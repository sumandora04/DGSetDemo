package com.notepoint.dgsetdemo.home.history.historyOverview;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.notepoint.dgsetdemo.R;

import java.util.ArrayList;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment implements HistoryAdapter.OnHistorySelectListener{

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
        historyList.add(new HistoryModel("DG set 1","Delivered","19-Sept-2019","24-Sept-2019", "John carter\n"+R.string.lorem_ipsum, R.drawable.generator_icon));
        historyList.add(new HistoryModel("DG set Service","Serviced","15-Sept-2019","24-Sept-2019", "John carter\n"+R.string.lorem_ipsum, R.drawable.generator_icon));
        historyList.add(new HistoryModel("DG set 2","Delivered","17-Sept-2019","24-Sept-2019", "John carter\n"+R.string.lorem_ipsum, R.drawable.generator_icon));
        historyList.add(new HistoryModel("DG set 3 Repair","Repaired","14-Sept-2019","24-Sept-2019", "John carter\n"+R.string.lorem_ipsum, R.drawable.generator_icon));
        historyList.add(new HistoryModel("DG set Service","Serviced","19-Sept-2019","24-Sept-2019", "John carter\n"+R.string.lorem_ipsum, R.drawable.generator_icon));

        HistoryAdapter adapter = new HistoryAdapter(historyList, this);
        RecyclerView historyRecycler = view.findViewById(R.id.recycler_History);
        historyRecycler.setAdapter(adapter);
        return view;
    }

    @Override
    public void onNewHistorySelect(int position) {
        Navigation.findNavController(Objects.requireNonNull(getActivity()),R.id.nav_host_fragment).navigate(R.id.action_historyFragment_to_historyDetailFragment);
    }
}
