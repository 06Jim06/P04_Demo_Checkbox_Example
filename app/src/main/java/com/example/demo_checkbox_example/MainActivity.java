package com.example.demo_checkbox_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = (CheckBox) findViewById(R.id.checkBx);
        btnCheck = (Button) findViewById(R.id.btnC);
        tvShow = (TextView) findViewById(R.id.TVoutput);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toast
                Toast toast = Toast.makeText(getApplicationContext(),"Button Click",Toast.LENGTH_LONG);
                toast.show();
                //logcat
                Log.i("MyActivity", "Inside onClick()");

                boolean check = cbEnabled.isChecked();
                    if(check){
                        tvShow.setText("The discount is given");
                    }
                    else {
                        tvShow.setText("");
                    }

//                //introducing debugging
//                if(cbEnabled.isChecked()) {
//                    double pay = calcPay(100, 20);
//                    tvShow.setText("The discount is given. You need to pay " + pay);
//                }
//                else {
//                    double pay = calcPay(100, 0);
//                    tvShow.setText("The discount is not given. You need to pay " + pay);
//                }
s
            }

        });

        //introducing debugging
//        private double calPay(double price, double discount){
//            double pay = price * (1-discount/100);
//            return pay;
//        }
    }
}