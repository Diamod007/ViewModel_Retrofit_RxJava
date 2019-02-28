package leavesc.hello.library.http;

import android.widget.Toast;

import io.reactivex.observers.DisposableObserver;
import leavesc.hello.library.holder.ContextHolder;
import leavesc.hello.library.http.callback.RequestCallback;
import leavesc.hello.library.http.callback.RequestMultiplyCallback;
import leavesc.hello.library.http.config.HttpCode;
import leavesc.hello.library.http.exception.base.BaseException;
import leavesc.hello.library.viewmodel.BaseViewModel;

/**
 * 作者：leavesC
 * 时间：2018/10/27 20:52
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class BaseSubscriber<T> extends DisposableObserver<T> {

    private BaseViewModel baseViewModel;

    private RequestCallback<T> requestCallback;

    public BaseSubscriber(BaseViewModel baseViewModel) {
        this.baseViewModel = baseViewModel;
    }

    BaseSubscriber(BaseViewModel baseViewModel, RequestCallback<T> requestCallback) {
        this.baseViewModel = baseViewModel;
        this.requestCallback = requestCallback;
    }

    @Override
    public void onNext(T t) {
        if (requestCallback != null) {
            requestCallback.onSuccess(t);
        }
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        if (requestCallback instanceof RequestMultiplyCallback) {
            RequestMultiplyCallback callback = (RequestMultiplyCallback) requestCallback;
            if (e instanceof BaseException) {
                callback.onFail((BaseException) e);
            } else {
                callback.onFail(new BaseException(HttpCode.CODE_UNKNOWN, e.getMessage()));
            }
        } else {
            if (baseViewModel == null) {
                Toast.makeText(ContextHolder.getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
            } else {
                baseViewModel.showToast(e.getMessage());
            }
        }
    }

    @Override
    public void onComplete() {

    }

}