package leavesc.hello.library.holder;

import android.content.Context;
import android.widget.Toast;

/**
 * 作者：leavesC
 * 时间：2019/3/1 20:47
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class ToastHolder {

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void showToast(String message) {
        showToast(ContextHolder.getContext(), message);
    }

}
