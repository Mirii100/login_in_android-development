package com.example.myapplication;
//import static com.example.myapplication.Homepage.*;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText passwordEditText;
    private  Button submitButton, nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        passwordEditText = findViewById(R.id.editTextTextPassword);
        submitButton = findViewById(R.id.btn1);
        nextButton = findViewById(R.id.nextButton);
        // Set click listener for the submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered password
                String password = passwordEditText.getText().toString();

                // Create a login object and store the password
                login loginObject = new login(password);
                loginObject.storePassword(MainActivity.this);
            }

        });
        nextButton.setOnClickListener(view -> {
            // Create an intent to navigate to Homepage
            Intent intent = new Intent(MainActivity.this, login.class);
            startActivity(intent);
        });
    }
}
