package uca.apss.isi.mascotapps.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uca.apss.isi.mascotapps.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link VaccinesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link VaccinesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VaccinesFragment extends Fragment {

    public VaccinesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vaccines, container, false);
    }
}
