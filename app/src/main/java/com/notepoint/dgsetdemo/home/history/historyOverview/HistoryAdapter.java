package com.notepoint.dgsetdemo.home.history.historyOverview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.notepoint.dgsetdemo.R;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryHolder> {

    ArrayList<HistoryModel> historyList;
    private OnHistorySelectListener onHistorySelectListener;

    public HistoryAdapter(ArrayList<HistoryModel> historyList, OnHistorySelectListener onHistorySelectListener) {
        this.historyList = historyList;
        this.onHistorySelectListener = onHistorySelectListener;
    }

    @NonNull
    @Override
    public HistoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_history_cell,parent,false);
        return new HistoryHolder(view, onHistorySelectListener);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryHolder holder, int position) {

        HistoryModel historyModel = historyList.get(position);
        holder.productImage.setImageResource(historyModel.getImageUrl());
        holder.productName.setText(historyModel.getProductServiceName());
        holder.lastActionStatusDate.setText(historyModel.getStatus()+":"+historyModel.getDeliveryDate());
    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }

    public class HistoryHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView productImage;
        TextView productName, lastActionStatusDate;
        OnHistorySelectListener onHistorySelectListener;
        public HistoryHolder(@NonNull View itemView, OnHistorySelectListener onHistorySelectListener) {
            super(itemView);

            this.onHistorySelectListener = onHistorySelectListener;

            productImage = itemView.findViewById(R.id.product_service_image);
            productName = itemView.findViewById(R.id.product_service_title);
            lastActionStatusDate = itemView.findViewById(R.id.product_service_status_text_view);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            onHistorySelectListener.onNewHistorySelect(getAdapterPosition());
        }
    }


    public interface OnHistorySelectListener {
        void onNewHistorySelect(int position);
    }
}
