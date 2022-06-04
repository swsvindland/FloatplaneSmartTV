package com.example.androidtv
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView

/**
 * Loads [MainFragment].
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("https://www.floatplane.com/login")
    }
}