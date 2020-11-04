package com.pedro_g.aplicandoactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Confirmaciondatos extends AppCompatActivity {

    TextView tvName;
    TextView tvDate;
    TextView tvPhone;
    TextView tvEmail;
    TextView tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmaciondatos);

        tvName = (TextView)findViewById(R.id.tvName);
        tvDate = (TextView)findViewById(R.id.tvDate);
        tvPhone = (TextView)findViewById(R.id.tvPhone);
        tvEmail = (TextView)findViewById(R.id.tvEmail);
        tvDescription = (TextView)findViewById(R.id.tvDescripcion);

        Bundle bundleName = getIntent().getExtras();
        Bundle bundleDate = getIntent().getExtras();
        Bundle bundlePhone = getIntent().getExtras();
        Bundle bundleEmail = getIntent().getExtras();
        Bundle bundleDescription = getIntent().getExtras();

        String datoName = bundleName.getString("InfoNombre").toString();
        String datoDate = bundleDate.getString("InfoFecha".toString());
        String datoPhone = bundlePhone.getString("InfoTelefono".toString());
        String datoEmail = bundleEmail.getString("InfoEmail".toString());
        String datoDescription = bundleDescription.getString("InfoDescripcion".toString());

        tvName.setText("Nombre completo: " + datoName);
        tvDate.setText("Fecha de nacimiento: " + datoDate);
        tvPhone.setText("Telefono: " + datoPhone);
        tvEmail.setText("E-mail: " + datoEmail);
        tvDescription.setText("Descripción: " + datoDescription);
    }

    public void onClick(View View){
        Intent myIntent=new Intent(Confirmaciondatos.this,MainActivity.class);
        finish();
    }
}