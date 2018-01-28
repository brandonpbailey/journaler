package com.journaler.fragment

import android.app.Fragment
import android.util.Log
import com.journaler.R

class ManualFragment: BaseFragment(){
    override val logTag = "Manual Fragment"
    override fun getLayout() = R.layout.fragment_manual
    override var fragmentNumber: String? = BaseFragment.count.toString()

    override fun onPause() {
        super.onPause()
        Log.d(logTag,"Fragment$fragmentNumber On Pause")

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(logTag,"[ON DESTROY Fragment$fragmentNumber]")
    }
    override fun onResume() {
        super.onResume()
        Log.d(logTag,"[ON RESUME Fragment$fragmentNumber]]")
    }

}