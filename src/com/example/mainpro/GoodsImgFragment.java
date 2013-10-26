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
		SmartImageView img_hot_goods_right = (SmartImageView)rootView.findViewById(R.id.img_hot_goods_right);
		SmartImageView img_hot_goods_center = (SmartImageView)rootView.findViewById(R.id.img_hot_goods_center);
		SmartImageView img_hot_goods_left = (SmartImageView)rootView.findViewById(R.id.img_hot_goods_left);
		System.out.println(img_list[i]);
		System.out.println(i);
		img_hot_goods_right.setImageUrl(img_list[i]);
		img_hot_goods_center.setImageUrl(img_list[i]);
		img_hot_goods_left.setImageUrl(img_list[i+1]);
		return rootView;
	}
}
