package leavesc.hello.network;

import android.arch.lifecycle.ViewModel;
import android.os.Bundle;
import android.view.View;

import leavesc.hello.library.view.BaseActivity;
import leavesc.hello.library.viewmodel.LViewModelProviders;
import leavesc.hello.network.viewmodel.FailExampleViewModel;

/**
 * 作者：leavesC
 * 时间：2019/2/28 23:36
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class FailExampleActivity extends BaseActivity {

    private FailExampleViewModel failExampleViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail_example);
    }

    @Override
    protected ViewModel initViewModel() {
        failExampleViewModel = LViewModelProviders.of(this, FailExampleViewModel.class);
        return failExampleViewModel;
    }

    public void test1(View view) {
        failExampleViewModel.test1();
    }

    public void test2(View view) {
        failExampleViewModel.test2();
    }

}
