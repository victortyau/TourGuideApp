package labs.bamboo.tourguideapp;

public class DiscoView {

    private int discoImageView;

    private String discoTitle;

    private String discoDisc;

    public DiscoView(int discoImageView, String discoTitle, String discoDisc) {
        this.discoImageView = discoImageView;
        this.discoTitle = discoTitle;
        this.discoDisc = discoDisc;
    }

    public int getDiscoImageView() {
        return discoImageView;
    }

    public String getDiscoTitle() {
        return discoTitle;
    }

    public String getDiscoDisc() {
        return discoDisc;
    }
}
