package com.betelguese.shoppingapploginscreen.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.betelguese.shoppingapploginscreen.R;
import com.betelguese.shoppingapploginscreen.fragments.LogInFragment;


public class SignUpActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new LogInFragment())
                    .commit();
        }
    }
}