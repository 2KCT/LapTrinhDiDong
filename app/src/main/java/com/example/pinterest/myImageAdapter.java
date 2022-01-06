package com.example.pinterest;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class myImageAdapter extends BaseAdapter {
    private Context context;
    private Integer []thumbIds;

    public myImageAdapter(Context context) {
        this.context = context;
    }

    public myImageAdapter(Context context, Integer[] thumbIds) {
        this.context = context;
        this.thumbIds = thumbIds;
    }

    @Override
    public int getCount() {
        return thumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if(convertView==null)
        {
            imageView = new ImageView(context);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        //lay dung vi tri hinh anh duoc chon
        //gan lai ImageResource
        imageView.setImageResource(thumbIds[position]);
        return imageView;
    }
}
