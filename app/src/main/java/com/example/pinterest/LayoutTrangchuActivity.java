package com.example.pinterest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import SignInSignUp.GridviewAdapter;
import SignInSignUp.HinhAnh;

public class LayoutTrangchuActivity extends AppCompatActivity  {
    BottomNavigationView botNav;
    GridView gridView;
    String[] imageName={"Hoa","Nghệ thuật","Móng tay","Giáo dục","Anime","Nhiếp ảnh","Động vật","Sức khỏe","Thiết kế","Mặt trăng","Trang sức","Xe","Bầu trời xanh","Koi","Hình xăm"};
    int[] images={R.drawable.hoa,R.drawable.nghethuat,R.drawable.mongtay,R.drawable.giaoduc,R.drawable.anime
            ,R.drawable.nhiepanh,R.drawable.dog4,R.drawable.suckhoe,R.drawable.thietke,R.drawable.mattrang,R.drawable.trangsuc
            ,R.drawable.xedep,R.drawable.bautroixanh,R.drawable.koi,R.drawable.hinhxam};
    int[] imgButton={R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption
            ,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption
            ,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_trangchu);

        gridView=(GridView) findViewById(R.id.gridView_trangchu);
        botNav = findViewById(R.id.bottom_navigation1);

       CustomAdapter customAdapter = new CustomAdapter();
       gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),LayoutTrangchu1Activity.class);
                intent.putExtra("name",imageName[position]);
                intent.putExtra("image",images[position]);
                startActivity(intent);
            }
        });
        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_home:
                        Intent intent = new Intent(LayoutTrangchuActivity.this,LayoutTrangchuActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.bottom_search:
                        Intent intent1 = new Intent(LayoutTrangchuActivity.this,MainTimKiemActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.bottom_messenger:
                        Intent intent2 = new Intent(LayoutTrangchuActivity.this,ThongbaoActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.bottom_account:
                        Intent intent3 = new Intent(LayoutTrangchuActivity.this,MainActivityAccount.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });
    }


    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.custom_layout_gridview_trangchu,null);
            TextView name =view1.findViewById(R.id.txtNameTrangChu);
            ImageView image = view1.findViewById(R.id.imgHinhTrangChu);
            ImageView button = view1.findViewById(R.id.img_Option);

            button.setImageResource(imgButton[position]);
            name.setText(imageName[position]);
            image.setImageResource(images[position]);
            return view1;
        }
    }
}