package com.journaler.fragment

import android.util.Log
import com.journaler.R

class ItemsFragment: BaseFragment(){
    override val logTag = "Items Fragment"
    override var fragmentNumber: String? = BaseFragment.count.toString()

    override fun getLayout(): Int {
        return R.layout.fragment_items
    }

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