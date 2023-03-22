package com.example.signuppage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView userName = (TextView) findViewById(R.id.userName);
        TextView userPassword  = (TextView) findViewById(R.id.userPassword);
        TextView confirmPassword  = (TextView) findViewById(R.id.confirmPassword);

        Button loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userPassword.getText().toString().equals(confirmPassword.getText().toString())){
                    if(userName.getText().toString().equals("admin") && userPassword.getText().toString().equals("Password@123")){
                        Toast.makeText(MainActivity.this, "Login Successfull!!", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(MainActivity.this, "Login Failed!!", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Both the passwords are not same!!", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}