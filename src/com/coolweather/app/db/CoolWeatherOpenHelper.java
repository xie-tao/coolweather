package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * ����ʡ�����С������ݿ��
 * @author л��
 * @date 2015-10-4  ����12:59:51
 * @version 1.0
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper{
	
	/**
	 * Province���������
	 * id:�Զ�����
	 * province_name:ʡ��
	 * province_code:ʡ������
	 */
	public static final String CREATE_PROVINCE = "create table Province("
			+"id integer primary key autoincrement, "
			+"province_name text, "
			+"province_code text)";
	/**
	 * City���������
	 * id:�Զ�����
	 * city_name:����
	 * city_code:�м�����
	 * province_id:����Province�������
	 */
	public static final String CREATE_CITY = "create table City("
			+"id integer primary key autoincrement, "
			+"city_name text, "
			+"city_code text, "
			+"province_id integer)";
	/**
	 * County���������
	 * id:�Զ�����
	 * city_name:����
	 * city_code:�ؼ�����
	 * city_id:����City�������
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
	 * ִ�н������
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_PROVINCE);//����province��
		db.execSQL(CREATE_CITY);//����city��
		db.execSQL(CREATE_COUNTY);//����county��
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
}