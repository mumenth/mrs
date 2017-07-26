package com.example.mumen.mrs;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.mumen.mrs.databinding.SignupBinding;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;



public class signup extends AppCompatActivity {
    SignupBinding mBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        mBinding = DataBindingUtil.setContentView(this, R.layout.signup);


    }
    private void loginSuccess() {
        Context context = signup.this;
        Class destinationActivity = login.class;
        Intent intent = new Intent(context, destinationActivity);
        startActivity(intent);
    }

    public void onSignupButtonClicked(View view) {
        String email = mBinding.etEmail.getText().toString();
        String password = mBinding.etPassword.getText().toString();
        signUp(email , password);
    }

    public void signUp (String email, String password){
        ParseUser user = new ParseUser();
        user.setEmail(email);
        user.setUsername(email);

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
}

