package com.notepoint.dgsetdemo.home.notification;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.notepoint.dgsetdemo.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {

    ArrayList<NotificationModel> notificationList;

    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        notificationList = new ArrayList<>();
        notificationList.add(new NotificationModel("Notification 1",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));

        notificationList.add(new NotificationModel("Notification 2",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));

        notificationList.add(new NotificationModel("Notification 3",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));

        notificationList.add(new NotificationModel("Notification 4",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));

        notificationList.add(new NotificationModel("Notification 5",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));


        NotificationAdapter adapter = new NotificationAdapter(notificationList);
        RecyclerView notificationRecycler = view.findViewById(R.id.recycler_notification);
        notificationRecycler.setAdapter(adapter);

        return view;
    }

}
