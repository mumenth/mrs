package com.example.mumen.mrs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }
    public void goToChoices(View view) {
        Context context = welcome.this;
        Class destination = choices_2.class;
        Intent intent = new Intent(context, destination);
        startActivity(intent);
    }
}
