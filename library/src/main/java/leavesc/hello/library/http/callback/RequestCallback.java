package leavesc.hello.library.http.callback;

import leavesc.hello.library.holder.ToastHolder;

/**
 * 作者：leavesC
 * 时间：2018/10/27 20:53
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public interface RequestCallback<T> {

    void onSuccess(T t);

    default void showToast(String message) {
        ToastHolder.showToast(message);
    }

}
