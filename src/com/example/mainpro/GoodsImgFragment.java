package com.example.mainpro;

import com.loopj.android.image.SmartImageView;

import controller.AnimationController;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class GoodsImgFragment extends Fragment {

	private SmartImageView img_hot_goods_right;
	private SmartImageView img_hot_goods_center;
	private SmartImageView img_hot_goods_left;
	private String[] img_list;
	private int i;
	private String[] img_addr_list;
	private int j = 0;
	private View rootView;
	private AnimationController animationController;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		rootView = inflater.inflate(R.layout.fragment_goods_img, container,
				false);
		i = getArguments().getInt("no");// ªÒ»°ID÷µ
		img_list = getArguments().getStringArray("info");

		img_hot_goods_right = (SmartImageView) rootView
				.findViewById(R.id.img_hot_goods_right);
		img_hot_goods_center = (SmartImageView) rootView
				.findViewById(R.id.img_hot_goods_center);
		img_hot_goods_left = (SmartImageView) rootView
				.findViewById(R.id.img_hot_goods_left);
		String img_addr = img_list[i];
		img_addr_list = img_addr.split(";");
		handler.postDelayed(runnable, 2000);

		return rootView;
	}

	private Runnable runnable = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			/**
			 * AnimationSet animationSet1 = new AnimationSet(true); AnimationSet
			 * animationSet2 = new AnimationSet(true); TranslateAnimation ta =
			 * new TranslateAnimation( Animation.RELATIVE_TO_SELF, 0f,
			 * Animation.RELATIVE_TO_SELF, -1f, Animation.RELATIVE_TO_SELF, 0f,
			 * Animation.RELATIVE_TO_SELF, 0f); ta.setDuration(2000);
			 * animationSet1.addAnimation(ta); animationSet1.setFillAfter(true);
			 * ta = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 1.0f,
			 * Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 0f,
			 * Animation.RELATIVE_TO_SELF, 0f); ta.setDuration(2000);
			 * animationSet2.addAnimation(ta); animationSet2.setFillAfter(true);
			 * img_hot_goods_right.setAnimation();
			 * //img_hot_goods_center.setAnimation(animationSet2);
			 * //img_hot_goods_left.setAnimation(animationSet2);
			 **/
			final Animation animation = (Animation) AnimationUtils
					.loadAnimation(rootView.getContext(),
							android.R.anim.fade_in);
			final Animation animation2 = (Animation) AnimationUtils
					.loadAnimation(rootView.getContext(),
							android.R.anim.slide_in_left);

			System.out.println(img_list[i]);
			switch (j) {
			case (0):
				img_hot_goods_right.setAnimation(animation);
				img_hot_goods_center.setAnimation(animation);
				img_hot_goods_left.setAnimation(animation);
				img_hot_goods_right.setImageUrl(img_addr_list[0]);
				img_hot_goods_center.setImageUrl(img_addr_list[1]);
				img_hot_goods_left.setImageUrl(img_addr_list[2]);
				// animationController.scaleIn(v, durationMillis, delayMillis);
				j = j + 1;
				break;
			case (1):
				img_hot_goods_right.setAnimation(animation);
				img_hot_goods_center.setAnimation(animation);
				img_hot_goods_left.setAnimation(animation);
				img_hot_goods_right.setImageUrl(img_addr_list[1]);
				img_hot_goods_center.setImageUrl(img_addr_list[2]);
				img_hot_goods_left.setImageUrl(img_addr_list[0]);
				// animationController.scaleIn(v, durationMillis, delayMillis);
				j = j + 1;
				break;
			case (2):
				img_hot_goods_right.setAnimation(animation);
				img_hot_goods_center.setAnimation(animation);
				img_hot_goods_left.setAnimation(animation);
				img_hot_goods_right.setImageUrl(img_addr_list[2]);
				img_hot_goods_center.setImageUrl(img_addr_list[0]);
				img_hot_goods_left.setImageUrl(img_addr_list[1]);
				// animationController.scaleIn(v, durationMillis, delayMillis);
				j = 0;
				break;
			default:
				return;
			}

			if (true) {
				handler.postDelayed(runnable, 6000);
			}
		}

	};

	public Handler handler = new Handler();
}
