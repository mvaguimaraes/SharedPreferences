package com.example.mvaguimaraes.shared_preferences;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    EditText text_firstname, text_lastname, text_phone;
    TextView textView_firstname, textView_lastname, textView_phonenumber;
    public static final String FirstName = "FirstNameSave";
    public static final String LastName = "LastNameSave";
    public static final String PhoneNumber = "PhoneNumberSave";
    public static final String SharedPreferenceDataToSave = "SharedPreferenceDataToSave";
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        text_firstname = (EditText) findViewById(R.id.text_firstname);
        text_lastname = (EditText) findViewById(R.id.text_lastname);
        text_phone = (EditText) findViewById(R.id.text_phone);
        textView_firstname = (TextView) findViewById(R.id.textView_firstname);
        textView_lastname = (TextView) findViewById(R.id.textView_lastname);
        textView_phonenumber = (TextView) findViewById(R.id.textView_phonenumber);

        sharedpreferences = getSharedPreferences(SharedPreferenceDataToSave, Context.MODE_PRIVATE);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void load_data(View view) {
    }

    public void save_data(View view) {

        String first_name_save = text_firstname.getText().toString();
        String last_name_save = text_lastname.getText().toString();
        String phone_number_save = text_phone.getText().toString();
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
