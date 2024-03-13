
package com.example.myapplication;

import android.content.Context;
        import android.os.Bundle;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    private String password;

    public login(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        }
    // Constructor to initialize the login object with the entered password
    public login(String password) {
        this.password = password;
    }

    // Method to store the entered password and display a toast message
    public void storePassword(Context context){
        // You can perform any additional operations with the password here
        // For example, you can save it to SharedPreferences, a database, etc.

        // For demonstration purposes, we'll just display a toast message
        String message = "Password: " + password + " stored successfully!";
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
