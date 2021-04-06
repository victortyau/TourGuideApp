package labs.bamboo.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class DiscoViewAdapter extends ArrayAdapter<DiscoView> {

    public DiscoViewAdapter(Context context, ArrayList<DiscoView> arrayList) {
        super(context, 0, arrayList);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View currentItemView = convertView;

        if ( currentItemView == null ) {
            currentItemView = LayoutInflater.from(getContext()).inflate( R.layout.disco_list_view, parent, false );
        }

        DiscoView currentDiscoPosition = getItem(position);

        ImageView imageDiscoView = currentItemView.findViewById(R.id.imageDiscoView);
        assert currentDiscoPosition != null;
        imageDiscoView.setImageResource(currentDiscoPosition.getDiscoImageView());

        TextView tripsTitle = currentItemView.findViewById(R.id.tripsTitle);
        tripsTitle.setText(currentDiscoPosition.getDiscoTitle());

        TextView tripsDesc = currentItemView.findViewById(R.id.tripsDesc);
        tripsDesc.setText(currentDiscoPosition.getDiscoDisc());

        return currentItemView;
    }
}
