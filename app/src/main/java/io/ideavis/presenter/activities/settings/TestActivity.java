package io.ideavis.presenter.activities.settings;

import android.os.Bundle;

import io.ideavis.R;
import io.ideavis.presenter.activities.util.BRActivity;

public class TestActivity extends BRActivity {
    private static final String TAG = TestActivity.class.getName();


    @Override
    protected void onSaveInstanceState(Bundle outState) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


}
