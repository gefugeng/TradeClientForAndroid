package com.jsdttec.gfg.tradeclient.Fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jsdttec.gfg.tradeclient.R;

/**
 * Created by gfg on 3/25 0025.
 */
public class QuotationFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View quotationLayout = inflater.inflate(R.layout.quotationactivity,
                container, false);
        return quotationLayout;
    }
}
