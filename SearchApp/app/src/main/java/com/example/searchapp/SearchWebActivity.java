package com.example.searchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SearchWebActivity extends AppCompatActivity {
    private WebView webView;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_web);
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        webView.loadUrl(url);
    }
}



