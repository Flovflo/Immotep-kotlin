package com.example.immotep.modules.pagedaccueil.data.model

import com.immotep.app.R
import com.immotep.app.appcomponents.di.MyApp
import kotlin.String

data class EstatescardRowModel(
    /**
     * TODO Replace with dynamic value
     */
    var txtTextValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_50),
    /**
     * TODO Replace with dynamic value
     */
    var txtTextUnit: String? = MyApp.getInstance().resources.getString(R.string.lbl),
    /**
     * TODO Replace with dynamic value
     */
    var txtMaisonHecquetTe: String? = MyApp.getInstance().resources.getString(R.string.lbl_maison_hecquet),
    /**
     * TODO Replace with dynamic value
     */
    var txtLensText: String? = MyApp.getInstance().resources.getString(R.string.lbl_lens)
)