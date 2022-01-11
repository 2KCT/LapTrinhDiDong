    package com.example.pinterest;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.ImageButton;
    import android.widget.TextView;

    import androidx.annotation.NonNull;
    import androidx.appcompat.app.AppCompatActivity;

    import com.google.android.material.bottomnavigation.BottomNavigationView;

    import SignInSignUp.MainActivity;

    public class MainActivity2 extends AppCompatActivity {
    private TextView chinhSuaHoSoTv, caiDatTaiKhoanTv,dxuat;
    private ImageButton btnChinhSuaHoSo, btnCaiDatTaiKhoan, btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        chinhSuaHoSoTv = (TextView) findViewById(R.id.chinhsuahoso);
        chinhSuaHoSoTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
        caiDatTaiKhoanTv = (TextView) findViewById(R.id.caidattaikhoan);
        caiDatTaiKhoanTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
            }
        });
        btnChinhSuaHoSo = (ImageButton) findViewById(R.id.btnchinhsuahoso);
        btnChinhSuaHoSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
        btnCaiDatTaiKhoan = (ImageButton) findViewById(R.id.btncaidattaikhoan);
        btnCaiDatTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
            }
        });
        btnback = (ImageButton) findViewById(R.id.clear);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivityAccount.class);
                startActivity(intent);
            }
        });
        BottomNavigationView botNav = findViewById(R.id.bottom_navigation8);
        botNav.getMenu().findItem(R.id.bottom_account).setChecked(true);
        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_home:
                        Intent intent = new Intent(MainActivity2.this,LayoutTrangchuActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.bottom_search:
                        Intent intent1 = new Intent(MainActivity2.this,MainTimKiemActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.bottom_messenger:
                        Intent intent2 = new Intent(MainActivity2.this,ThongbaoActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.bottom_account:
                        Intent intent3 = new Intent(MainActivity2.this,MainActivityAccount.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });
        dxuat = findViewById(R.id.dangxuat);
        dxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}