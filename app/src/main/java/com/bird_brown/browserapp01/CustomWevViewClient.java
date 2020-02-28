package com.bird_brown.browserapp01;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class CustomWevViewClient extends WebViewClient {

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);

        //コンテキストを取得
        Context context = view.getContext();

        //トーストで表示する文字列を設定
        String s = "ロード中";

        //トーストを表示
        Toast t = Toast.makeText(context, s, Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);

        //コンテキストを取得
        Context context = view.getContext();

        //表示されているページのタイトルを取得
        String title = view.getTitle();

        //トーストで表示する文字列を設定
        String s = title + "を読込完了";

        //トーストを表示
        Toast t = Toast.makeText(context, s, Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
    //    super.onReceivedError(view, errorCode, description, failingUrl);

    //@Override
    //public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
    //    super.onReceivedError(view, request, error);

    //コンテキストを取得
        Context context = view.getContext();

        //トーストで表示する文字列を設定
        String s = "エラー";

        //トーストを表示する
        Toast t = Toast.makeText(context, s, Toast.LENGTH_SHORT);
        t.show();
    }
}
