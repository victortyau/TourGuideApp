package labs.bamboo.tourguideapp.ui.trips;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import java.util.ArrayList;

import labs.bamboo.tourguideapp.R;
import labs.bamboo.tourguideapp.TripsView;
import labs.bamboo.tourguideapp.TripsViewAdapter;

public class TripsFragment extends Fragment {

    private TripsViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(TripsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_trips, container, false);

        ListView tripsListView = root.findViewById(R.id.listViewTrips);

        ArrayList<TripsView> arrayList = new ArrayList<TripsView>();

        for( int i = 0; i < 20; i++ ){
            arrayList.add(new TripsView(R.drawable.rails_9,
                    getResources().getString(R.string.trips_title),
                    getResources().getString(R.string.food_desc)));
        }

        TripsViewAdapter tripsViewAdapter = new TripsViewAdapter(container.getContext(), arrayList);

        tripsListView.setAdapter(tripsViewAdapter);

        return root;
    }
}