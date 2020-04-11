package com.akram.tourguideapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A {@link Fragment} subclass that displays a list of parks.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.chrea_park),R.drawable.chrea));
        places.add(new Place(getString(R.string.djurdjura_park), R.drawable.djurdjura));
        places.add(new Place(getString(R.string.tikijda_park), R.drawable.tikijda));
        places.add(new Place(getString(R.string.tlemcen),R.drawable.tlemcen));
        places.add(new Place(getString(R.string.ahuggar_parc), R.drawable.ahuggar));
        places.add(new Place(getString(R.string.taza_park), R.drawable.taza));
        places.add(new Place(getString(R.string.tassili_park), R.drawable.tassili));
        places.add(new Place(getString(R.string.hoggar), R.drawable.hoggar));

        // Inflate current View object in places_list.xml
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create PlaceAdapter object in current activity for data from places array
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Create ListView object in places_list.xml and set the PlaceAdapter object to it
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        // Return current View object with the data
        return rootView;
    }
}