package com.jianmi.news.app;

import com.jianmi.news.BuildConfig;
import com.jianmi.common.baseapp.BaseApplication;
import com.jianmi.common.commonutils.LogUtils;

/**
 * APPLICATION
 */
public class AppApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化logger
        LogUtils.logInit(BuildConfig.LOG_DEBUG);
    }
}
