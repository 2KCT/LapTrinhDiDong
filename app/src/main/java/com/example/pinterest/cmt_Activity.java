package com.example.pinterest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class cmt_Activity extends AppCompatActivity {
    private ImageButton imgBtClose, imgBtBaoCao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmt);
        imgBtClose = (ImageButton) findViewById(R.id.imgBtn_Dong_cmt);
        imgBtBaoCao = (ImageButton)findViewById(R.id.imgBt_baocao_cmt);

        imgBtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cmt_Activity.this,AnhActivity.class);
                startActivity(intent);
            }
        });
        imgBtBaoCao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cmt_Activity.this,Baocao_Nhanxet_Activity.class);
                startActivity(intent);
            }
        });
    }
}