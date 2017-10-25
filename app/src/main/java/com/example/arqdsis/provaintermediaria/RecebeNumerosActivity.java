package com.example.arqdsis.provaintermediaria;

/**
 * Created by arqdsis on 25/10/2017.
 * RA:201512177
 * Nome:JoaoLucasLima
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RecebeNumerosActivity extends Activity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_numeros);
        Bundle bundle = getIntent().getExtras();
//        Numeros numeros = new Numeros();
       String valor = bundle.getString("valor");
//        String valorFinal = numeros.trataNumeros(valor);

        textView = (TextView) findViewById(R.id.retornaNumero);
        textView.setText(valor);

    }
}
