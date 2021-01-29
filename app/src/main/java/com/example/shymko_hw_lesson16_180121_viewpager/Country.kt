package com.example.shymko_hw_lesson16_180121_viewpager

class Country (
val name: String,
var population:Long,
val area:Int,
  ) {
  companion object{
  val listOfCountries = mutableListOf<Country>()
  }
}

