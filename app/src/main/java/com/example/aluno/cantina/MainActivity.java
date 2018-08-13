package com.example.aluno.cantina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaoProd;
    Button sobreNos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoProd = (Button) findViewById(R.id.buttonProdutos);
        sobreNos = (Button) findViewById(R.id.buttonNos);

        botaoProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ProdutosActivity.class));

            }
        });
    }
}
