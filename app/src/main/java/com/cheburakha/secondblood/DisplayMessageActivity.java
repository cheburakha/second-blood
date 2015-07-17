package com.cheburakha.secondblood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display_message);

        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String scale = intent.getStringExtra(MainActivity.EXTRA_SCALE);

        // Create the text view
        TextView textView = new TextView(this);

        textView.setTextSize(Integer.parseInt(scale));
        textView.setText(message);

        // Calculate ActionBar height
        //String testString = Integer.toString(android.R.attr.actionBarSize);
        //textView.setText(testString);
        // Set the text view as the activity layout
        //textView.setPadding(16, 80, 16, 16);

        // Get a string resource from your app's Resources
        //String hello = getResources().getString(R.string.app_name);
        // Or supply a string resource to a method that requires a string
        //TextView textView1 = new TextView(this);
        //textView1.setText(R.string.app_name);

        setContentView(textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
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
