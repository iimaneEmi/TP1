package com.example.application2;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Dialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
        Toast.makeText(getApplicationContext(),"onCreate",Toast.LENGTH_SHORT).show();
//        requestWindowFeature(Window.FEATURE_NO_TITLE);


    }


    protected void buttonFinish(View view) {

        finish();
        Toast.makeText(getApplicationContext(),"buttonFinish",Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        if(isFinishing()){
            System.exit(0);
        }
        Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPause",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart(){
        super.onRestart ();


        Toast.makeText(getApplicationContext(),"onRestart",Toast.LENGTH_SHORT).show();

    }


    public void clickExit(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }



}
