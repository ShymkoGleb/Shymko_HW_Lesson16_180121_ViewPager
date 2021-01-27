package com.example.shymko_hw_lesson16_180121_viewpager

class Country (
val name: String,
var population:Long,
var populationDensity:Int,
val area:Int,
var textInformation:String
  ) {
  companion object{
  val listOfCountries = mutableListOf<Country>()
  }
}

