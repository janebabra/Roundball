package com.greendog.androidstudio.example.roundballwebapp;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class MainActivity extends Activity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roundball);

        myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("file:///android_asset/roundball/roundball.html");

    }



}
