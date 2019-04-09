package mx.edu.tesoem.hugo4295.itics.listadesplegablecontinua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.GenericArrayType;

public class MainActivity extends AppCompatActivity {
    Spinner ListaDesplegable;
    GridView Datosgv;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] Elementossp = {"Suma","Resta","Division","Multiplicacion","Potencia"};
        String[] Elementosgv = {"Nombre","Edad","Correo","Pablo escobar","22","pablo@tesoem.edu.mx","jose ramirez","30","pepe@tesoem.edu.mx","sandalio moreno","50","sandi@tesoem.edu.mx","Fernanda Gomez","26","fer@tesoem.edu.mx"};

        ListaDesplegable = (Spinner) findViewById(R.id.ListaDesplegable);
        Datosgv = (GridView) findViewById(R.id.Datosgv);
        r1 = (RadioButton) findViewById(R.id.rb1);
        r2 = (RadioButton) findViewById(R.id.rb2);
        r3 = (RadioButton) findViewById(R.id.rb3);
        r4 = (RadioButton) findViewById(R.id.rb4);

        ArrayAdapter<String> elementossp = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Elementossp);
        ArrayAdapter<String> elementosgv = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Elementosgv);

        ListaDesplegable.setAdapter(elementossp);
        Datosgv.setAdapter(elementosgv);

    }

    public void checaRadioBoton(View view){
        if (r1.isChecked()){
            Toast.makeText(this,"Se presiono suma",Toast.LENGTH_LONG).show();
        } else if (r2.isChecked()) {
            Toast.makeText(this,"Se presiono resta",Toast.LENGTH_LONG).show();
        } else if (r3.isChecked()) {
            Toast.makeText(this,"Se presiono multiplicacion",Toast.LENGTH_LONG).show();
        } else if (r4.isChecked()) {
            Toast.makeText(this,"Se presiono division",Toast.LENGTH_LONG).show();
        }

    }
}
