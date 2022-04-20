package com.example.android_leakcanary_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {

    companion object {
        private var subActivity: SubActivity? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        subActivity = this
    }

}