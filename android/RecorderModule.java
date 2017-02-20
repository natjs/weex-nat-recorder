package com.nat.weex;

import com.nat.recorder.HLModuleResultListener;
import com.nat.recorder.HLRecorderModule;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

import java.util.HashMap;

/**
 * Created by Daniel on 17/2/18. 
 * Copyright (c) 2017 Nat. All rights reserved.
 */

public class RecorderModule extends WXModule {

    @JSMethod
    public void start(HashMap<String, String> param, final JSCallback jsCallback){
        HLRecorderModule.getInstance().start(param, new HLModuleResultListener() {
            @Override
            public void onResult(Object o) {
                jsCallback.invoke(o);
            }
        });
    }

    @JSMethod
    public void pause(final JSCallback jsCallback){
        HLRecorderModule.getInstance().pause(new HLModuleResultListener() {
            @Override
            public void onResult(Object o) {
                jsCallback.invoke(o);
            }
        });
    }

    @JSMethod
    public void stop(final JSCallback jsCallback){
        HLRecorderModule.getInstance().stop(new HLModuleResultListener() {
            @Override
            public void onResult(Object o) {
                jsCallback.invoke(o);
            }
        });
    }
}
