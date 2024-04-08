package com.example.immotep.modules.pagedaccueil.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.immotep.app.R
import com.immotep.app.appcomponents.base.BaseActivity
import com.immotep.app.databinding.ActivityPageDAccueilBinding
import com.immotep.app.modules.pagedaccueil.data.model.EstatescardRowModel
import com.immotep.app.modules.pagedaccueil.data.viewmodel.PageDAccueilVM
import kotlin.Int
import kotlin.Unit

class PageDAccueilActivity : BaseActivity<ActivityPageDAccueilBinding>(R.layout.activity_page_d_accueil) {
    private val viewModel: PageDAccueilVM by viewModels<PageDAccueilVM>()

    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        val estatescardAdapter = EstatescardAdapter(viewModel.estatescardList.value?: mutableListOf())
        binding.recyclerEstatescard.adapter = estatescardAdapter
        estatescardAdapter.setOnItemClickListener(object : EstatescardAdapter.OnItemClickListener {
            override fun onItemClicked(view: View, position: Int, item: EstatescardRowModel) {
                onClickRecyclerEstatescard(view, position, item)
            }
        })

        viewModel.estatescardList.observe(this) {
            estatescardAdapter.updateData(it)
        }
        binding.pageDAccueilVM = viewModel
    }

    override fun setUpClicks(): Unit {
        // Implementation of any click listeners goes here
    }

    fun onClickRecyclerEstatescard(view: View, position: Int, item: EstatescardRowModel): Unit {
        // Handle click events
    }

    companion object {
        const val TAG: String = "PAGE_D_ACCUEIL_ACTIVITY"

        fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, PageDAccueilActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }
    }
}
