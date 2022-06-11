package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class TablayoutPagerSimpleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablayout_pager_simple)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        viewPager.adapter = viewPagerAdapter(LayoutInflater.from(this),3)

        tabLayout.addTab(tabLayout.newTab().setText("1번째"))
        tabLayout.addTab(tabLayout.newTab().setText("2번째"))
        tabLayout.addTab(tabLayout.newTab().setText("3번째"))

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.setCurrentItem(tab!!.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

    }
}

class viewPagerAdapter(
    val layoutInflater: LayoutInflater,
    val tabCount : Int
):PagerAdapter(){
    override fun getCount(): Int {
        return tabCount
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        //우리가 만든 뷰인지 아닌지
        return view ===`object` as View
        // == -> 값을 비교
        // === -> 주소값을 비교한다.
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        //보여줄 아이템 리턴하기
        when(position) {
            0-> {
                val view = layoutInflater.inflate(R.layout.first_fragment, container, false)
                container.addView(view)
                return view
            }
            1-> {
                val view = layoutInflater.inflate(R.layout.activity_homework04_recyclerview, container, false)
                container.addView(view)
                return view
            }
            else-> {
                val view = layoutInflater.inflate(R.layout.first_fragment, container, false)
                container.addView(view)
                return view
            }
        }
    }
}