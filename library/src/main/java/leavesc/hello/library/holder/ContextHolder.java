package leavesc.hello.library.holder;

import android.content.Context;

/**
 * 作者：leavesC
 * 时间：2019/1/27 18:00
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class ContextHolder {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        ContextHolder.context = context;
    }

}
