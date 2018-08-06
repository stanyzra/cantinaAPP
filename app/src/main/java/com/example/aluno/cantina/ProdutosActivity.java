package com.example.aluno.cantina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProdutosActivity extends AppCompatActivity {

    final double precoSalgado = 3.80;
    final double precoRefri = 1.50;
    final double precoBalas = 0.10;
    final double precoPirulito = 0.50;
    final double precoCapu = 2.0;

    private Button botaoMaisSalgado = (Button) findViewById(R.id.buttonMaisSalgado);
    private Button botaoMaisRefri = (Button) findViewById(R.id.buttonMaisRefri);
    private Button botaoMaisBalas = (Button) findViewById(R.id.buttonMaisBalas);
    private Button botaoMaisPirulito = (Button) findViewById(R.id.buttonMaisPirulito);
    private Button botaoMaisCapu = (Button) findViewById(R.id.buttonMaisCapu);

    private Button botaoMenosSalgado = (Button) findViewById(R.id.buttonMaisSalgado);
    private Button botaoMenosRefri = (Button) findViewById(R.id.buttonMaisRefri);
    private Button botaoMenosBalas = (Button) findViewById(R.id.buttonMaisBalas);
    private Button botaoMenosPirulito = (Button) findViewById(R.id.buttonMaisPirulito);
    private Button botaoMenosCapu = (Button) findViewById(R.id.buttonMaisCapu);

    private Button botaoPrecoFinal = (Button) findViewById(R.id.buttonPrecoFinal);

    private TextView mostrarQtde;
    private TextView mostrarPreco;

    private int qtdeSalg = 0;
    private int qtdeRefri = 0;
    private int qtdeBalas = 0;
    private int qtdePirulito = 0;
    private int qtdeCapu = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        botaoMaisSalgado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeSalgado);

                qtdeSalg = qtdeSalg+1;

                mostrarQtde.setText(""+qtdeSalg);
            }
        });

        botaoMaisRefri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeRefri);

                qtdeRefri = qtdeRefri+1;

                mostrarQtde.setText(""+qtdeRefri);
            }
        });

        botaoMaisBalas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeBalas);

                qtdeBalas = qtdeBalas+1;

                mostrarQtde.setText(""+qtdeBalas);
            }
        });

        botaoMaisPirulito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdePirulito);

                qtdePirulito = qtdePirulito+1;

                mostrarQtde.setText(""+qtdePirulito);
            }
        });

        botaoMaisCapu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeCapu);

                qtdeCapu = qtdeCapu+1;

                mostrarQtde.setText(""+qtdeCapu);
            }
        });

        botaoMenosSalgado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeSalgado);

                qtdeSalg = qtdeSalg-1;

                mostrarQtde.setText(""+qtdeSalg);
            }
        });

        botaoMenosRefri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeRefri);

                qtdeRefri = qtdeRefri-1;

                mostrarQtde.setText(""+qtdeRefri);
            }
        });

        botaoMenosBalas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeBalas);

                qtdeBalas = qtdeBalas-1;

                mostrarQtde.setText(""+qtdeBalas);
            }
        });

        botaoMenosPirulito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdePirulito);

                qtdePirulito = qtdePirulito-1;

                mostrarQtde.setText(""+qtdePirulito);
            }
        });

        botaoMenosCapu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeCapu);

                qtdeCapu = qtdeCapu-1;

                mostrarQtde.setText(""+qtdeCapu);
            }
        });

        botaoPrecoFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarPreco = (TextView) findViewById(R.id.precoFinal);

                double preco = (precoSalgado*qtdeSalg) + (precoRefri*qtdeRefri) + (precoBalas*qtdeBalas) +
                        (precoPirulito*qtdePirulito) + (precoCapu*qtdeCapu);

                mostrarPreco.setText(""+preco);
            }
        });
    }
}
