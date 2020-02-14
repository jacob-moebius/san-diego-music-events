package edu.miracosta.cs134.sandiegomusicevents.model;

/**
 * The MusicEvent class is a place holder for data corresponding to music events
 * occurring within San Diego County. 
 *
 * @author Michael Paulding
 * @version 2.0
 */
public class MusicEvent {

    // Every instance variable in Java class should mimic the JSON file
    private String mArtist;
    private String mDate;
    private String mDay;
    private String mTime;
    private String mVenue;
    private String mCity;
    private String mState;
    private String mImageName;

    public MusicEvent(String artist, String date, String day, String time, String venue, String city, String state, String imageName) {
        mArtist = artist;
        mDate = date;
        mDay = day;
        mTime = time;
        mVenue = venue;
        mCity = city;
        mState = state;
        mImageName = imageName;
    }

    public MusicEvent(String artist, String date, String day, String time, String venue, String city) {
        this(artist, date, day, time, venue, city, "CA", artist.replaceAll(" ", "") + ".png");
    }

    public MusicEvent() {
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String artist) {
        mArtist = artist;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getDay() {
        return mDay;
    }

    public void setDay(String day) {
        mDay = day;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

    public String getVenue() {
        return mVenue;
    }

    public void setVenue(String venue) {
        mVenue = venue;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public String getImageName() {
        return mImageName;
    }

    public void setImageName(String imageName) {
        mImageName = imageName;
    }

    @Override
    public String toString() {
        return "MusicEvent{" +
                "Artist='" + mArtist + '\'' +
                ", Date='" + mDate + '\'' +
                ", Day='" + mDay + '\'' +
                ", Time='" + mTime + '\'' +
                ", Venue='" + mVenue + '\'' +
                ", City='" + mCity + '\'' +
                ", State='" + mState + '\'' +
                ", ImageName='" + mImageName + '\'' +
                '}';
    }
}
