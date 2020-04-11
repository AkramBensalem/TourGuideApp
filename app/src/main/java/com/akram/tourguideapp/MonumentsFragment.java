package com.akram.tourguideapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A {@link Fragment} subclass that displays a list of monuments.
 */
public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.timgad), R.drawable.timgad));
        places.add(new Place(getString(R.string.memorial_du_matyr), R.drawable.memorial));
        places.add(new Place(getString(R.string.tombeau_de_la_chretienne), R.drawable.tombeau));
        places.add(new Place(getString(R.string.basilique_saint_augustin), R.drawable.basilique));
        places.add(new Place(getString(R.string.santa_cruz), R.drawable.santa));
        places.add(new Place(getString(R.string.ahmed_bey), R.drawable.ahmedbey));
        places.add(new Place(getString(R.string.ketchaoua_mosque),R.drawable.ketchaoua));
        places.add(new Place(getString(R.string.el_mansourah),R.drawable.el_mansourah));
        places.add(new Place(getString(R.string.ain_el_fouara),R.drawable.ainfouara));

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