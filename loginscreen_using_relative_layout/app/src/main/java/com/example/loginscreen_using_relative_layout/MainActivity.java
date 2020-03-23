package com.example.loginscreen_using_relative_layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText userNameEditText,passwordEditText;
    Button signInButton;
    TextView signUpTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userNameEditText=findViewById(R.id.username);
        passwordEditText=findViewById((R.id.password));
        signInButton= findViewById((R.id.login));
        signUpTextView=findViewById(R.id.signup);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName= userNameEditText.getText().toString();
                String password= passwordEditText.getText().toString();
                if(userName.equals("Admin")&&password.equals("Password"));
                {
                    startActivity(new Intent(MainActivity.this, LoginSuccessfullActivity.class));

                }
            }
        });
        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignUpActivity.class));
            }
        });
    }
}