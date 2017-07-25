package com.example.mumen.mrs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;



public class signup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }
    
    private void loginInformationSubmitted() throws ParseException {
//        String email = mBinding.etEmail.getText().toString();
//        String password = mBinding.etPassword.getText().toString();
//        if (mBinding.switchSignupToggle.isChecked()) {
//            signUp(email, password);
//        } else {
//            logIn(email, password);
//        }
    }

    private void signUp(String email, String password) {
        ParseUser user = new ParseUser();
        user.setUsername(email);
        user.setEmail(email);
        user.setPassword(password);

        Toast.makeText(getApplicationContext(), "Signing up...", Toast.LENGTH_SHORT).show();

        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException exception) {
                if (exception == null) {
                    loginSuccess();
                } else {
                    Log.d("signup", "Error: " + exception.getMessage());

                    Toast.makeText(getApplicationContext(), "Signup failed :[\nPlease try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }{
        ParseUser user = new ParseUser();
        user.setUsername(email);
        user.setEmail(email);
        user.setPassword(password);

        Toast.makeText(getApplicationContext(), "Signing up...", Toast.LENGTH_SHORT).show();

        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException exception) {
                if (exception == null) {
                    loginSuccess();
                } else {
                    Log.d("signup", "Error: " + exception.getMessage());

                    Toast.makeText(getApplicationContext(), "Signup failed :[\nPlease try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void loginSuccess() {
        Context context = signup.this;
        Class destinationActivity = login.class;
        Intent intent = new Intent(context, destinationActivity);
        startActivity(intent);
    }
}
