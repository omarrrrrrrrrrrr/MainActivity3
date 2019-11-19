package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        FragmentManager FragmentManger = getSupportFragmentManager();
        FragmentTransaction transaction=FragmentManger.beginTransaction();
        aboutFragment aboutFragment=new aboutFragment();
        transaction.add(R.id.container,aboutFragment);
        transaction.commit();

    }

    public void btn_about(View view) {
        FragmentManager FragmentManger = getSupportFragmentManager();
        FragmentTransaction transaction=FragmentManger.beginTransaction();
        aboutFragment aboutFragment=new aboutFragment();
        transaction.replace(R.id.container,aboutFragment);
        transaction.commit();

    }

    public void btn_profile(View view) {
        FragmentManager FragmentManger = getSupportFragmentManager();
        FragmentTransaction transaction=FragmentManger.beginTransaction();
        profileFragment profileFragment=new profileFragment();
        transaction.replace(R.id.container,profileFragment);
        transaction.commit();

    }
}
