package com.example.pinterest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import com.example.pinterest.Upload;
import com.google.firebase.storage.StorageReference;

public class LayoutTrangchuActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ImageAdapter mAdapter;
    private DatabaseReference mDatabaseRef;
    private List<Upload> mUploads;
    BottomNavigationView botNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_trangchu);
        botNav = findViewById(R.id.bottom_navigation1);

        mRecyclerView = findViewById(R.id.recycler_view_Trangchu);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mUploads = new ArrayList<>();

        mDatabaseRef = FirebaseDatabase.getInstance().getReference("uploads");

        mDatabaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot postSnapshot : snapshot.getChildren())
                {
                     Upload uploads = postSnapshot.getValue(Upload.class);
                    mUploads.add(uploads);
                }
                mAdapter = new ImageAdapter(LayoutTrangchuActivity.this,mUploads);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(LayoutTrangchuActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bottom_home:
                        Intent intent = new Intent(LayoutTrangchuActivity.this, LayoutTrangchuActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.bottom_search:
                        Intent intent1 = new Intent(LayoutTrangchuActivity.this, MainTimKiemActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.bottom_messenger:
                        Intent intent2 = new Intent(LayoutTrangchuActivity.this, ThongbaoActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.bottom_account:
                        Intent intent3 = new Intent(LayoutTrangchuActivity.this, MainActivityAccount.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });
    }
}

