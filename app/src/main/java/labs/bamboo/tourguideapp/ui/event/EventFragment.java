package labs.bamboo.tourguideapp.ui.event;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import java.util.ArrayList;

import labs.bamboo.tourguideapp.EventsView;
import labs.bamboo.tourguideapp.EventsViewAdapter;
import labs.bamboo.tourguideapp.R;
import labs.bamboo.tourguideapp.ui.trips.TripsViewModel;

public class EventFragment extends Fragment {

    private EventViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(EventViewModel.class);
        View root = inflater.inflate(R.layout.fragment_event, container, false);

        ListView eventListView = root.findViewById(R.id.listViewEvent);

        ArrayList<EventsView> arrayList = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            arrayList.add(new EventsView(R.drawable.jekyllrb,
                    getResources().getString(R.string.event_title),
                    getResources().getString(R.string.event_desc)));
        }

        EventsViewAdapter eventsViewAdapter = new EventsViewAdapter(container.getContext(), arrayList);

        eventListView.setAdapter(eventsViewAdapter);

        return root;
    }
}
