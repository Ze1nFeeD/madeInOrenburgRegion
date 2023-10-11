package com.example.madeinorenburgregion
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.google.android.material.tabs.TabLayout

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment{
        return when(position) {
            0 -> KazakHistoryFrag()
            1 -> KazakClothFrag()
            else -> KazakKitchenFrag()
        }
    }
    override fun getCount(): Int{
        return 3
    }
    override fun getPageTitle(position: Int): CharSequence{
        return when (position){
            0 -> "История"
            1 -> "Одежда"
            else ->"Кухня"
        }
    }
}



