package com.deeepssj.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageButton b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(ImageButton)findViewById(R.id.button1);
        b2=(ImageButton)findViewById(R.id.button2);
        b3=(ImageButton)findViewById(R.id.button3);

    }
    public void image1(View view)
    {
        Toast.makeText(getApplicationContext(),"Clicked on Health Checkup Button",Toast.LENGTH_LONG).show();
    }
    public void image2(View view)
    {
        Toast.makeText(getApplicationContext(),"Clicked on Expert Analysis Button",Toast.LENGTH_LONG).show();
    }
    public void image3(View view)
    {
        Toast.makeText(getApplicationContext(),"Clicked on Open Forum Button",Toast.LENGTH_LONG).show();
    }
}