package com.example.myapplication4.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication4.R;
import com.example.myapplication4.model.XemPhim;
import com.example.myapplication4.viewPageAdapter.xemphimAdapter;

import java.util.ArrayList;

public class Fragment_xemphim extends Fragment {

    RecyclerView rcxemphim;
    ArrayList<XemPhim> list;
    xemphimAdapter adapter;

    public Fragment_xemphim() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_xemphim, container, false);

        rcxemphim = view.findViewById(R.id.rcxemphim);

        list = new ArrayList<>();
        list.add(new XemPhim("Phim Mai", "Tâm Lý / Tình Cảm", R.drawable.phim_mai));
        list.add(new XemPhim("Lật Mặt 7", "Gia Đình / Hài", R.drawable.lat_mat_7));
        list.add(new XemPhim("Nhà Bà Nữ", "Gia Đình / Tâm Lý", R.drawable.nha_ba_nu));
        list.add(new XemPhim("Bố Già", "Gia Đình / Tình Cảm", R.drawable.bo_gia));
        list.add(new XemPhim("Em Là Bà Nội Của Anh", "Hài / Lãng Mạn", R.drawable.em_la_ba_noi_cua_anh));
        list.add(new XemPhim("Mắt Biếc", "Lãng Mạn / Tâm Lý", R.drawable.mat_biec));

        adapter = new xemphimAdapter(requireContext(), list);
        rcxemphim.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rcxemphim.setAdapter(adapter);

        return view;
    }
}