package com.example.shymko_hw_lesson16_180121_viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

/*

Створити додаток з використанням ViewPager,
як контент використати список країн,
у заголовку повинна бути назва країни,
у fragment детальна інформація.
Обов’язкові поля в детальній інформації:
назва, населення, площа, густота населення (рахується як площа поділена на населення).

*/
class MainActivity : AppCompatActivity() {
    companion object {
        var isCountryAdded: Boolean = false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addCountries(isCountryAdded)

        val adapter = ViewPagerAdapter(Country.listOfCountries)
        vpViewPager.adapter = adapter
        TabLayoutMediator(tabTabLayout, vpViewPager) { tab, position ->
            tab.text = "Country ${position + 1}"
        }.attach()
    }

    private fun addCountries(flag: Boolean) {
        if (!flag) {
            Country.listOfCountries.add(Country("Egypt", 100_075_480, 1_010_408))
            Country.listOfCountries.add(Country("Laos", 7_123_205, 237_955))
            Country.listOfCountries.add(Country("Turkey", 83_154_997, 783_356))
            isCountryAdded = true
        }
    }
}