package leavesc.hello.network.http.datasource;

import leavesc.hello.library.http.BaseRemoteDataSource;
import leavesc.hello.library.http.callback.RequestCallback;
import leavesc.hello.library.viewmodel.BaseViewModel;
import leavesc.hello.network.http.config.HttpConfig;
import leavesc.hello.network.http.datasource.base.IFailExampleDataSource;
import leavesc.hello.network.http.service.ApiService;

/**
 * 作者：leavesC
 * 时间：2019/1/30 13:02
 * 描述：
 */
public class FailExampleDataSource extends BaseRemoteDataSource implements IFailExampleDataSource {

    public FailExampleDataSource(BaseViewModel baseViewModel) {
        super(baseViewModel);
    }

    @Override
    public void test1(RequestCallback<String> callback) {
        execute(getService(ApiService.class, HttpConfig.BASE_URL_WEATHER).test1(), callback);
    }

    @Override
    public void test2(RequestCallback<String> callback) {
        execute(getService(ApiService.class, HttpConfig.BASE_URL_WEATHER).test2(), callback);
    }

}