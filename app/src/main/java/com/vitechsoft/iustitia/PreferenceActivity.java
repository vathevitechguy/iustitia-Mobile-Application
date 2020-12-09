package com.vitechsoft.iustitia;

import androidx.appcompat.app.AppCompatActivity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.CheckBox;

public class PreferenceActivity extends AppCompatActivity {
	
	
	private LinearLayout linear82;
	private LinearLayout linear80;
	private LinearLayout linear83;
	private LinearLayout linear81;
	private TextView textview38;
	private TextView textview39;
	private LinearLayout linear84;
	private LinearLayout linear85;
	private LinearLayout linear87;
	private TextView textview40;
	private CheckBox checkbox1;
	private TextView textview41;
	private CheckBox checkbox2;
	private TextView textview43;
	private CheckBox checkbox4;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.preference);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear82 = (LinearLayout) findViewById(R.id.linear82);
		linear80 = (LinearLayout) findViewById(R.id.linear80);
		linear83 = (LinearLayout) findViewById(R.id.linear83);
		linear81 = (LinearLayout) findViewById(R.id.linear81);
		textview38 = (TextView) findViewById(R.id.textview38);
		textview39 = (TextView) findViewById(R.id.textview39);
		linear84 = (LinearLayout) findViewById(R.id.linear84);
		linear85 = (LinearLayout) findViewById(R.id.linear85);
		linear87 = (LinearLayout) findViewById(R.id.linear87);
		textview40 = (TextView) findViewById(R.id.textview40);
		checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
		textview41 = (TextView) findViewById(R.id.textview41);
		checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
		textview43 = (TextView) findViewById(R.id.textview43);
		checkbox4 = (CheckBox) findViewById(R.id.checkbox4);
	}
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
