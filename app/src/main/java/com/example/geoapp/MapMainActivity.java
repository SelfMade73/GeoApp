package com.example.geoapp;

import android.app.ActionBar;
import android.app.Notification;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MapMainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_main);
        toolbar = findViewById(R.id.action_toolbar);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener( listener );
        navView.setSelectedItemId(R.id.map);


    }

    private BottomNavigationView.OnNavigationItemSelectedListener listener
    = item -> {
        Fragment selectedFragment = null;
        switch ( item.getItemId() ){

            case R.id.action:
                selectedFragment = new ActionFragment();
                toolbar.setTitle("Actions");
                break;
            case R.id.map:
                selectedFragment = new MapFragment();
                toolbar.setTitle("Map");
                break;
            case R.id.account:
                selectedFragment = new AccountFragment();
                toolbar.setTitle("Profile");
                break;
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, selectedFragment).commit();
        return true;
    };



}
