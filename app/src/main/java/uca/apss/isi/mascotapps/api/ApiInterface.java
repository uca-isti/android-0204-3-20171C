package uca.apss.isi.mascotapps.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import uca.apss.isi.mascotapps.models.ProfileModel;

/**
 * Created by usuario on 7/4/2017.
 */

public interface ApiInterface {
    @GET("profiles")
    Call<List<ProfileModel>> getProfile();
}
