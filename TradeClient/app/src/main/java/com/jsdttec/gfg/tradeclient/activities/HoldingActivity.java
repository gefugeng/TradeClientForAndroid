package com.jsdttec.gfg.tradeclient.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.jsdttec.gfg.tradeclient.R;
import com.jsdttec.gfg.tradeclient.adapters.HoldingDetailAdapter;
import com.jsdttec.gfg.tradeclient.entity.HoldingDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gfg on 3/25 0025.
 */
public class HoldingActivity extends Activity {
    private List<HoldingDetail> fruitList = new ArrayList<HoldingDetail>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.holdingactivity);

        initData(); // 初始化数据
        HoldingDetailAdapter adapter = new HoldingDetailAdapter(HoldingActivity.this,
                R.layout.holdinglistitem, fruitList);
        ListView listView = (ListView) findViewById(R.id.holding_listview);

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
