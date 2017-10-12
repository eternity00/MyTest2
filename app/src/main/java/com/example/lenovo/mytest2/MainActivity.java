package com.example.lenovo.mytest2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String Tag = "info";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        System.out.println("onCreate");
        Log.i(Tag, "onCreate");
        int id = getTaskId();
        Toast.makeText(MainActivity.this, id+"", Toast.LENGTH_SHORT).show();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, TwoAct.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart");
        Log.i(Tag, "onstart");
        Log.d(Tag, "ononon");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");
        Log.i(Tag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop");
        Log.i(Tag, "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");
        Log.i(Tag, "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");
        Log.i(Tag, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart");
        Log.i(Tag, "onRestart");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
