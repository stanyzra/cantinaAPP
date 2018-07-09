package com.example.aluno.cantina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ProdutosActivity extends AppCompatActivity {

    Button botaoMais;
    Button botaoMenos;
    TextView qtde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        botaoMais = (Button) findViewById(R.id.buttonMaisSalgado);
        botaoMais = (Button) findViewById(R.id.buttonMaisRefri);
        botaoMais = (Button) findViewById(R.id.buttonMaisBalas);
        botaoMais = (Button) findViewById(R.id.buttonMaisPirulito);
        botaoMais = (Button) findViewById(R.id.buttonMaisCapu);

        botaoMenos = (Button) findViewById(R.id.buttonMenosSalgado);
        botaoMenos = (Button) findViewById(R.id.buttonMenosRefri);
        botaoMenos = (Button) findViewById(R.id.buttonMenosBalas);
        botaoMenos = (Button) findViewById(R.id.buttonMenosPirulito);
        botaoMenos = (Button) findViewById(R.id.buttonMenosCapu);


    }
}
