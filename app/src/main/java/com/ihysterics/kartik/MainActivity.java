package com.ihysterics.kartik;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.click);

        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Toast.makeText(this, "I am Kartik Budakoti", Toast.LENGTH_SHORT).show();
    }
}
