package uca.apss.isi.mascotapps.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import uca.apss.isi.mascotapps.R;
import uca.apss.isi.mascotapps.models.ProfileModel;

/**
 * Created by isi3 on 17/04/2017.
 */

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {
    public List<ProfileModel> profileModels;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView firstName;
        public TextView lastName;
        public TextView email;
        public TextView password;
       // public TextView profile_id;
        //public TextView profilePetsId;

        public ViewHolder(View view){
            super(view);
            firstName = (TextView) view.findViewById(R.id.firstName);
            lastName = (TextView) view.findViewById(R.id.lastName);
            email = (TextView) view.findViewById(R.id.email);
            password = (TextView) view.findViewById(R.id.password);
            //profile_id = (TextView) view.findViewById(R.id.profile_id);
            //profilePetsId = (TextView) view.findViewById(R.id.profilePetsId);
        }
    }

    public ProfileAdapter(List<ProfileModel> profileModels){this.profileModels = profileModels;}

    @Override
    public ProfileAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profile,parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ProfileAdapter.ViewHolder holder, int position) {
        ProfileModel profileModel = this.profileModels.get(position);
        holder.firstName.setText(profileModel.getFirstName());
        holder.lastName.setText(profileModel.getLastName());
        holder.email.setText(profileModel.getEmail());
        holder.password.setText(profileModel.getPassword());
        //holder.profile_id.setText(profileModel.getProfile_id());
        //holder.profilePetsId.setText(profileModel.getProfilePetsId());
    }

    @Override
    public int getItemCount() {
        return this.profileModels.size();
    }
}
