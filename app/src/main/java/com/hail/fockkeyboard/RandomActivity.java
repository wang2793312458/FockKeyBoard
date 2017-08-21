package com.hail.fockkeyboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class RandomActivity extends AppCompatActivity {
    private EditText mEtRondom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        mEtRondom = (EditText) findViewById(R.id.et_rondom);
        final KeyboardUtil keyboardUtil = new KeyboardUtil(RandomActivity.this, true);

        mEtRondom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyboardUtil.attachTo(mEtRondom);
            }
        });
    }
}
