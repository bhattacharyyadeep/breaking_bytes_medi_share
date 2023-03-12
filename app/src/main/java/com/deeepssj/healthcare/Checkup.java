package com.deeepssj.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Checkup extends AppCompatActivity {
EditText e1, e2 ;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkup);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        textView=(TextView)findViewById(R.id.t1);



    }
    public void b1(View view)
    {
        String s1=e1.getText().toString();
        String s2=e2.getText().toString();
        double temp=Double.parseDouble(s1);
      int j=0;
        String s4="";
        if((temp>99.5)&&(temp<=100.3))
        {
            s4="You have Mild fever. ";
            j=j+1;
        }else if(temp>100.3){
            s4="You have high fever. ";
            j=j+1;
        }
        else
        {
            s4="Normal body temperarure. ";
        }
        int i=Integer.parseInt(s2);
        String s5="";
        if(i>100)
        {
            s5="You have tachycardia. ";
            j=j+1;
        }
        else if(i<60){
            s5="You have bacardiya. ";
            j=j+1
        }
        else{
            s5="Normal Heart Beat. ";
        }
        if(j>0)
        {
            textView.setText(s4+s5+" You must check our expert analaysis forum");
        }

    }
}