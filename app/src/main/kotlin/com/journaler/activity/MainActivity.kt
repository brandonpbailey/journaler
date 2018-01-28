package com.journaler.activity
import android.support.v4.app.FragmentManager
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import android.util.Log
import com.journaler.R
import com.journaler.fragment.BaseFragment
import com.journaler.fragment.ItemsFragment
import com.journaler.fragment.ManualFragment
import kotlinx.android.synthetic.main.activity_header.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity: BaseActivity(){
    override val tag = "Main Activity"
    override fun getLayout() = R.layout.activity_main
    override fun getActivityTitle() = R.string.app_name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pager.adapter = ViewPagerAdapter(supportFragmentManager)
        //val fragment = ItemsFragment()
/*        supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        filter_menu.text = "H"
        filter_menu.setOnClickListener {
            val userManualFrg = ManualFragment()
            Log.d("Fragment Count",BaseFragment.count.toString())
            Log.d(tag,"Button clicked")
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, userManualFrg)
                    .addToBackStack("User Manual")
                    .commit()
        }*/
    }
    private class ViewPagerAdapter(manager: FragmentManager):
            FragmentStatePagerAdapter(manager){
        override fun getCount(): Int {
            return 5
        }

        override fun getItem(position: Int): Fragment {
            return ItemsFragment()
        }
    }

}