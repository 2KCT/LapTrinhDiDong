package com.example.pinterest;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivityAccount extends AppCompatActivity {
    private ImageButton horizbtn,imgBtnUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainaccount);
        horizbtn = (ImageButton)findViewById(R.id.imgb1);
        imgBtnUpload = findViewById(R.id.imgButton_Upload);
        imgBtnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityAccount.this, UploadPictureActivity.class);
                startActivity(intent);
            }
        });
        horizbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityAccount.this, MainActivity5.class);
                startActivity(intent);


            }
        });
        BottomNavigationView botNav = findViewById(R.id.bottom_navigation7);
        botNav.getMenu().findItem(R.id.bottom_account).setChecked(true);
        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_home:
                        Toast.makeText(MainActivityAccount.this,"Trang chủ",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivityAccount.this,LayoutTrangchuActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.bottom_search:
                        Toast.makeText(MainActivityAccount.this,"Tìm kiếm",Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(MainActivityAccount.this,MainTimKiemActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.bottom_messenger:
                        Toast.makeText(MainActivityAccount.this,"Tin nhắn",Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(MainActivityAccount.this,ThongbaoActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.bottom_account:
                        Toast.makeText(MainActivityAccount.this,"Tài khoản",Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(MainActivityAccount.this,MainActivityAccount.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });
    }
}