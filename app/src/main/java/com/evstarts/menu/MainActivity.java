package com.evstarts.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        //TODO: Find first menu item TextView and print the text to the logs
        TextView menuItem1 = (TextView) findViewById(R.id.menu_item_1);
        String log1 = menuItem1.getText().toString();
        Log.v("MyActivity", log1);

        //TODO: Find second menu item TextView and print the text to the logs

        TextView menuItem2 = (TextView) findViewById(R.id.menu_item_2);
        String log2 = menuItem2.getText().toString();
        Log.v("MyActivity", log2);

        //TODO: Find third menu item TextView and print the text to the logs
        TextView menuItem3 = (TextView) findViewById(R.id.menu_item_3);
        String log3 = menuItem3.getText().toString();
        Log.v("MyActivity", log3);


    }
}