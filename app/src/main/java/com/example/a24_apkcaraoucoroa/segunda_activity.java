package com.example.a24_apkcaraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.Serializable;

public class segunda_activity extends AppCompatActivity {

     ImageView imageMoeda, imageVoltar;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.segunda_activity);

          imageVoltar = findViewById(R.id.imageVoltar);
          imageMoeda  = findViewById(R.id.imageMoeda);

          //Class que recebe o Array de informacoes.
          Bundle dadosPassados = getIntent().getExtras();

          //Recebendo dados
          int aleatorio = dadosPassados.getInt("aleatorio");

          //Tratando dados recebidos
          if(aleatorio == 1){//Coroa
               imageMoeda.setImageResource(R.drawable.moeda_coroa);
          } else {//Cara
               imageMoeda.setImageResource(R.drawable.moeda_cara);
          }

          imageVoltar.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                    finish();//Metodo que encerra a segunda_activity
               }
          });
     }
}