package com.example.yulechave.proyectoanotaciones;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.yulechave.proyectoanotaciones.MainActivity.blocnota;

public class EliminarActivity extends Activity implements View.OnClickListener{
    EditText txttitulo,txtfecha,txtanotacion;
    Button btnBuscar,btneliminat;
    Anotacion a;
    TextView lblFecha, lblAnotacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar);
        txttitulo=findViewById(R.id.txtTituloEliminar);
        txtanotacion=findViewById(R.id.txtAnotacioneliminar);
        txtfecha=findViewById(R.id.txtFechaeliminar);
        btnBuscar=findViewById(R.id.btnBuscarEliminar);
        btneliminat=findViewById(R.id.btnEliminar);
        btnBuscar.setOnClickListener(this);
        btneliminat.setOnClickListener(this);
        lblAnotacion=findViewById(R.id.lblAnotacion);
        lblFecha=findViewById(R.id.lblFecha);
        a=null;
    }

    @Override
    public void onClick(View v) {
        if(v==btnBuscar){
            if(txttitulo.getText().toString()!=""){
                a=blocnota.Buscar(txttitulo.getText().toString());
                txtfecha.setText(a.getFecha().toString());
                txtanotacion.setText(a.getAnotacion());
                txtanotacion.setVisibility(View.VISIBLE);
                txtfecha.setVisibility(View.VISIBLE);
                btneliminat.setVisibility(View.VISIBLE);
                lblFecha.setVisibility(View.VISIBLE);
                lblAnotacion.setVisibility(View.VISIBLE);
            }
        }else if(v==btneliminat){
            blocnota.Eliminar(a);
        }
    }
}
