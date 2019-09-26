package com.notepoint.dgsetdemo.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import com.notepoint.dgsetdemo.R;
import com.notepoint.dgsetdemo.logIn.LoginActivity;

public class HomePageActivity extends AppCompatActivity {

    AppBarConfiguration appBarConfiguration;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_drawer);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout);

        appBarConfiguration =
                new AppBarConfiguration.Builder(navController.getGraph()).build();

        NavigationUI.setupWithNavController(navigationView, navController);

        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                switch (destination.getId()) {
                    case R.id.productListFragment:
                        setTitle("DG Set");
                        break;

                    case R.id.userProfileFragment:
                        setTitle("Profile");
                        break;

                    case R.id.editUserProfileFragment:
                        setTitle("Edit Profile");
                        break;

                    case R.id.notificationFragment:
                        setTitle("Notification");
                        break;

                    case R.id.serviceFragment:
                        setTitle("Service");
                        break;

                    case R.id.historyFragment:
                        setTitle("History");
                        break;


                    case R.id.aboutFragment:
                        setTitle("About us");
                        break;

                    case R.id.historyDetailFragment:
                        setTitle("History");
                        break;

                    case R.id.helpFragment:
                        setTitle("Help");
                        break;

                    case R.id.productDetailFragment:
                        setTitle("DG Set");
                        break;

                    case R.id.log_out:
                        startActivity(new Intent(HomePageActivity.this, LoginActivity.class));
                        finish();
                        break;

                    default:
                        setTitle("DG Set");
                }
            }
        });
    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, appBarConfiguration);
    }
}
