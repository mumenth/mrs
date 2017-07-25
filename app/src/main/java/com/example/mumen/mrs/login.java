package com.example.mumen.mrs;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.mumen.mrs.databinding.LoginBinding;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class login extends AppCompatActivity {

    LoginBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mBinding = DataBindingUtil.setContentView(this, R.layout.login);
    }

    private void logIn(String email, String password) {
        Toast.makeText(getApplicationContext(), "Logging in...", Toast.LENGTH_SHORT).show();

        ParseUser.logInInBackground(email, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException exception) {
                if (exception == null) {
                    loginSuccess();
                } else {
                    Log.d("login", "Error: " + exception.getMessage());

                    Toast.makeText(getApplicationContext(), "Login failed :[\nPlease try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void loginSuccess() {
        Context context = login.this;
        Class destinationActivity = ready_to_go.class;
        Intent intent = new Intent(context, destinationActivity);
        startActivity(intent);
    }
}