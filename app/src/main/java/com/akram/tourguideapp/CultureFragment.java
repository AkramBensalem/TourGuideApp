package com.akram.tourguideapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A {@link Fragment} subclass that displays a list of cultural places.
 */
public class CultureFragment extends Fragment {


    public CultureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.algerian_theater), R.drawable.algerienne));
        places.add(new Place(getString(R.string.batna_theater), R.drawable.batna));
        places.add(new Place(getString(R.string.hyponne), R.drawable.hyppone));
        places.add(new Place(getString(R.string.museum_modern_art), R.drawable.museum_of_modern_art));
        places.add(new Place(getString(R.string.ahmed_zabana), R.drawable.ahmed_zabana));
        places.add(new Place(getString(R.string.central_studies_andalouses), R.drawable.central_etudes_andalouses));
        places.add(new Place(getString(R.string.cherchal_museum), R.drawable.cherchell));
        places.add(new Place(getString(R.string.palais_of_rais),R.drawable.palais_of_rais));


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