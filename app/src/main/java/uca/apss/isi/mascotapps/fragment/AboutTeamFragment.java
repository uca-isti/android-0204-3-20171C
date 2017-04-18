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
 * {@link AboutTeamFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AboutTeamFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboutTeamFragment extends Fragment {

    public AboutTeamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_team, container, false);
    }
}
