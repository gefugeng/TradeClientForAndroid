package com.jsdttec.gfg.tradeclient.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jsdttec.gfg.tradeclient.R;

/**
 * Created by gfg on 3/27 0027.
 */
public class TradeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View tradeLayout = inflater.inflate(R.layout.tradeactivity,
                container, false);
        return tradeLayout;
    }
}
