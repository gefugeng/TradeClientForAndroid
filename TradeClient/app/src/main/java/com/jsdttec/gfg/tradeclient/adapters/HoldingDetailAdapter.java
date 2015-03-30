package com.jsdttec.gfg.tradeclient.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.jsdttec.gfg.tradeclient.R;
import com.jsdttec.gfg.tradeclient.entity.HoldingDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gfg on 3/26 0026.
 */
public class HoldingDetailAdapter extends ArrayAdapter<HoldingDetail> {
    private int resourceId;

    public HoldingDetailAdapter(Context context, int resource, List<HoldingDetail> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HoldingDetail holdingDetail = getItem(position); // 获取当前项的实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);

        TextView name = (TextView) view.findViewById(R.id.holdinglistitem_name_text);
        name.setText(holdingDetail.getName());

        TextView tradeMarkName = (TextView) view.findViewById(R.id.holdinglistitem_trademarkname_text);
        tradeMarkName.setText(holdingDetail.getTradeMarkName());

        TextView holdQuantity = (TextView) view.findViewById(R.id.holdinglistitem_holdquantity_text);
        holdQuantity.setText(String.valueOf(holdingDetail.getHoldQuantity()));

        TextView holdPrice = (TextView) view.findViewById(R.id.holdinglistitem_holdprice_text);
        holdPrice.setText(String.valueOf(holdingDetail.getHoldPrice()));

        return view;
    }
}
