package com.notepoint.dgsetdemo.home.history.historyDetail;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.notepoint.dgsetdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryDetailFragment extends Fragment {


    public HistoryDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_history_detail, container, false);
    }

}
