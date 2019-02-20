package com.appb;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by 97974 on 2017/9/11.
 */

public class RnModules extends ReactContextBaseJavaModule {
  private ReactApplicationContext mContext;
  public RnModules(ReactApplicationContext reactContext) {
    super(reactContext);
    mContext = reactContext;
  }

  @Override
  public String getName() {
    return "RnNativeModule"; //这里的name是必须的，最终在js中调用的时候以这个为准！
  }

  @ReactMethod
  public void Toasts(String msg) {
    Toast.makeText(mContext,msg,Toast.LENGTH_SHORT).show();
  }
}