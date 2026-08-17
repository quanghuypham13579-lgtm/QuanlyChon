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
import com.example.myapplication4.model.DienVien;
import com.example.myapplication4.viewPageAdapter.dienvienAdapter;

import java.util.ArrayList;

public class Fragment_dienvien extends Fragment {

    RecyclerView rcdienvien;
    ArrayList<DienVien> list;
    dienvienAdapter adapter;

    public Fragment_dienvien() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dienvien, container, false);

        rcdienvien = view.findViewById(R.id.rcdienvien);

        list = new ArrayList<>();
        list.add(new DienVien("Trấn Thành", "Việt Nam", R.drawable.img_1));
        list.add(new DienVien("Ninh Dương Lan Ngọc", "Việt Nam", R.drawable.img_2));
        list.add(new DienVien("Trường Giang", "Việt Nam", R.drawable.img));
        list.add(new DienVien("Kaity Nguyễn", "Việt Nam", R.drawable.img_3));
        list.add(new DienVien("Thái Hòa", "Việt Nam", R.drawable.img_4));
        list.add(new DienVien("Thu Trang", "Việt Nam", R.drawable.img_5));

        adapter = new dienvienAdapter(requireContext(), list);
        rcdienvien.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rcdienvien.setAdapter(adapter);

        return view;
    }
}