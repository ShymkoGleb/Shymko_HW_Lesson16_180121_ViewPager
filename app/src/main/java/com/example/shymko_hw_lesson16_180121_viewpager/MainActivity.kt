package com.example.shymko_hw_lesson16_180121_viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Country.listOfCountries.add(Country("Ukraine", 40000000, 55555, 555, "adasdds"))
        onStart()
        Country.listOfCountries.add(Country("Egypt", 80000000, 22222, 3333, "sadadsad"))
        onStart()
        Country.listOfCountries.add(Country("Kair", 30000000, 22222, 3333, "sadadsad"))
        onStart()
        Country.listOfCountries.add(Country("Laos", 40000000, 22222, 3333, "sadadsad"))
        onStart()


        val adapter = ViewPagerAdapter(Country.listOfCountries)
        vpViewPager.adapter = adapter
        //  adapter.notifyItemInserted(Country.listOfCountries.size - 1)

        TabLayoutMediator(tabTabLayout, vpViewPager) { tab, position ->
            tab.text = " Tab Pos = ${position + 1}"
        }.attach()
    }
}