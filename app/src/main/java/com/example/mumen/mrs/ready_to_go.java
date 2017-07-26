package com.example.mumen.mrs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
    public void export_activity(View view) {
        Context context = ready_to_go.this;
        Class destination = export.class;
        Intent intent = new Intent(context, destination);
        startActivity(intent);
    }
    public void developer_page(View view) {
        Context context = ready_to_go.this;
        Class destination = activity_main8.class;
        Intent intent = new Intent(context, destination);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.export) {
            export_activity(null);
            return true;
        }else if (id == R.id.developer){
            developer_page(null);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
