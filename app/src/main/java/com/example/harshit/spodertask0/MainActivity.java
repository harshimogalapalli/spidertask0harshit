package com.example.harshit.spodertask0;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Button.*;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4,button5;
    Random rand=new Random();
    int amount=rand.nextInt(90)+1; int currentvalue=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      TextView amountField=(TextView)findViewById(R.id.textView);
      amountField.setText(String.valueOf(amount));
      check();
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
    }
    public void add1(View v){currentvalue+=1;displaycurrentvalue();}
    public void add2(View v){currentvalue+=2;displaycurrentvalue();}
    public void add5(View v){currentvalue+=5;displaycurrentvalue();}
    public void add10(View v){currentvalue+=10;displaycurrentvalue();}
    public void reset(View v){currentvalue=0;displaycurrentvalue();

    }
    public void displaycurrentvalue(){TextView currentvalueField=(TextView)findViewById(R.id.textView2);
    currentvalueField.setText(String.valueOf(currentvalue));check();
    }
    public void check(){
        if(currentvalue==amount){
            Toast.makeText(getApplicationContext()," Correctly paid", Toast.LENGTH_LONG).show();

            button5.setBackgroundColor(Color.GREEN);

            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
        }
if(currentvalue>amount) {
    Toast.makeText(getApplicationContext(), " please reset wrong payment", Toast.LENGTH_LONG).show();
}
}}
