package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnJogar;
    private int numeroAleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = findViewById(R.id.btnJogar);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //chamar nova activity
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                //cria o numero aleatorio
                numeroAleatorio = new Random().nextInt(2);
                intent.putExtra("numero", numeroAleatorio);

                //iniciar a  activity
                startActivity(intent);

            }
        });



    }
}