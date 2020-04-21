package com.example.pleasework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RadioButton rb1,rb2,rb3,rb4;
    ListView lv;
    ArrayList<String> Poeple;
    ArrayAdapter<String> arrayAdapter;
    String Sum;
    EditText et;
    String[] StringArr ={"Rehovot","Jerusalem","Ashdod","Afula","Beer Sheva","Herzelia","Rishon Lezion","Ashkelon","Yavne"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1 = findViewById(R.id.radioButton1);
        rb2 = findViewById(R.id.radioButton2);
        rb3 = findViewById(R.id.radioButton3);
        rb4 = findViewById(R.id.radioButton4);
        et=findViewById(R.id.editText);
        lv = findViewById(R.id.lv);
        arrayAdapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1,StringArr);
        lv.setAdapter(arrayAdapter);
        String station;
        public class Main extends AppCompatActivity implements AdapterView.OnItemClickListener {
            public void onItamClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        }

    }

    public void Yes(View view) {
        if (rb1.isChecked())
            Sum = Sum + ",normal adult";

        if (rb2.isChecked())
            Sum = Sum + ",solider";

        if (rb3.isChecked())
            Sum = Sum + ",child";

        if (rb4.isChecked())
            Sum = Sum + ",pessioner";

        Sum = Sum +"," + et.getText().toString();
        Poeple.add(Sum);
        Sum= " ";
        et.setText("");

    }
}
