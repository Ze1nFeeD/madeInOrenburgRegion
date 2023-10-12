package com.example.madeinorenburgregion
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.google.android.material.tabs.TabLayout

class MyPagerAdapterTatar(fm: FragmentManager): FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment{
        return when(position) {
            0 -> TatarHistoryFrag()
            1 -> TatarClothFrag()
            2 -> TatarKitchenFrag()
            else -> TatarHolidayFrag()
        }
    }
    override fun getCount(): Int{
        return 4
    }
    override fun getPageTitle(position: Int): CharSequence{
        return when (position){
            0 -> "История"
            1 -> "Одежда"
            2 -> "Кухня"
            else ->"Праздники"
        }
    }
}



