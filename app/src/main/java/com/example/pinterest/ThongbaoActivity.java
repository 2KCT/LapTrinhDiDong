package com.example.pinterest;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ThongbaoActivity extends AppCompatActivity {

    Button tinnhan;
    private final int id_home = 1;
    private final int id_search = 2;
    private final int id_notigication = 3;
    private final int id_acount = 4;
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
     /*   BottomNavigationView botNav = findViewById(R.id.bottom_navigation5);
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
        });*/
        MeowBottomNavigation bottomNavigation = findViewById(R.id.bottom_thongbao);

        bottomNavigation.add(new MeowBottomNavigation.Model(id_home,R.drawable.ic_home));
        bottomNavigation.add(new MeowBottomNavigation.Model(id_search,R.drawable.ic_baseline_search1_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(id_notigication,R.drawable.ic_textsms));
        bottomNavigation.add(new MeowBottomNavigation.Model(id_acount,R.drawable.ic_account));

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {

            }
        });
        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                switch (item.getId()){
                    case id_home:
                        Intent intent = new Intent(ThongbaoActivity.this,LayoutTrangchuActivity.class);
                        startActivity(intent);
                        break;
                    case id_search:
                        Intent intent1 = new Intent(ThongbaoActivity.this,MainTimKiemActivity.class);
                        startActivity(intent1);
                        break;
                    case id_notigication:
                        Intent intent2 = new Intent(ThongbaoActivity.this,ThongbaoActivity.class);
                        startActivity(intent2);
                        break;
                    case id_acount:
                        Intent intent3 = new Intent(ThongbaoActivity.this,MainActivityAccount.class);
                        startActivity(intent3);
                        break;
                }
            }
        });
        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {

            }
        });

    }

    private void goToTinnhanActivity() {
        Intent intent = new Intent(ThongbaoActivity.this, TinnhanActivity.class);
        startActivity(intent);
    }
}