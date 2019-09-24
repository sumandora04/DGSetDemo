package com.notepoint.dgsetdemo.home.products;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.notepoint.dgsetdemo.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductListFragment extends Fragment {

    ArrayList<ProductModel> productList;

    public ProductListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_list, container, false);


        productList = new ArrayList<>();
        productList.add(new ProductModel("DG set 1", R.drawable.dg_set, 20184));
        productList.add(new ProductModel("DG set 2", R.drawable.dg_set, 30184));
        productList.add(new ProductModel("DG set 3", R.drawable.dg_set, 40184));
        productList.add(new ProductModel("DG set 4", R.drawable.dg_set, 10184));
        productList.add(new ProductModel("DG set 5", R.drawable.dg_set, 50184));
        productList.add(new ProductModel("DG set 6", R.drawable.dg_set, 60184));


        RecyclerView recyclerView = view.findViewById(R.id.recycler_product);
        ProductRecyclerAdapter adapter = new ProductRecyclerAdapter(productList);
        recyclerView.setAdapter(adapter);

        setHasOptionsMenu(true);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.home_menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.history_menu:
                NavHostFragment.findNavController(this).navigate(R.id.action_productListFragment_to_historyFragment);
                break;

            case R.id.profile_menu:
                NavHostFragment.findNavController(this).navigate(R.id.action_productListFragment_to_userProfileFragment);
                break;
            case R.id.notification_menu:
                NavHostFragment.findNavController(this).navigate(R.id.action_productListFragment_to_notificationFragment);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
