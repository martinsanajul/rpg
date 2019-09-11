package com.example.charactersheetcreator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
/* import android.support.v7.app.AppCompatActivity; */
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
/*import android.widget.CompoundButton;*/
/*import android.widget.EditText;
import android.widget.Switch;
import android.widget.ToggleButton;*/

/*import static java.lang.Math.pow;
import android.os.Bundle;*/

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void Registro(View v) {

        TextView etNome = findViewById(R.id.etNome);
        TextView etClasse = findViewById(R.id.etClasse);
        TextView etRaca = findViewById(R.id.etRaca);
        TextView etXP = findViewById(R.id.etXP);
        TextView etNiv = findViewById(R.id.etNiv);
        TextView etForca = findViewById(R.id.etForca);
        TextView etDest = findViewById(R.id.etDest);
        TextView etInt = findViewById(R.id.etInt);
        TextView etConst = findViewById(R.id.etConst);
        TextView etCarism = findViewById(R.id.etCarism);
        TextView etSab = findViewById(R.id.etSab);
        TextView etHab = findViewById(R.id.ethHab);
        TextView etItens = findViewById(R.id.etItens);
        TextView etPinh = findViewById(R.id.etPinh);
        TextView etOuro = findViewById(R.id.etOuro);
        TextView etPrata = findViewById(R.id.etPrata);
        TextView etCobre = findViewById(R.id.etCobre);
        TextView etPer = findViewById(R.id.etPer);
        TextView etAnt = findViewById(R.id.etAnt);

        String nome = etNome.getText().toString();
        String classe = etClasse.getText().toString();
        String raca = etRaca.getText().toString();
        int xp = Integer.parseInt(etXP.getText().toString());
        int nivel = Integer.parseInt(etNiv.getText().toString());
        int forca = Integer.parseInt(etForca.getText().toString());
        int dest = Integer.parseInt(etDest.getText().toString());
        int inte = Integer.parseInt(etInt.getText().toString());
        int cons = Integer.parseInt(etConst.getText().toString());
        int carism = Integer.parseInt(etCarism.getText().toString());
        int sab = Integer.parseInt(etSab.getText().toString());
        String hab = etHab.getText().toString();
        String itens = etItens.getText().toString();
        int pinh = Integer.parseInt(etPinh.getText().toString());
        int ouro = Integer.parseInt(etOuro.getText().toString());
        int prata = Integer.parseInt(etPrata.getText().toString());
        int cobre = Integer.parseInt(etCobre.getText().toString());
        String pericia = etPer.getText().toString();
        String ante = etAnt.getText().toString();


        Intent intent = new Intent(this, FichaActivity.class);

        Bundle parametros = new Bundle();

        parametros.putString("chave_nome",  nome);
        parametros.putString("chave_classe", classe);
        parametros.putString("chave_raca", raca);
        parametros.putInt("chave_xp", xp);
        parametros.putInt("chave_nivel", nivel);
        parametros.putInt("chave_forca", forca);
        parametros.putInt("chave_dest", dest);
        parametros.putInt("chave_inte", inte);
        parametros.putInt("chave_cons", cons);
        parametros.putInt("chave_carism", carism);
        parametros.putInt("chave_sab", sab);
        parametros.putString("chave_hab", hab);
        parametros.putString("chave_itens", itens);
        parametros.putInt("chave_pinh", pinh);
        parametros.putInt("chave_ouro", ouro);
        parametros.putInt("chave_prata", prata);
        parametros.putInt("chave_cobre", cobre);
        parametros.putString("chave_pericia", pericia);
        parametros.putString("chave_ante", ante);

        intent.putExtras(parametros);

        startActivity(intent);

    }
}