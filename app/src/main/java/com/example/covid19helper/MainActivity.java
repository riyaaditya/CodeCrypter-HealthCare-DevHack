package com.example.covid19helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText Unknown;
    private EditText Password;
    private TextView Info;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Unknown = (EditText)findViewById(R.id.etname);
        Password = (EditText)findViewById(R.id.etpassword);
        Info = (TextView)findViewById(R.id.tvinfo);
        Login=(Button)findViewById(R.id.btnlogin);

        Info.setText("No. of attempts remaining: 5");
        public void onClick (View view) {
            validate(Name.getText().toString(), Password.getText(.toString()) ;
        }
        }) ;


    }

    private void validate(String userName, String userPassword) {
        if (userName == "admin") {
            {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
            else{
                counter--;
                Info.setText("No of attempts remaining:" + String.valueOf(counter));
                if (counter == 0) {
                    Login.setEnabled(false);
                }
            }
        }

    }