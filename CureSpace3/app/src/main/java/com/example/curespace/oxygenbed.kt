
package com.example.curespace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebViewClient
import com.example.curespace.databinding.ActivityOxygenbedBinding

class oxyegenbed : AppCompatActivity() {
    private  lateinit var binding:ActivityOxygenbedBinding
    private val link = "https://coronabeds.jantasamvad.org/oxygen-beds.html"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOxygenbedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        turnwebtoapp()
    }

    private fun turnwebtoapp(){

        binding.oxygnwebview.apply {
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
        if(binding.oxygnwebview.canGoBack()){
            binding.oxygnwebview.goBack()
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


        binding.oxygnwebview.apply {
            loadData(customHtml,
                "text/html",
                "UTF-8")

        }
    }
}
