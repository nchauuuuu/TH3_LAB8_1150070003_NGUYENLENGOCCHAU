package com.example.th3_lab8_1150070003_nguyenlengocchau.Adapter;

import android.content.Context;
import android.view.*;
import android.widget.*;
import java.util.ArrayList;
import com.example.th3_lab8_1150070003_nguyenlengocchau.R;
import com.example.th3_lab8_1150070003_nguyenlengocchau.Product;

public class GridAdapter extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<Product> data;

    public GridAdapter(Context context, int layout, ArrayList<Product> data) {
        this.context = context;
        this.layout = layout;
        this.data = data;
    }

    @Override public int getCount() { return data.size(); }
    @Override public Object getItem(int i) { return data.get(i); }
    @Override public long getItemId(int i) { return i; }

    @Override
    public View getView(int pos, View view, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(layout, null);

        ImageView img = row.findViewById(R.id.imgGrid);
        TextView txt = row.findViewById(R.id.txtGrid);

        Product p = data.get(pos);

        img.setImageResource(p.getImage());
        txt.setText(p.getTitle());

        return row;
    }
}