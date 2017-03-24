package com.example.mobsoft.cookbook.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.mobsoft.cookbook.R;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class BaseActivity extends AppCompatActivity implements BaseScreen{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoader(Boolean show) {

    }
}
