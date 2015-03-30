package com.jsdttec.gfg.tradeclient.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.jsdttec.gfg.tradeclient.R;
import com.jsdttec.gfg.tradeclient.common.WebDataHelper;

/**
 * Created by gfg on 3/25 0025.
 */
public class LoginActivity extends Activity {

    private EditText idEditText;
    private EditText passwordEditText;
    private CheckBox rememberCheckBox;
    private ProgressBar loginProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);

        idEditText = (EditText) findViewById(R.id.id_edittext);
        passwordEditText = (EditText) findViewById(R.id.password_edittext);
        rememberCheckBox = (CheckBox) findViewById(R.id.remember_checkbox);
        loginProgressBar = (ProgressBar) findViewById(R.id.login_action_progressbar);
        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DownloadTask dTask = new DownloadTask();
                dTask.execute(10);
                // String webData=  WebDataHelper.GetData("http://222.73.113.127/m/hq/v1/commodityprice/");
              /*  if (CheckInput()) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }*/
            }
        });

    }

    private boolean CheckInput() {
        String id = idEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        if (id.trim().isEmpty()) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
            dialog.setTitle("Warning");
            dialog.setMessage("please input your Id");
            dialog.setCancelable(false);
            dialog.setPositiveButton("OK", new DialogInterface.
                    OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            dialog.show();
            return false;
        }

        return true;
    }

    class DownloadTask extends AsyncTask<Integer, Integer, String> {
        //后面尖括号内分别是参数（例子里是线程休息时间），进度(publishProgress用到)，返回值 类型

        @Override
        protected void onPreExecute() {
            //第一个执行方法
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Integer... params) {
            //第二个执行方法,onPreExecute()执行完后执行
    /*    for(int i=0;i<=100;i++){

            publishProgress(i);
            try {
                Thread.sleep(params[0]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
            String webData = WebDataHelper.GetData("http://222.73.113.127/m/hq/v1/commodityprice/");
            return webData;
        }

        @Override
        protected void onProgressUpdate(Integer... progress) {
            //这个函数在doInBackground调用publishProgress时触发，虽然调用时只有一个参数
            //但是这里取到的是一个数组,所以要用progesss[0]来取值
            //第n个参数就用progress[n]来取值
            //  loginProgressBar.setProgress(progress[0]);
            super.onProgressUpdate(progress);
        }

        @Override
        protected void onPostExecute(String result) {
            //doInBackground返回时触发，换句话说，就是doInBackground执行完后触发
            //这里的result就是上面doInBackground执行后的返回值，所以这里是"执行完毕"
            Toast.makeText(LoginActivity.this, result,
                    Toast.LENGTH_SHORT).show();
            super.onPostExecute(result);
        }
    }
}

