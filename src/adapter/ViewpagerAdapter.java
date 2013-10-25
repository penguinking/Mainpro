package adapter;



import com.example.mainpro.GoodsImgFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class ViewpagerAdapter extends FragmentStatePagerAdapter{
	private String[] img_list;
	public ViewpagerAdapter(FragmentManager fm,String[] img_list) {
		super(fm);
		this.img_list=img_list;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		Fragment fragment = new GoodsImgFragment();

		Bundle args = new Bundle();

		args.putInt("no", position);
		args.putStringArray("info", img_list);
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return img_list.length;
	}

	
	

}
