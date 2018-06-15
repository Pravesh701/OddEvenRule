package com.tahlkamovie.oerule;

import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText e1;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        e1= (EditText) findViewById(R.id.editText);
        result = (TextView) findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {

                String str = e1.getText().toString();
                if(e1.equals("")){
                    e1.setError("Please Enter a Vehicle Number");
                }
                else{
                    int number = Integer.parseInt(str);
                    Calendar ca = Calendar.getInstance();
                    int year = ca.get(Calendar.YEAR);
                    int month = ca.get(Calendar.MONTH);
                    int day = ca.get(Calendar.DAY_OF_MONTH);

                    if(number%2==0){
                        if(day>=1 && day<15){
                            result.setText("Please go your most welcome in Delhi you are even number");
                            e1.setText("");
                        }
                        else{
                            result.setText("Sorry you are even number so you can not go between 15-30 day");
                            e1.setText("");
                        }

                    }
                    else{
                        if(day>=15 && day<=31){
                            result.setText("Please Go Your Most Welcome in Delhi you are odd number");
                            e1.setText("");
                        }
                        else{
                            result.setText("Sorry You are Odd Number so you can not go between 1-15");
                            e1.setText("");
                        }
                    }

                }
            }
        });
    }


}
