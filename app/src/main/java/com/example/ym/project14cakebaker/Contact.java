package com.example.ym.project14cakebaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Contact extends AppCompatActivity {

    protected TextView ConText;
    String ConString="Call us on 01676906018 and mail at ym.321704215@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

       ConText =(TextView) findViewById(R.id.Cont);
        Toast.makeText(Contact.this, ConString, Toast.LENGTH_LONG).show();

    }
}
