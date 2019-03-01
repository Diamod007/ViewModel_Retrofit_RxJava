package leavesc.hello.library;

import android.content.Context;

import java.util.List;

import leavesc.hello.library.holder.ContextHolder;
import leavesc.hello.library.http.RetrofitManagement;
import okhttp3.Interceptor;

/**
 * 作者：leavesC
 * 时间：2019/3/1 20:35
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public enum Leaves {

    INSTANCE;

    public Leaves init(Context context) {
        ContextHolder.setContext(context);
        return INSTANCE;
    }

    public Leaves log(boolean log) {
        RetrofitManagement.getInstance().setLog(log);
        return INSTANCE;
    }

    public Leaves addInterceptor(List<Interceptor> interceptorList) {
        RetrofitManagement.getInstance().addInterceptor(interceptorList);
        return INSTANCE;
    }

}
