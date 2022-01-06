package com.example.pinterest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Bao_Cao_GhimActivity extends AppCompatActivity {
    private RelativeLayout relativeLayout;
    private ImageButton imgBtClose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bao_cao_ghim);

        imgBtClose = (ImageButton) findViewById(R.id.btnClose);
        imgBtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bao_Cao_GhimActivity.this,AnhActivity.class);
                startActivity(intent);
            }
        });
        relativeLayout = (RelativeLayout) findViewById(R.id.baocao1);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bao_Cao_GhimActivity.this,Bao_Cao_Spam_Activity.class);
                startActivity(intent);
            }
        });
    }
}