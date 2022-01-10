package com.example.pinterest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainTimKiemActivity extends Activity {
    private TextView tvBHCD;
    private final int id_home = 1;
    private final int id_search = 2;
    private final int id_notigication = 3;
    private final int id_acount = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_maintimkiem);


        tvBHCD = (TextView) findViewById(R.id.tvBongHoaCoDon);
        tvBHCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainTimKiemActivity.this,YTuongActivity.class);
                startActivity(intent);
            }
        });

      /*  BottomNavigationView botNav = findViewById(R.id.bottom_navigation3);
        botNav.getMenu().findItem(R.id.bottom_search).setChecked(true);
        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_home:
                        Intent intent = new Intent(MainTimKiemActivity.this,LayoutTrangchuActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.bottom_search:
                        Intent intent1 = new Intent(MainTimKiemActivity.this,MainTimKiemActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.bottom_messenger:
                        Intent intent2 = new Intent(MainTimKiemActivity.this,ThongbaoActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.bottom_account:
                        Intent intent3 = new Intent(MainTimKiemActivity.this,MainActivityAccount.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });*/
        MeowBottomNavigation bottomNavigation = findViewById(R.id.bottom_maintimkiem);

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
                        Intent intent = new Intent(MainTimKiemActivity.this,LayoutTrangchuActivity.class);
                        startActivity(intent);
                        break;
                    case id_search:
                        Intent intent1 = new Intent(MainTimKiemActivity.this,MainTimKiemActivity.class);
                        startActivity(intent1);
                        break;
                    case id_notigication:
                        Intent intent2 = new Intent(MainTimKiemActivity.this,ThongbaoActivity.class);
                        startActivity(intent2);
                        break;
                    case id_acount:
                        Intent intent3 = new Intent(MainTimKiemActivity.this,MainActivityAccount.class);
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


}