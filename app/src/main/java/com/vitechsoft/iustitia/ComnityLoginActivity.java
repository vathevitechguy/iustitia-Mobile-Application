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
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class ComnityLoginActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private ScrollView vscroll_comnity_logn;
	private ScrollView vscroll_cmty_signup;
	private ScrollView vscroll_cmty_forget;
	private LinearLayout linear_login;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private TextView textview4;
	private Button button_login;
	private Button button_newacc;
	private TextView textview1;
	private ProgressBar progressbar1;
	private TextView textview2;
	private EditText edittext1;
	private TextView textview3;
	private EditText edittext2;
	private LinearLayout linear_signup;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private ProgressBar progressbar2;
	private Button button3;
	private LinearLayout linear_bck_login;
	private TextView textview5;
	private TextView textview6;
	private EditText edittext3;
	private TextView textview7;
	private EditText edittext4;
	private TextView textview8;
	private EditText edittext5;
	private TextView textview9;
	private EditText edittext6;
	private ImageView imageview2;
	private TextView textview10;
	private LinearLayout linear_forgotpasspg;
	private TextView textview_resetpass;
	private LinearLayout linear13;
	private ProgressBar progressbar3;
	private Button button4;
	private LinearLayout linear14;
	private TextView textview12;
	private EditText edittext7;
	private ImageView imageview3;
	private TextView textview13;
	
	private FirebaseAuth comnity_auth;
	private OnCompleteListener<AuthResult> _comnity_auth_create_user_listener;
	private OnCompleteListener<AuthResult> _comnity_auth_sign_in_listener;
	private OnCompleteListener<Void> _comnity_auth_reset_password_listener;
	private Intent To_comnity = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.comnity_login);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll_comnity_logn = (ScrollView) findViewById(R.id.vscroll_comnity_logn);
		vscroll_cmty_signup = (ScrollView) findViewById(R.id.vscroll_cmty_signup);
		vscroll_cmty_forget = (ScrollView) findViewById(R.id.vscroll_cmty_forget);
		linear_login = (LinearLayout) findViewById(R.id.linear_login);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview4 = (TextView) findViewById(R.id.textview4);
		button_login = (Button) findViewById(R.id.button_login);
		button_newacc = (Button) findViewById(R.id.button_newacc);
		textview1 = (TextView) findViewById(R.id.textview1);
		progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
		textview2 = (TextView) findViewById(R.id.textview2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		textview3 = (TextView) findViewById(R.id.textview3);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		linear_signup = (LinearLayout) findViewById(R.id.linear_signup);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		progressbar2 = (ProgressBar) findViewById(R.id.progressbar2);
		button3 = (Button) findViewById(R.id.button3);
		linear_bck_login = (LinearLayout) findViewById(R.id.linear_bck_login);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		textview7 = (TextView) findViewById(R.id.textview7);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		textview8 = (TextView) findViewById(R.id.textview8);
		edittext5 = (EditText) findViewById(R.id.edittext5);
		textview9 = (TextView) findViewById(R.id.textview9);
		edittext6 = (EditText) findViewById(R.id.edittext6);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear_forgotpasspg = (LinearLayout) findViewById(R.id.linear_forgotpasspg);
		textview_resetpass = (TextView) findViewById(R.id.textview_resetpass);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		progressbar3 = (ProgressBar) findViewById(R.id.progressbar3);
		button4 = (Button) findViewById(R.id.button4);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		textview12 = (TextView) findViewById(R.id.textview12);
		edittext7 = (EditText) findViewById(R.id.edittext7);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview13 = (TextView) findViewById(R.id.textview13);
		comnity_auth = FirebaseAuth.getInstance();
		
		button_login.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) {
					if (edittext1.getText().toString().equals("")) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter your Email address");
					}
					if (edittext2.getText().toString().equals("")) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter your password...");
					}
				}
				else {
					comnity_auth.signInWithEmailAndPassword(edittext1.getText().toString(), edittext2.getText().toString()).addOnCompleteListener(ComnityLoginActivity.this, _comnity_auth_sign_in_listener);
					progressbar1.setVisibility(View.VISIBLE);
				}
			}
		});
		
		button_newacc.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear_login.setVisibility(View.GONE);
				linear_signup.setVisibility(View.VISIBLE);
				linear_forgotpasspg.setVisibility(View.GONE);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext3.getText().toString().equals("") || (edittext4.getText().toString().equals("") || (edittext5.getText().toString().equals("") || edittext6.getText().toString().equals("")))) {
					if (edittext3.getText().toString().equals("")) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter your username");
					}
					if (edittext4.getText().toString().equals("")) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter your Email address");
					}
					if (edittext5.getText().toString().equals("")) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter your Password");
					}
					if (edittext6.getText().toString().equals("")) {
						SketchwareUtil.showMessage(getApplicationContext(), "Enter your password confirm");
					}
				}
				else {
					if (edittext5.getText().toString().equals(edittext6.getText().toString())) {
						comnity_auth.createUserWithEmailAndPassword(edittext4.getText().toString(), edittext6.getText().toString()).addOnCompleteListener(ComnityLoginActivity.this, _comnity_auth_create_user_listener);
						progressbar2.setVisibility(View.VISIBLE);
					}
				}
			}
		});
		
		linear_bck_login.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear_login.setVisibility(View.VISIBLE);
				linear_signup.setVisibility(View.GONE);
				linear_forgotpasspg.setVisibility(View.GONE);
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear_login.setVisibility(View.VISIBLE);
				linear_signup.setVisibility(View.GONE);
				linear_forgotpasspg.setVisibility(View.GONE);
			}
		});
		
		textview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear_login.setVisibility(View.VISIBLE);
				linear_signup.setVisibility(View.GONE);
				linear_forgotpasspg.setVisibility(View.GONE);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext7.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "Enter your Email address");
				}
				else {
					comnity_auth.sendPasswordResetEmail(edittext7.getText().toString()).addOnCompleteListener(_comnity_auth_reset_password_listener);
					progressbar3.setVisibility(View.VISIBLE);
				}
			}
		});
		
		linear14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear_login.setVisibility(View.VISIBLE);
				linear_signup.setVisibility(View.GONE);
				linear_forgotpasspg.setVisibility(View.GONE);
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear_login.setVisibility(View.VISIBLE);
				linear_signup.setVisibility(View.GONE);
				linear_forgotpasspg.setVisibility(View.GONE);
			}
		});
		
		textview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear_login.setVisibility(View.VISIBLE);
				linear_signup.setVisibility(View.GONE);
				linear_forgotpasspg.setVisibility(View.GONE);
			}
		});
		
		_comnity_auth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					progressbar3.setVisibility(View.GONE);
					edittext1.setText(edittext5.getText().toString());
					edittext2.setText(edittext7.getText().toString());
					comnity_auth.signInWithEmailAndPassword(edittext5.getText().toString(), edittext7.getText().toString()).addOnCompleteListener(ComnityLoginActivity.this, _comnity_auth_sign_in_listener);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Unable to Register. Try again");
				}
			}
		};
		
		_comnity_auth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					progressbar1.setVisibility(View.GONE);
					To_comnity.setClass(getApplicationContext(), HomeActivity.class);
					startActivity(To_comnity);
					SketchwareUtil.showMessage(getApplicationContext(), "Login Successfull ");
					finish();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
				}
			}
		};
		
		_comnity_auth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				progressbar2.setVisibility(View.GONE);
				if (_success) {
					SketchwareUtil.showMessage(getApplicationContext(), "Password reset link has been sent to your Email");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Error! Password reset link could not be sent");
				}
			}
		};
	}
	private void initializeLogic() {
		linear_login.setVisibility(View.VISIBLE);
		linear_signup.setVisibility(View.GONE);
		linear_forgotpasspg.setVisibility(View.GONE);
		progressbar1.setVisibility(View.INVISIBLE);
		progressbar2.setVisibility(View.INVISIBLE);
		progressbar3.setVisibility(View.INVISIBLE);
		_Shape(50, 50, 50, 50, "#FFC107", 2, "#FFC107", 0, button_login);
		_Shape(50, 50, 50, 50, "#FFC107", 2, "#FFC107", 0, button_newacc);
		_Shape(50, 50, 50, 50, "#FFC107", 2, "#FFC107", 0, button3);
		_Shape(50, 50, 50, 50, "#FFC107", 2, "#FFC107", 0, button4);
		if ((FirebaseAuth.getInstance().getCurrentUser() != null)) {
			To_comnity.setClass(getApplicationContext(), ComnityLoginActivity.class);
			startActivity(To_comnity);
			finish();
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		To_comnity.setClass(getApplicationContext(), HomeActivity.class);
		startActivity(To_comnity);
		finish();
	}
	private void _Shape (final double _t1, final double _t2, final double _b1, final double _b2, final String _Background, final double _Stroke, final String _stroke, final double _Elevation, final View _view) {
		android.graphics.drawable.GradientDrawable gs = new android.graphics.drawable.GradientDrawable();
		
		gs.setColor(Color.parseColor(_Background));
		
		gs.setStroke((int)_Stroke, Color.parseColor(_stroke));
		
		gs.setCornerRadii(new float[]{(int)_t1,(int)_t1,(int)_t2,(int)_t2,(int)_b1,(int)_b1,(int)_b2,(int)_b2});
		
		_view.setBackground(gs);
		_view.setElevation((int)_Elevation);
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
