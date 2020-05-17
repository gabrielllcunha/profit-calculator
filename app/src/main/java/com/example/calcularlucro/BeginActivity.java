package com.example.calcularlucro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BeginActivity extends AppCompatActivity {

    EditText editAtivo;
    EditText editLucroLiquido;
    EditText editPatrimonioLiquido;
    EditText editNumeroAcoesEmitidas;
    EditText editPrecoAtual;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        Edit1();
    }

    public void Edit1() {
        this.editAtivo = findViewById(R.id.editAtivo);
        this.editLucroLiquido = findViewById(R.id.editLucroLiquido);
        this.editPatrimonioLiquido = findViewById(R.id.editPatrimonioLiquido);
        this.editNumeroAcoesEmitidas = findViewById(R.id.editNumeroAcoesEmitidas);
        this.editPrecoAtual = findViewById(R.id.editPrecoAtual);
    }

    private void goToNewActivity() {
        Intent intent = new Intent(BeginActivity.this, EndActivity.class);
        Bundle b = new Bundle();
        b.putString("ativo", Ativo);
        b.putDouble("lucroLiquido", lucroLiquido);
        b.putDouble("patrimonioLiquido", patrimonioLiquido);
        b.putDouble("precoAtual", precoAcao);
        b.putLong("nAcoesBolsa", numeroAcoes);
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }

    public void Get(View view) {
        this.Ativo = editAtivo.getText().toString();
        this.lucroLiquido = Double.parseDouble(editLucroLiquido.getText().toString());
        this.patrimonioLiquido = Double.parseDouble(editPatrimonioLiquido.getText().toString());
        this.precoAcao = Double.parseDouble(editPrecoAtual.getText().toString());
        this.numeroAcoes = Long.parseLong(editNumeroAcoesEmitidas.getText().toString());
        goToNewActivity();
    }
}
