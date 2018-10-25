package com.example.yulechave.proyectoanotaciones;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.example.yulechave.proyectoanotaciones.MainActivity.blocnota;

public class ModificarActivity extends Activity implements View.OnClickListener{

    private EditText txtTitulo, txtFecha, txtAnotacion;
    private Button btnModificar, btnBuscar, btnReset;
    Anotacion a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        a=null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar);
        txtAnotacion=findViewById(R.id.txtAnotacionModificar);
        txtFecha=findViewById(R.id.txtFechaModificar);
        txtTitulo=findViewById(R.id.txtTituloModificar);
        btnBuscar=findViewById(R.id.btnBuscarEliminar);
        btnModificar=findViewById(R.id.btnModificar);
        btnReset=findViewById(R.id.btnReset);
        btnModificar.setOnClickListener(this);
        btnBuscar.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btnModificar){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            if(a != null){
                AlertDialog ad= new AlertDialog.Builder(this).create();
                ad.setMessage("No se busco ninguna anotacion.");
                ad.show();
            }else{
                if(txtTitulo.getText().toString()!="" && txtAnotacion.getText().toString()!="" && txtFecha.getText().toString()!="") {
                    blocnota.Modificar(blocnota.Buscar(a), txtAnotacion.getText().toString(), LocalDate.parse(txtFecha.getText().toString(), formatter), txtTitulo.getText().toString());
                }else{
                    AlertDialog ad= new AlertDialog.Builder(this).create();
                    ad.setMessage("Escribe en todos las cajas de texto");
                    ad.show();
                }
            }
        }else if(v==btnBuscar){
            a = blocnota.Buscar(txtTitulo.getText().toString());
            txtFecha.setText(a.getFecha().toString());
            txtAnotacion.setText(a.getAnotacion().toString());
        }else if(v==btnReset){
            a=null;
            txtAnotacion.setText("");
            txtFecha.setText("");
            txtTitulo.setText("");
        }
    }

}
