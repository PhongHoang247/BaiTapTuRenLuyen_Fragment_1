package com.phong.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.phong.baitapturenluyen_fragment_1.R;
import com.phong.model.SanPham;

import java.util.ArrayList;

public class SanPhamAdapter extends BaseAdapter {
    Context context;
    ArrayList<SanPham> sanPhams;
    LayoutInflater inflater;
    public SanPhamAdapter(Context context,ArrayList<SanPham> sanPhams){
        this.context = context;
        this.sanPhams = sanPhams;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return sanPhams.size();
    }

    @Override
    public Object getItem(int i) {
        return sanPhams.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null){
            viewHolder = new ViewHolder();
            view = inflater.inflate(R.layout.item_listview,null);
            viewHolder.imgHinh = view.findViewById(R.id.imgHinh);
            viewHolder.txtTen = view.findViewById(R.id.txtTen);
            viewHolder.txtMoTa = view.findViewById(R.id.txtMoTa);
            viewHolder.btnGia = view.findViewById(R.id.btnGia);
            viewHolder.chkMua = view.findViewById(R.id.chkMua);
            view.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) view.getTag();
        }
        SanPham sp = sanPhams.get(i);
        viewHolder.imgHinh.setImageResource(sp.getHinh());
        viewHolder.txtTen.setText(sp.getTen());
        viewHolder.txtMoTa.setText(sp.getMoTa());
        viewHolder.btnGia.setText(sp.getGia() + "");
        viewHolder.chkMua.setChecked(sp.isMua());
        return view;
    }

    private class ViewHolder{
        public ImageView imgHinh;
        public TextView txtTen, txtMoTa;
        public Button btnGia;
        public CheckBox chkMua;
    }
}
