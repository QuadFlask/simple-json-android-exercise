package com.example.simplejsonapp;

import android.app.Activity;
import android.widget.TextView;

import com.example.simplejsonapp.entity.User;
import com.example.simplejsonapp.rest.SimpleRestClient;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.Background;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.UiThread;
import com.googlecode.androidannotations.annotations.ViewById;
import com.googlecode.androidannotations.annotations.rest.RestService;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

	@ViewById
	TextView textView1;

	@RestService
	SimpleRestClient restClient;

	@AfterViews
	void afterViews() {
		setTextView1("-");
		
		getUserNameById("testid1");
	}

	@Background
	void getUserNameById(String id) {
		User user = restClient.getUserById(id);
		setTextView1(user.toString());
	}

	@UiThread
	void setTextView1(String text) {
		textView1.setText("received : " + text);
	}

}
