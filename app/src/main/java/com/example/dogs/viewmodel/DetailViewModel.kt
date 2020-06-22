package com.example.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dogs.model.DogBreed

class DetailViewModel: ViewModel() {

    public var detailDog = MutableLiveData<DogBreed>()

    fun fetch() {
       val giveData = DogBreed("Detalle","Detalle","Detalle","Detalle","Detalle","Detalle","")

        detailDog.value = giveData
    }

}