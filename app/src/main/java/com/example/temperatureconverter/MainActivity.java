package com.example.temperatureconverter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View.OnClickListener;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    boolean flag =false;
    Double t,t2;
    String d1,d2;

    private TextView outputText;
    private EditText edtTxtNumber;
    Spinner spinnerin , spinnerout ;
    Button btn;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerin = findViewById(R.id.inputscroll);
        spinnerout = findViewById(R.id.outputscroll);
        edtTxtNumber = findViewById(R.id.editTextNumber);
        outputText = findViewById(R.id.tempout);
        btn = findViewById(R.id.button);


        String[] s = new String[]{"°C","°F","K"};
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this ,android.R.layout.simple_spinner_dropdown_item,s);
            spinnerin.setAdapter(adapter);
            spinnerout.setAdapter(adapter);
            spinnerin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    d1=adapterView.getItemAtPosition(i).toString();
                }

                public void onNothingSelected(AdapterView<?> adapterView){
                    flag = true;
                }
            });
            btn.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View view){

                }
            });





    }
}