package com.example.geoapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.geoapp.models.list_items.ActionItem;
import com.example.geoapp.utils.adapters.ActionRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class ActionFragment extends Fragment {

    //public RecyclerViewAdapterTasks recyclerViewAdapter;
    public RecyclerView recyclerView;
    ActionRecyclerViewAdapter adapter;

    public ActionFragment() {
        List<ActionItem> list = new ArrayList<>();
        list.add( new ActionItem(R.drawable.test2,"Kostya Malay", "Started following you", "2 w"));
        list.add( new ActionItem(R.drawable.test2,"Агафонов Лешка", "liked your mark \"Bali\"" , "1 w"));
        list.add( new ActionItem(R.drawable.test,"КаМАЗ", "Started following you", "3 d"));
        list.add( new ActionItem(R.drawable.test2,"Kostya молодой", "liked your ark", "34 m"));
        list.add( new ActionItem(R.drawable.test,"КЕК", "Added your mark to favorites", "32 w"));
        list.add( new ActionItem(R.drawable.test,"Старшина романюк", "Started following you", "2 w"));
        list.add( new ActionItem(R.drawable.test2,"Ефрейтор Русаков", "Started following you", "23 w"));
        list.add( new ActionItem(R.drawable.test,"Хер ебаный", "Started following you", "1 w"));
        list.add( new ActionItem(R.drawable.test2,"Глиномес петя", "Started following you", "4 h"));
        list.add( new ActionItem(R.drawable.test2,"Илья малофья", "Started following you", "22 w"));
        list.add( new ActionItem(R.drawable.test,"Стас пидорас", "Started following you", "23 w"));
        list.add( new ActionItem(R.drawable.test2,"Володя ввп", "Started following you", "32 w"));
        list.add( new ActionItem(R.drawable.test,"Серега ебанарот", "Started following you", "2 w"));
        list.add( new ActionItem(R.drawable.test,"Для друзей лютый", "Started following you", "3 w"));
        adapter = new ActionRecyclerViewAdapter(list);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_action, container, false);
        recyclerView = view.findViewById(R.id.action_recycle_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);


        return view;
    }
}
