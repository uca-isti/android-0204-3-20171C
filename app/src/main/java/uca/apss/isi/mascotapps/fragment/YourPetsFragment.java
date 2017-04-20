package uca.apss.isi.mascotapps.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import uca.apss.isi.mascotapps.R;
import uca.apss.isi.mascotapps.api.Api;
import uca.apss.isi.mascotapps.models.PetModel;
import uca.apss.isi.mascotapps.models.ProfileModel;
import uca.apss.isi.mascotapps.ui.adapters.PetAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class YourPetsFragment extends Fragment {

    private static final String TAG = "YourPetsFragment";
    public RecyclerView yourPets;
    public PetAdapter petAdapter;
    public ArrayList<PetModel> petModelArrayList;
    public YourPetsFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_your_pets, container, false);
        yourPets = (RecyclerView) rootView.findViewById(R.id.recycler_view_your_pets);
        petModelArrayList = new ArrayList<>();
        getData();



        // Inflate the layout for this fragment
        return rootView;
    }//end method


    private void getData(){

        Call<List<PetModel>> call = Api.instance().getPet();
        call.enqueue(new Callback<List<PetModel>>() {
            @Override
            public void onResponse(Call<List<PetModel>> call, Response<List<PetModel>> response) {
                if(response != null){
                    for(PetModel petModel : response.body()){
                            //Log.d(TAG, petModel.getName() + " - " + petModel.getPicture());
                            petModelArrayList.add(petModel);
                    }//end for each
                    Log.d(TAG, petModelArrayList.toString());
                    petAdapter = new PetAdapter(getActivity(), petModelArrayList);
                    yourPets.setAdapter(petAdapter);
                    yourPets.setLayoutManager(new LinearLayoutManager(getActivity()));
                }//end if

            }//end method

            @Override
            public void onFailure(Call<List<PetModel>> call, Throwable t) {
                Log.d(TAG, "Fallo en la solicitud - " + t.getMessage());
            }//end met
            // hod
        });
    }//end method

}//en class












