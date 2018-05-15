package com.example.ym.project14cakebaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class About extends AppCompatActivity {

    protected TextView labout;
    String aboutString="If you look over the years, the styles have changed - the clothes, the hair, the production, the approach to the songs. The icing to the cake has changed flavors. But if you really look at the cake itself, it's really the same.\n" +
            "John Oates ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        labout =(TextView) findViewById(R.id.Cont);
        Toast.makeText(About.this, aboutString, Toast.LENGTH_LONG).show();

    }
}
