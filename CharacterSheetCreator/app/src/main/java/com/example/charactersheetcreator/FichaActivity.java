package com.example.charactersheetcreator;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class FichaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha);

      /*  private EditText etNome;
        private EditText etClasse;
        private EditText etRaca;
        private EditText etXP;
        private EditText etNiv;
        private EditText etForca;
        private EditText etDest;
        private EditText etInt;
        private EditText etConst;
        private EditText etCarism;
        private EditText etSab;
        private EditText etHab;
        private EditText etItens;
        private EditText etPinh;
        private EditText etOuro;
        private EditText etPrata;
        private EditText etCobre;
        private EditText etPer;
        private EditText etAnt; */

        Bundle parametros = getIntent().getExtras();

        TextView txtnome = findViewById(R.id.textView17);
        TextView txtclasse = findViewById(R.id.textView2);
        TextView txtraca = findViewById(R.id.textView5);
        TextView txtxp = findViewById(R.id.textView6);
        TextView txtnivel = findViewById(R.id.textView8);
        TextView txtforca = findViewById(R.id.textView9);
        TextView txtdest = findViewById(R.id.textView11);
        TextView txtintel = findViewById(R.id.textView10);
        TextView txtconst = findViewById(R.id.textView12);
        TextView txtcarism = findViewById(R.id.textView13);
        TextView txtsab = findViewById(R.id.textView4);
        TextView txthab = findViewById(R.id.textView15);
        TextView txtitens = findViewById(R.id.textView16);
        TextView txtpinh = findViewById(R.id.textView20);
        TextView txtouro = findViewById(R.id.textView21);
        TextView txtprata = findViewById(R.id.textView22);
        TextView txtcobre = findViewById(R.id.textView23);
        TextView txtper = findViewById(R.id.textView25);
        TextView txtant = findViewById(R.id.textView26);

        if (parametros != null) {

            String nome = parametros.getString("chave_nome");
            String classe = parametros.getString("chave_classe");
            String raca = parametros.getString("chave_raca");
            int xp = parametros.getInt("chave_xp");
            int nivel = parametros.getInt("chave_nivel");
            int forca = parametros.getInt("chave_forca");
            int dest = parametros.getInt("chave_dest");
            int inte = parametros.getInt("chave_int");
            int cons = parametros.getInt("chave_cons");
            int carism = parametros.getInt("chave_carism");
            int sab = parametros.getInt("chave_sab");
            String hab = parametros.getString("chave_hab");
            String itens = parametros.getString("chave_itens");
            int pinh = parametros.getInt("chave_pinh");
            int ouro = parametros.getInt("chave_ouro");
            int prata = parametros.getInt("chave_prata");
            int cobre = parametros.getInt("chave_cobre");
            String pericia = parametros.getString("chave_pericia");
            String ante = parametros.getString("chave_ante");

            txtnome.setText(nome);
            txtclasse.setText(classe);
            txtraca.setText(raca);
            txtxp.setText(xp);
            txtnivel.setText(nivel);
            txtforca.setText(forca);
            txtdest.setText(dest);
            txtintel.setText(inte);
            txtconst.setText(cons);
            txtcarism.setText(carism);
            txtsab.setText(sab);
            txthab.setText(hab);
            txtitens.setText(itens);
            txtpinh.setText(pinh);
            txtouro.setText(ouro);
            txtprata.setText(prata);
            txtcobre.setText(cobre);
            txtper.setText(pericia);
            txtant.setText(ante);

        }


    }


}


