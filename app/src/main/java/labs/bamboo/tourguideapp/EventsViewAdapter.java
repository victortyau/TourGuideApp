package labs.bamboo.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class EventsViewAdapter extends ArrayAdapter<EventsView> {

    public EventsViewAdapter(Context context, ArrayList<EventsView> arrayList) {
        super( context, 0, arrayList);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View currentItemView = convertView;

        if ( currentItemView == null   ) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.event_list_view, parent, false);
        }

        EventsView currentEventsPosition = getItem(position);

        ImageView imageEventView = currentItemView.findViewById(R.id.imageEventView);
        assert currentEventsPosition != null;
        imageEventView.setImageResource(currentEventsPosition.getEventImageId());

        TextView eventTitle = currentItemView.findViewById(R.id.eventTitle);
        eventTitle.setText(currentEventsPosition.getEventTitle());

        TextView eventDesc = currentItemView.findViewById(R.id.eventDesc);
        eventDesc.setText(currentEventsPosition.getEventDesc());

        return currentItemView;
    }
}
