package com.example.kuis.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.kuis.R;
import com.example.kuis.model.Mhs;

import java.util.List;

public class MhsAdapter extends BaseAdapter {

    Context context;
    List<Mhs> mhsList;

    public MhsAdapter(Context context, List<Mhs> mhsList) {
        this.context = context;
        this.mhsList = mhsList;
    }

    @Override
    public int getCount() {
        return mhsList.size();
    }

    @Override
    public Object getItem(int position) {
        return mhsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.daftar_mhs, null);
        TextView tvNama = view.findViewById(R.id.tv_nama);
        TextView tvNim = view.findViewById(R.id.tv_nim);
        TextView tvProdi = view.findViewById(R.id.tv_prodi);

        tvNama.setText(mhsList.get(position).nama);
        tvNim.setText(mhsList.get(position).nim);
        tvProdi.setText(mhsList.get(position).prodi);
        return view;
    }
}
