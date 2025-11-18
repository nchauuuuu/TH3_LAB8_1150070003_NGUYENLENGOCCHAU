package com.example.th3_lab8_1150070003_nguyenlengocchau.Adapter;

import android.content.Context;
import android.view.*;
import android.widget.*;
import java.util.ArrayList;
import com.example.th3_lab8_1150070003_nguyenlengocchau.R;
import com.example.th3_lab8_1150070003_nguyenlengocchau.Product;
public class FoodAdapter extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<Product> list;

    public FoodAdapter(Context context, int layout, ArrayList<Product> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override public int getCount() { return list.size(); }
    @Override public Object getItem(int i) { return list.get(i); }
    @Override public long getItemId(int i) { return i; }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(layout, null);

        ImageView img = row.findViewById(R.id.imgFood);
        TextView name = row.findViewById(R.id.txtFoodName);
        TextView desc = row.findViewById(R.id.txtFoodDesc);

        Product p = list.get(position);

        img.setImageResource(p.getImage());
        name.setText(p.getTitle());
        desc.setText(p.getDescription());

        return row;
    }
}
