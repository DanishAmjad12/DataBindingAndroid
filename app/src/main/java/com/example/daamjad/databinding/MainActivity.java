package com.example.daamjad.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daamjad.databinding.bindingModels.UserModel;
import com.example.daamjad.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,
                R.layout.activity_main);

        UserModel userModel=new UserModel("John");
        activityMainBinding.setUser(userModel);

    }
}
