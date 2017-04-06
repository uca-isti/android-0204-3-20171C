package uca.apss.isi.mascotapps.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uca.apss.isi.mascotapps.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class YourPetsFragment extends Fragment {


    public YourPetsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_your_pets, container, false);
    }

}
