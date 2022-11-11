package com.example.fikacoffee.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fikacoffee.MainActivity;
import com.example.fikacoffee.R;
import com.example.fikacoffee.adapter.CoffeeAdapter;
import com.example.fikacoffee.modelo.Coffee;
import com.example.fikacoffee.modelo.CoffeeViewModel;


public class ListCoffee extends Fragment {


    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        CoffeeViewModel viewModel= new ViewModelProvider(getActivity()).get(CoffeeViewModel.class);

        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_list_coffee, container, false);
        recyclerView=view.findViewById(R.id.list_coffee_recycler_fragment);

        LinearLayoutManager lm= new LinearLayoutManager(getActivity());
        lm.setOrientation(RecyclerView.VERTICAL);
        CoffeeAdapter adapter=new CoffeeAdapter(getActivity(),R.layout.item, viewModel.getCoffeeList());
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);


        return view;
    }
}