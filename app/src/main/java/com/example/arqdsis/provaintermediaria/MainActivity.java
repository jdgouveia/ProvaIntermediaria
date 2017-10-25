package com.example.arqdsis.provaintermediaria;

/**
 * Created by arqdsis on 25/10/2017.
 * RA:201512177
 * Nome:JoaoLucasLima
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.preencheNumero);
        btnEnviar = (Button) findViewById(R.id.btnEnvia);
    }

    public void enviaNumeros(View view){
        String valor = editText.getText().toString();
        Bundle bundle = new Bundle();

        Numeros numero = new Numeros();
        String valor1 = numero.trataNumeros(valor);
        bundle.putString("valor",valor1);
        Intent intent = new Intent(MainActivity.this,RecebeNumerosActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
