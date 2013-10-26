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
		String img_addr = "http://h.hiphotos.baidu.com/pic/w%3D230/sign=6d39bd8b908fa0ec7fc7630e1696594a/c8ea15ce36d3d539b9e9707b3b87e950342ab0b5.jpg;"+
				"http://g.hiphotos.baidu.com/pic/w%3D230/sign=128d995ad788d43ff0a996f14d1fd2aa/f636afc379310a555d97e0dbb64543a982261069.jpg;"+
				"http://g.hiphotos.baidu.com/pic/w%3D230/sign=d45ce6e20df431adbcd2443a7b37ac0f/bd315c6034a85edfeb5afd5348540923dc5475ef.jpg,"+
				"http://c.hiphotos.baidu.com/pic/w%3D230/sign=a34c4615b219ebc4c078719ab227cf79/0bd162d9f2d3572ccba2e5ac8b13632762d0c37a.jpg;"+
				"http://g.hiphotos.baidu.com/pic/w%3D230/sign=ad1de12edcc451daf6f60be886fc52a5/cefc1e178a82b901fc58ba43728da9773812efcd.jpg;"+
				"http://g.hiphotos.baidu.com/pic/w%3D230/sign=6d19654f0eb30f24359aeb00f894d192/4bed2e738bd4b31c91915a9586d6277f9e2ff86b.jpg,"+
				"http://h.hiphotos.baidu.com/pic/w%3D230/sign=a81648b68326cffc692ab8b189014a7d/10dfa9ec8a1363277d83fc1c908fa0ec08fac7b6.jpg;"+
				"http://d.hiphotos.baidu.com/pic/w%3D230/sign=2129d9bd0df431adbcd2443a7b37ac0f/bd315c6034a85edf1e2fc20c48540923dd547579.jpg;"+
				"http://h.hiphotos.baidu.com/pic/w%3D230/sign=633f80c8eaf81a4c2632ebcae72b6029/77094b36acaf2eddccc07b558c1001e93901935c.jpg;";
		String[] img_list = img_addr.split(",");
		mAdapter = new ViewpagerAdapter(getSupportFragmentManager(),img_list);
        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);
        mIndicator = (UnderlinePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        mIndicator.setFades(true);
        mIndicator.setCurrentItem(0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
