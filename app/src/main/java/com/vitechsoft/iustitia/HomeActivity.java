package com.vitechsoft.iustitia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
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
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import android.content.ClipData;
import java.util.Timer;
import java.util.TimerTask;
import android.webkit.WebViewClient;
import android.view.View;
import android.widget.AdapterView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;

public class HomeActivity extends AppCompatActivity {
	
	public final int REQ_CD_FILE = 101;
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private DrawerLayout _drawer;
	private double number = 0;
	private HashMap<String, Object> account = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	private ArrayList<String> lists = new ArrayList<>();
	private ArrayList<String> Listmap = new ArrayList<>();
	private ArrayList<String> age = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear_btm_bar;
	private LinearLayout linear_home;
	private LinearLayout linear_report;
	private LinearLayout linear_community;
	private LinearLayout linear_website;
	private LinearLayout linear_profile;
	private LinearLayout linear_top_bar;
	private ScrollView vscroll5;
	private ImageView imageview5;
	private ImageView imageview6;
	private ImageView imageview7;
	private LinearLayout linear_home_inner;
	private LinearLayout linear_report_redir;
	private LinearLayout linear_comnity_redir;
	private ImageView imageview9;
	private LinearLayout linear10;
	private TextView textview7;
	private ImageView imageview11;
	private ImageView imageview16;
	private LinearLayout linear15;
	private TextView textview9;
	private ImageView imageview17;
	private LinearLayout linear5;
	private ScrollView vscroll_report;
	private LinearLayout linear6;
	private Spinner spinner2;
	private TextView textview5;
	private LinearLayout linear_report_inner;
	private LinearLayout linear50;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private LinearLayout linear35;
	private LinearLayout linear34;
	private LinearLayout linear36;
	private LinearLayout linear47;
	private LinearLayout linear49;
	private LinearLayout linear_moreinfo;
	private Button button3;
	private LinearLayout linear51;
	private TextView textview16;
	private TextView textview17;
	private LinearLayout linear44;
	private EditText edittext1;
	private ImageView imageview31;
	private LinearLayout linear43;
	private EditText edittext2;
	private ImageView imageview30;
	private LinearLayout linear42;
	private EditText edittext4;
	private ImageView imageview29;
	private LinearLayout linear41;
	private EditText edittext3;
	private ImageView imageview28;
	private LinearLayout linear38;
	private TextView textview_age;
	private Spinner spinner_age;
	private ImageView imageview25;
	private LinearLayout linear48;
	private TextView textview_sexform;
	private Spinner spinner_abusetype;
	private ImageView imageview33;
	private TextView textview15;
	private EditText edittext5;
	private LinearLayout linear16;
	private ScrollView vscroll7;
	private ImageView imageview18;
	private LinearLayout linear17;
	private Spinner spinner3;
	private TextView textview10;
	private LinearLayout linear_comnity_inner;
	private LinearLayout linear_comnity_nolog;
	private LinearLayout linear_comni_logedin;
	private LinearLayout linear25;
	private LinearLayout linear30;
	private TextView textview13;
	private Button button2;
	private TextView textview12;
	private ImageView imageview57;
	private TextView textview48;
	private LinearLayout linear18;
	private WebView webview1;
	private LinearLayout linear19;
	private TextView textview11;
	private LinearLayout linear80;
	private ScrollView vscroll_profile;
	private LinearLayout linear81;
	private TextView textview38;
	private LinearLayout linear_profile_inner;
	private LinearLayout linear_noaccount_pro;
	private LinearLayout linear_profile_login;
	private LinearLayout linear_proin;
	private LinearLayout linear_profile_head;
	private LinearLayout linear_biography;
	private LinearLayout linear63;
	private LinearLayout linear11;
	private ImageView imageview3;
	private TextView textview24;
	private LinearLayout linear62;
	private LinearLayout linear_location;
	private ImageView imageview4;
	private TextView textview6;
	private ImageView imageview50;
	private TextView textview40;
	private LinearLayout linear_bio_title;
	private TextView textview8;
	private LinearLayout linear77;
	private ImageView imageview51;
	private TextView textview42;
	private TextView textview36;
	private LinearLayout linear_profile_detal;
	private LinearLayout linear72;
	private LinearLayout linear73;
	private LinearLayout linear74;
	private LinearLayout linear79;
	private LinearLayout linear83;
	private LinearLayout linear69;
	private LinearLayout linear86;
	private LinearLayout linear84;
	private LinearLayout linear88;
	private ImageView imageview52;
	private TextView textview43;
	private ImageView imageview43;
	private TextView textview31;
	private ImageView imageview56;
	private TextView textview46;
	private ImageView imageview53;
	private TextView textview44;
	private TextView textview47;
	private ImageView imageview45;
	private TextView textview32;
	private ImageView imageview47;
	private TextView textview33;
	private ImageView imageview49;
	private TextView textview34;
	private TextView textview37;
	private LinearLayout linear22;
	private ImageView imageview_fb;
	private ImageView imageview_inst;
	private ImageView imageview_twitter;
	private LinearLayout _drawer_linear_drawer;
	private ScrollView _drawer_vscroll2;
	private LinearLayout _drawer_linear11;
	private LinearLayout _drawer_linear_logo_area;
	private LinearLayout _drawer_linear12;
	private LinearLayout _drawer_linear13;
	private LinearLayout _drawer_linear14;
	private LinearLayout _drawer_linear_signin_opt;
	private LinearLayout _drawer_linear_signout_opt;
	private LinearLayout _drawer_linear20;
	private LinearLayout _drawer_linear18;
	private ImageView _drawer_imageview1;
	private ImageView _drawer_imageview2;
	private TextView _drawer_textview1;
	private ImageView _drawer_imageview3;
	private TextView _drawer_textview2;
	private ImageView _drawer_imageview4;
	private TextView _drawer_textview3;
	private ImageView _drawer_imageview6;
	private TextView _drawer_textview5;
	private ImageView _drawer_imageview5;
	private TextView _drawer_textview4;
	private ImageView _drawer_imageview7;
	private TextView _drawer_textview8;
	private TextView _drawer_textview7;
	private LinearLayout _drawer_linear22;
	private ImageView _drawer_imageview_fb;
	private ImageView _drawer_imageview_inst;
	private ImageView _drawer_imageview_twitter;
	
