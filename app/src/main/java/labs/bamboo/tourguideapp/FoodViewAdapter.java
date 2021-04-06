package labs.bamboo.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodViewAdapter extends ArrayAdapter<FoodView> {

    public FoodViewAdapter(Context context, ArrayList<FoodView> arrayList) {
        super(context, 0, arrayList);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View currentItemView = convertView;

        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.food_list_view, parent, false);
        }

        FoodView currentFoodPosition = getItem(position);

        ImageView imageFoodView = currentItemView.findViewById(R.id.imageFoodView);
        assert currentFoodPosition != null;
        imageFoodView.setImageResource(currentFoodPosition.getFoodImageId());

        TextView foodTitle = currentItemView.findViewById(R.id.foodTitle);
        foodTitle.setText(currentFoodPosition.getFoodTitle());

        TextView foodDesc = currentItemView.findViewById(R.id.foodDesc);
        foodDesc.setText(currentFoodPosition.getFoodDesc());

        return currentItemView;
    }
}
