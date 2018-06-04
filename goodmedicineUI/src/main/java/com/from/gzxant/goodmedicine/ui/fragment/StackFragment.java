/*
 * Copyright (C) 2012 The Android Open Source Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.from.gzxant.goodmedicine.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.from.gzxant.goodmedicine.constant.Constant;
import com.from.gzxant.goodmedicine.ui.view.ChildContent;


/**
 * 页面堆栈
 * @author Jesse
 *
 */
public class StackFragment extends Fragment {
	int mStackLevel = 1;
	String from = "";
	String tag = "";
	ChildContent child_fragment ;
	private Fragment fragment;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (getArguments() != null)
			from = getArguments().getString("from");
		from = from == null ? "" : from;
		fragment=new IndexFragment();

		FragmentTransaction ft = getChildFragmentManager().beginTransaction();
		child_fragment = new ChildContent(getActivity(),789457);
		ft.add(child_fragment.getLayoutId(), fragment, Constant.FragmentTags.INDEX).commitAllowingStateLoss();


	}

	public ChildContent getChildFragment(){
		return child_fragment;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return child_fragment;
	}

	public void goBack() {
		getChildFragmentManager().popBackStack();
		if (mStackLevel > 1)
			mStackLevel--;
	}
}
