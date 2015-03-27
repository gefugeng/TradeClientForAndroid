package com.jsdttec.gfg.tradeclient.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jsdttec.gfg.tradeclient.Fragments.AnnounceFragment;
import com.jsdttec.gfg.tradeclient.Fragments.HoldingFragment;
import com.jsdttec.gfg.tradeclient.Fragments.QuotationFragment;
import com.jsdttec.gfg.tradeclient.Fragments.TradeFragment;
import com.jsdttec.gfg.tradeclient.R;


public class MainActivity extends Activity implements View.OnClickListener {

    /**
     * 用于对Fragment进行管理
     */
    private FragmentManager fragmentManager;

    private QuotationFragment quotationFragment;
    private TradeFragment tradeFragment;
    private HoldingFragment holdingFragment;
    private AnnounceFragment announceFragment;

    private View quotationLayout;
    private View tradeLayout;
    private View holdingLayout;
    private View announceLayout;

    private TextView quotationText;
    private TextView tradeText;
    private TextView holdingText;
    private TextView announceText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化布局元素
        initViews();
        fragmentManager = getFragmentManager();
        // 第一次启动时选中第0个tab
        setTabSelection(0);
    }

    /**
     * 在这里获取到每个需要用到的控件的实例，并给它们设置好必要的点击事件。
     */
    private void initViews() {
        quotationLayout = findViewById(R.id.main_quotation_layout);
        tradeLayout = findViewById(R.id.main_trade_layout);
        holdingLayout = findViewById(R.id.main_holding_layout);
        announceLayout = findViewById(R.id.main_announce_layout);

        quotationText = (TextView) findViewById(R.id.main_quotation_text);
        tradeText = (TextView) findViewById(R.id.main_trade_text);
        holdingText = (TextView) findViewById(R.id.main_holding_text);
        announceText = (TextView) findViewById(R.id.main_announce_text);
        quotationLayout.setOnClickListener(this);
        tradeLayout.setOnClickListener(this);
        holdingLayout.setOnClickListener(this);
        announceLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_quotation_layout:
                // 当点击了消息tab时，选中第1个tab
                setTabSelection(0);
                break;
            case R.id.main_trade_layout:
                // 当点击了联系人tab时，选中第2个tab
                setTabSelection(1);
                break;
            case R.id.main_holding_layout:
                // 当点击了动态tab时，选中第3个tab
                setTabSelection(2);
                break;
            case R.id.main_announce_layout:
                // 当点击了设置tab时，选中第4个tab
                setTabSelection(3);
                break;
            default:
                break;
        }
    }

    /**
     * 根据传入的index参数来设置选中的tab页。
     *
     * @param index 每个tab页对应的下标。0表示消息，1表示联系人，2表示动态，3表示设置。
     */
    private void setTabSelection(int index) {
        // 每次选中之前先清楚掉上次的选中状态
        clearSelection();
        // 开启一个Fragment事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        // 先隐藏掉所有的Fragment，以防止有多个Fragment显示在界面上的情况
        hideFragments(transaction);
        switch (index) {
            case 0:
                // 当点击了消息tab时，改变控件的图片和文字颜色
                quotationText.setTextColor(Color.WHITE);
                if (quotationFragment == null) {
                    // 如果MessageFragment为空，则创建一个并添加到界面上
                    quotationFragment = new QuotationFragment();
                    transaction.add(R.id.main_content, quotationFragment);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(quotationFragment);
                }
                break;
            case 1:
                // 当点击了联系人tab时，改变控件的图片和文字颜色
                tradeText.setTextColor(Color.WHITE);
                if (tradeFragment == null) {
                    // 如果ContactsFragment为空，则创建一个并添加到界面上
                    tradeFragment = new TradeFragment();
                    transaction.add(R.id.main_content, tradeFragment);
                } else {
                    // 如果ContactsFragment不为空，则直接将它显示出来
                    transaction.show(tradeFragment);
                }
                break;
            case 2:
                // 当点击了动态tab时，改变控件的图片和文字颜色
                holdingText.setTextColor(Color.WHITE);
                if (holdingFragment == null) {
                    // 如果NewsFragment为空，则创建一个并添加到界面上
                    holdingFragment = new HoldingFragment();
                    transaction.add(R.id.main_content, holdingFragment);
                } else {
                    // 如果NewsFragment不为空，则直接将它显示出来
                    transaction.show(holdingFragment);
                }
                break;
            case 3:
            default:
                // 当点击了设置tab时，改变控件的图片和文字颜色
                announceText.setTextColor(Color.WHITE);
                if (announceFragment == null) {
                    // 如果SettingFragment为空，则创建一个并添加到界面上
                    announceFragment = new AnnounceFragment();
                    transaction.add(R.id.main_content, announceFragment);
                } else {
                    // 如果SettingFragment不为空，则直接将它显示出来
                    transaction.show(announceFragment);
                }
                break;
        }
        transaction.commit();
    }

    /**
     * 清除掉所有的选中状态。
     */
    private void clearSelection() {
        quotationText.setTextColor(Color.parseColor("#82858b"));
        tradeText.setTextColor(Color.parseColor("#82858b"));
        holdingText.setTextColor(Color.parseColor("#82858b"));
        announceText.setTextColor(Color.parseColor("#82858b"));
    }

    /**
     * 将所有的Fragment都置为隐藏状态。
     *
     * @param transaction 用于对Fragment执行操作的事务
     */
    private void hideFragments(FragmentTransaction transaction) {
        if (quotationFragment != null) {
            transaction.hide(quotationFragment);
        }
        if (tradeFragment != null) {
            transaction.hide(tradeFragment);
        }
        if (holdingFragment != null) {
            transaction.hide(holdingFragment);
        }
        if (announceFragment != null) {
            transaction.hide(announceFragment);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
