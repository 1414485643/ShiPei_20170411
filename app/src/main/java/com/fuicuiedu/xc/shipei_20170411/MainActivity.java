package com.fuicuiedu.xc.shipei_20170411;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.main_tv);

        //找到当前控件的父控件（父控件上给子控件设定一个规则）
        DisplayMetrics metrics = new DisplayMetrics();
        //给当前metrics去设置当前屏幕信息（宽高）
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        //输出屏幕的高度和宽度
        Log.e("aaa","屏幕的高 = " + metrics.heightPixels);
        Log.e("aaa","屏幕的宽 = " + metrics.widthPixels);

        //控件宽高各为50%
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                (int)(metrics.widthPixels * 0.5),(int)(metrics.heightPixels * 0.5));

        textView.setLayoutParams(layoutParams);

    }
}
