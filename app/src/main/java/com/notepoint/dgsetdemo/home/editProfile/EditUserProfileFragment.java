package com.notepoint.dgsetdemo.home.editProfile;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.notepoint.dgsetdemo.R;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class EditUserProfileFragment extends Fragment {

    private static final String TAG = EditUserProfileFragment.class.getSimpleName();
    private static final int SELECT_IMAGE_LOGO = 101;
    private int insertOrUpdateProfile =0;
    private int selectedUserId =0;

    public EditUserProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_edit_user_profile, container, false);

        setHasOptionsMenu(true);




        return view;
    }



    /* ========================================================================================================================================================== */

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.save_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.save_profile_menu) {
//            saveDetails();

        }
        return super.onOptionsItemSelected(item);
    }


    /* ========================================================================================================================================================== */
    /*Open Gallery*/
    private void selectImageLogo() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, SELECT_IMAGE_LOGO);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SELECT_IMAGE_LOGO && resultCode == Activity.RESULT_OK && data != null) {
            Uri selectedPhotoUri = data.getData();

            setImageLogo(selectedPhotoUri);
        }
    }

    private void setImageLogo(Uri uri) {
        Log.d("Image_uri", "setImageLogo: " + uri);

//        Glide.with(binding.companyLogoImageViewEdit)
//                .load(uri)
//                .into(binding.companyLogoImageViewEdit);

    }

    /* ========================================================================================================================================================== */
    /* Save user details to database:*/
//    private void saveDetails() {
//        String comapanyName, userName, userDesignation, userEmail, userPrimaryMob, userSecondaryMob, userAddress1, userAddress2, userAddress3;
//        String companyLogo = Objects.requireNonNull(viewModel.selectedImageUri.getValue()).toString();
//        comapanyName = binding.companyNameEditText.getText().toString();
//        userName = binding.userNameEditText.getText().toString();
//        userDesignation = binding.designationEditText.getText().toString();
//        userEmail = binding.userEmailEditText.getText().toString();
//        userPrimaryMob = binding.userPhonePrimaryEditText.getText().toString();
//        userSecondaryMob = binding.userPhoneSecondaryEditText.getText().toString();
//        userAddress1 = binding.userAddressLine1EditText.getText().toString();
//        userAddress2 = binding.userAddressLine2EditText.getText().toString();
//        userAddress3 = binding.userAddressLine3EditText.getText().toString();
//
//
//        if (companyLogo.isEmpty()) {
//            Toast.makeText(getContext(), "Select company logo", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        if (comapanyName.isEmpty()) {
//            binding.companyNameEditText.setError("Field is mandatory");
//            return;
//        }
//
//        if (userName.isEmpty()) {
//            binding.userNameEditText.setError("Field is mandatory");
//            return;
//        }
//
//        if (userDesignation.isEmpty()) {
//            binding.designationEditText.setError("Field is mandatory");
//            return;
//        }
//
//        if (userEmail.isEmpty()) {
//            binding.userEmailEditText.setError("Field is mandatory");
//            return;
//        }
//
//        if (userPrimaryMob.isEmpty()) {
//            binding.userPhonePrimaryEditText.setError("Field is mandatory");
//            return;
//        }
//
//
//        if (userAddress1.isEmpty()) {
//            binding.userAddressLine1EditText.setError("Field is mandatory");
//            return;
//        }
//
//
//        if (insertOrUpdateProfile==0) {
//            UserProfile profile = new UserProfile(comapanyName, companyLogo, userName,
//                    userDesignation, userEmail, userPrimaryMob, userSecondaryMob, userAddress1, userAddress2, userAddress3,1);
//
//            viewModel.insertProfile(profile);
//        }else {
//            Log.d(TAG, "saveDetails: ");
//            UserProfile profile = new UserProfile(comapanyName, companyLogo, userName,
//                    userDesignation, userEmail, userPrimaryMob, userSecondaryMob, userAddress1, userAddress2, userAddress3,1);
//
//            profile.setId(selectedUserId);
//            viewModel.updateProfile(profile);
//        }
//        NavHostFragment.findNavController(this).navigate(R.id.action_editUserProfileFragment_to_userProfileFragment);
//
//    }
}
