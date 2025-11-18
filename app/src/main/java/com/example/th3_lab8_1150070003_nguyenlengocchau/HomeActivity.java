package com.example.th3_lab8_1150070003_nguyenlengocchau;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btnLT1, btnLT2, btnBT1, btnBT2, btnBT3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnLT1 = findViewById(R.id.btnLT1);
        btnLT2 = findViewById(R.id.btnLT2);
        btnBT1 = findViewById(R.id.btnBT1);
        btnBT2 = findViewById(R.id.btnBT2);
        btnBT3 = findViewById(R.id.btnBT3);

        btnLT1.setOnClickListener(v ->
                startActivity(new Intent(this, MainActivity.class)));

        btnLT2.setOnClickListener(v ->
                startActivity(new Intent(this, CustomListViewActivity.class)));

        btnBT1.setOnClickListener(v ->
                startActivity(new Intent(this, FoodActivity.class)));

        btnBT2.setOnClickListener(v ->
                startActivity(new Intent(this, GridViewActivity.class)));

        btnBT3.setOnClickListener(v ->
                startActivity(new Intent(this, FoodActivity.class))); // BT3 nằm trong FoodActivity
    }
}
