package com.example.edittext_validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private EditText user, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.user_txt);
        password = (EditText) findViewById(R.id.pass_txt);

    }

    public void register (View view){
        String username = user.getText().toString();
        String pass = user.getText().toString();

        if (username.length() == 0 && pass.length() != 0){
            Toast.makeText(this, "User is empty. Please fill all the fields" , Toast.LENGTH_SHORT).show();
        }
        else if (username.length() != 0 && pass.length() == 0){
            Toast.makeText(this, "Password is empty. Please fill all the fields" , Toast.LENGTH_SHORT).show();
        }
        else if (username.length() == 0 && pass.length() == 0){
            Toast.makeText(this, "Please fill all the fields" , Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Thanks for testing! :)" , Toast.LENGTH_SHORT).show();
        }

    }
}