package com.example.pinterest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NoidungTNActivity extends AppCompatActivity {
Button caidat,ghimtn,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noidung_tnactivity);
        caidat= findViewById(R.id.caidat);
        ghimtn= findViewById(R.id.ghim);

        back= findViewById(R.id.back_nd);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(NoidungTNActivity.this,TinnhanActivity.class);
                startActivity(intent);
            }
        });

        ghimtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(NoidungTNActivity.this,GhimActivity.class);
                startActivity(intent);

            }
        });
        caidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNoidungTNActivity();
            }
        });
    }

    private void goToNoidungTNActivity() {
        Intent intent = new Intent(this,CaidatActivity.class);
        startActivity(intent);
    }
}