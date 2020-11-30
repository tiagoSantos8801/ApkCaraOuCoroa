package com.example.a24_apkcaraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

     private ImageView imageJogar;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);

          imageJogar = findViewById(R.id.imageJogar);

          imageJogar.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                    //Caminho da class
                    Intent intent = new Intent(getApplicationContext(), segunda_activity.class);

                    //Passando dados
                    int aleatorio = new Random().nextInt(2);
                    intent.putExtra("aleatorio", aleatorio);

                    //Chamando a classe
                    startActivity(intent);
               }
          });
     }
}