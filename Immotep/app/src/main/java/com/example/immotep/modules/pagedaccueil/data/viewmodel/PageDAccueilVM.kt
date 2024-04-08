package com.example.immotep.modules.pagedaccueil.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.immotep.app.modules.pagedaccueil.data.model.EstatescardRowModel
import com.immotep.app.modules.pagedaccueil.data.model.PageDAccueilModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PageDAccueilVM : ViewModel(), KoinComponent {
    val pageDAccueilModel: MutableLiveData<PageDAccueilModel> = MutableLiveData(PageDAccueilModel())
    var navArguments: Bundle? = null
    val estatescardList: MutableLiveData<MutableList<EstatescardRowModel>> = MutableLiveData(mutableListOf())
}
