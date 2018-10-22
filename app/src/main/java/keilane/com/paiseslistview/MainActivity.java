package keilane.com.paiseslistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    List<Pais> animais;
    PaisAdapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = new ListView(this);
        setContentView(listView);
        List<Pais> paises = new ArrayList<Pais>();
        paises.add(new Pais("Alemanha", 1, 1354040000, 0));
        paises.add(new Pais("Argentina", 2, 1210193422, 1));
        paises.add(new Pais("Chile", 3, 315761000, 2));
        paises.add(new Pais("Espanha", 4, 237641000, 3));
        paises.add(new Pais("Franca", 5, 193946886, 4));
        paises.add(new Pais("Gana", 5, 193946886, 5));
        paises.add(new Pais("Grecia", 5, 193946886, 6));
        paises.add(new Pais("Honduras", 5, 193946886, 7));

        listView.setAdapter(new PaisAdapter(this,paises));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Pais pais = (Pais) adapterView.getItemAtPosition(i);
        Toast.makeText(this,pais.getNome(), Toast.LENGTH_SHORT).show();
    }
}
