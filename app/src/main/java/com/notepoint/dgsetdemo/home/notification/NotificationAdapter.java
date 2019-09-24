package com.notepoint.dgsetdemo.home.notification;

import android.app.Notification;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.notepoint.dgsetdemo.R;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationHolder> {

    ArrayList<NotificationModel> notificationList;

    public NotificationAdapter(ArrayList<NotificationModel> notificationList) {
        this.notificationList = notificationList;
    }

    @NonNull
    @Override
    public NotificationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_list_single_cell,parent,false);
        return new NotificationHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationHolder holder, int position) {
        NotificationModel notification = notificationList.get(position);
        holder.title.setText(notification.getNotificationTitle());
        holder.message.setText(notification.getNotificationMessage());

    }

    @Override
    public int getItemCount() {
        return notificationList.size();
    }

    public class NotificationHolder extends RecyclerView.ViewHolder {
        TextView title, message;
        public NotificationHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.notification_title_text_view);
            message = itemView.findViewById(R.id.notification_message_text_view);
        }
    }
}
