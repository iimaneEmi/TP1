package com.example.application2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity {


    public void send(View view){

        Intent intent = new Intent(activity2.this,activity3.class);

        startActivity(intent);
    }


    EditText txt_name;
    Button btn_copier;
    TextView txt_view;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Toast.makeText(getApplicationContext(),"onCreate",Toast.LENGTH_SHORT).show();





        txt_name = (EditText) findViewById(R.id.txt_name);
        txt_view = (TextView) findViewById(R.id.text_view);

        btn_copier = (Button) findViewById(R.id.btn_copier);

        btn_copier.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String nom = txt_name.getText().toString();
                txt_view.setText( "Bonjour, je suis " + nom);

            }

        });




        /*Button btn1 = (Button)findViewById(R.id.Quitter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               finish();
            }
        });*/






        }
        @Override
        protected void onSaveInstanceState(Bundle outState){
            super.onSaveInstanceState(outState);

            outState.putString("result","Bonjour, je suis " +txt_name.getText().toString());
            Toast.makeText(this,"on save", Toast.LENGTH_SHORT).show();
//            outState.putString(txt_name.getText().toString(),"100");
        }

        @Override
        protected void onRestoreInstanceState(Bundle savedInstanceState) {
            super.onRestoreInstanceState(savedInstanceState);

            String r = savedInstanceState.getString("result");

            txt_view.setText(r);

            Toast.makeText(this,"on restore", Toast.LENGTH_SHORT).show();


        }

    public void exit(View view){


     finish();
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
