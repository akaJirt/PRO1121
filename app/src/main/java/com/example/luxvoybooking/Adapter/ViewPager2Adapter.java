package com.example.luxvoybooking.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.luxvoybooking.Fragment.FragmentOnboard1;
import com.example.luxvoybooking.Fragment.FragmentOnboard2;
import com.example.luxvoybooking.Fragment.FragmentOnboard3;


public class ViewPager2Adapter extends FragmentStateAdapter {

    public ViewPager2Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position) {
            default:
            case 0:
                fragment = new FragmentOnboard1();
                break;
            case 1:
                fragment = new FragmentOnboard2();
                break;
            case 2:
                fragment = new FragmentOnboard3();
                break;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
