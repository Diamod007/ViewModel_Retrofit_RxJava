package leavesc.hello.network.http.datasource;

import leavesc.hello.library.http.BaseRemoteDataSource;
import leavesc.hello.library.http.callback.RequestCallback;
import leavesc.hello.library.http.config.HttpConfig;
import leavesc.hello.library.viewmodel.BaseViewModel;
import leavesc.hello.network.http.datasource.base.IQrCodeDataSource;
import leavesc.hello.network.http.service.ApiService;
import leavesc.hello.network.model.QrCode;

/**
 * 作者：leavesC
 * 时间：2018/10/27 20:48
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class QrCodeDataSource extends BaseRemoteDataSource implements IQrCodeDataSource {

    public QrCodeDataSource(BaseViewModel baseViewModel) {
        super(baseViewModel);
    }

    @Override
    public void createQrCode(String text, int width, RequestCallback<QrCode> callback) {
        execute(getService(ApiService.class, HttpConfig.BASE_URL_QR_CODE).createQrCode(text, width), callback);
    }

}