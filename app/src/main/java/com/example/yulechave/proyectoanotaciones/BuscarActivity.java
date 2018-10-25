package com.example.yulechave.proyectoanotaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static com.example.yulechave.proyectoanotaciones.MainActivity.blocnotas;

public class BuscarActivity extends AppCompatActivity implements View.OnClickListener{

    public EditText txtTitulo, txtFecha, txtMes;
    public Button btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
        txtTitulo=findViewById(R.id.txtTituloAgregar);
        txtFecha=findViewById(R.id.txtFecha);
        txtMes=findViewById(R.id.txtMes);
        btnBuscar=findViewById(R.id.btnBuscar);
        btnBuscar.setOnClickListener(this);
        if (txtTitulo.isFocused()){
            txtTitulo.setEnabled(true);
            txtFecha.setEnabled(false);
            txtMes.setEnabled(false);
        }
        else if (txtFecha.isFocused()){
            txtFecha.setEnabled(true);
            txtTitulo.setEnabled(false);
            txtMes.setEnabled(false);
        }else if (txtMes.isFocused()){
            txtMes.setEnabled(true);
            txtTitulo.setEnabled(false);
            txtFecha.setEnabled(false);
        }
    }

    public void onClick(View v){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Anotacion a;
        ArrayList<Anotacion> anotMes = new ArrayList<Anotacion>();
        if(v==btnBuscar){
            if(txtTitulo.isEnabled()){
                a=blocnotas.Buscar(txtTitulo.getText().toString());
            }else if (txtFecha.isEnabled()) {
                a=blocnotas.Buscar(LocalDate.parse(txtFecha.getText().toString(), formatter));
            }else if (txtMes.isEnabled()){
                anotMes=blocnotas.Buscar(Integer.parseInt(txtMes.getText().toString()));
            }
        }

    }
}
