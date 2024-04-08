package com.example.immotep.modules.dtails.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.immotep.app.modules.details.data.model.DTailsModel
import org.koin.core.KoinComponent

class DTailsVM : ViewModel(), KoinComponent {
    val dTailsModel: MutableLiveData<DTailsModel> = MutableLiveData(DTailsModel())

    var navArguments: Bundle? = null
}
