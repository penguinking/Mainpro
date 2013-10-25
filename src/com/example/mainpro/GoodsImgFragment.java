package com.example.mainpro;



import com.loopj.android.image.SmartImageView;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GoodsImgFragment extends Fragment{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View rootView = inflater.inflate(R.layout.fragment_goods_img, container,
				false);
		int i = getArguments().getInt("no");// ªÒ»°ID÷µ
		String[] img_list = getArguments().getStringArray("info");
		SmartImageView img_goods = (SmartImageView)rootView.findViewById(R.id.img_hot_goods);
		System.out.println(img_list[i]);
		img_goods.setImageUrl(img_list[i]);
		return rootView;
	}
}
