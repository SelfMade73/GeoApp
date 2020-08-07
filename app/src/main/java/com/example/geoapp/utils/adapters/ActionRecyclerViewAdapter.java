package com.example.geoapp.utils.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.geoapp.R;
import com.example.geoapp.models.list_items.ActionItem;
import com.example.geoapp.utils.view_holders.ActionViewHolder;

import java.util.List;

public class ActionRecyclerViewAdapter extends RecyclerView.Adapter<ActionViewHolder> {

    private List<ActionItem> actionItemList;

    public ActionRecyclerViewAdapter( List<ActionItem> list){
        this.actionItemList = list;
    }

    @NonNull
    @Override
    public ActionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.action_list_item,parent,false);
        return new ActionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActionViewHolder holder, int position) {
        holder.setImageView((this.actionItemList.get(position).getImage()));
        holder.getAction().setText(this.actionItemList.get(position).getAction());
        holder.getUsername().setText(this.actionItemList.get(position).getUsername());
        holder.getTime().setText(this.actionItemList.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return this.actionItemList.size();
    }
}
