package com.example.immotep.modules.dtails.ui

import androidx.activity.viewModels
import com.immotep.app.R
import com.immotep.app.appcomponents.base.BaseActivity
import com.immotep.app.databinding.ActivityDTailsBinding
import com.immotep.app.modules.details.data.viewmodel.DTailsVM
import kotlin.String
import kotlin.Unit

class DTailsActivity : BaseActivity<ActivityDTailsBinding>(R.layout.activity_d_tails) {
    private val viewModel: DTailsVM by viewModels<DTailsVM>()

    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        binding.dTailsVM = viewModel
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
        const val TAG: String = "D_TAILS_ACTIVITY"
    }
}
