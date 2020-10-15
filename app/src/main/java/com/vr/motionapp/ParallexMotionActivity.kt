package com.vr.motionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import com.vr.motionapp.ui.ViewPagerAdapter
import com.vr.motionapp.ui.ViewpagerHeader
import kotlinx.android.synthetic.main.activity_parallex_motion.*

class ParallexMotionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = R.layout.activity_parallex_motion
        setContentView(layout)

        val viewPagerHeader = findViewById<ViewpagerHeader>(R.id.motionLayout)
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        viewPagerAdapter.addPage("Page A", R.layout.page_1)
        viewPagerAdapter.addPage("Page B", R.layout.page_2)
        viewPagerAdapter.addPage("Page C", R.layout.page_3)

        pager.adapter = viewPagerAdapter
        tabs.setupWithViewPager(pager)

        if (viewPagerHeader != null){
            pager.addOnPageChangeListener(viewPagerHeader)
        }

        viewPagerHeader.setDebugMode(MotionLayout.DEBUG_SHOW_PATH)
    }
}
