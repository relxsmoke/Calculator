package com.calculator.au;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.media.*;

public class MainActivity extends Activity implements View.OnClickListener{
	
	@Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Toast.makeText(MainActivity.this,"作者：Zero"+"\n"+"qq：2767832980",Toast.LENGTH_LONG).show();
		
		//绑定id
		Button b0 = (Button) findViewById(R.id.mainButton0);
		Button b1 = (Button) findViewById(R.id.mainButton1);
		Button b2 = (Button) findViewById(R.id.mainButton2);
		Button b3 = (Button) findViewById(R.id.mainButton3);
		Button b4 = (Button) findViewById(R.id.mainButton4);
		Button b5 = (Button) findViewById(R.id.mainButton5);
		Button b6 = (Button) findViewById(R.id.mainButton6);
		Button b7 = (Button) findViewById(R.id.mainButton7);
		Button b8 = (Button) findViewById(R.id.mainButton8);
		Button b9 = (Button) findViewById(R.id.mainButton9);
		Button b10 = (Button) findViewById(R.id.mainButton10);
		Button b11 = (Button) findViewById(R.id.mainButton11);
		Button b12 = (Button) findViewById(R.id.mainButton12);
		Button b13 = (Button) findViewById(R.id.mainButton13);
		Button b14 = (Button) findViewById(R.id.mainButton14);
		Button b15 = (Button) findViewById(R.id.mainButton15);
		Button b16 = (Button) findViewById(R.id.mainButton16);
		
		//获取按钮实例
		b0.setOnClickListener(this);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
		b9.setOnClickListener(this);
		b10.setOnClickListener(this);
		b11.setOnClickListener(this);
		b12.setOnClickListener(this);
		b13.setOnClickListener(this);
		b14.setOnClickListener(this);
		b15.setOnClickListener(this);
		b16.setOnClickListener(this);
		
	}
	
	@Override
	public void onClick ( View p1 ){
		switch(p1.getId()){
			case R.id.mainButton0:
				MediaPlayer m_ling = MediaPlayer.create(this,R.raw.ling);
				m_ling.start();
				break;
			case R.id.mainButton1:
				MediaPlayer m_yi = MediaPlayer.create(this,R.raw.yi);
				m_yi.start();
				break;
			case R.id.mainButton2:
				MediaPlayer m_er = MediaPlayer.create(this,R.raw.er);
				m_er.start();
				break;
			case R.id.mainButton3:
				MediaPlayer m_san = MediaPlayer.create(this,R.raw.san);
				m_san.start();
				break;
			case R.id.mainButton4:
				MediaPlayer m_si = MediaPlayer.create(this,R.raw.si);
				m_si.start();
				break;
			case R.id.mainButton5:
				MediaPlayer m_wu = MediaPlayer.create(this,R.raw.wu);
				m_wu.start();
				break;
			case R.id.mainButton6:
				MediaPlayer m_liu = MediaPlayer.create(this,R.raw.liu);
				m_liu.start();
				break;
			case R.id.mainButton7:
				MediaPlayer m_qi = MediaPlayer.create(this,R.raw.qi);
				m_qi.start();
				break;
			case R.id.mainButton8:
				MediaPlayer m_ba = MediaPlayer.create(this,R.raw.ba);
				m_ba.start();
				break;
			case R.id.mainButton9:
				MediaPlayer m_jiu = MediaPlayer.create(this,R.raw.jiu);
				m_jiu.start();
				break;
			case R.id.mainButton10:
				MediaPlayer m_guiling = MediaPlayer.create(this,R.raw.guiling);
				m_guiling.start();
				break;
			case R.id.mainButton11:
				MediaPlayer m_chuyu = MediaPlayer.create(this,R.raw.chuyu);
				m_chuyu.start();
				break;
			case R.id.mainButton12:
				MediaPlayer m_chen = MediaPlayer.create(this,R.raw.chen);
				m_chen.start();
				break;
			case R.id.mainButton13:
				MediaPlayer m_jian = MediaPlayer.create(this,R.raw.jian);
				m_jian.start();
				break;
			case R.id.mainButton14:
				MediaPlayer m_jia = MediaPlayer.create(this,R.raw.jia);
				m_jia.start();
				break;
			case R.id.mainButton15:
				MediaPlayer m_dengyu = MediaPlayer.create(this,R.raw.dengyu);
				m_dengyu.start();
				break;
			case R.id.mainButton16:
				MediaPlayer m_dian = MediaPlayer.create(this,R.raw.dian);
				m_dian.start();
				break;
			default:
				break;
		}
	}
	
}
