package com.deeepssj.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Intent intent=new Intent(getApplicationContext(),Checkup.class);
        startActivity(intent);
    }
    public void image2(View view)
    {
        Intent intent=new Intent(getApplicationContext(),expert_forum.class);
        startActivity(intent);
    }
    public void image3(View view)
    {
        Intent intent=new Intent(getApplicationContext(),open_forum.class);
        startActivity(intent);
    }
}