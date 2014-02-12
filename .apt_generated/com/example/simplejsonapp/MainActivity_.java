//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.example.simplejsonapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.example.simplejsonapp.R.layout;
import com.example.simplejsonapp.rest.SimpleRestClient_;
import com.googlecode.androidannotations.api.BackgroundExecutor;

public final class MainActivity_
    extends MainActivity
{

    private Handler handler_ = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
    }

    private void init_(Bundle savedInstanceState) {
        restClient = new SimpleRestClient_();
    }

    private void afterSetContentView_() {
        textView1 = ((TextView) findViewById(com.example.simplejsonapp.R.id.textView1));
        afterViews();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        afterSetContentView_();
    }

    public static MainActivity_.IntentBuilder_ intent(Context context) {
        return new MainActivity_.IntentBuilder_(context);
    }

    @Override
    public void setTextView1(final String text) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    MainActivity_.super.setTextView1(text);
                } catch (RuntimeException e) {
                    Log.e("MainActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void getUserNameById(final String id) {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    MainActivity_.super.getUserNameById(id);
                } catch (RuntimeException e) {
                    Log.e("MainActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, MainActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public MainActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (context_ instanceof Activity) {
                ((Activity) context_).startActivityForResult(intent_, requestCode);
            } else {
                context_.startActivity(intent_);
            }
        }

    }

}
