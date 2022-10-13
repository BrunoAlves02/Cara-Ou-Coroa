package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class ResultadoActivity extends AppCompatActivity {

    private Button btnVoltar;
    private ImageView imgResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        btnVoltar = findViewById(R.id.btnVoltar);
        imgResultado = findViewById(R.id.imgResultado);

        //recuperar dados
        Bundle dados = getIntent().getExtras();
        int numeroRandomico = dados.getInt("numero");

        if (numeroRandomico == 0){
            imgResultado.setImageResource(R.drawable.moeda_cara);
        }else {
            imgResultado.setImageResource(R.drawable.moeda_coroa);
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //startActivity(intent);

                finish();

            }
        });




    }
}