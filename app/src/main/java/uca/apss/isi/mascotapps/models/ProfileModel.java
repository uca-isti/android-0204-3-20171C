package uca.apss.isi.mascotapps.models;

import java.util.List;

import io.realm.RealmObject;

/**
 * Created by usuario on 7/4/2017.
 */

public class ProfileModel extends RealmObject {
    public String email;
    public String password;
    public String firstName;
    public String lastName;
    public int id;
    public int profile_id;
    public int profilePetsId;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }

    public int getProfilePetsId() {
        return profilePetsId;
    }

    public void setProfilePetsId(int profilePetsId) {
        this.profilePetsId = profilePetsId;
    }
}
