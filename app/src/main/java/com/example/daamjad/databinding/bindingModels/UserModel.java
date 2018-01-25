package com.example.daamjad.databinding.bindingModels;

/**
 * Created by daamjad on 1/25/2018.
 */

public class UserModel
{
    private String firstName;

    public UserModel(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
