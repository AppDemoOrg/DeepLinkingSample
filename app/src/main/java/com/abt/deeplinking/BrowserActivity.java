package com.abt.deeplinking;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @描述： @BrowserActivity
 * @作者： @黄卫旗
 * @创建时间： @20/05/2018
 */
public class BrowserActivity extends AppCompatActivity {

    @BindView(R.id.webview)
    WebView mWebView;
    @BindView(R.id.ua)
    TextView mUserAgent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        ButterKnife.bind(this);

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("file:///android_asset/web.html");
        mUserAgent.setText(mWebView.getSettings().getUserAgentString());
    }

    public static final void startActivity(Context context) {
        Intent intent = new Intent(context, BrowserActivity.class);
        context.startActivity(intent);
    }
}
