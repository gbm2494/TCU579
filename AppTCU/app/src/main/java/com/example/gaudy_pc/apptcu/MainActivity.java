package com.example.gaudy_pc.apptcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Método para el cambio de pantalla para configurar el bluetooth del botón iniciar*/
    public void accionBtnIniciar(View view) {

        Intent intent = new Intent(this, Despliegue.class);
        startActivity(intent);
    }
}
