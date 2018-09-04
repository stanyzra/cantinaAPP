package com.example.aluno.cantina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class ProdutosActivity extends AppCompatActivity {

    final double precoSalgado = 3.80;
    final double precoRefri = 1.50;
    final double precoBalas = 0.10;
    final double precoPirulito = 0.50;
    final double precoCapu = 2.0;

    private TextView mostrarQtde;
    private TextView mostrarPreco;
    private TextView mostrarTroco;

    private int qtdeSalg = 0;
    private int qtdeRefri = 0;
    private int qtdeBalas = 0;
    private int qtdePirulito = 0;
    private int qtdeCapu = 0;

    DecimalFormat df;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

         Button botaoMaisSalgado = (Button) findViewById(R.id.buttonMaisSalgado);
         Button botaoMaisRefri = (Button) findViewById(R.id.buttonMaisRefri);
         Button botaoMaisBalas = (Button) findViewById(R.id.buttonMaisBalas);
         Button botaoMaisPirulito = (Button) findViewById(R.id.buttonMaisPirulito);
         Button botaoMaisCapu = (Button) findViewById(R.id.buttonMaisCapu);

         Button botaoMenosSalgado = (Button) findViewById(R.id.buttonMenosSalgado);
         Button botaoMenosRefri = (Button) findViewById(R.id.buttonMenosRefri);
         Button botaoMenosBalas = (Button) findViewById(R.id.buttonMenosBalas);
         Button botaoMenosPirulito = (Button) findViewById(R.id.buttonMenosPirulito);
         Button botaoMenosCapu = (Button) findViewById(R.id.buttonMenosCapu);

         Button botaoPrecoFinal = (Button) findViewById(R.id.buttonPrecoFinal);

        mostrarPreco = (TextView) findViewById(R.id.precoFinal);
        mostrarTroco = (TextView) findViewById(R.id.textViewTroco);

         final EditText editValorInformado = (EditText) findViewById(R.id.editTextTroco);

         df = new DecimalFormat("#0.00");




        botaoMaisSalgado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeSalgado);

                qtdeSalg = qtdeSalg+1;

                mostrarQtde.setText(""+qtdeSalg);

                double preco = (precoSalgado*qtdeSalg) + (precoRefri*qtdeRefri) + (precoBalas*qtdeBalas) +
                        (precoPirulito*qtdePirulito) + (precoCapu*qtdeCapu);

                mostrarPreco.setText("Preço final: "+df.format(preco));


            }
        });

        botaoMaisRefri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeRefri);

                qtdeRefri = qtdeRefri+1;

                mostrarQtde.setText(""+qtdeRefri);

                double preco = (precoSalgado*qtdeSalg) + (precoRefri*qtdeRefri) + (precoBalas*qtdeBalas) +
                        (precoPirulito*qtdePirulito) + (precoCapu*qtdeCapu);

                mostrarPreco.setText("Preço final: "+df.format(preco));

            }
        });

        botaoMaisBalas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeBalas);

                qtdeBalas = qtdeBalas+1;

                mostrarQtde.setText(""+qtdeBalas);

                double preco = (precoSalgado*qtdeSalg) + (precoRefri*qtdeRefri) + (precoBalas*qtdeBalas) +
                        (precoPirulito*qtdePirulito) + (precoCapu*qtdeCapu);

                mostrarPreco.setText("Preço final: "+df.format(preco));


            }
        });

        botaoMaisPirulito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdePirulito);

                qtdePirulito = qtdePirulito+1;

                mostrarQtde.setText(""+qtdePirulito);

                double preco = (precoSalgado*qtdeSalg) + (precoRefri*qtdeRefri) + (precoBalas*qtdeBalas) +
                        (precoPirulito*qtdePirulito) + (precoCapu*qtdeCapu);

                mostrarPreco.setText("Preço final: "+df.format(preco));


            }
        });

        botaoMaisCapu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeCapu);

                qtdeCapu = qtdeCapu+1;

                mostrarQtde.setText(""+qtdeCapu);

                double preco = (precoSalgado*qtdeSalg) + (precoRefri*qtdeRefri) + (precoBalas*qtdeBalas) +
                        (precoPirulito*qtdePirulito) + (precoCapu*qtdeCapu);

                mostrarPreco.setText("Preço final: "+df.format(preco));


            }
        });

        botaoMenosSalgado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeSalgado);

                qtdeSalg = qtdeSalg-1;

                mostrarQtde.setText(""+qtdeSalg);

                double preco = (precoSalgado*qtdeSalg) + (precoRefri*qtdeRefri) + (precoBalas*qtdeBalas) +
                        (precoPirulito*qtdePirulito) + (precoCapu*qtdeCapu);

                mostrarPreco.setText("Preço final: "+df.format(preco));

            }
        });

        botaoMenosRefri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeRefri);

                qtdeRefri = qtdeRefri-1;

                mostrarQtde.setText(""+qtdeRefri);

                double preco = (precoSalgado*qtdeSalg) + (precoRefri*qtdeRefri) + (precoBalas*qtdeBalas) +
                        (precoPirulito*qtdePirulito) + (precoCapu*qtdeCapu);

                mostrarPreco.setText("Preço final: "+df.format(preco));


            }
        });

        botaoMenosBalas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeBalas);

                qtdeBalas = qtdeBalas-1;

                mostrarQtde.setText(""+qtdeBalas);

                double preco = (precoSalgado*qtdeSalg) + (precoRefri*qtdeRefri) + (precoBalas*qtdeBalas) +
                        (precoPirulito*qtdePirulito) + (precoCapu*qtdeCapu);

                mostrarPreco.setText("Preço final: "+df.format(preco));


            }
        });

        botaoMenosPirulito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdePirulito);

                qtdePirulito = qtdePirulito-1;

                mostrarQtde.setText(""+qtdePirulito);

                double preco = (precoSalgado*qtdeSalg) + (precoRefri*qtdeRefri) + (precoBalas*qtdeBalas) +
                        (precoPirulito*qtdePirulito) + (precoCapu*qtdeCapu);

                mostrarPreco.setText("Preço final: "+df.format(preco));


            }
        });

        botaoMenosCapu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarQtde = (TextView) findViewById(R.id.qtdeCapu);

                qtdeCapu = qtdeCapu-1;

                mostrarQtde.setText(""+qtdeCapu);

                double preco = (precoSalgado*qtdeSalg) + (precoRefri*qtdeRefri) + (precoBalas*qtdeBalas) +
                        (precoPirulito*qtdePirulito) + (precoCapu*qtdeCapu);

                mostrarPreco.setText("Preço final: "+df.format(preco));


            }
        });

        botaoPrecoFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double preco = (precoSalgado*qtdeSalg) + (precoRefri*qtdeRefri) + (precoBalas*qtdeBalas) +
                        (precoPirulito*qtdePirulito) + (precoCapu*qtdeCapu);

                mostrarPreco.setText("Preço final: "+df.format(preco));

                double troco = Double.parseDouble(editValorInformado.getText().toString());

                if(troco < preco){

                    mostrarTroco.setText("Saldo inválido!");
                }else{

                    troco = troco-preco;
                    mostrarTroco.setText("Troco final: "+df.format(troco));

                }
            }
        });
    }
}
