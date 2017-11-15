package com.dw.hadi.myapplicationinputoutput;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        button.setText("ganti");

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        editText=findViewById(R.id.editText);

        String sas=editText.getText().toString();
        // String sas="bdakjda dhadan dlhvahc ahc v";
        TextView textView=(TextView)findViewById(R.id.textView2);
        textView.setText(sas);


    }
};

  /*  void langsung dari atribut android:onClick button
  public void sa(View view) {
        EditText editText=(EditText)findViewById(R.id.editText);

        String sas=editText.getText().toString();
       // String sas="bdakjda dhadan dlhvahc ahc v";
        TextView textView=(TextView)findViewById(R.id.textView2);
        textView.setText(sas);

    }
*/

