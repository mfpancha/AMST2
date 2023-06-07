package com.example.appamst2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private EditText edtUsuario, edtClave;
    private Button btnLogin, btnRegistro;
    private FloatingActionButton fab_video, fab_calendar, fab_map, fab_chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencias a los controles del diseño
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtClave = (EditText) findViewById(R.id.edtClave);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegistro = (Button) findViewById(R.id.btnRegistro);

        // Referencia al botón flotante componente video view
        fab_video = findViewById(R.id.fab_video);

        // Agregar listener al botón flotante del componente video view
        fab_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acciones a realizar cuando se hace clic en el botón flotante del componente video view
                Toast.makeText(MainActivity.this, "Botón flotante del video presionado", Toast.LENGTH_SHORT).show();
            }
        });

        // Referencia al botón flotante del componente calendar view
        fab_calendar = findViewById(R.id.fab_calendar);

        // Agregar listener al botón flotante del componente calendar view
        fab_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acciones a realizar cuando se hace clic en el botón flotante del componente calendar view
                Toast.makeText(MainActivity.this, "Botón flotante de calendar view presionado", Toast.LENGTH_SHORT).show();
            }
        });

        // Referencia al botón flotante del componente map
        fab_map = findViewById(R.id.fab_map);

        // Agregar listener al botón flotante del componente map
        fab_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acciones a realizar cuando se hace clic en el botón flotante del componente map
                Toast.makeText(MainActivity.this, "Botón flotante de map presionado", Toast.LENGTH_SHORT).show();
            }
        });

        // Referencia al botón flotante del componente chart
        fab_chart = findViewById(R.id.fab_chart);

        // Agregar listener al botón flotante del componente chart
        fab_chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acciones a realizar cuando se hace clic en el botón flotante del del componente chart
                Toast.makeText(MainActivity.this, "Botón flotante de chart presionado", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void registrarse(View view) {
        Intent intent = new Intent(this, formulario_registro.class);
        startActivity(intent);
    }

    public void login(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"Usted no cuenta con un usuario",Toast.LENGTH_SHORT);

        toast.show();
    }

    public void onClick(View v) {
        if(v.getId() == R.id.btnLogin){
            Log.d("mensaje","ïngreso");

        }else if(v.getId() == R.id.btnRegistro) {
        }
    }
}