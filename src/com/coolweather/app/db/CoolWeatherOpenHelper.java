package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 创建省、城市、县数据库表
 * @author 谢涛
 * @date 2015-10-4  下午12:59:51
 * @version 1.0
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper{
	
	/**
	 * Province表建表语句
	 * id:自动增长
	 * province_name:省名
	 * province_code:省级代号
	 */
	public static final String CREATE_PROVINCE = "create table Province("
			+"id integer primary key autoincrement, "
			+"province_name text, "
			+"province_code text)";
	/**
	 * City表建表语句
	 * id:自动增长
	 * city_name:市名
	 * city_code:市级代号
	 * province_id:关联Province表的外键
	 */
	public static final String CREATE_CITY = "create table City("
			+"id integer primary key autoincrement, "
			+"city_name text, "
			+"city_code text, "
			+"province_id integer)";
	/**
	 * County表建表语句
	 * id:自动增长
	 * city_name:县名
	 * city_code:县级代号
	 * city_id:关联City表的外键
	 */
	public static final String CREATE_COUNTY = "create table County("
			+"id integer primary key autoincrement,"
			+"county_name text, "
			+"county_code text, "
			+"city_id integer)";
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 执行建表语句
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_PROVINCE);//创建province表
		db.execSQL(CREATE_CITY);//创建city表
		db.execSQL(CREATE_COUNTY);//创建county表
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
}
