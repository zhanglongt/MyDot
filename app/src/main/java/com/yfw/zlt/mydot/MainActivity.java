package com.yfw.zlt.mydot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yfw.zlt.mydot.view.DotsView;

public class MainActivity extends AppCompatActivity {
    private DotsView mDotsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDotsView = (DotsView) findViewById(R.id.dotsview_main);
        mDotsView.setDotRessource(R.mipmap.dot_selected, R.mipmap.dot_unselected);
        mDotsView.setNumberOfPage(5);
        mDotsView.selectDot(3);


    }
}
