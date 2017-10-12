package com.example.lenovo.mytest2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TwoAct extends AppCompatActivity {

    TextView show2;//此处只能声明，不能定义

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_two);//可理解为创建xml文件中的全部对象
        show2 = (TextView) findViewById(R.id.show);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
    }

    MenuItem it1, it2, it3;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_two, menu);//xml文件的菜单项和java文件加的菜单项排序不定
        it1 = menu.add("大人");
        it2 = menu.add("小孩");
        it3 = menu.add("hello");
        it1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Toast.makeText(TwoAct.this, "123", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.blue:
                show2.setBackgroundColor(Color.BLUE);
                break;
            case R.id.red:
                show2.setBackgroundColor(Color.RED);
                break;
            case R.id.green:
                show2.setBackgroundColor(Color.GREEN);
                break;
            case R.id.large:
                show2.setTextSize(50);
                break;
            case R.id.small:
                show2.setTextSize(20);
                break;
        }
        if (item == it1) {
            show2.setText("人族1");
            show2.setBackgroundColor(Color.BLUE);
            Toast.makeText(TwoAct.this, "sel1", Toast.LENGTH_SHORT).show();
        } else if (item == it2) {
            show2.setText("人族2");
            show2.setBackgroundColor(Color.GREEN);
            Toast.makeText(TwoAct.this, "sel2", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
