package com.example.myapplication4.viewPageAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication4.R;
import com.example.myapplication4.model.DienVien;

import java.util.ArrayList;

public class dienvienAdapter extends RecyclerView.Adapter<dienvienAdapter.dienvienViewHolder> {

    private Context context;
    private ArrayList<DienVien> arrayList;

    public dienvienAdapter(Context context, ArrayList<DienVien> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public dienvienViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_dienvien, parent, false);
        return new dienvienViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dienvienViewHolder holder, int position) {
        DienVien dienvien = arrayList.get(position);

        holder.txtTenDienVien.setText(dienvien.getTenDienVien());
        holder.txtQuocGia.setText(dienvien.getQuocGia());
        holder.imgDienVien.setImageResource(dienvien.getHinhanh());

        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(context, "Bạn chọn diễn viên: " + dienvien.getTenDienVien(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class dienvienViewHolder extends RecyclerView.ViewHolder {
        ImageView imgDienVien;
        TextView txtTenDienVien;
        TextView txtQuocGia;

        public dienvienViewHolder(@NonNull View itemView) {
            super(itemView);
            imgDienVien = itemView.findViewById(R.id.imgDienVien);
            txtTenDienVien = itemView.findViewById(R.id.txtTenDienVien);
            txtQuocGia = itemView.findViewById(R.id.txtQuocGia);
        }
    }
}
