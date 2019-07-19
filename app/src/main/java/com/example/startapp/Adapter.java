package com.example.startapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adapter extends BaseAdapter {

    private String[] titles;
    private String[] desc;
    private String[] imgdef;

    private Context context;

    private static LayoutInflater layoutInflater;

    Adapter(Context adaptercontext, String[] titlelist, String [] desclist, String[] img)
    {
        titles = titlelist;
        desc = desclist;
        imgdef = img;
        context = adaptercontext;

        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private class ViewHolder
    {
        TextView tv1,tv2,tv3;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = new ViewHolder();

        if (view == null)
        {
            view = layoutInflater.inflate(R.layout.list_layout,viewGroup,false);

            viewHolder.tv1 = (TextView)view.findViewById(R.id.textView);
            viewHolder.tv2 = (TextView)view.findViewById(R.id.textView2);
            viewHolder.tv3 = (TextView)view.findViewById(R.id.textView3);

            view.setTag(viewHolder);
        }

        else
        {
            viewHolder = (ViewHolder)view.getTag();
        }

        viewHolder.tv1.setText(titles[i]);
        viewHolder.tv2.setText(desc[i]);
        viewHolder.tv1.setText(imgdef[i]);

        return view;
    }
}
