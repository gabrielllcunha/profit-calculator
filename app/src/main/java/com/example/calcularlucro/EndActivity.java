package com.example.calcularlucro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {
    String Ativo;
    Double lucroLiquido;
    Double patrimonioLiquido;
    Long numeroAcoes;
    Double precoAcao;
    Double lpa = lucroLiquido / numeroAcoes;
    Double pl = precoAcao / lpa;
    Double roe = (lucroLiquido / patrimonioLiquido) * 100;
    Double vpa = patrimonioLiquido / numeroAcoes;
    Double pvp = precoAcao / vpa;
    TextView acaoResult;
    TextView lpaResult;
    TextView plResult;
    TextView roeResult;
    TextView vpaResult;
    TextView pvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        Edit2();
        Result();
    }

    public void Edit2() {
        this.acaoResult = findViewById(R.id.acaoResult);
        this.lpaResult = findViewById(R.id.lpaResult);
        this.plResult = findViewById(R.id.plResult);
        this.roeResult = findViewById(R.id.roeResult);
        this.vpaResult = findViewById(R.id.vpaResult);
        this.pvResult = findViewById(R.id.pvResult);
    }

    public void Result() {
        acaoResult.setText(Ativo);
        lpaResult.setText(String.format("L/PA: %.2f", lpa));
        plResult.setText(String.format("P/L: %.2f", pl));
        roeResult.setText(String.format("ROE: %.2f", roe));
        vpaResult.setText(String.format("VPA: %.2f", vpa));
        pvResult.setText(String.format("P/VP: %.2f", pvp));
    }
}


