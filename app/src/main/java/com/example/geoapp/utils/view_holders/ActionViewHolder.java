package com.example.geoapp.utils.view_holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.geoapp.R;

public class ActionViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView username;
    private TextView action;
    private TextView time;

    public ActionViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView = itemView.findViewById(R.id.action_avatar);
        this.username = itemView.findViewById(R.id.action_username);
        this.action = itemView.findViewById(R.id.action_desc);
        this.time = itemView.findViewById(R.id.action_time);
    }

    public void setImageView(int res) {
        this.imageView .setImageResource(res);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public TextView getUsername() {
        return username;
    }

    public TextView getAction() {
        return action;
    }

    public TextView getTime() {
        return time;
    }

    public void setUsername(TextView username) {
        this.username = username;
    }

    public void setAction(TextView action) {
        this.action = action;
    }

    public void setTime(TextView time) {
        this.time = time;
    }
}
