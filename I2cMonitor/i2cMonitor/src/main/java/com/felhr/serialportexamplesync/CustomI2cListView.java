package com.felhr.serialportexamplesync;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class I2cListHolder {
    String timing;
    String data;
    public I2cListHolder(String timing, String data) {
        this.timing = timing;
        this.data   = data;
    }
}
public class CustomI2cListView extends BaseAdapter {

    Context context;
    private ArrayList<I2cListHolder> list;

    public CustomI2cListView(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    class ViewHolder {
        TextView timing;
        TextView data;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.activity_i2c_header_layout, null, false);
            viewHolder = new ViewHolder();
            viewHolder.timing = view.findViewById(R.id.i2c_data);
            viewHolder.data = view.findViewById(R.id.i2c_time);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder)view.getTag();
        }
        //viewHolder.timing.setTextSize();
        //viewHolder.data.setTextSize();
        return view;
    }



}
