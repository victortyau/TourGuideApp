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

        TextView discoTitle = currentItemView.findViewById(R.id.discoTitle);
        discoTitle.setText(currentDiscoPosition.getDiscoTitle());

        TextView discoDesc = currentItemView.findViewById(R.id.discoDesc);
        discoDesc.setText(currentDiscoPosition.getDiscoDisc());

        return currentItemView;
    }
}
