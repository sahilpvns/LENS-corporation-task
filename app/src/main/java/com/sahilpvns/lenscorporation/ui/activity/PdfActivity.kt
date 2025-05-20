package com.sahilpvns.lenscorporation.ui.activity

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.sahilpvns.lenscorporation.R
import com.sahilpvns.lenscorporation.databinding.ActivityPdfBinding

class PdfActivity : BaseActivity() {

    private lateinit var binding : ActivityPdfBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
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