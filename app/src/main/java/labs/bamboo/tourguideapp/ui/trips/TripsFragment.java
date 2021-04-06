package labs.bamboo.tourguideapp.ui.trips;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import labs.bamboo.tourguideapp.R;

public class TripsFragment extends Fragment {

    private TripsViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(TripsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_trips, container, false);
        return root;
    }
}