	private SharedPreferences get;
	private Intent I = new Intent();
	private FirebaseAuth auth;
	private OnCompleteListener<AuthResult> _auth_create_user_listener;
	private OnCompleteListener<AuthResult> _auth_sign_in_listener;
	private OnCompleteListener<Void> _auth_reset_password_listener;
	private Intent file = new Intent(Intent.ACTION_GET_CONTENT);
	private Intent about_link = new Intent();
	private Intent Twitter = new Intent();
	private Intent Instagram = new Intent();
	private Intent Facebook = new Intent();
	private RequestNetwork internetconnection;
	private RequestNetwork.RequestListener _internetconnection_request_listener;
	private Intent internet = new Intent();
	private TimerTask timer;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initialize(_savedInstanceState);
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
		}
		else {
			initializeLogic();
		}
	}
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(HomeActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear_btm_bar = (LinearLayout) findViewById(R.id.linear_btm_bar);
		linear_home = (LinearLayout) findViewById(R.id.linear_home);
		linear_report = (LinearLayout) findViewById(R.id.linear_report);
		linear_community = (LinearLayout) findViewById(R.id.linear_community);
		linear_website = (LinearLayout) findViewById(R.id.linear_website);
		linear_profile = (LinearLayout) findViewById(R.id.linear_profile);
		linear_top_bar = (LinearLayout) findViewById(R.id.linear_top_bar);
		vscroll5 = (ScrollView) findViewById(R.id.vscroll5);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		linear_home_inner = (LinearLayout) findViewById(R.id.linear_home_inner);
		linear_report_redir = (LinearLayout) findViewById(R.id.linear_report_redir);
		linear_comnity_redir = (LinearLayout) findViewById(R.id.linear_comnity_redir);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		vscroll_report = (ScrollView) findViewById(R.id.vscroll_report);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear_report_inner = (LinearLayout) findViewById(R.id.linear_report_inner);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		linear_moreinfo = (LinearLayout) findViewById(R.id.linear_moreinfo);
		button3 = (Button) findViewById(R.id.button3);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		imageview31 = (ImageView) findViewById(R.id.imageview31);
		linear43 = (LinearLayout) findViewById(R.id.linear43);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		imageview30 = (ImageView) findViewById(R.id.imageview30);
		linear42 = (LinearLayout) findViewById(R.id.linear42);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		imageview29 = (ImageView) findViewById(R.id.imageview29);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		imageview28 = (ImageView) findViewById(R.id.imageview28);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		textview_age = (TextView) findViewById(R.id.textview_age);
		spinner_age = (Spinner) findViewById(R.id.spinner_age);
		imageview25 = (ImageView) findViewById(R.id.imageview25);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		textview_sexform = (TextView) findViewById(R.id.textview_sexform);
		spinner_abusetype = (Spinner) findViewById(R.id.spinner_abusetype);
		imageview33 = (ImageView) findViewById(R.id.imageview33);
		textview15 = (TextView) findViewById(R.id.textview15);
		edittext5 = (EditText) findViewById(R.id.edittext5);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		vscroll7 = (ScrollView) findViewById(R.id.vscroll7);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		spinner3 = (Spinner) findViewById(R.id.spinner3);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear_comnity_inner = (LinearLayout) findViewById(R.id.linear_comnity_inner);
		linear_comnity_nolog = (LinearLayout) findViewById(R.id.linear_comnity_nolog);
		linear_comni_logedin = (LinearLayout) findViewById(R.id.linear_comni_logedin);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		textview13 = (TextView) findViewById(R.id.textview13);
		button2 = (Button) findViewById(R.id.button2);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview57 = (ImageView) findViewById(R.id.imageview57);
		textview48 = (TextView) findViewById(R.id.textview48);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		textview11 = (TextView) findViewById(R.id.textview11);
		linear80 = (LinearLayout) findViewById(R.id.linear80);
		vscroll_profile = (ScrollView) findViewById(R.id.vscroll_profile);
		linear81 = (LinearLayout) findViewById(R.id.linear81);
		textview38 = (TextView) findViewById(R.id.textview38);
		linear_profile_inner = (LinearLayout) findViewById(R.id.linear_profile_inner);
		linear_noaccount_pro = (LinearLayout) findViewById(R.id.linear_noaccount_pro);
		linear_profile_login = (LinearLayout) findViewById(R.id.linear_profile_login);
		linear_proin = (LinearLayout) findViewById(R.id.linear_proin);
		linear_profile_head = (LinearLayout) findViewById(R.id.linear_profile_head);
		linear_biography = (LinearLayout) findViewById(R.id.linear_biography);
		linear63 = (LinearLayout) findViewById(R.id.linear63);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview24 = (TextView) findViewById(R.id.textview24);
		linear62 = (LinearLayout) findViewById(R.id.linear62);
		linear_location = (LinearLayout) findViewById(R.id.linear_location);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview50 = (ImageView) findViewById(R.id.imageview50);
		textview40 = (TextView) findViewById(R.id.textview40);
		linear_bio_title = (LinearLayout) findViewById(R.id.linear_bio_title);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear77 = (LinearLayout) findViewById(R.id.linear77);
		imageview51 = (ImageView) findViewById(R.id.imageview51);
		textview42 = (TextView) findViewById(R.id.textview42);
		textview36 = (TextView) findViewById(R.id.textview36);
		linear_profile_detal = (LinearLayout) findViewById(R.id.linear_profile_detal);
		linear72 = (LinearLayout) findViewById(R.id.linear72);
		linear73 = (LinearLayout) findViewById(R.id.linear73);
		linear74 = (LinearLayout) findViewById(R.id.linear74);
		linear79 = (LinearLayout) findViewById(R.id.linear79);
		linear83 = (LinearLayout) findViewById(R.id.linear83);
		linear69 = (LinearLayout) findViewById(R.id.linear69);
		linear86 = (LinearLayout) findViewById(R.id.linear86);
		linear84 = (LinearLayout) findViewById(R.id.linear84);
		linear88 = (LinearLayout) findViewById(R.id.linear88);
		imageview52 = (ImageView) findViewById(R.id.imageview52);
		textview43 = (TextView) findViewById(R.id.textview43);
		imageview43 = (ImageView) findViewById(R.id.imageview43);
		textview31 = (TextView) findViewById(R.id.textview31);
		imageview56 = (ImageView) findViewById(R.id.imageview56);
		textview46 = (TextView) findViewById(R.id.textview46);
		imageview53 = (ImageView) findViewById(R.id.imageview53);
		textview44 = (TextView) findViewById(R.id.textview44);
		textview47 = (TextView) findViewById(R.id.textview47);
		imageview45 = (ImageView) findViewById(R.id.imageview45);
		textview32 = (TextView) findViewById(R.id.textview32);
		imageview47 = (ImageView) findViewById(R.id.imageview47);
		textview33 = (TextView) findViewById(R.id.textview33);
		imageview49 = (ImageView) findViewById(R.id.imageview49);
		textview34 = (TextView) findViewById(R.id.textview34);
		textview37 = (TextView) findViewById(R.id.textview37);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		imageview_fb = (ImageView) findViewById(R.id.imageview_fb);
		imageview_inst = (ImageView) findViewById(R.id.imageview_inst);
		imageview_twitter = (ImageView) findViewById(R.id.imageview_twitter);
		_drawer_linear_drawer = (LinearLayout) _nav_view.findViewById(R.id.linear_drawer);
		_drawer_vscroll2 = (ScrollView) _nav_view.findViewById(R.id.vscroll2);
		_drawer_linear11 = (LinearLayout) _nav_view.findViewById(R.id.linear11);
		_drawer_linear_logo_area = (LinearLayout) _nav_view.findViewById(R.id.linear_logo_area);
		_drawer_linear12 = (LinearLayout) _nav_view.findViewById(R.id.linear12);
		_drawer_linear13 = (LinearLayout) _nav_view.findViewById(R.id.linear13);
		_drawer_linear14 = (LinearLayout) _nav_view.findViewById(R.id.linear14);
		_drawer_linear_signin_opt = (LinearLayout) _nav_view.findViewById(R.id.linear_signin_opt);
		_drawer_linear_signout_opt = (LinearLayout) _nav_view.findViewById(R.id.linear_signout_opt);
		_drawer_linear20 = (LinearLayout) _nav_view.findViewById(R.id.linear20);
		_drawer_linear18 = (LinearLayout) _nav_view.findViewById(R.id.linear18);
		_drawer_imageview1 = (ImageView) _nav_view.findViewById(R.id.imageview1);
		_drawer_imageview2 = (ImageView) _nav_view.findViewById(R.id.imageview2);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		_drawer_imageview3 = (ImageView) _nav_view.findViewById(R.id.imageview3);
		_drawer_textview2 = (TextView) _nav_view.findViewById(R.id.textview2);
		_drawer_imageview4 = (ImageView) _nav_view.findViewById(R.id.imageview4);
		_drawer_textview3 = (TextView) _nav_view.findViewById(R.id.textview3);
		_drawer_imageview6 = (ImageView) _nav_view.findViewById(R.id.imageview6);
		_drawer_textview5 = (TextView) _nav_view.findViewById(R.id.textview5);
		_drawer_imageview5 = (ImageView) _nav_view.findViewById(R.id.imageview5);
		_drawer_textview4 = (TextView) _nav_view.findViewById(R.id.textview4);
		_drawer_imageview7 = (ImageView) _nav_view.findViewById(R.id.imageview7);
		_drawer_textview8 = (TextView) _nav_view.findViewById(R.id.textview8);
		_drawer_textview7 = (TextView) _nav_view.findViewById(R.id.textview7);
		_drawer_linear22 = (LinearLayout) _nav_view.findViewById(R.id.linear22);
		_drawer_imageview_fb = (ImageView) _nav_view.findViewById(R.id.imageview_fb);
		_drawer_imageview_inst = (ImageView) _nav_view.findViewById(R.id.imageview_inst);
		_drawer_imageview_twitter = (ImageView) _nav_view.findViewById(R.id.imageview_twitter);
		get = getSharedPreferences("get", Activity.MODE_PRIVATE);
		auth = FirebaseAuth.getInstance();
		file.setType("image/*");
		file.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		internetconnection = new RequestNetwork(this);
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.openDrawer(GravityCompat.START);
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				I.setClass(getApplicationContext(), NotificationsActivity.class);
				startActivity(I);
			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_callReport();
			}
		});
		
		linear15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_callCommunity();
			}
		});
		
		spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		spinner_age.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position == 0) {
					textview_age.setText("11");
					textview_age.setTextColor(0xFF000000);
				}
				if (_position == 1) {
					textview_age.setText("12");
					textview_age.setTextColor(0xFF000000);
				}
				if (_position == 2) {
					textview_age.setText("13");
					textview_age.setTextColor(0xFF000000);
				}
				if (_position == 3) {
					textview_age.setText("14");
					textview_age.setTextColor(0xFF000000);
				}
				if (_position == 4) {
					textview_age.setText("15");
					textview_age.setTextColor(0xFF000000);
				}
				if (_position == 5) {
					textview_age.setText("16");
					textview_age.setTextColor(0xFF000000);
				}
				if (_position == 6) {
					textview_age.setText("17");
					textview_age.setTextColor(0xFF000000);
				}
				if (_position == 7) {
					textview_age.setText("18");
					textview_age.setTextColor(0xFF000000);
				}
				if (_position == 8) {
					textview_age.setText("Others");
					textview_age.setTextColor(0xFF000000);
				}
				if (_position == 9) {
					textview_age.setText("age");
					textview_age.setTextColor(0xFF607D8B);
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		spinner_abusetype.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position == 0) {
					textview_sexform.setText("Sexual Harassment");
					textview_sexform.setTextColor(0xFF000000);
				}
				if (_position == 1) {
					textview_sexform.setText("Rape");
					textview_sexform.setTextColor(0xFF000000);
				}
				if (_position == 2) {
					textview_sexform.setText("Molestation");
					textview_sexform.setTextColor(0xFF000000);
				}
				if (_position == 3) {
					textview_sexform.setText("Others (State Below)");
					textview_sexform.setTextColor(0xFF000000);
				}
				if (_position == 4) {
					textview_sexform.setText("What form of sexual abuse do you experience?");
					textview_sexform.setTextColor(0xFF607D8B);
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		imageview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.openDrawer(GravityCompat.START);
			}
		});
		
		spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		linear72.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				I.setClass(getApplicationContext(), AccountSettingsActivity.class);
				startActivity(I);
			}
		});
		
		linear73.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				I.setClass(getApplicationContext(), PreferenceActivity.class);
				startActivity(I);
			}
		});
		
		linear74.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				FirebaseAuth.getInstance().signOut();
			}
		});
		
		_internetconnection_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _response = _param2;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				internet.setAction(Intent.ACTION_VIEW);
				internet.setClass(getApplicationContext(), ErrornetActivity.class);
				startActivity(internet);
				finish();
			}
		};
		
		_drawer_linear_signin_opt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				I.setClass(getApplicationContext(), ComnityLoginActivity.class);
				startActivity(I);
			}
		});
		
		_drawer_linear_signout_opt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				FirebaseAuth.getInstance().signOut();
				_drawer.closeDrawer(GravityCompat.START);
				_drawer_linear_signout_opt.setVisibility(View.GONE);
				_drawer_linear_signin_opt.setVisibility(View.VISIBLE);
				linear_comnity_nolog.setVisibility(View.VISIBLE);
				linear_comni_logedin.setVisibility(View.GONE);
				linear_noaccount_pro.setVisibility(View.VISIBLE);
				linear_profile_login.setVisibility(View.GONE);
			}
		});
		
		_auth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	private void initializeLogic() {
		_bottomnavigation();
		linear_home.setVisibility(View.VISIBLE);
		linear_report.setVisibility(View.GONE);
		linear_community.setVisibility(View.GONE);
		linear_website.setVisibility(View.GONE);
		linear_profile.setVisibility(View.GONE);
		webview1.loadUrl("http://www.iustitia.org.ng/");
		if (!get.getString("account", "").equals("")) {
			listmap = new Gson().fromJson(get.getString("account", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			
		}
		getSupportActionBar().hide();
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		//10-height of shadow
		try{
			if(Build.VERSION.SDK_INT >= 21) {
				linear_top_bar.setElevation(10f);
				linear_report_redir.setElevation(10f);
				linear_comnity_redir.setElevation(10f);
				linear_btm_bar.setElevation(10f);
				_drawer_linear_logo_area.setElevation(12f);
				linear15.setElevation(10f);
				linear32.setElevation(3f);
				linear33.setElevation(3f);
				linear34.setElevation(3f);
				linear35.setElevation(3f);
				linear36.setElevation(3f);
				linear47.setElevation(3f);
				button3.setElevation(3f);
				linear50.setElevation(10f);
				linear_proin.setElevation(3f);
				linear_profile_head.setElevation(3f);
			}
		} catch(Exception e){}linear47.setElevation(3f);
		Listmap.add("Home");
		Listmap.add("About");
		Listmap.add("Setting");
		Listmap.add("Exit");
		Listmap.add("");
		spinner2.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, Listmap));
		spinner2.setSelection((int)(4));
		if ((FirebaseAuth.getInstance().getCurrentUser() != null)) {
			_drawer_linear_signin_opt.setVisibility(View.GONE);
			linear_comnity_nolog.setVisibility(View.GONE);
			linear_comni_logedin.setVisibility(View.VISIBLE);
			linear_profile_login.setVisibility(View.VISIBLE);
			linear_noaccount_pro.setVisibility(View.GONE);
		}
		else {
			_drawer_linear_signout_opt.setVisibility(View.GONE);
			linear_comnity_nolog.setVisibility(View.VISIBLE);
			linear_comni_logedin.setVisibility(View.GONE);
			linear_profile_login.setVisibility(View.GONE);
			linear_noaccount_pro.setVisibility(View.VISIBLE);
		}
		_Shape(8, 8, 8, 8, "#FFC107", 1, "#FFC107", 0, button2);
		android.graphics.drawable.GradientDrawable gs = new android.graphics.drawable.GradientDrawable();
		
		gs.setColor(Color.parseColor("#FFFFFF"));
		
		gs.setCornerRadii(new float[]{(80), (80),(80), (80), (80), (80), (80), (80)});
		
		_drawer_linear12.setBackground(gs);
		_drawer_linear12.setElevation(5f);
		_drawer_linear13.setBackground(gs);
		_drawer_linear13.setElevation(5f);
		_drawer_linear14.setBackground(gs);
		_drawer_linear14.setElevation(5f);
		_drawer_linear20.setBackground(gs);
		_drawer_linear20.setElevation(5f);
		_drawer_linear_signin_opt.setBackground(gs);
		_drawer_linear_signin_opt.setElevation(5f);
		_drawer_linear_signout_opt.setBackground(gs);
		_drawer_linear_signout_opt.setElevation(5f);
		age.add("11");
		age.add("12");
		age.add("13");
		age.add("14");
		age.add("15");
		age.add("16");
		age.add("17");
		age.add("18");
		age.add("Others");
		age.add("");
		spinner_age.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, age));
		spinner_age.setSelection((int)(9));
		lists.add("Sexual Harassment");
		lists.add("Rape");
		lists.add("Molestation");
		lists.add("Others (State Below)");
		lists.add("");
		spinner_abusetype.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, lists));
		spinner_abusetype.setSelection((int)(4));
		_Shape(0, 0, 0, 0, "#ffffff", 2, "#ffc107", 3, linear_moreinfo);
		internetconnection.startRequestNetwork(RequestNetworkController.GET, "https://www.google.com", "splash", _internetconnection_request_listener);
		_Shape(8, 8, 8, 8, "#ffffff", 2, "#ffffff", 10, linear_biography);
		_Shape(8, 8, 8, 8, "#ffffff", 2, "#ffffff", 10, linear_profile_detal);
		_Shape(8, 8, 8, 8, "#ffffff", 2, "#ffffff", 10, linear72);
		_Shape(8, 8, 8, 8, "#ffffff", 2, "#ffffff", 10, linear73);
		_Shape(8, 8, 8, 8, "#ffffff", 2, "#ffffff", 10, linear74);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_FILE:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
				
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		}
		else {
			super.onBackPressed();
		}
	}
	private void _bottomnavigation () {
		com.google.android.material.bottomnavigation.BottomNavigationView btm= new com.google.android.material.bottomnavigation.BottomNavigationView(HomeActivity.this); 
		btm.setLayoutParams(new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)); 
		linear_btm_bar.addView(btm); linear_btm_bar.setElevation(10); 
		
		Menu menu = btm.getMenu(); 
		final int A = 0; 
		final int B = 1; 
		final int C = 2; 
		final int D = 3; 
		final int E = 4;
		
		menu.add(Menu.NONE, A, Menu.NONE, "Home").setIcon(R.drawable.ic_home_grey); 
		menu.add(Menu.NONE, B, Menu.NONE, "Report").setIcon(R.drawable.ic_verified_user_grey); 
		menu.add(Menu.NONE, C, Menu.NONE, "Community").setIcon(R.drawable.ic_question_answer_grey); 
		menu.add(Menu.NONE, D, Menu.NONE, "Website").setIcon(R.drawable.ic_language_grey);
		menu.add(Menu.NONE, E, Menu.NONE, "Profile").setIcon(R.drawable.ic_person_grey); 
		btm.setOnNavigationItemSelectedListener(new com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener() { @Override public boolean onNavigationItemSelected(final MenuItem item) { switch (item.getItemId()){ case A: _callHome(); return true; case B: _callReport(); return true; case C: _callCommunity(); return true; case D: _callWebsite(); return true; case E: _callProfile(); return true; default: return true; } } });
	}
	
	
	private void _callHome () {
		number = 0;
		linear_home.setVisibility(View.VISIBLE);
		linear_report.setVisibility(View.GONE);
		linear_community.setVisibility(View.GONE);
		linear_website.setVisibility(View.GONE);
		linear_profile.setVisibility(View.GONE);
	}
	
	
	private void _callReport () {
		number = 1;
		linear_home.setVisibility(View.GONE);
		linear_report.setVisibility(View.VISIBLE);
		linear_community.setVisibility(View.GONE);
		linear_website.setVisibility(View.GONE);
		linear_profile.setVisibility(View.GONE);
	}
	
	
	private void _callCommunity () {
		number = 2;
		linear_home.setVisibility(View.GONE);
		linear_report.setVisibility(View.GONE);
		linear_community.setVisibility(View.VISIBLE);
		linear_website.setVisibility(View.GONE);
		linear_profile.setVisibility(View.GONE);
	}
	
	
	private void _callWebsite () {
		number = 3;
		linear_home.setVisibility(View.GONE);
		linear_report.setVisibility(View.GONE);
		linear_community.setVisibility(View.GONE);
		linear_website.setVisibility(View.VISIBLE);
		linear_profile.setVisibility(View.GONE);
	}
	
	
	private void _callProfile () {
		number = 4;
		linear_home.setVisibility(View.GONE);
		linear_report.setVisibility(View.GONE);
		linear_community.setVisibility(View.GONE);
		linear_website.setVisibility(View.GONE);
		linear_profile.setVisibility(View.VISIBLE);
	}
	
	
	private void _Shape (final double _t1, final double _t2, final double _b1, final double _b2, final String _Background, final double _Stroke, final String _stroke, final double _Elevation, final View _view) {
		android.graphics.drawable.GradientDrawable gs = new android.graphics.drawable.GradientDrawable();
		
		gs.setColor(Color.parseColor(_Background));
		
		gs.setStroke((int)_Stroke, Color.parseColor(_stroke));
		
		gs.setCornerRadii(new float[]{(int)_t1,(int)_t1,(int)_t2,(int)_t2,(int)_b1,(int)_b1,(int)_b2,(int)_b2});
		
		_view.setBackground(gs);
		_view.setElevation((int)_Elevation);
	}
	
	
	private void _CardView (final String _color1, final String _color2, final double _str, final double _n1, final double _n2, final double _n3, final double _n4, final View _view, final View _el) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		
		gd.setColor(Color.parseColor(_color1));
		
		gd.setStroke((int)_str, Color.parseColor(_color2));
		
		gd.setCornerRadii(new float[]{(int)_n1,(int)_n1,(int)_n2,(int)_n2,(int)_n3,(int)_n3,(int)_n4,(int)_n4});
		
		_view.setBackground(gd);
		if (Build.VERSION.SDK_INT >=14){
			    _el.setElevation((float)5);
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
