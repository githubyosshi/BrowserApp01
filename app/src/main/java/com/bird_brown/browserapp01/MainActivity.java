package com.bird_brown.browserapp01;

import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView webView;    //WebViewクラス

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ActionBarのオブジェクトを取得
        //ActionBar actionBar = getActionBar();
        ActionBar actionBar = getSupportActionBar();

        //ActionBarにタイトルを設定
        actionBar.setTitle("メインタイトル");
        //setTitle("メインタイトル");

        //ActionBarにサブタイトルを設定
        actionBar.setSubtitle("サブタイトル");

        //WebViewのオブジェクトを取得
        webView = (WebView) findViewById(R.id.webView1);

        //WebSettingsを取得
        WebSettings settings = webView.getSettings();

        //JavaScriptを有効にする
        settings.setJavaScriptEnabled(true);

        //CustomWebClientViewのオブジェクトを設定
        webView.setWebViewClient(new CustomWevViewClient());

        if (savedInstanceState == null) {
            //何も画面に表示されていなければWebViewに表示
            webView.loadUrl("https://www.google.co.jp/");
        } else {
            //現在表示されている内容でsavedInstanceStateの状態を復元
            webView.restoreState(savedInstanceState);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (webView == null) {
            return;
        }

        //webViewの表示を停止
        webView.stopLoading();

        //setWebChromeClientをnullに設定
        webView.setWebChromeClient(null);

        //setWebViewClient(null)
        webView.setWebViewClient(null);

        //webViewを破棄
        webView.destroy();

        //webViewをnullに設定
        webView = null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }
}
