package com.example.intent_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.Simg);
        Intent receivedIntent =getIntent();
        String receivedAction =receivedIntent.getAction();
        String receivedType =receivedIntent.getType();
        Uri receivedUri= receivedIntent.getParcelableExtra(Intent.EXTRA_STREAM);
        img.setImageURI(receivedUri);



    }
}
