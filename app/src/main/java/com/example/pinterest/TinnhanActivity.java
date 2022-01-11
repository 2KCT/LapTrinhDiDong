package com.example.pinterest;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TinnhanActivity extends AppCompatActivity {
Button tk,tnmoi,capnhat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinnhan);
        capnhat = findViewById(R.id.capnhat);
        tk=findViewById(R.id.btn_ten);
        tnmoi=findViewById(R.id.tinnhanmoi);

        capnhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TinnhanActivity.this, ThongbaoActivity.class);
                startActivity(intent);
            }
        });

        tnmoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TinnhanActivity.this, TrangcanhanActivity.class);
                startActivity(intent);
            }
        });

        BottomNavigationView botNav = findViewById(R.id.bottom_navigation6);
        botNav.getMenu().findItem(R.id.bottom_messenger).setChecked(true);
        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_home:
                        Intent intent = new Intent(TinnhanActivity.this,LayoutTrangchuActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.bottom_search:
                        Intent intent1 = new Intent(TinnhanActivity.this,MainTimKiemActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.bottom_messenger:
                        Intent intent2 = new Intent(TinnhanActivity.this,ThongbaoActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.bottom_account:
                        Intent intent3 = new Intent(TinnhanActivity.this,MainActivityAccount.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });

        tk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNoidungActivity();
            }
        });
    }
    private void goToNoidungActivity() {
        Intent intent = new Intent(this, NoidungTNActivity.class);
        startActivity(intent);
    }
}