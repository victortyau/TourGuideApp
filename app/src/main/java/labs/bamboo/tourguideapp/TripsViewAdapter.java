package labs.bamboo.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TripsViewAdapter extends ArrayAdapter<TripsView> {

    public TripsViewAdapter(Context context, ArrayList<TripsView> arrayList) {
        super(context, 0, arrayList);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View currentItemView = convertView;

        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.trips_list_view, parent, false);
        }

        TripsView currentTripsPosition = getItem(position);

        ImageView imageTripsView = currentItemView.findViewById(R.id.imageTripsView);
        assert currentTripsPosition != null;
        imageTripsView.setImageResource(currentTripsPosition.getTripsImageView());

        TextView tripsTitle = currentItemView.findViewById(R.id.tripsTitle);
        tripsTitle.setText(currentTripsPosition.getTripsTitle());

        TextView tripsDesc = currentItemView.findViewById(R.id.tripsDesc);
        tripsDesc.setText(currentTripsPosition.getTripsDesc());

        return currentItemView;
    }

}
