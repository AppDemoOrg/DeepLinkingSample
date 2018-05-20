package com.abt.deeplinking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.orhanobut.logger.Logger;

import butterknife.ButterKnife;
import butterknife.OnClick;
import cc.lkme.deeplinking.R;

/**
 * @描述： @MainActivity
 * @作者： @黄卫旗
 * @创建时间： @20/05/2018
 */
public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.open_html) void click() {
        BrowserActivity.startActivity(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if (getIntent().getData() != null) {
            //获取query中的数据
            String clickId = getIntent().getData().getQueryParameter("click_id");
            Logger.d("clickId = "+clickId);
        }
    }
}
