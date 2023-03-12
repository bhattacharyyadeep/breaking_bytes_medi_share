package com.deeepssj.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Checkup extends AppCompatActivity {
EditText e1, e2 , e3, e4;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkup);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        e4=(EditText)findViewById(R.id.e4);
        textView=(TextView)findViewById(R.id.t1);



    }
    public void b1(View view)
    {
        String s1=e1.getText().toString();
        String s2=e2.getText().toString();
        String s3=e3.getText().toString();
        String s4=e4.getText().toString();
        double temp=Double.parseDouble(s1);
        double height=Double.parseDouble(s3);
        double weight=Double.parseDouble(s4);
        double bmi=((weight)/((height)*(height)));
      int j=0;
        String s5="";
        if((temp>=99.5)&&(temp<=100.3))
        {
            s5="You have Mild fever. ";
            j=j+1;
        }else if(temp>100.3){
            s5="You have high fever. ";
            j=j+1;
        }
        else
        {
            s5="Normal body temperarure. ";
        }
        int i=Integer.parseInt(s2);
        String s6="";
        if(i>100)
        {
            s6="You have tachycardia. ";
            j=j+1;
        }
        else if(i<60){
            s6="You have bacardiya. ";
            j=j+1;
        }
        else{
            s6="Normal Heart Beat. ";
        }
        String s7="";
        if(bmi<18.5)
        {
            s7="Your bmi is "+String.format("%.2f", bmi)+" ,you are underweight.";
            j=j+1;
        }
        else if(bmi>=18.5 && bmi<=24.9)
        {
            s7="Your bmi is "+String.format("%.2f", bmi)+" ,you have a healthy weight.";
        }
        else if(bmi>24.9 && bmi<=29.9)
        {
            s7="Your bmi is "+String.format("%.2f", bmi)+" ,you are overweight.";
            j=j+1;
        }
        else{
            s7="You bmi is"+String.format("%.2f", bmi)+" ,you have obesity.";
            j=j+1;
        }
        if(j>0)
        {
            textView.setText(s5+s6+s7+" You must check our expert analaysis forum");
        }
        if(j==0)
        {
            textView.setText(s5+s6+s7+" You have very healthy body.");
        }

    }
}