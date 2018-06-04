package com.from.gzxant.goodmedicine.constant;

import android.graphics.Color;

public class Constant {
	
	public static final String PLAT_FORM = "android";

	

	/**
	 * 合作商
	 */


	/**
	 * Activity返回
	 */
	public static class ActivityResult{
		public static final int PROTOCOL_FALSE= 1000;
		public static final int PROTOCOL_TRUE = 1001;
		
		public static final int COMMON_FACEBOOK_LOGIN = 1002;
		public static final int BIND_FACEBOOK_LOGIN = 1003;
		
		public static final int COMMON_TWITTER_LOGIN = 1004;
		
		public static final int COMMON_GOOGLE_LOGIN=1005;
		public static final int BIND_GOOGLE_LOGIN=1006;
	}
	/**
	 * selecter图片名称
	 * @author Jesse
	 *
	 */
	public static class ViewSelecter{
		public static final String EFUN_BAKC_SELECTER = "efun_ui_mobile_back_btn_selecter";
		public static final String EFUN_SET_SELECTER ="efun_set_selecter";
		public static final String EFUN_COMMON_BTN_SELECTER ="efun_ui_mobile_btn_selecter";
		public static final String EFUN_THIRD_BTN_SELECTER ="efun_third_btn_selecter";
	}
	
	/**
	 * 控件大小比例值
	 */
	/**
	 * 比例
	 * @author Jesse
	 *
	 */
	/**
	 * 纯色
	 * @author Jesse
	 *
	 */

	/**
	 * Fragment TAG
	 */
	public static class FragmentTags{
		public static final String STACK = "STACK";
		public static final String INDEX = "INDEX";
		public static final String USERAGREEMENT="USERAGREEMENT";
		public static final String LOGIN = "LOGIN";
		public static final String REGISTER = "REGISTER";
		public static final String MANAGER = "MANAGER";
		public static final String RESET_PASSWORD = "RESET_PASSWORD";
		public static final String FORGET_PASSWORD = "FORGET_PASSWORD";
		public static final String BIND = "BIND";
		public static final String BIND_TWITTER="BIND_TWITTER";
		public static final String BIND_FB = "BIND_FB";
		public static final String CLAUSE = "CLAUSE";
		public static final String BIGPLAYER = "BIGPLAYER";
		public static final String Announcement = "ANNOUNCEMENT";
		public static final String BIND_YAHOO = "BIND_YAHOO";
		public static final String BIND_GOOGLE = "BIND_GOOGLE";
		public static final String BIND_VK = "BIND_VK";
	}
	
	/**
	 * 文件存储类（存储登陆信息）
	 */
	public static class DatabaseValue{
		public static final String EFUN_FILE="Efun.db";
		public static final String LOGIN_USERNAME = "LOGIN_USERNAME";
		public static final String LOGIN_PASSWORD = "LOGIN_PASSWORD";
		public static final String ADS_ADVERTISERS_NAME = "ADS_ADVERTISERS_NAME";
		public static final String ADS_PARTNER_NAME = "ADS_PARTNER_NAME";
		public static final String IS_FACEBOOK_LOGIN = "IS_FACEBOOK_LOGIN";
//		public static final String ALLOW_FACEBOOK_SHARE="ALLOW_FACEBOOK_SHARE";
		public static final String THIRD_PLATFORM_EVATAR_NAME="THIRD_PLATFORM_EVATAR_NAME";
		public static final String THIRD_PLATFORM_EVATAR_PASSWORD="THIRD_PLATFORM_EVATAR_PASSWORD";
		public static final String YAHOO_ID = "YAHOO_ID";
		public static final String EFUN_APP_BUSINESS_IDS = "EFUN_APP_BUSINESS_IDS";
		public static final String BIND_ACCOUNT_USERNAME = "BIND_ACCOUNT_USERNAME";
		/** 区域 */
		public static final String EFUN_CHOSE_AREA = "EFUN_CHOSE_AREA";
//		public static final String IS_ANNOUNCEMENT_SHOWED = "IS_ANNOUNCEMENT_SHOWED";//公告是否已经显示过
		public static final String EFUN_LOGIN_FACEBOOK_ID = "efunfbid";//fb登录的fbid
		public static final String EFUN_LOGIN_GOOGLE_ID = "efungoogleid";//fb登录的fbid
		public static final String EFUN_LOGIN_TWITTER_ID = "efuntwitterid";//fb登录的fbid
		public static final String EFUN_LOGIN_VK_ID = "efunvkid";//fb登录的fbid
		public static final String EFUN_LOGIN_FACEBOOK_ACCESSTOKEN = "efunfbaccesstoken";//fb登录的accesstoken
	}
	
	
	/**
	 * MetaDate name
	 */
	public static class MetaData{
		/**
		 * APP_KEY
		 */
		public static final String GAME_KEY_META = "appkey";
		/**
		 * gameCode
		 */
		public static final String GAME_CODE_META = "gamecode";
		
		public static final String SDK_LISTENER = "sdklistener";
	}
}
