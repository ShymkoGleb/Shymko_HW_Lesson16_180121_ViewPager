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
            Country.listOfCountries.add(Country("Ukraine", 40000000, 55555, 555, "adasdds"))
            Country.listOfCountries.add(Country("Egypt", 80000000, 22222, 3333, "sadadsad"))
            Country.listOfCountries.add(Country("Kair", 30000000, 22222, 3333, "sadadsad"))
            Country.listOfCountries.add(Country("Laos", 40000000, 22222, 3333, "sadadsad"))
            isCountryAdded = true
        }
    }
}