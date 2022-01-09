package com.example.pinterest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

public class UploadActivity extends AppCompatActivity {
    ImageView imageSelected;
    Uri imageUri;
    Button btnUpload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_picture);
        imageSelected = findViewById(R.id.chooseImage);
        btnUpload = findViewById(R.id.btn_upload);
        getDataFromDatabase();

        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    addToStorage(imageUri);


            }
        });
        imageSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGallary();
            }
        });
    }

    private void getDataFromDatabase(){
        DatabaseReference db = FirebaseDatabase.getInstance().getReference("uploads")
                .child("myImages").child("user1").child("newImage");
        db.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    Picasso.with(UploadActivity.this).load(snapshot.getValue().toString()).into(imageSelected);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void openGallary(){
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent,200);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==200 && resultCode ==RESULT_OK){
            imageUri = data.getData();
            Picasso.with(UploadActivity.this).load(imageUri).into(imageSelected);
            addToStorage(imageUri);
        }
    }
    private void addToStorage(Uri imageUri){
        StorageReference storageReference = FirebaseStorage.getInstance().getReference().child("uploads");
        final StorageReference imageName = storageReference.child("Image12312");
        imageName.putFile(imageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                imageName.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        DatabaseReference db = FirebaseDatabase.getInstance().getReference("uploads")
                                .child("myImages").child("user1").child("newImage");
                        db.setValue(uri.toString());
                    }
                });
            }
        });
    }
}
