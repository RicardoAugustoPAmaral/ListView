package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listlocais;
    private String[] itens = {"Angra dos Reis", "Caldas Novas",
            "Campos do Jordão", "Costa do Sauípe", "Ilhéus", "Porto Seguro",
            "Tiradentes", "Praga", "Santiago", "Zurique", "Caribe", "Buenos Aires",
            "Budapeste", "Cancún", "Aruba"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listlocais = findViewById(R.id.listLocais);

        // criar adaptador da lista

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(

                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );
        //Adiciona adaptador na lista
        listlocais.setAdapter(adaptador);

        //Adiciona clique na lista

        listlocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valorSelecionado = listlocais.getItemAtPosition(i).toString();

                Toast.makeText(getApplicationContext(),valorSelecionado,Toast.LENGTH_LONG).show();

            }
        });

    }
}