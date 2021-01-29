package com.example.shymko_hw_lesson16_180121_viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_pager.view.*

class ViewPagerAdapter(
        val countryList: List<Country>) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_pager, parent, false)
        return ViewPagerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return this.countryList.size

    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.itemView.apply {
            tvCountryName.text = "Contry name is: ${countryList[position].name}"
            tvCountryPopulation.text ="Country population is: " + countryList[position].population.toString() + " persons"
            tvCountryArea.text = "Country area is: " + countryList[position].area.toString() +" sq.km"
            tvCountryPopulationDencity.text = "Country population dencity is: " + (countryList[position].population/countryList[position].area).toString() + " persons/sq.km"
        }
    }
}

