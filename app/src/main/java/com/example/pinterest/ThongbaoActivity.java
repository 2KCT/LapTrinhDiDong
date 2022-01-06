package com.example.pinterest;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ThongbaoActivity extends AppCompatActivity {

    Button tinnhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongbao);


        tinnhan = findViewById(R.id.tinnhan);
        tinnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTinnhanActivity();
            }
        });
        BottomNavigationView botNav = findViewById(R.id.bottom_navigation5);
        botNav.getMenu().findItem(R.id.bottom_messenger).setChecked(true);
        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_home:
                        Intent intent = new Intent(ThongbaoActivity.this,LayoutTrangchuActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.bottom_search:
                        Intent intent1 = new Intent(ThongbaoActivity.this,MainTimKiemActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.bottom_messenger:
                        Intent intent2 = new Intent(ThongbaoActivity.this,ThongbaoActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.bottom_account:
                        Intent intent3 = new Intent(ThongbaoActivity.this,MainActivityAccount.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });

    }

    private void goToTinnhanActivity() {
        Intent intent = new Intent(ThongbaoActivity.this, TinnhanActivity.class);
        startActivity(intent);
    }
}