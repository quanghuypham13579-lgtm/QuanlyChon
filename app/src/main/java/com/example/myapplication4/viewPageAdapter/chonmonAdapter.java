package com.example.myapplication4.viewPageAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication4.R;
import com.example.myapplication4.model.ChonMon;

import java.util.ArrayList;

public class chonmonAdapter extends RecyclerView.Adapter<chonmonAdapter.chonmonViewHolder> {

    private Context context;
    private ArrayList<ChonMon> arrayList;

    public chonmonAdapter(Context context, ArrayList<ChonMon> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    // tao giao dien cho tung item
    public chonmonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_chonmon, parent, false);

        return new chonmonViewHolder(view);
    }

    //do du lieu vao item
    @Override
    public void onBindViewHolder(@NonNull chonmonViewHolder holder, int position) {

        ChonMon mon = arrayList.get(position);

        holder.txtTen.setText(mon.getTenmon());
        holder.txtGia.setText(String.valueOf(mon.getGia()));
        holder.imgMon.setImageResource(mon.getHinhanh());

        holder.itemView.setOnClickListener(v -> {

            PopupMenu popup = new PopupMenu(context, holder.itemView);
            popup.getMenuInflater().inflate(R.menu.menu_ban, popup.getMenu());

            popup.setOnMenuItemClickListener(item -> {

                String ban = item.getTitle().toString();

                Toast.makeText(
                        context,
                        ban + " chọn món " + mon.getTenmon(),
                        Toast.LENGTH_SHORT
                ).show();

                return true;
            });

            popup.show();
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class chonmonViewHolder extends RecyclerView.ViewHolder {

        ImageView imgMon;
        TextView txtTen;
        TextView txtGia;

        public chonmonViewHolder(@NonNull View itemView) {
            super(itemView);

            imgMon = itemView.findViewById(R.id.imgMon);
            txtTen = itemView.findViewById(R.id.txtTen);
            txtGia = itemView.findViewById(R.id.txtGia);
        }
    }
}