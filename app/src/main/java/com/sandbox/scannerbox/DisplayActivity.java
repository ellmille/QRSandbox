package com.sandbox.scannerbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView textValue = findViewById(R.id.barcode_value);

        textValue.setText(getIntent().getStringExtra("BARCODE"));
    }
}
