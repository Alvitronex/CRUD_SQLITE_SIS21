package com.itca.crud_sqlite_sis21;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.itca.crud_sqlite_sis21.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener{

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    private EditText et_descripcion, et_precio, et_codigo;
    private Button btnAlta, btnConsultar1, btnConsultar2, btnEliminar, btnActualizar, btnNuevo, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        /*NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);*/

        et_codigo = findViewById(R.id.et_codigo);
        et_descripcion = findViewById(R.id.et_descipcion);
        et_precio = findViewById(R.id.et_precio);
        btnAlta = findViewById(R.id.btnAlta);
        btnConsultar1 = findViewById(R.id.btnConsultar1);
        btnConsultar2 = findViewById(R.id.btnConsultar2);
        btnEliminar = findViewById(R.id.btnEliminar);
        btnActualizar = findViewById(R.id.btnActualizar);
        btnNuevo = findViewById(R.id.btnNuevo);
        btnSalir = findViewById(R.id.btnSalir);

        btnAlta.setOnClickListener(this);
        btnConsultar1.setOnClickListener(this);
        btnConsultar2.setOnClickListener(this);
        btnEliminar.setOnClickListener(this);
        btnActualizar.setOnClickListener(this);
        btnNuevo.setOnClickListener(this);
        btnSalir.setOnClickListener(this);


        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello I've a new history for you is about this, the program is a technology for the world, Did you know about?" +
                        "The animal isn't always worst!!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
    {
            case R.id.btnAlta:
                Toast.makeText(this,"has hecho click en el boton Alta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnConsultar1:
                Toast.makeText(this,"has hecho click en el boton Consultar por codigo", Toast.LENGTH_SHORT).show();
                break;
        case R.id.btnConsultar2:
            Toast.makeText(this,"has hecho click en el boton Consultar por descripcion", Toast.LENGTH_SHORT).show();
            break;
        case R.id.btnEliminar:
            Toast.makeText(this,"has hecho click en el boton Eliminar", Toast.LENGTH_SHORT).show();
            break;
        case R.id.btnActualizar:
            Toast.makeText(this,"has hecho click en el boton Actualizar", Toast.LENGTH_SHORT).show();
            break;
        case R.id.btnNuevo:
            Toast.makeText(this,"has hecho click en el boton Nuevo", Toast.LENGTH_SHORT).show();
            break;
        case R.id.btnSalir:
            Toast.makeText(this,"has hecho click en el boton Salir", Toast.LENGTH_SHORT).show();
            break;

        }
    }
/*
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }*/
}