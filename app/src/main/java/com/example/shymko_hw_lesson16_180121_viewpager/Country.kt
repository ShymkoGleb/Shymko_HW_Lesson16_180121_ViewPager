package com.example.shymko_hw_lesson16_180121_viewpager

class Country (
val name: String,
var population:Long,
var populationDensity:Int,
val area:Int,
var textInformation:String
  ) {companion object{
  val listOfCountries = mutableListOf<Country>()
  }

}


/*
*
* <TextView
        android:id="@+id/tvCountryArea"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="tvCountryPopulation"
        app:layout_constraintStart_toStartOf="parent"
        android:layout_marginStart="20dp"
        app:layout_constraintTop_toBottomOf="tvCountryPopulation"
        android:layout_marginTop="20dp"/>
    <TextView
        android:id="@+id/tvCountryDencity"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="tvCountryName"
        app:layout_constraintStart_toStartOf="parent"
        android:layout_marginStart="20dp"
        app:layout_constraintTop_toBottomOf="tvCountryArea"
        android:layout_marginTop="20dp"/>

    <TextView
        android:id="@+id/tvCountryTextDetail"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="tvCountryName"
        app:layout_constraintStart_toStartOf="parent"
        android:layout_marginStart="20dp"
        app:layout_constraintTop_toBottomOf="tvCountryDencity"
        android:layout_marginTop="20dp"/>
*
*
* */