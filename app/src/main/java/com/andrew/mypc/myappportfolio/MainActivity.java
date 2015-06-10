package com.andrew.mypc.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void displayToast(View v) {
        Button clickedButton = (Button) v;
        switch (clickedButton.getId()) {
            case R.id.app1:
                Toast.makeText(this,"This will launch " + getResources().getString( R.string.first_app),Toast.LENGTH_SHORT).show();
                break;

            case R.id.app2:
                Toast.makeText(this,"This will launch " + getResources().getString(R.string.second_app),Toast.LENGTH_SHORT).show();
                break;

            case R.id.app3:
                Toast.makeText(this,"This will launch " + getResources().getString(R.string.third_app),Toast.LENGTH_SHORT).show();
                break;

            case R.id.app4:
                Toast.makeText(this,"This will launch " + getResources().getString(R.string.fourth_app),Toast.LENGTH_SHORT).show();
                break;

            case R.id.app5:
                Toast.makeText(this,"This will launch " + getResources().getString(R.string.fifth_app),Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
