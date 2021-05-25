package com.rokid.glass.ui.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;


import com.rokid.sdk.infinity.core.InfinityView;
import com.rokid.sdk.infinity.core.bean.SubwinBean;
import com.rokid.sdk.infinity.core.bean.ViewModel;
import com.rokid.sdk.infinity.core.listener.FocusChangeListener;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class InfinityActivity extends AppCompatActivity {
    private InfinityView infinityView;
    private FrameLayout view;
    private View button;

    private static String TAG = "IMUTESTActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infinity);


        infinityView = findViewById(R.id.infinityView);
        getLifecycle().addObserver(infinityView);
        view = (FrameLayout) LayoutInflater.from(this).inflate(R.layout.layout_infinityview, null);
        button = view.findViewById(R.id.button);
        infinityView.addContentView(view);
        infinityView.setViewModel(ViewModel.VIEW_MODEL);
        infinityView.showStatusBar(true);
        infinityView.addListenerView(button);
        infinityView.updateSize();


        ArrayList<SubwinBean> subwinBeans = new ArrayList<>();
        subwinBeans.add(new SubwinBean("test1", getDrawable(R.mipmap.bluetooth), "test1"));
        subwinBeans.add(new SubwinBean("test2", getDrawable(R.mipmap.bluetooth), "test2"));

        infinityView.setSubWinData(subwinBeans);
        infinityView.setFocusChangeListener(new FocusChangeListener() {
            @Override
            public void haveFocus(@NotNull View view) {
                Log.d(TAG, "haveFocus tag = " + view.getTag());
            }

            @Override
            public void removeFocus(@NotNull View view) {
                Log.d(TAG, "removeFocus tag = " + view.getTag());
            }

            @Override
            public void haveNoFucus() {
                Log.d(TAG, "haveFocus tag = " + view.getTag());
            }

            @Override
            public void focusEnter(@NotNull View view) {
                Log.d(TAG, "focusEnter tag = " + view.getTag());
            }

            @Override
            public void haveFocusSubWin(@NotNull View view) {

            }

            @Override
            public void removeFocusSubWin(@NotNull View view) {

            }

            @Override
            public void focusEnterSubWin(@NotNull SubwinBean bean) {
                Log.d(TAG, "focusEnterSubWin tag = " + bean.getLab());
            }
        });

    }

}