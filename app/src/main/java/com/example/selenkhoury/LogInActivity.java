package com.example.selenkhoury;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogInActivity extends AppCompatActivity {

    private EditText editTextTextPersonName_login , editTextNumberPassword_login;
    private TextView textView2;
    private Button buttonLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextTextPersonName_login = findViewById(R.id.editTextTextPersonName_login);
        editTextNumberPassword_login = findViewById(R.id.editTextNumberPassword_login);
        textView2 = findViewById(R.id.textView2);
        buttonLogIn = findViewById(R.id.buttonLogIn);

    }

    public void login (View view){
        String input_User = editTextTextPersonName_login.getText().toString();
      //  String input_Userpass= editTextNumberPassword_login.getText().toString();
        if (input_User.length()>0) {
            Toast.makeText(this, "user logged in !", Toast.LENGTH_LONG).show();
            Intent intent_main = new Intent(this, MainActivity.class);
            startActivity(intent_main);
        }else{
            Toast.makeText(this,"Empty values,please insert !",Toast.LENGTH_LONG).show();
        }

    }
}
