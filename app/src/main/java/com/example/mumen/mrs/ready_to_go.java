package com.example.mumen.mrs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ready_to_go extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ready_to_go);
    }
    public void GoToReadyToGoPage(View view) {
        Context context = ready_to_go.this;
        Class destination = enter_data.class;
        Intent intent = new Intent(context, destination);
        startActivity(intent);}
}
