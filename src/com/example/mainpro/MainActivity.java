package com.example.mainpro;


import adapter.ViewpagerAdapter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	ViewpagerAdapter mAdapter ;
	ViewPager mPager;
	UnderlinePageIndicator mIndicator;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String[] img_list = {"http://pic7.nipic.com/20100604/4214844_232831115578_2.jpg","http://pic.pingpingw.com/ppfz/01/2010091903542125493.jpeg","http://pica.nipic.com/2008-03-19/200831911642647_2.jpg"};
		mAdapter = new ViewpagerAdapter(getSupportFragmentManager(),img_list);
        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);
        mIndicator = (UnderlinePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        mIndicator.setFades(false);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
