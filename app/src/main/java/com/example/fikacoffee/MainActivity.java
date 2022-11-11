package com.example.fikacoffee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.fikacoffee.adapter.CoffeeAdapter;
import com.example.fikacoffee.fragments.Detail;
import com.example.fikacoffee.fragments.ListCoffee;
import com.example.fikacoffee.modelo.Coffee;
import com.example.fikacoffee.modelo.CoffeeViewModel;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    //declaramos la clase MaterialToolbar y se la asignamos a toolbar
    private MaterialToolbar toolbar;
    private RecyclerView recyclerView;
    private CoffeeViewModel viewModel;
    //atributos del fragmento

    private Fragment fragment;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    public static final String NAME_COFFEE="1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //implementación del toolbar
        setContentView(R.layout.activity_main);

        //inicializamos view model para cargar los fragmentos
        viewModel = new ViewModelProvider(this).get(CoffeeViewModel.class);

        toolbar = findViewById(R.id.appbar_toolbar);
        //soporte de toolbar
        setSupportActionBar(toolbar);
        //desabilita el titulo por defecto
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("");
        toolbar.setSubtitle("");
        //carga la listCoffe
        loadFragmentCoffeeList();

        }
        public void loadFragmentCoffeeList(){

        Fragment fragment = new ListCoffee();
        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_container,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();

        }
    //metodo que muestra la interfas main_menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    //metodo que recibe la opcion seleccionada
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_option1:
                Intent intent=new Intent(this,Developers.class);
                startActivity(intent);
        }
        return true;
    }


}