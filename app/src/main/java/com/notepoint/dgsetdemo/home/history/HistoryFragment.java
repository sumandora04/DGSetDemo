package com.notepoint.dgsetdemo.home.history;


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
public class HistoryFragment extends Fragment {

    ArrayList<HistoryModel> historyList;

    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history, container, false);

        historyList = new ArrayList<>();
        historyList.add(new HistoryModel("DG set 1","Delivered","19-Sept-2019","24-Sept-2019", "John carter\n"+R.string.lorem_ipsum, android.R.drawable.star_big_on));
        historyList.add(new HistoryModel("DG set Service","Serviced","15-Sept-2019","24-Sept-2019", "John carter\n"+R.string.lorem_ipsum, android.R.drawable.star_big_on));
        historyList.add(new HistoryModel("DG set 2","Delivered","17-Sept-2019","24-Sept-2019", "John carter\n"+R.string.lorem_ipsum, android.R.drawable.star_big_on));
        historyList.add(new HistoryModel("DG set 3 Repair","Repaired","14-Sept-2019","24-Sept-2019", "John carter\n"+R.string.lorem_ipsum, android.R.drawable.star_big_on));
        historyList.add(new HistoryModel("DG set Service","Serviced","19-Sept-2019","24-Sept-2019", "John carter\n"+R.string.lorem_ipsum, android.R.drawable.star_big_on));

        HistoryAdapter adapter = new HistoryAdapter(historyList);
        RecyclerView historyRecycler = view.findViewById(R.id.recycler_History);
        historyRecycler.setAdapter(adapter);
        return view;
    }

}
