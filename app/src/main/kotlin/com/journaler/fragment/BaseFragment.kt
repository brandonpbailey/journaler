package com.journaler.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment: Fragment(){
    protected abstract val logTag: String
    protected abstract fun getLayout(): Int
    protected abstract var fragmentNumber: String?
    init{
        count++
    }


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.d(logTag,"[ON CREATE VIEW Fragment$count]")
        return inflater?.inflate(getLayout(), container, false)
    }
    companion object {
        var count: Int = 0
        private set

    }





}