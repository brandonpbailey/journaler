package com.journaler.activity

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.util.Log
import com.journaler.Journaler
import kotlinx.android.synthetic.main.activity_header.*

abstract class BaseActivity : FragmentActivity() {

    protected abstract val tag: String
    protected abstract fun getLayout(): Int
    protected abstract fun getActivityTitle(): Int


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        activity_title.setText(getActivityTitle())
        Log.v(tag,"[ON CREATE]")
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.v(tag,"[ON POST RESUME]")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(tag,"[ON DESTROY]")
    }

    override fun onStart() {
        super.onStart()
        Log.v(tag,"[ON START]")
    }

    override fun onStop() {
        super.onStop()
        Log.v(tag,"[ON STOP]")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(tag,"[ON RESTART]")
    }

    override fun onResume() {
        super.onResume()
        Log.v(tag,"[ON RESUME]")
    }

    override fun onPause() {
        super.onPause()
    }




}