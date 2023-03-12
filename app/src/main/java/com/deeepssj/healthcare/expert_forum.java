package com.deeepssj.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class expert_forum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expert_forum);
    }
    public void button1(View view)
    {
        Intent intent=new Intent(getApplicationContext(),Cancer.class);
        startActivity(intent);
    }
    public void button2(View view)
    {
        Intent intent=new Intent(getApplicationContext(),Flu.class);
        startActivity(intent);
    }

}