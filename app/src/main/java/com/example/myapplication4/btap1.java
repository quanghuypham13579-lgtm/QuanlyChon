package com.example.myapplication4;
import com.example.myapplication4.viewPageAdapter.viewPageAdapter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;


import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class btap1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_btap1);

        TabLayout tabLayout= findViewById(R.id.tablayout);
        ViewPager2 viewpage=findViewById(R.id.viewPage);

        viewPageAdapter adapter = new viewPageAdapter(this);
        viewpage.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewpage, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int i) {
                switch (i){
                    case 0 : tab.setText("CHON MON");
                    break;

                    case 1 : tab.setText("DIEN VIEN");
                    break;

                    case 2 : tab.setText("XEM PHIM");
                    break;
                }
            }
        }).attach();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}