package com.example.myapplication4.viewPageAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication4.fragment.Fragment_chonmon;
import com.example.myapplication4.fragment.Fragment_dienvien;
import com.example.myapplication4.fragment.Fragment_xemphim;

public class viewPageAdapter extends FragmentStateAdapter {
    public viewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 : return new Fragment_chonmon();
            case 1 : return new Fragment_dienvien();
            case 2 : return new Fragment_xemphim();
        }
        return new Fragment_chonmon();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
