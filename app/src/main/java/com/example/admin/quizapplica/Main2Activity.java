package com.example.admin.quizapplica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void Net(View view) {
        Intent objIntent = new Intent(Main2Activity.this, Main4Activity.class);
        startActivity(objIntent);
    }


    public void apk (View view) {
        Intent objIntent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(objIntent);
    }

    public void team(View view) {
        Intent objIntent = new Intent(Main2Activity.this, Main5Activity.class);
        startActivity(objIntent);
    }

}









