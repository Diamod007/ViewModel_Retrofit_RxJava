package leavesc.hello.network;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import leavesc.hello.library.Leaves;
import leavesc.hello.network.http.interceptor.FilterInterceptor;
import okhttp3.Interceptor;

/**
 * 作者：leavesC
 * 时间：2018/10/26 23:24
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class BaseApplication extends Application {

    private static Application appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
        initLeaves();
    }

    private void initLeaves() {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new FilterInterceptor());
        Leaves.INSTANCE.init(this).log(true).addInterceptor(interceptorList);
    }

    public static Application getAppContext() {
        return appContext;
    }

}