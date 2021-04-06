package labs.bamboo.tourguideapp;

public class EventsView {

    private int eventImageId;

    private String eventTitle;

    private String eventDesc;

    public EventsView(int eventImageId, String eventTitle, String eventDesc) {
        this.eventImageId = eventImageId;
        this.eventTitle = eventTitle;
        this.eventDesc = eventDesc;
    }

    public int getEventImageId() {
        return eventImageId;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getEventDesc() {
        return eventDesc;
    }
}
