package ru.mirea.rebrov.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void snackbarClick(View view) {
        Snackbar.make(view, "rebrov bsbo0220", Snackbar.LENGTH_SHORT).show();
    }

    public void timeClick(View view) {
        MyTimeDialogFragment dialog = new MyTimeDialogFragment(MainActivity.this);
    }

    public void dateClick(View view) {
        MyDateDialogFragment dialog = new MyDateDialogFragment(MainActivity.this);
    }

    public void progressClick(View view) {
        MyProgressDialogFragment dialog = new MyProgressDialogFragment(MainActivity.this);
    }
}