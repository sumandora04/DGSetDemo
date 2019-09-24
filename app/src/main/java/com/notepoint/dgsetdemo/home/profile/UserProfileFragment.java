package com.notepoint.dgsetdemo.home.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.notepoint.dgsetdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserProfileFragment extends Fragment {

    public UserProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_profile, container, false);

        setHasOptionsMenu(true);




        return view;

    }

//    private void displayProfile(UserProfile profile) {
//        Uri uri = Uri.parse(profile.getCompanyLogoUrl());
//        setImageLogo(uri);
//        binding.companyNameTextView.setText(profile.getCompanyName());
//        binding.userNameTextView.setText(profile.getUserName());
//        binding.designationTextView.setText(profile.getUserDesignation());
//        binding.userEmailTextView.setText(profile.getUserEmail());
//        binding.userPhonePrimaryTextView.setText(profile.getUserPrimaryPhone());
//        binding.userPhoneSecondaryTextView.setText(profile.getUserSecondaryPhone());
//        binding.userAddressLine1TextView.setText(profile.getUserAddressLine1());
//        binding.userAddressLine2TextView.setText(profile.getUserAddressLine2());
//        binding.userAddressLine3TextView.setText(profile.getUserAddressLine3());
//    }
//
//    private void setImageLogo(Uri uri) {
//        Glide.with(binding.companyLogoImageViewSingle)
//                .load(uri)
//                .into(binding.companyLogoImageViewSingle);
//    }
    /* ========================================================================================================================================================== */

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.edit_menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.edit_profile_menu) {
            NavHostFragment.findNavController(this).navigate(R.id.action_userProfileFragment_to_editUserProfileFragment);
        }
        return super.onOptionsItemSelected(item);
    }
}
