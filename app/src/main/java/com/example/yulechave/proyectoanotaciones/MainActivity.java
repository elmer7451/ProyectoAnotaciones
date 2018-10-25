package com.example.yulechave.proyectoanotaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public static MODELVIEW blocnota = new MODELVIEW();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blocnota = new MODELVIEW();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi=getMenuInflater();
        mi.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.agregar){
            Intent i = new Intent (this,AgregarActivity.class);
            startActivity(i);
        }else if (item.getItemId()==R.id.modificar){
            Intent i = new Intent(this,ModificarActivity.class);
            startActivity(i);
        }else if (item.getItemId()==R.id.buscar) {
            Intent i = new Intent(this, BuscarActivity.class);
            startActivity(i);
        }else if (item.getItemId()==R.id.eliminar){
            Intent i = new Intent(this, EliminarActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
