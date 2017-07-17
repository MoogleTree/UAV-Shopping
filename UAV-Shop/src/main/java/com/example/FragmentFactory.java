package com.example;

import android.app.Fragment;

import com.example.MyFragment;
import com.example.PaymentFragement;
import com.example.ShopFragment;

/**
 * Created by InsZVA on 2017/7/17.
 */

public class FragmentFactory {
    public static Fragment getInstanceByIndex(int index) {
        Fragment fragment = null;
        switch (index) {
            case 1:
                fragment = new ShopFragment();
                break;
            case 2:
                fragment = new PaymentFragement();
                break;
            case 3:
                fragment = new MyFragment();
                break;
        }
        return fragment;
    }
}