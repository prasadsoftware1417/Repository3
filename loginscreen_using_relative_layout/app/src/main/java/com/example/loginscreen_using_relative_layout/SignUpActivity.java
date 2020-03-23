package com.example.loginscreen_using_relative_layout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    EditText nameEditText, mobileNoEditText, ageEditText, userNameEditText, passwordEditText;
    Button submitButton;
    String name, mobileNo, age, userName, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        nameEditText =(EditText)findViewById(R.id.name);
        mobileNoEditText =(EditText)findViewById(R.id.mobileNo);
        ageEditText =(EditText)findViewById(R.id.age);
        userNameEditText =(EditText)findViewById(R.id.userName);
        passwordEditText =(EditText)findViewById(R.id.password);
        submitButton =(Button)findViewById(R.id.submit);
        name = nameEditText.getText().toString();
        mobileNo = mobileNoEditText.getText().toString();
        age = ageEditText.getText().toString();
        userName = userNameEditText.getText().toString();
        password = passwordEditText.getText().toString();
        if(!(name ==""&& mobileNo ==""&& age ==""&& userName ==""&& password =="")) {
            submitButton.setEnabled(true);
        }

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUpActivity.this,"Account created Successfully",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
