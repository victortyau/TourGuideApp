package labs.bamboo.tourguideapp.ui.food;

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

import labs.bamboo.tourguideapp.FoodView;
import labs.bamboo.tourguideapp.FoodViewAdapter;
import labs.bamboo.tourguideapp.R;

public class FoodFragment extends Fragment {

    private FoodViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(FoodViewModel.class);
        View root = inflater.inflate(R.layout.fragment_food, container, false);

        ListView foodListView = root.findViewById(R.id.listViewFood);

        final ArrayList<FoodView> arrayList = new ArrayList<FoodView>();

        for(int i = 0; i < 20; i++) {
            arrayList.add(new FoodView(R.drawable.jest_9, "Dely Gourment", "Delicatesen" ));
        }

        FoodViewAdapter foodViewAdapter = new FoodViewAdapter(container.getContext(), arrayList);

        foodListView.setAdapter(foodViewAdapter);

        return root;
    }
}