package com.example.mumen.mrs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choices_2);

    }

    protected void GoToSignUpPage(View view) {
        Context context = MainActivity.this;
        Class destination = signup.class;
        Intent intent = new Intent(context, destination);
        startActivity(intent);

    }
}
