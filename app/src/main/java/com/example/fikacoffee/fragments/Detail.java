package com.example.fikacoffee.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.fikacoffee.R;
import com.example.fikacoffee.modelo.Coffee;
import com.example.fikacoffee.modelo.CoffeeViewModel;


public class Detail extends Fragment {

        RecyclerView recyclerView;

        private ImageView img;
        private TextView txt_name,txt_description;
        public RelativeLayout container;

    private String name;
    public Detail(String name) {

        this.name=name;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_detail, container, false);
        CoffeeViewModel viewModel= new ViewModelProvider(getActivity()).get(CoffeeViewModel.class);
        img= view.findViewById(R.id.detail_img);
        txt_name=view.findViewById(R.id.detail_title);
        txt_description=view.findViewById(R.id.detail_detail);
        container=view.findViewById(R.id.detail_container);
        Coffee coffee=viewModel.findCoffee(name);
        img.setImageResource(coffee.getImage());
        txt_name.setText(coffee.getName());
        txt_description.setText(coffee.getDescription());
        container.setBackground(getActivity().getDrawable(coffee.getColor()));
        return view;
    }
}