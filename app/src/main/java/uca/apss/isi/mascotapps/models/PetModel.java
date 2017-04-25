package uca.apss.isi.mascotapps.models;

import io.realm.RealmObject;

/**
 * Created by Moises Mena on 17/04/2017.
 */

public class PetModel extends RealmObject{
    private String name;
    private String picture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}//end class
