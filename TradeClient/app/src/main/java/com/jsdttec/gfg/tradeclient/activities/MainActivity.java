package com.jsdttec.gfg.tradeclient.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.jsdttec.gfg.tradeclient.R;


public class MainActivity extends Activity {

    private LinearLayout containerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        containerLayout = (LinearLayout) findViewById(R.id.container_layout);

        View view = View.inflate(this, R.layout.quotationactivity, null);
        containerLayout.removeAllViews();
        containerLayout.addView(view);

        Button quotationButton = (Button) findViewById(R.id.quotation_button);
        quotationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = View.inflate(MainActivity.this, R.layout.quotationactivity, null);

                containerLayout.removeAllViews();
                containerLayout.addView(view);
            }
        });

        Button holdingButton = (Button) findViewById(R.id.holding_button);
        holdingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = View.inflate(MainActivity.this, R.layout.holdingactivity, null);
                containerLayout.removeAllViews();
                containerLayout.addView(view);
            }
        });
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
