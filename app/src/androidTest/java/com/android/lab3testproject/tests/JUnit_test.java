package com.android.lab3testproject.tests;
import android.test.ActivityInstrumentationTestCase2;
import com.android.lab3testproject.MainActivity;
import com.android.lab3testproject.R;
//import android.R;

import android.widget.TextView;
import java.lang.Object;

/**
 * Created by exue on 4/18/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test() {
            super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }

}
