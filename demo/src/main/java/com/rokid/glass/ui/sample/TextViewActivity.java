package com.rokid.glass.ui.sample;

import android.os.Bundle;
//import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Window;

/**
 * @author jian.yang
 * @date 2019/10/30
 */

public class TextViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_text_view);
//        findViewById(R.id.item_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(TextViewActivity.this, TextView2Activity.class),
//                        ActivityOptionsCompat.makeSceneTransitionAnimation(TextViewActivity.this).toBundle());
//            }
//        });
    }

//    @Override
//    public boolean onKeyUp(int keyCode, KeyEvent event) {
//        Log.d("DEBUG", "##### keyCode: " + keyCode);
//        switch (keyCode) {
//            case KeyEvent.KEYCODE_ENTER:
//            case KeyEvent.KEYCODE_DPAD_CENTER:
//                startActivity(new Intent(TextViewActivity.this, TextView2Activity.class),
//                        ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());
//                break;
//            case KeyEvent.KEYCODE_DPAD_RIGHT:
//            case KeyEvent.KEYCODE_DPAD_LEFT:
//                return true;
//        }
//        return super.onKeyUp(keyCode, event);
//    }

//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        Log.d("DEBUG", "##### onKeyDown: " + keyCode);
//        switch (keyCode) {
//            case KeyEvent.KEYCODE_DPAD_RIGHT:
//            case KeyEvent.KEYCODE_DPAD_LEFT:
//                return true;
//        }
//        return super.onKeyDown(keyCode, event);
//    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
//        switch (event.getKeyCode()) {
//            case KeyEvent.KEYCODE_DPAD_RIGHT:
//            case KeyEvent.KEYCODE_DPAD_LEFT:
//                return true;
//        }
        return super.dispatchKeyEvent(event);
    }
}
