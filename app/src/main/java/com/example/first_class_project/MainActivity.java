package com.example.first_class_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnConverter;
    TextView labelDollar, labelEuro;
    EditText entradaReal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labelDollar = findViewById(R.id.txtDollar);
        labelEuro = findViewById(R.id.txtEuro);
        entradaReal = findViewById(R.id.edtReal);
        btnConverter = findViewById(R.id.button);
    }

    public void converter(View v) {
        float cambioDollar = 4.93f;
        float cambioEuro = 5.33f;

        float valorDollar, valorEuro, valorReal;

        String aux = entradaReal.getText().toString();
        valorReal = Float.parseFloat(aux);

        valorDollar = valorReal / cambioDollar;
        valorEuro = valorReal / cambioEuro;

        labelDollar.setText(String.format("%.2f", valorDollar));
        labelEuro.setText(String.format("%.2f", valorEuro));

    }
}