package com.kevinmcr.shoestore;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private EditText cantZapatos;
    private Button botonCotizar;
    private TextView valorCosto, valorDivisa;
    private Spinner  tipoZapato, tipoMarca;
    private RadioButton radioHombre, radioMujer;
    private Resources recursos;
    private String zapatos[], marcas[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantZapatos = findViewById(R.id.txtCantZapatos);
        botonCotizar = findViewById(R.id.btnCotizar);
        valorCosto = findViewById(R.id.lblCosto);
        valorDivisa = findViewById(R.id.lblDivisa);
        radioHombre = findViewById(R.id.rdHombre);
        radioMujer = findViewById(R.id.rdMujer);
        tipoZapato = findViewById(R.id.cmbTipoZapato);
        tipoMarca = findViewById(R.id.cmbTipoMarca);
        recursos = this.getResources();

        //Setting Spinners
        zapatos = recursos.getStringArray((R.array.tipoZapato));
        ArrayAdapter<String> zapatosAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,zapatos);
        tipoZapato.setAdapter(zapatosAdapter);

        marcas = recursos.getStringArray((R.array.tipoMarca));
        ArrayAdapter<String> marcaAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,marcas);
        tipoMarca.setAdapter(marcaAdapter);
    }

    public boolean validarCantidad(){

        if(cantZapatos.getText().toString().isEmpty()){
            cantZapatos.requestFocus();
            cantZapatos.setError( recursos.getString(R.string.error_cantidad_vacio));
            return false;
        }

        if(Integer.parseInt(cantZapatos.getText().toString()) == 0){
            cantZapatos.requestFocus();
            cantZapatos.setError(recursos.getString(R.string.error_cantidad_cero));
            return false;
        }

        return true;
    }

    public void cotizar (View v){
        int cantidad = 1,
                resultado = 0,
                zapato = tipoZapato.getSelectedItemPosition(),
                marca = tipoMarca.getSelectedItemPosition();

        boolean esHombre = radioHombre.isChecked();

        valorCosto.setText("0");

        if(validarCantidad()){
            cantidad = Integer.parseInt(cantZapatos.getText().toString());
            resultado = Metodos.calcular(cantidad,esHombre,zapato,marca);
            NumberFormat format = NumberFormat.getCurrencyInstance();
            valorCosto.setText("" + format.format(resultado));
        }
    }
}
