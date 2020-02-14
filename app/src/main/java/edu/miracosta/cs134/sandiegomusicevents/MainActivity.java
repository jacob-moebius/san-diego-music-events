package edu.miracosta.cs134.sandiegomusicevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.miracosta.cs134.sandiegomusicevents.model.JSONLoader;
import edu.miracosta.cs134.sandiegomusicevents.model.MusicEvent;

public class MainActivity extends AppCompatActivity {

    private List<MusicEvent> eventsList;
    private MusicEventListAdapter mMusicEventListAdapter;
    private ListView mMusicEventsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventsList = new ArrayList<>();

        // Pull data from JSON
        try {
            eventsList = JSONLoader.loadJSONFromAsset(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // DONE: Wire up the musicEventsListView
        mMusicEventsListView = findViewById(R.id.musicEventListView);

        // DONE: Instantiate a new ListAdapter (MusicEventListAdapter)
        mMusicEventListAdapter =
                new MusicEventListAdapter(this, R.layout.music_event_list_item, eventsList);

        // DONE: Set the adapter of the list view to the newly instantiated adapter
        mMusicEventsListView.setAdapter(mMusicEventListAdapter);
    }

    public void openEventDetails(View v) {
        // Extract the "tag"
        MusicEvent clickedEvent = (MusicEvent) v.getTag();

        // Set up an intent
        Intent intent = new Intent(this, EventDetailsActivity.class);

        // Fill intent with details about clicked event
        intent.putExtra("Artist", clickedEvent.getArtist());
        intent.putExtra("Date", clickedEvent.getDate());
        intent.putExtra("Day", clickedEvent.getDay());
        intent.putExtra("Time", clickedEvent.getTime());
        intent.putExtra("Venue", clickedEvent.getVenue());
        intent.putExtra("City", clickedEvent.getCity());
        intent.putExtra("State", clickedEvent.getState());
        intent.putExtra("ImageName", clickedEvent.getImageName());

        // Go to (startActivity) even details
        startActivity(intent);
    }
}
