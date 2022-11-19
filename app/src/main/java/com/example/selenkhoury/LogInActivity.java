package com.example.selenkhoury;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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


    public void Login(View view) {
        /*if (editTextEmailAddress.getText().toString().equals(""))
            Toast.makeText(this,"Empty Email",Toast.LENGTH_LONG).show();
        else if (editTextPassword.getText().toString().equals(""))
            Toast.makeText(this,"Empty Password",Toast.LENGTH_LONG).show();
        else if (editTextPersonName.getText().toString().equals(""))
            Toast.makeText(this,"Empty User Name",Toast.LENGTH_LONG).show();
        else {
            Intent i = new Intent(this, HomeActivity.class);
            startActivity(i);
}
