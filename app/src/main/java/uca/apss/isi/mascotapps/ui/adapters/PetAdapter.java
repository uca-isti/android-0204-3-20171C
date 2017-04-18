package uca.apss.isi.mascotapps.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import uca.apss.isi.mascotapps.R;
import uca.apss.isi.mascotapps.models.PetModel;

/**
 * Created by Moises on 17/04/2017.
 */

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.ViewHolder>{

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView yourPetName;
        public ImageView yourPetPicture;

        public ViewHolder(View itemView){
            super(itemView);
            yourPetName = (TextView) itemView.findViewById(R.id.your_pet_name);
            yourPetPicture = (ImageView) itemView.findViewById(R.id.your_pet_picture);
        }
    }//end static class

    private List<PetModel> petModelList;
    private Context context;

    public PetAdapter(Context context, List<PetModel> petModelList) {
        this.petModelList = petModelList;
        this.context = context;
    }//end contructor

    public Context getContext() {
        return context;
    }//end method

    @Override
    public PetAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View yourPetsView = inflater.inflate(R.layout.item_your_pets, parent, false);
        ViewHolder viewHolder = new ViewHolder(yourPetsView);
        return viewHolder;
    }//end method

    @Override
    public void onBindViewHolder(PetAdapter.ViewHolder viewHolder, int position) {
        PetModel petModel = petModelList.get(position);

        TextView yourPetName = viewHolder.yourPetName;
        yourPetName.setText(petModel.getName());
        ImageView yourPetPicture = viewHolder.yourPetPicture;
        yourPetPicture.setImageResource(R.drawable.ic_pets_black_24dp);
    }//end method

    @Override
    public int getItemCount() {
        return petModelList.size();
    }//end method
}//end class
