package com.mudrita.cmpe277.chefdepot;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone =(EditText)findViewById(R.id.phone_editxt);
    }


    public void getVerificationCode(View view){
        Intent i = new Intent(this,OTPVerificationActivity.class);
        startActivity(i);

    }


}
