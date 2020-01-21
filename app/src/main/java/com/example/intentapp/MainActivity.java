package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void call(View view){
        Uri number = Uri.parse("tel:874549818");
        Intent intent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(intent);
    }

    public void map(View view){
        Uri location = Uri.parse("geo:17.1645048,104.1509038?z=14");
        Intent intent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(intent);
    }

    public void web(View view){
        Uri web = Uri.parse("https://www.snru.ac.th");
        Intent intent = new Intent(Intent.ACTION_VIEW, web);
        startActivity(intent);
    }

    public void text(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, "สวัสดีจร้าาาาาาา");
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "สวัสดีจร้าาาาา"));
    }
}
