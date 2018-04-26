package com.mudrita.cmpe277.chefdepot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
    }


    public void onClickCook(View view){
        Intent i = new Intent(this,MapsActivity.class);
        startActivity(i);
    }

    public void onClickOrder(View view){

    }
}
