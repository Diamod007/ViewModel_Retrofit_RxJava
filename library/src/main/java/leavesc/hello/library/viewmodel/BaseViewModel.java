package leavesc.hello.library.viewmodel;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import leavesc.hello.library.event.BaseActionEvent;

/**
 * 作者：leavesC
 * 时间：2018/9/30 22:24
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class BaseViewModel extends ViewModel implements IViewModelAction {

    private MutableLiveData<BaseActionEvent> actionLiveData;

    private BaseActionEvent actionEvent;

    protected LifecycleOwner lifecycleOwner;

    public BaseViewModel() {
        actionLiveData = new MutableLiveData<>();
        actionEvent = new BaseActionEvent(BaseActionEvent.DEFAULT);
    }

    @Override
    public void startLoading() {
        startLoading(null);
    }

    @Override
    public void startLoading(String message) {
        actionEvent.setAction(BaseActionEvent.SHOW_LOADING_DIALOG);
        actionEvent.setMessage(message);
        actionLiveData.setValue(actionEvent);
    }

    @Override
    public void dismissLoading() {
        actionEvent.setAction(BaseActionEvent.DISMISS_LOADING_DIALOG);
        actionLiveData.setValue(actionEvent);
    }

    @Override
    public void showToast(String message) {
        actionEvent.setAction(BaseActionEvent.SHOW_TOAST);
        actionEvent.setMessage(message);
        actionLiveData.setValue(actionEvent);
    }

    @Override
    public void finish() {
        actionEvent.setAction(BaseActionEvent.FINISH);
        actionLiveData.setValue(actionEvent);
    }

    @Override
    public void finishWithResultOk() {
        actionEvent.setAction(BaseActionEvent.FINISH_WITH_RESULT_OK);
        actionLiveData.setValue(actionEvent);
    }

    @Override
    public MutableLiveData<BaseActionEvent> getActionLiveData() {
        return actionLiveData;
    }

    void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
    }

}