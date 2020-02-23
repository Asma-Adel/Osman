package com.example.osman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Cib,Enr,Swvl,Vezeeta,AnaVodafone,Btech,AlexBank,BankCairo,BankiMobile,EgPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cib = findViewById(R.id.Cib);
        Enr = findViewById(R.id.Enr);
        Swvl = findViewById(R.id.Swvl);
        Vezeeta = findViewById(R.id.Vezeeta);
        AnaVodafone = findViewById(R.id.AnaVodafone);
        Btech = findViewById(R.id.Btech);
        AlexBank = findViewById(R.id.AlexBank);
        BankCairo = findViewById(R.id.BankCairo);
        BankiMobile = findViewById(R.id.BankiMobile);
        EgPost = findViewById(R.id.EgPost);


        Cib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Cib = getPackageManager().getLaunchIntentForPackage("com.CIB.Digital.MB");
                if(Cib.resolveActivity(getPackageManager()) != null){
                    startActivity(Cib);
                }
            }
        });

        Enr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Enr = getPackageManager().getLaunchIntentForPackage("enr.transit.maf");
                if(Enr.resolveActivity(getPackageManager()) != null){
                    startActivity(Enr);
                }
            }
        });

        Swvl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Swvl = getPackageManager().getLaunchIntentForPackage("io.swvl.customer");
                if(Swvl.resolveActivity(getPackageManager()) != null){
                    startActivity(Swvl);
                }
            }
        });

        Vezeeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Vezeeta = getPackageManager().getLaunchIntentForPackage("com.ionicframework.vezeetapatientsmobile694843");
                if(Vezeeta.resolveActivity(getPackageManager()) != null){
                    startActivity(Vezeeta);
                }
            }
        });

        AnaVodafone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AnaVodafone = getPackageManager().getLaunchIntentForPackage("com.emeint.android.myservices");
                if(AnaVodafone.resolveActivity(getPackageManager()) != null){
                    startActivity(AnaVodafone);
                }
            }
        });

        Btech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Btech = getPackageManager().getLaunchIntentForPackage("com.btechapp");
                if(Btech.resolveActivity(getPackageManager()) != null){
                    startActivity(Btech);
                }
            }
        });

        AlexBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AlexBank = getPackageManager().getLaunchIntentForPackage("hr.asseco.android.intesa.isbd.mbanking.alex");
                if(AlexBank.resolveActivity(getPackageManager()) != null){
                    startActivity(AlexBank);
                }
            }
        });

        BankCairo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BankCairo = getPackageManager().getLaunchIntentForPackage("paymob.bds.qahera");
                if(BankCairo.resolveActivity(getPackageManager()) != null){
                    startActivity(BankCairo);
                }
            }
        });

        BankiMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BankiMobile = getPackageManager().getLaunchIntentForPackage("com.CA.Push");
                if(BankiMobile.resolveActivity(getPackageManager()) != null){
                    startActivity(BankiMobile);
                }
            }
        });

        EgPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent EgPost = getPackageManager().getLaunchIntentForPackage("org.egyptpost.postapp");
                if(EgPost.resolveActivity(getPackageManager()) != null){
                    startActivity(EgPost);
                }
            }
        });

    }
}
