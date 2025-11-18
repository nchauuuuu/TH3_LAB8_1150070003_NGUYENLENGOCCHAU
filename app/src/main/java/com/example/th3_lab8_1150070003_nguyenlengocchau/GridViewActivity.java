package com.example.th3_lab8_1150070003_nguyenlengocchau;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import java.util.ArrayList;
import android.widget.Button;
import android.content.Intent;

import com.example.th3_lab8_1150070003_nguyenlengocchau.Adapter.GridAdapter;

public class GridViewActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Product> list;
    GridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = findViewById(R.id.gridView);

        // ==============================
        // DỮ LIỆU 4 MÓN ĂN
        // ==============================
        list = new ArrayList<>();
        list.add(new Product(R.drawable.food_comtam, "Cơm tấm", ""));
        list.add(new Product(R.drawable.food_pho, "Phở", ""));
        list.add(new Product(R.drawable.food_bundau, "Bún đậu", ""));
        list.add(new Product(R.drawable.food_hutieu, "Hủ tiếu", ""));

        adapter = new GridAdapter(this, R.layout.row_grid, list);
        gridView.setAdapter(adapter);

        // ==============================
        // NÚT QUAY VỀ TRANG CHỦ
        // ==============================
        Button btnBack = findViewById(R.id.btnBackHome);
        btnBack.setOnClickListener(v ->
                startActivity(new Intent(this, HomeActivity.class))
        );
    }
}
