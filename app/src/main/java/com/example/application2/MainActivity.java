package com.example.application2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Log log;
    Button btn ;



    public void envoyer(View view){

        Intent intent = new Intent(MainActivity.this,activity2.class);

        startActivity(intent);

    }

    public void send4(View view){

        Intent intent = new Intent(MainActivity.this,Dialog.class);

        startActivity(intent);

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"onCreate",Toast.LENGTH_SHORT).show();


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

