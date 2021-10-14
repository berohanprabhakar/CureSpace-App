

package com.example.curespace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebViewClient
import com.example.curespace.databinding.ActivityCovidBedsBinding

class CovidBeds : AppCompatActivity() {
    private  lateinit var binding:ActivityCovidBedsBinding
    private val link = "https://coronabeds.jantasamvad.org/beds.html"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCovidBedsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        turnwebtoapp()
    }

    private fun turnwebtoapp(){

        binding.covidwebview.apply {
            webViewClient = WebViewClient()
            loadUrl(link)

            settings.apply {
                javaScriptEnabled= true
                setAppCacheEnabled(true)
                cacheMode= WebSettings.LOAD_DEFAULT
                setSupportZoom(false)
                builtInZoomControls = false
                displayZoomControls = false
                textZoom = 100
                blockNetworkImage = false
                loadsImagesAutomatically = true
            }
        }.canGoBack()
    }

    override fun onBackPressed() {
        if(binding.covidwebview.canGoBack()){
            binding.covidwebview.goBack()
        }else {
            super.onBackPressed()
        }
    }
    private fun myHtml(){

        val customHtml = "<html><body>" +
                "<h1>Hello There</h1>"+
                "<h2>Heading 2</h2>" +
                "<h3>Heading 3</h3>" +
                "<p>This is a sample Paragraph</p>"+
                "</html></body>"


        binding.covidwebview.apply {
            loadData(customHtml,
                "text/html",
                "UTF-8")

        }
    }
}

