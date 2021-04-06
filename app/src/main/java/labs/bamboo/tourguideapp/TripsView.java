package labs.bamboo.tourguideapp;

public class TripsView {

    private int tripsImageView;

    private String tripsTitle;

    private String tripsDesc;

    public TripsView(int tripsImageView, String tripsTitle, String tripsDesc) {
        this.tripsImageView = tripsImageView;
        this.tripsTitle = tripsTitle;
        this.tripsDesc = tripsDesc;
    }

    public int getTripsImageView() {
        return tripsImageView;
    }

    public String getTripsTitle() {
        return tripsTitle;
    }

    public String getTripsDesc() {
        return tripsDesc;
    }
}
