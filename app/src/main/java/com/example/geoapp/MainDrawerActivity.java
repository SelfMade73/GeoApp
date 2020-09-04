package com.example.geoapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainDrawerActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private Toolbar toolbar;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_drawer);
        toolbar = findViewById(R.id.toolbar);
        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.nav_app_bar_open_drawer_description,R.string.navigation_drawer_close);
        toggle.syncState();
        toggle.getDrawerArrowDrawable().setColor(getColor(R.color.colorAccent));
        toggle.setDrawerIndicatorEnabled(true);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener( listener );
        navView.setSelectedItemId(R.id.map);


        toolbar.setNavigationOnClickListener(v -> {
            if (drawer.isDrawerOpen(Gravity.RIGHT)) {
                drawer.closeDrawer(Gravity.RIGHT);
            } else {
                drawer.openDrawer(Gravity.RIGHT);
            }
        });



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
                .replace(R.id.fragment_container1, selectedFragment).commit();
        return true;
    };

}
