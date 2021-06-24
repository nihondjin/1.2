package com.example.a12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.btn_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()){
                    case R.id.icon_home:
                        transaction.replace(R.id.fragment_container, Home_Fragment.newInstance("value1", "value2")).commit();
                        item.setChecked(true);
                        break;
                    case R.id.icon_list:
                        transaction.replace(R.id.fragment_container, List_Fragment.newInstance("value1", "value2")).commit();
                        item.setChecked(true);
                        break;
                    case R.id.icon_person:
                        transaction.replace(R.id.fragment_container, Profile_Fragment.newInstance("value1", "value2")).commit();
                        item.setChecked(true);
                        break;
                }
                return false;
            }
        });


    }
}