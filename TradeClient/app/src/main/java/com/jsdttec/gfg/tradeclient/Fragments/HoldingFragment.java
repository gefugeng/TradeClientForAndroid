package com.jsdttec.gfg.tradeclient.Fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.jsdttec.gfg.tradeclient.R;
import com.jsdttec.gfg.tradeclient.adapters.HoldingDetailAdapter;
import com.jsdttec.gfg.tradeclient.entity.HoldingDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gfg on 3/25 0025.
 */
public class HoldingFragment extends Fragment {
    private List<HoldingDetail> fruitList = new ArrayList<HoldingDetail>();
    View holdingLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        holdingLayout = inflater.inflate(R.layout.holdingactivity,
                container, false);

        return holdingLayout;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData(); // 初始化数据
        HoldingDetailAdapter adapter = new HoldingDetailAdapter(this.getActivity(),
                R.layout.holdinglistitem, fruitList);
        ListView listView = (ListView) getView().findViewById(R.id.holding_listview);

        listView.setAdapter(adapter);
    }

    private void initData() {
        HoldingDetail data1 = new HoldingDetail();
        data1.setName("Ag10kg");
        data1.setTradeMarkName("buy");
        data1.setHoldQuantity(20);
        data1.setHoldPrice(3505);
        fruitList.add(data1);

        HoldingDetail data2 = new HoldingDetail();
        data2.setName("Ag50kg");
        data2.setTradeMarkName("sell");
        data2.setHoldQuantity(10);
        data2.setHoldPrice(3509);
        fruitList.add(data2);

        HoldingDetail data3 = new HoldingDetail();
        data3.setName("Ag100kg");
        data3.setTradeMarkName("sell");
        data3.setHoldQuantity(30);
        data3.setHoldPrice(3529);
        fruitList.add(data3);
    }
}
