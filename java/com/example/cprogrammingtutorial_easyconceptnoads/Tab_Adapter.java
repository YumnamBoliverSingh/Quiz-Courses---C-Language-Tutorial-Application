package com.example.cprogrammingtutorial_easyconceptnoads;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Tab_Adapter extends FragmentStateAdapter {
    public  Tab_Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle){
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1: {return new Second_tab();}
            case 2: {return new Third_tab();}
        }
        return new First_tab();

    }

    @Override
    public int getItemCount() {
        return 3;
    }




}

