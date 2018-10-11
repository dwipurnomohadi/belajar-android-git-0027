package com.project_n.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.project_n.splashscreen.util.PreferenceHelper;

public class MainActivity extends AppCompatActivity {

    TextView tampilUser;
    PreferenceHelper instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tampilUser = (TextView) findViewById(R.id.TamilUser);
        instance = PreferenceHelper.getInstance(getApplicationContext());
        tampilUser.setText(instance.getName());
    }
}
