package labs.bamboo.tourguideapp;

public class FoodView {

    private int foodImageId;

    private String foodTitle;

    private String foodDesc;

    public FoodView(int foodImageId, String foodTitle, String foodDesc) {
        this.foodImageId = foodImageId;
        this.foodTitle = foodTitle;
        this.foodDesc = foodDesc;
    }

    public int getFoodImageId() {
        return foodImageId;
    }

    public String getFoodTitle() {
        return foodTitle;
    }

    public String getFoodDesc() {
        return foodDesc;
    }
}
