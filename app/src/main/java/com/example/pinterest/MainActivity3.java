package com.example.pinterest;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity3 extends AppCompatActivity {
    private ImageButton backbtn;
    private Button donebtn;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        backbtn = (ImageButton) findViewById(R.id.back);
        Intent intentGet = getIntent();
        name = intentGet.getStringExtra("name");
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
        donebtn = (Button) findViewById(R.id.donebtn);
        donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
        BottomNavigationView botNav = findViewById(R.id.bottom_navigation9);
        botNav.getMenu().findItem(R.id.bottom_account).setChecked(true);
        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_home:
                        Toast.makeText(MainActivity3.this,"Trang chủ",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity3.this,LayoutTrangchuActivity.class);
                        intent.putExtra("name",name);
                        startActivity(intent);
                        break;
                    case R.id.bottom_search:
                        Toast.makeText(MainActivity3.this,"Tìm kiếm",Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(MainActivity3.this,MainTimKiemActivity.class);
                        intent1.putExtra("name",name);
                        startActivity(intent1);
                        break;
                    case R.id.bottom_messenger:
                        Toast.makeText(MainActivity3.this,"Nhắn tin",Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(MainActivity3.this,ThongbaoActivity.class);
                        intent2.putExtra("name",name);
                        startActivity(intent2);
                        break;
                    case R.id.bottom_account:
                        Toast.makeText(MainActivity3.this,"Tài khoản",Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(MainActivity3.this,MainActivityAccount.class);
                        intent3.putExtra("name",name);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });
    }
}