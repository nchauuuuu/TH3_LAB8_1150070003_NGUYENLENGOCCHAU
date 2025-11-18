package com.example.th3_lab8_1150070003_nguyenlengocchau;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import com.example.th3_lab8_1150070003_nguyenlengocchau.Adapter.MyListViewAdapter;
import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {

    ListView lvProducts;
    TextView txtSelected;
    ArrayList<Product> products;
    MyListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_listview);

        lvProducts = findViewById(R.id.lvProducts);
        txtSelected = findViewById(R.id.txtSelected);

        // =============================
        // DỮ LIỆU Luyện tập – theo PDF
        // =============================
        products = new ArrayList<>();
        products.add(new Product(R.drawable.android, "Android", "Hệ điều hành của Google"));
        products.add(new Product(R.drawable.ios, "iOS", "Hệ điều hành của Apple"));
        products.add(new Product(R.drawable.windows, "Windows Phone", "Hệ điều hành Microsoft"));

        adapter = new MyListViewAdapter(this, R.layout.row_product, products);
        lvProducts.setAdapter(adapter);

        lvProducts.setOnItemClickListener((parent, view, position, id) ->
                txtSelected.setText("Bạn chọn: " + products.get(position).getTitle())
        );

        // ========================================
        // NÚT QUAY VỀ TRANG CHỦ
        // ========================================
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());
    }
}
