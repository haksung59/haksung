package com.example.fastcampus

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doBeforeTextChanged
import androidx.core.widget.doOnTextChanged

class Homework02_webview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework02_webview)

        val webview = findViewById<WebView>(R.id.webView)
        webview.setWebViewClient(object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                // true -> 주도권을 가져오지 않는다. (우리앱이)
                // false -> 주도권을 가져오겠다 ( 우리앱)
                return true
            }
        })

        try {
            webview.loadUrl(intent.data!!.toString())
        }catch(exception:Exception) {

        }

        val urlPrefix = "http://"
        var finalUrl = ""

        val address = (findViewById<EditText>(R.id.webUrl))
        //addTextChangedListener 사용법
        address.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("testt", "beforeTextChanged : " + s)
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("testt", "onTextChanged : " + s)
            }

            override fun afterTextChanged(s: Editable?) {
                finalUrl = urlPrefix + s.toString()
                Log.d("testt", "afterTextChanged : " + s)
            }
        })

        //addTextChangedListener 사용법 -> 람다 형식
        address.doBeforeTextChanged { text, start, count, after ->  }
        address.doOnTextChanged { text, start, before, count ->  }
        address.doAfterTextChanged {  }

        val open = findViewById<Button>(R.id.btnSearch)
        open.setOnClickListener{
//            webview.loadUrl(finalUrl)
            val url = address.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }
}