package com.arun.viewpager2sliderex.fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.os.Bundle;

import com.arun.viewpager2sliderex.R;
import com.arun.viewpager2sliderex.databinding.ActivityFragmentViewPagerBinding;
import com.google.android.material.tabs.TabLayoutMediator;


public class FragmentViewPagerActivity extends AppCompatActivity {

        ActivityFragmentViewPagerBinding binding;

        // tab titles
        private String[] titles = new String[]{"Movies", "Events", "Tickets"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityFragmentViewPagerBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            init();
        }

        private void init() {
            // removing toolbar elevation
            getSupportActionBar().setElevation(0);

            binding.viewPager.setAdapter(new ViewPagerFragmentAdapter(this));

            // attaching tab mediator
            new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                    (tab, position) -> tab.setText(titles[position])).attach();
        }

        private class ViewPagerFragmentAdapter extends FragmentStateAdapter {

            public ViewPagerFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
                super(fragmentActivity);
            }

            @NonNull
            @Override
            public Fragment createFragment(int position) {
                switch (position) {
                    case 0:
                        return new MoviesFragment();
                    case 1:
                        return new EventsFragment();
                    case 2:
                        return new TicketsFragment();
                }
                return new MoviesFragment();
            }

            @Override
            public int getItemCount() {
                return titles.length;
            }
        }

}