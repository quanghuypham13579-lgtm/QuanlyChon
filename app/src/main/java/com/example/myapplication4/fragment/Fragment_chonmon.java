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
import com.example.myapplication4.model.ChonMon;
import com.example.myapplication4.viewPageAdapter.chonmonAdapter;

import java.util.ArrayList;

public class Fragment_chonmon extends Fragment {

    RecyclerView rcchonmon;
    ArrayList<ChonMon> list;
    chonmonAdapter adapter;

    public Fragment_chonmon() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chonmon, container, false);

        rcchonmon = view.findViewById(R.id.rcchonmon);

        list = new ArrayList<>();

        list.add(new ChonMon("Sinh Tố", 70000, R.drawable.sinh_to));
        list.add(new ChonMon("Cafe", 70000, R.drawable.cafe));
        list.add(new ChonMon("Chè Liên", 70000, R.drawable.che_lien));
        list.add(new ChonMon("Bánh Canh", 53000, R.drawable.banh_canh));
        list.add(new ChonMon("Bánh Tráng", 25000, R.drawable.banh_trang));
        list.add(new ChonMon("Bún Chả", 83000, R.drawable.bun_cha));

        adapter = new chonmonAdapter(requireContext(), list);

        rcchonmon.setLayoutManager(new GridLayoutManager(getContext(), 2));

        rcchonmon.setAdapter(adapter);

        return view;
    }
}