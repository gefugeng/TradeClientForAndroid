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
        //����������ڷֱ��ǲ��������������߳���Ϣʱ�䣩������(publishProgress�õ�)������ֵ ����

        @Override
        protected void onPreExecute() {
            //��һ��ִ�з���
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Integer... params) {
            //�ڶ���ִ�з���,onPreExecute()ִ�����ִ��
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
            //���������doInBackground����publishProgressʱ��������Ȼ����ʱֻ��һ������
            //��������ȡ������һ������,����Ҫ��progesss[0]��ȡֵ
            //��n����������progress[n]��ȡֵ
            //  loginProgressBar.setProgress(progress[0]);
            super.onProgressUpdate(progress);
        }

        @Override
        protected void onPostExecute(String result) {
            //doInBackground����ʱ���������仰˵������doInBackgroundִ����󴥷�
            //�����result��������doInBackgroundִ�к�ķ���ֵ������������"ִ�����"
            Toast.makeText(LoginActivity.this, result,
                    Toast.LENGTH_SHORT).show();
            super.onPostExecute(result);
        }
    }
}

