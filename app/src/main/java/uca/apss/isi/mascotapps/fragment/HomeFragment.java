package uca.apss.isi.mascotapps.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import uca.apss.isi.mascotapps.R;
import uca.apss.isi.mascotapps.api.Api;
import uca.apss.isi.mascotapps.models.ProfileModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private static final String TAG = "HomeFragment";


    public HomeFragment() {
        // Required empty public constructor
        getData();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    private void getData() {
        Call<List<ProfileModel>> call = Api.instance().getProfile();
        call.enqueue(new Callback<List<ProfileModel>>() {
            @Override
            public void onResponse(Call<List<ProfileModel>> call, Response<List<ProfileModel>> response) {
                //valida si la respusta fue nula porque no habia tweets
                if (response != null) {
                    for (ProfileModel profileModel : response.body()) {
                        Log.d(TAG, profileModel.getFirstName());
                        Log.d(TAG, profileModel.getLastName());
                        Log.d(TAG, profileModel.getEmail());
                        Log.d(TAG, profileModel.getPassword());
                        Log.d(TAG, String.valueOf(profileModel.getId()));
                        Log.d(TAG, String.valueOf(profileModel.getProfile_id()));
                        Log.d(TAG, String.valueOf(profileModel.getProfilePetsId()));
                    }
                } else {
                    Log.d(TAG, "La respuesta es incorrecta");
                }
            }
            @Override
            public void onFailure(Call<List<ProfileModel>> call, Throwable throwable) {
                Log.d(TAG, throwable.getMessage());
            }
        });
    }

}
