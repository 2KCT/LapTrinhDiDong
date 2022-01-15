package com.example.pinterest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import SignInSignUp.GridviewAdapter;
import SignInSignUp.HinhAnh;

public class GridviewTrangchuAdapter extends BaseAdapter {
    private Context context;
    int layout;
    private List<HinhAnh> hinhAnhList;
    private Integer []thumbIds;


    public GridviewTrangchuAdapter(Context context, int layout, List<HinhAnh> hinhAnhList) {
        this.context = context;
        this.layout = layout;
        this.hinhAnhList = hinhAnhList;
    }

    public GridviewTrangchuAdapter(Context context, Integer[] thumbIds) {
        this.context = context;
        this.thumbIds = thumbIds;
    }

    @Override
    public int getCount() {
        return hinhAnhList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh,imgOption;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imgHinhTrangChu);
            holder.imgOption = (ImageView) convertView.findViewById(R.id.img_Option);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        HinhAnh hinhAnh = hinhAnhList.get(position);
        TextView tvTen = convertView.findViewById(R.id.txtNameTrangChu);
        tvTen.setText(hinhAnh.getTen());
        holder.imgOption.setImageResource(hinhAnh.getOption());
        holder.imgHinh.setImageResource(hinhAnh.getHinh());
        return convertView;
    }
}
