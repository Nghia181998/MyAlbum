package com.example.myalbum;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageAdapter extends BaseAdapter {
    private Context localContext;
    private LayoutInflater mInflater;
    private LayoutInflater layoutInflater;

    ImageAdapter(Context ct) {
        this.localContext = ct;
        mInflater = LayoutInflater.from(localContext);
    }

    @Override
    public int getCount() {
        return 60;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {

             mInflater = (LayoutInflater) localContext
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            convertView = mInflater.inflate(R.layout.item_image_in_girdlayout, null);
            holder = new ViewHolder();
            holder.flagView = (ImageView) convertView.findViewById(R.id.iv_item_image_in_gridlayout);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Picasso.get().load("https://live.staticflickr.com//3745//12237140903_c8314e07df.jpg").into(holder.flagView);

        return convertView;


    }
    static class ViewHolder {
        ImageView flagView;
    }
}

