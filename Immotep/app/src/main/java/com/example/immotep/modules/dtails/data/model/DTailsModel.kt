package com.example.immotep.modules.dtails.data.model

import com.immotep.app.R
import com.immotep.app.appcomponents.di.MyApp
import kotlin.String

data class DtailsModel(
    /**
     * TODO Replace with dynamic value
     */
    var txtApartment: String? = MyApp.getInstance().resources.getString(R.string.lbl_apartment),

    /**
     * TODO Replace with dynamic value
     */
    var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3),

    /**
     * TODO Replace with dynamic value
     */
    var txtThreeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_3),

    /**
     * TODO Replace with dynamic value
     */
    var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_iq2i),

    /**
     * TODO Replace with dynamic value
     */
    var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_20),

    /**
     * TODO Replace with dynamic value
     */
    var txtDetail: String? = MyApp.getInstance().resources.getString(R.string.lbl),

    /**
     * TODO Replace with dynamic value
     */
    var txtLensfrance: String? = MyApp.getInstance().resources.getString(R.string.lbl_lens_france),

    /**
     * TODO Replace with dynamic value
     */
    var txtDescription: String? =
        MyApp.getInstance().resources.getString(R.string.msg_n_dat_des_lieux),

    /**
     * TODO Replace with dynamic value
     */
    var txtDescription1: String? =
        MyApp.getInstance().resources.getString(R.string.msg_n_du_bien_01726809_type)
)
