package com.sahilpvns.lenscorporation.ui.activity

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.databinding.ActivityMainBinding
import com.sahilpvns.lenscorporation.databinding.ActivityPdfBinding

class PDF : BaseActivity() {

    private var binding: ActivityPdfBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_pdf)

        binding?.apply {
            webView.loadUrl(getString(R.string.pdf_url))
            webView.settings.javaScriptEnabled = true
            webView.webViewClient = object : WebViewClient() {
                override fun onPageFinished(view: WebView, url: String) {
                    pbLoader.visibility = View.GONE
                }
            }
        }


    }
}