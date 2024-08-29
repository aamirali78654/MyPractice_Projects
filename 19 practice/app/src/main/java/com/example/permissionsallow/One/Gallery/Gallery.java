package com.example.permissionsallow.One.Gallery;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.permissionsallow.R;

public class Gallery extends AppCompatActivity {
    ImageView imageView;
    private final int REQUEST_GALLERY_CODE = 3;
    private  final int REQUEST_CAMERA_CODE = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gallery);
        imageView = (ImageView) findViewById(R.id.imageView);

    }
    //------------Button method for Camera------------------>>
    public void cameraButton(View view)
    {
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA ) == PackageManager.PERMISSION_GRANTED) {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, REQUEST_CAMERA_CODE);
        }
        else
        {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CAMERA},REQUEST_CAMERA_CODE);
        }
    }
    //-------------Button Method FOR Gallery ---------------->>
    public void ClickGallery(View view)
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);

        startActivityForResult(Intent.createChooser(intent,"select Image ...!") , REQUEST_GALLERY_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        //-----------------------Gallery's code----------------------->>>
        if(resultCode == RESULT_OK && requestCode == REQUEST_GALLERY_CODE) {
            Uri uri = data.getData();
            if (uri != null) {
                imageView.setImageURI(uri);
            }
        }

        //---------------------Camera's code---------------------------->>>>
            if(resultCode == RESULT_OK && requestCode == REQUEST_CAMERA_CODE)
            {
                Bitmap bitmap = (Bitmap) data.getExtras().get("Data");
                imageView.setImageBitmap(bitmap);
            }


    }
}