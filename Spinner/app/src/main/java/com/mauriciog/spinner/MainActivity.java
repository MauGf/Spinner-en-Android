package com.mauriciog.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.mauriciog.spinner.data.ListaHogar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    String[] categorias;
    Spinner mySpinner;
    ArrayAdapter<ListaHogar> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        initializeViews ();
        /*categorias=getResources ().getStringArray (R.array.categories);
        sp=(Spinner)findViewById (R.id.spinner);
        ArrayAdapter adapter= new ArrayAdapter (this,android.R.layout.simple_list_item_1,categorias);
        sp.setAdapter (adapter);

        myListView = findViewById(R.id.myListView);
        myListView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getCosmicBodies()));*/


       /* sp.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i>0){
                    Toast.makeText (MainActivity.this, "Usted ha Seleccionado"+ categorias[i], Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/
        /*sp.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i>0){
                    Toast.makeText (MainActivity.this, "Usted ha Seleccionado"+ categorias[i], Toast.LENGTH_SHORT).show ();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });*/
    }

    private void initializeViews() {

        categorias = getResources ().getStringArray (R.array.categories);
        mySpinner = findViewById (R.id.spinner);
        //mySpinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categories));
        ArrayAdapter adapter = new ArrayAdapter (this, android.R.layout.simple_list_item_1, categorias);
        mySpinner.setAdapter (adapter);

        myListView = findViewById (R.id.myListView);
        myListView.setAdapter (new ArrayAdapter<> (this, android.R.layout.simple_list_item_1, getListaHogar ()));


        //spinner selection events
        mySpinner.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long itemID) {
                if (position >= 0 && position < categorias.length) {
                    getSelectedCategoryData (position);
                } else {
                    Toast.makeText (MainActivity.this, "Categoria no existe", Toast.LENGTH_SHORT).show ();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void getSelectedCategoryData(int categoryID) {
        ArrayList<ListaHogar> hogarLista = new ArrayList<> ();
        if(categoryID == 0)
        {
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getListaHogar());
        }else{
            //filter by id
            for (ListaHogar listaHogar : getListaHogar()) {
                if (listaHogar.getCategoryId() == categoryID) {
                    hogarLista.add(listaHogar);
                }
            }
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, hogarLista);
        }
        myListView.setAdapter(adapter);
    }

    private ArrayList<ListaHogar> getListaHogar() {
        ArrayList<ListaHogar> data = new ArrayList<>();
        data.clear();

        data.add(new ListaHogar ("Carne de cerdo", 1));
        data.add(new ListaHogar ("Carne de cabra", 1));
        data.add(new ListaHogar ("Trigo", 3));
        data.add(new ListaHogar ("Papas", 2));
        data.add(new ListaHogar ("Maiz", 3));
        data.add(new ListaHogar ("Zanahoria", 2));
        data.add(new ListaHogar ("Yuca", 2));
        data.add(new ListaHogar ("Carne de pollo", 1));
        data.add(new ListaHogar ("Arroz", 3));
        data.add(new ListaHogar ("Cebollas", 2));
        data.add(new ListaHogar ("Carne de Ternero", 1));
        data.add(new ListaHogar ("tijera", 12));
        data.add(new ListaHogar ("Tabcin", 11));
        data.add(new ListaHogar ("Carne de Cordero", 1));
        data.add(new ListaHogar ("Cartulina", 12));
        data.add(new ListaHogar ("gomas", 9));
        data.add(new ListaHogar ("Jabon", 4));
        data.add(new ListaHogar ("Sorgo", 3));
        data.add(new ListaHogar ("Bocadeli", 10));
        data.add(new ListaHogar ("pasta dental", 4));
        data.add(new ListaHogar ("chocolates", 9));
        data.add(new ListaHogar ("Uva Tropical", 8));
        data.add(new ListaHogar ("Fanta", 8));
        data.add(new ListaHogar ("Coca Cola", 8));
        data.add(new ListaHogar ("Caramelos", 9));
        data.add(new ListaHogar ("Churros", 10));
        data.add(new ListaHogar ("Manzanas", 5));
        data.add(new ListaHogar ("Carne de conejo", 1));
        data.add(new ListaHogar ("Uvas", 5));
        data.add(new ListaHogar ("Boquitas diana", 10));
        data.add(new ListaHogar ("langosta", 7));
        data.add(new ListaHogar ("Acetaminofen", 11));
        data.add(new ListaHogar ("Peras", 5));
        data.add(new ListaHogar ("Camarones", 7));
        data.add(new ListaHogar ("Ostras", 7));
        data.add(new ListaHogar ("Asistin", 6));
        data.add(new ListaHogar ("Trapeador", 6));
        data.add(new ListaHogar ("Rinso", 6));
        data.add(new ListaHogar ("Firulais (perro)", 13));
        data.add(new ListaHogar ("Neron(perro)", 13));
        data.add(new ListaHogar ("Micha (gata)", 13));

        return data;
    }
}
