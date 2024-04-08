package com.example.immotep.modules.pagedaccueil.data.model

import com.immotep.app.R
import com.immotep.app.appcomponents.di.MyApp
import kotlin.String


data class PageDAccueilModel(
    /**
     * TODO Replace with dynamic value
     */
    var txtPagetitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_les_biens),
    /**
     * TODO Replace with dynamic value
     */
    var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_5),
    /**
     * TODO Replace with dynamic value
     */
    var txtMaisonsactulle: String? = MyApp.getInstance().resources.getString(R.string.msg_maisons_actuellement),
    /**
     * TODO Replace with dynamic value
     */
    var txtOnehundredninete: String? = MyApp.getInstance().resources.getString(R.string.lbl_502),
    /**
     * TODO Replace with dynamic value
     */
    var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl),
    /**
     * TODO Replace with dynamic value
     */
    var txtMaisonBoone: String? = MyApp.getInstance().resources.getString(R.string.lbl_maison_boone),
    /**
     * TODO Replace with dynamic value
     */
    var txtLille: String? = MyApp.getInstance().resources.getString(R.string.lbl_lille2),
    /**
     * TODO Replace with dynamic value
     */
    var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_0),
    /**
     * TODO Replace with dynamic value
     */
    var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl),
    /**
     * TODO Replace with dynamic value
     */
    var txtAppartement: String? = MyApp.getInstance().resources.getString(R.string.msg_appartement_iq2i),
    /**
     * TODO Replace with dynamic value
     */
    var txtLens: String? = MyApp.getInstance().resources.getString(R.string.lbl_lens)
)