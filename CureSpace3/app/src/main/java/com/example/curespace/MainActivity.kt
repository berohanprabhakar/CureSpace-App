package com.example.curespace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val covidbed = findViewById<RelativeLayout>(R.id.firstbtn)


        covidbed.setOnClickListener {
            val intent = Intent(this,CovidBeds::class.java)
            startActivity(intent)
        }

        val oxyegenbed = findViewById<RelativeLayout>(R.id.oxygenbtn)
        oxyegenbed.setOnClickListener {
            val intent = Intent(this,com.example.curespace.oxyegenbed::class.java)
            startActivity(intent)
        }

        val icubed = findViewById<RelativeLayout>(R.id.icubtn)
        icubed.setOnClickListener {
            val intent = Intent(this,icu_beds::class.java)
            startActivity(intent)
        }

        val ventib  = findViewById<RelativeLayout>(R.id.ventibtn)
        ventib.setOnClickListener {
            val intent = Intent(this,venti_beds::class.java)
            startActivity(intent)
        }

        val vaccineslotsAc = findViewById<ConstraintLayout>(R.id.vaccinetab)
        vaccineslotsAc.setOnClickListener {
            val intent = Intent(this,Slots::class.java)
            startActivity(intent)
        }

        val blooddono = findViewById<ConstraintLayout>(R.id.bloodtab)
        blooddono.setOnClickListener {
            val intent = Intent(this,BloodDonor::class.java)
            startActivity(intent)
        }

        actionBar?.setDisplayHomeAsUpEnabled(true)

    }
}
