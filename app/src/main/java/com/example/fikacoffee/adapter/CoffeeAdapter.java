package com.example.fikacoffee.adapter;

import android.app.Activity;
import android.app.BackgroundServiceStartNotAllowedException;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fikacoffee.Developers;
import com.example.fikacoffee.MainActivity;
import com.example.fikacoffee.R;
import com.example.fikacoffee.fragments.Detail;
import com.example.fikacoffee.modelo.Coffee;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.CoffeHolder> {

    //Declaramos la variables a utilizar que son los mismos componentes que utilizamos en el item
    private Activity activity;
    private int layout;
    private List<Coffee> coffeeList;


    public CoffeeAdapter(Activity activity, int layout, List<Coffee> coffeeList) {
        this.activity = activity;
        this.layout = layout;
        this.coffeeList = coffeeList;
    }

    @NonNull
    @Override
    public CoffeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //instaciamos la clase view y atraves de LayoutInflater pasamos al padre, el contexto y con
        //el metodo inflater mostramos el layout el padre y declaramos que falso por defecto
        View view= LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        //retornamos un TeaHolder y pasamos el poder de view y pueda buscar los elementos e inicializarlos
        return new CoffeHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CoffeHolder holder, int position) {
        Coffee coffee=coffeeList.get(position);
        holder.txt_title.setText(coffee.getName());
        holder.img.setImageResource(coffee.getImage());
        holder.container.setBackground(activity.getDrawable(coffee.getColor()));

    }

    @Override
    public int getItemCount() {
        return coffeeList.size();
    }


    public class CoffeHolder extends RecyclerView.ViewHolder{
        //utilizamos el CarView de Material
        public MaterialCardView card;
        public ImageView img;
        public TextView txt_title,txt_price,txt_description;
        public RelativeLayout container;

        public CoffeHolder(@NonNull View itemView) {
            super(itemView);
            txt_title=itemView.findViewById(R.id.item_title);
            img=itemView.findViewById(R.id.item_img);
            card=itemView.findViewById(R.id.item_card);
            container=itemView.findViewById(R.id.item_layout);


            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   MainActivity mainActivity=(MainActivity) itemView.getContext();
                   FragmentTransaction fragmentTransaction= mainActivity.getSupportFragmentManager().beginTransaction();
                   Fragment fragment= new Detail(txt_title.getText().toString());
                   fragmentTransaction.replace(R.id.main_container,fragment);
                   fragmentTransaction.addToBackStack(null);
                   fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                   fragmentTransaction.commit();

                }
            });
        }
    }
}
