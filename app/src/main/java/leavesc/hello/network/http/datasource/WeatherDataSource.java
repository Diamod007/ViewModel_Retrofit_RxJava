package leavesc.hello.network.http.datasource;

import leavesc.hello.library.http.BaseRemoteDataSource;
import leavesc.hello.library.http.callback.RequestCallback;
import leavesc.hello.library.viewmodel.BaseViewModel;
import leavesc.hello.network.http.datasource.base.IWeatherDataSource;
import leavesc.hello.network.http.service.ApiService;
import leavesc.hello.network.model.Weather;

/**
 * 作者：leavesC
 * 时间：2018/10/27 20:48
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class WeatherDataSource extends BaseRemoteDataSource implements IWeatherDataSource {

    public WeatherDataSource(BaseViewModel baseViewModel) {
        super(baseViewModel);
    }

    @Override
    public void queryWeather(String cityName, RequestCallback<Weather> responseCallback) {
        execute(getService(ApiService.class).queryWeather(cityName), responseCallback);
    }

}
