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
     * ���ڶ�Fragment���й���
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

        // ��ʼ������Ԫ��
        initViews();
        fragmentManager = getFragmentManager();
        // ��һ������ʱѡ�е�0��tab
        setTabSelection(0);
    }

    /**
     * �������ȡ��ÿ����Ҫ�õ��Ŀؼ���ʵ���������������úñ�Ҫ�ĵ���¼���
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
                // ���������Ϣtabʱ��ѡ�е�1��tab
                setTabSelection(0);
                break;
            case R.id.main_trade_layout:
                // ���������ϵ��tabʱ��ѡ�е�2��tab
                setTabSelection(1);
                break;
            case R.id.main_holding_layout:
                // ������˶�̬tabʱ��ѡ�е�3��tab
                setTabSelection(2);
                break;
            case R.id.main_announce_layout:
                // �����������tabʱ��ѡ�е�4��tab
                setTabSelection(3);
                break;
            default:
                break;
        }
    }

    /**
     * ���ݴ����index����������ѡ�е�tabҳ��
     *
     * @param index ÿ��tabҳ��Ӧ���±ꡣ0��ʾ��Ϣ��1��ʾ��ϵ�ˣ�2��ʾ��̬��3��ʾ���á�
     */
    private void setTabSelection(int index) {
        // ÿ��ѡ��֮ǰ��������ϴε�ѡ��״̬
        clearSelection();
        // ����һ��Fragment����
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        // �����ص����е�Fragment���Է�ֹ�ж��Fragment��ʾ�ڽ����ϵ����
        hideFragments(transaction);
        switch (index) {
            case 0:
                // ���������Ϣtabʱ���ı�ؼ���ͼƬ��������ɫ
                quotationText.setTextColor(Color.WHITE);
                if (quotationFragment == null) {
                    // ���MessageFragmentΪ�գ��򴴽�һ������ӵ�������
                    quotationFragment = new QuotationFragment();
                    transaction.add(R.id.main_content, quotationFragment);
                } else {
                    // ���MessageFragment��Ϊ�գ���ֱ�ӽ�����ʾ����
                    transaction.show(quotationFragment);
                }
                break;
            case 1:
                // ���������ϵ��tabʱ���ı�ؼ���ͼƬ��������ɫ
                tradeText.setTextColor(Color.WHITE);
                if (tradeFragment == null) {
                    // ���ContactsFragmentΪ�գ��򴴽�һ������ӵ�������
                    tradeFragment = new TradeFragment();
                    transaction.add(R.id.main_content, tradeFragment);
                } else {
                    // ���ContactsFragment��Ϊ�գ���ֱ�ӽ�����ʾ����
                    transaction.show(tradeFragment);
                }
                break;
            case 2:
                // ������˶�̬tabʱ���ı�ؼ���ͼƬ��������ɫ
                holdingText.setTextColor(Color.WHITE);
                if (holdingFragment == null) {
                    // ���NewsFragmentΪ�գ��򴴽�һ������ӵ�������
                    holdingFragment = new HoldingFragment();
                    transaction.add(R.id.main_content, holdingFragment);
                } else {
                    // ���NewsFragment��Ϊ�գ���ֱ�ӽ�����ʾ����
                    transaction.show(holdingFragment);
                }
                break;
            case 3:
            default:
                // �����������tabʱ���ı�ؼ���ͼƬ��������ɫ
                announceText.setTextColor(Color.WHITE);
                if (announceFragment == null) {
                    // ���SettingFragmentΪ�գ��򴴽�һ������ӵ�������
                    announceFragment = new AnnounceFragment();
                    transaction.add(R.id.main_content, announceFragment);
                } else {
                    // ���SettingFragment��Ϊ�գ���ֱ�ӽ�����ʾ����
                    transaction.show(announceFragment);
                }
                break;
        }
        transaction.commit();
    }

    /**
     * ��������е�ѡ��״̬��
     */
    private void clearSelection() {
        quotationText.setTextColor(Color.parseColor("#82858b"));
        tradeText.setTextColor(Color.parseColor("#82858b"));
        holdingText.setTextColor(Color.parseColor("#82858b"));
        announceText.setTextColor(Color.parseColor("#82858b"));
    }

    /**
     * �����е�Fragment����Ϊ����״̬��
     *
     * @param transaction ���ڶ�Fragmentִ�в���������
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
