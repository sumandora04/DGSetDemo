package com.notepoint.dgsetdemo.home;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.notepoint.dgsetdemo.R;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

//        view.findViewById(R.id.service_card_view).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Navigation.findNavController(Objects.requireNonNull(getActivity()),R.id.nav_host_fragment)
//                        .navigate(R.id.action_homeFragment_to_serviceFragment);
//            }
//        });
//
//        view.findViewById(R.id.product_card_view).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Navigation.findNavController(Objects.requireNonNull(getActivity()),R.id.nav_host_fragment)
//                        .navigate(R.id.action_homeFragment_to_productListFragment);
//            }
//        });


        setHasOptionsMenu(true);
        return view;
    }

   /* @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.home_menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.history_menu:
                Toast.makeText(getContext(), "User history", Toast.LENGTH_SHORT).show();
                break;

            case R.id.profile_menu:
                NavHostFragment.findNavController(this).navigate(R.id.action_homeFragment_to_userProfileFragment);
                break;
            case R.id.notification_menu:
                NavHostFragment.findNavController(this).navigate(R.id.action_homeFragment_to_notificationFragment);
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
