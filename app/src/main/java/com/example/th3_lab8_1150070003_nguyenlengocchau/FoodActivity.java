package com.example.th3_lab8_1150070003_nguyenlengocchau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;

import com.example.th3_lab8_1150070003_nguyenlengocchau.Adapter.FoodAdapter;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    ListView lvFood;
    ArrayList<Product> foods;
    FoodAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        lvFood = findViewById(R.id.lvFood);

        foods = new ArrayList<>();
        foods.add(new Product(R.drawable.food_comtam, "Cơm Tấm", "Sườn – Bì – Chả"));
        foods.add(new Product(R.drawable.food_pho, "Phở Bò", "Tái – Nạm – Gầu"));
        foods.add(new Product(R.drawable.food_bundau, "Bún Đậu", "Mắm tôm đặc biệt"));
        foods.add(new Product(R.drawable.food_hutieu, "Hủ Tiếu", "Nước trong – Thịt – Tôm"));

        adapter = new FoodAdapter(this, R.layout.item_food, foods);
        lvFood.setAdapter(adapter);

        registerForContextMenu(lvFood);

        // ==========================
        // NÚT QUAY VỀ HOME
        // ==========================
        Button btnBack = findViewById(R.id.btnBackHome);
        btnBack.setOnClickListener(v ->
                startActivity(new Intent(this, HomeActivity.class))
        );
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Chọn thao tác");
        menu.add(0, 1, 0, "Sửa món ăn");
        menu.add(0, 2, 0, "Xóa món ăn");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo info =
                (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        int index = info.position;

        switch (item.getItemId()) {

            case 1:
                Toast.makeText(this,
                        "Sửa món: " + foods.get(index).getTitle(),
                        Toast.LENGTH_SHORT).show();
                return true;

            case 2:
                foods.remove(index);
                adapter.notifyDataSetChanged();
                Toast.makeText(this, "Đã xóa món ăn", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onContextItemSelected(item);
    }
}
