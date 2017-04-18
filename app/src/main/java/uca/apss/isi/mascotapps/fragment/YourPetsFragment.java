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
import uca.apss.isi.mascotapps.models.PetModel;
import uca.apss.isi.mascotapps.models.ProfileModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class YourPetsFragment extends Fragment {

    private static final String TAG = "YourPetsFragment";

    public YourPetsFragment() {
        getData();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_your_pets, container, false);
    }//end method


    private void getData(){
        Call<List<PetModel>> call = Api.instance().getPet();
        call.enqueue(new Callback<List<PetModel>>() {
            @Override
            public void onResponse(Call<List<PetModel>> call, Response<List<PetModel>> response) {
                if(response != null){
                    for(PetModel petModel : response.body()){
                        Log.d(TAG, petModel.getName() + " " + petModel.getPicture());
                    }//end for each
                }//end if
            }//end method

            @Override
            public void onFailure(Call<List<PetModel>> call, Throwable t) {
                Log.d(TAG, "Fallo en la solicitud - " + t.getMessage());
            }//end method
        });
    }//end method

}//en class












