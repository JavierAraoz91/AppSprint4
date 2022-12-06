package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d("MainActivity","Hola mundo... Hello world");
        //Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show();
        //Test.myToast(this);
        //Context context=getApplicationContext();
        CharSequence text="Menaje emergente...";
        //int duration= Toast.LENGTH_SHORT;
        //Toast toast=Toast.makeText(context,text,duration);
        //toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
        //toast.show();

        //Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show();
    }*/
}