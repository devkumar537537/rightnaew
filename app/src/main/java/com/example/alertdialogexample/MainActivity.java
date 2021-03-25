package com.example.alertdialogexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button creatalert;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        creatalert = findViewById(R.id.createbtn);

        builder = new AlertDialog.Builder(this);

        creatalert.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {

                                              builder.setTitle(R.string.title_stirng)
                                                      .setMessage(R.string.message_text)
                                                      .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                                          @Override
                                                          public void onClick(DialogInterface dialog, int which) {
                                                              Toast.makeText(MainActivity.this, "You chooose NO", Toast.LENGTH_SHORT).show();
                                                          }
                                                      })
                                                      .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                                          @Override
                                                          public void onClick(DialogInterface dialog, int which) {
                                                              Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                                                              startActivity(intent);
                                                          }
                                                      });

                                              AlertDialog alertDialog = builder.create();
                                              alertDialog.setCancelable(false);
                                              alertDialog.setIcon(R.drawable.phonebook);
                                              alertDialog.show();

                                          }
                                      });
    }
}