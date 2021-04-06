package labs.bamboo.tourguideapp.ui.disco;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import java.util.ArrayList;

import labs.bamboo.tourguideapp.DiscoView;
import labs.bamboo.tourguideapp.DiscoViewAdapter;
import labs.bamboo.tourguideapp.R;

public class DiscoFragment extends Fragment {

    private DiscoViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(DiscoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_disco, container, false);

        ListView discoListView = root.findViewById(R.id.listViewDisco);

        ArrayList<DiscoView> arrayList = new ArrayList<DiscoView>();

        for( int i = 0; i < 20; i++ ) {
            arrayList.add(new DiscoView(R.drawable.angular_9, "Live Zone", "Dance Place"));
        }

        DiscoViewAdapter discoViewAdapter = new DiscoViewAdapter(container.getContext(), arrayList);

        discoListView.setAdapter(discoViewAdapter);

        return root;
    }
}