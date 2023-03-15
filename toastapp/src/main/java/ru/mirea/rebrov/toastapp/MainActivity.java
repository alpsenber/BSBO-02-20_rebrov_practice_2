package ru.mirea.rebrov.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view)
    {
        EditText editText2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        Toast.makeText(getApplicationContext(), String.format("СТУДЕНТ %s ГРУППА %s. общее кол-во символов - %s", editText2.getText().toString(), editText.getText().toString(), editText.getText().toString().length() + editText2.getText().toString().length()), Toast.LENGTH_SHORT).show();
    }
}