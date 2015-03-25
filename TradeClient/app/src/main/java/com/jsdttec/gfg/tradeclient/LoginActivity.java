package com.jsdttec.gfg.tradeclient;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by gfg on 3/25 0025.
 */
public class LoginActivity extends Activity {

    private EditText idEditText;
    private EditText passwordEditText;
    private CheckBox rememberCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);

        idEditText = (EditText) findViewById(R.id.id_edittext);
        passwordEditText = (EditText) findViewById(R.id.password_edittext);
        rememberCheckBox = (CheckBox) findViewById(R.id.remember_checkbox);
        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckInput()) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
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
}

