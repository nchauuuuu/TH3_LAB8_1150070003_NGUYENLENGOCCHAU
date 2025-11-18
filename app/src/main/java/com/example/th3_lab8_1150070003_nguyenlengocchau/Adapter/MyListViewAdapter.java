package com.example.th3_lab8_1150070003_nguyenlengocchau.Adapter;

import android.content.Context;
import android.view.*;
import android.widget.*;

import com.example.th3_lab8_1150070003_nguyenlengocchau.Product;
import com.example.th3_lab8_1150070003_nguyenlengocchau.R;

import java.util.ArrayList;

public class MyListViewAdapter extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<Product> data;

    public MyListViewAdapter(Context context, int layout, ArrayList<Product> data) {
        this.context = context;
        this.layout = layout;
        this.data = data;
    }

    @Override
    public int getCount() { return data.size(); }

    @Override
    public Object getItem(int i) { return data.get(i); }

    @Override
    public long getItemId(int i) { return i; }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(layout, null);

        ImageView img = row.findViewById(R.id.imgRow);
        TextView title = row.findViewById(R.id.txtTitle);
        TextView desc = row.findViewById(R.id.txtContent);

        Product p = data.get(i);

        img.setImageResource(p.getImage());
        title.setText(p.getTitle());
        desc.setText(p.getDescription());

        return row;
    }
}