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
import com.example.myapplication4.model.XemPhim;

import java.util.ArrayList;

public class xemphimAdapter extends RecyclerView.Adapter<xemphimAdapter.xemphimViewHolder> {

    private Context context;
    private ArrayList<XemPhim> arrayList;

    public xemphimAdapter(Context context, ArrayList<XemPhim> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public xemphimViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_xemphim, parent, false);
        return new xemphimViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull xemphimViewHolder holder, int position) {
        XemPhim phim = arrayList.get(position);

        holder.txtTenPhim.setText(phim.getTenPhim());
        holder.txtTheLoai.setText(phim.getTheLoai());
        holder.imgPhim.setImageResource(phim.getHinhanh());

        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(context, "Bạn chọn xem phim: " + phim.getTenPhim(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class xemphimViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhim;
        TextView txtTenPhim;
        TextView txtTheLoai;

        public xemphimViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhim = itemView.findViewById(R.id.imgPhim);
            txtTenPhim = itemView.findViewById(R.id.txtTenPhim);
            txtTheLoai = itemView.findViewById(R.id.txtTheLoai);
        }
    }
}
