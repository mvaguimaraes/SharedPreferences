package com.example.mvaguimaraes.shared_preferences;

/**
 * Created by Mvaguimaraes on 3/11/16.
 */
public class SharedPreferences {

    SharedPreferences.Editor editor = sharedpreferences.edit();
    editor.putString(FirstName, first_name_save);
    editor.putString(LastName, last_name_save);
    editor.putString(PhoneNumber, phone_number_save);
    editor.commit();

    public void save_data(View view) {
        String first_name_save = text_firstname.getText().toString();
        String last_name_save = text_lastname.getText().toString();
        String phone_number_save = text_phone.getText().toString();

        SharedPreferences.Editor editor = sharedpreferences.edit();

        editor.putString(FirstName, first_name_save);
        editor.putString(LastName, last_name_save);
        editor.putString(PhoneNumber, phone_number_save);
        editor.commit();
        Toast.makeText(MainActivity.this, "Your data has been saved.", Toast.LENGTH_LONG).show();
    }

}
