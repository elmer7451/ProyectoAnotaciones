package com.example.yulechave.proyectoanotaciones;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.example.yulechave.proyectoanotaciones.MainActivity.blocnota;

public class AgregarActivity extends Activity implements View.OnClickListener {

    public EditText txtTitulo, txtFecha, txtAnotacion;
    public Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        txtAnotacion=findViewById(R.id.txtAnotacionAgregar);
        txtFecha=findViewById(R.id.txtFechaAgregar);
        txtTitulo=findViewById(R.id.txtTituloAgregar);
        btnAgregar=findViewById(R.id.btnAgregar);
        btnAgregar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if(v==btnAgregar) {
            Anotacion a = new Anotacion(txtTitulo.getText().toString(), LocalDate.parse(txtFecha.getText().toString(),formatter),txtAnotacion.getText().toString());
            blocnota.Agregar(a);
        }
    }
}
