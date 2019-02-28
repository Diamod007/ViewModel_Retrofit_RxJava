package leavesc.hello.library.http.exception;

import leavesc.hello.library.http.config.HttpCode;
import leavesc.hello.library.http.exception.base.BaseException;

/**
 * 作者：leavesC
 * 时间：2018/10/27 8:11
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class AccountInvalidException extends BaseException {

    public AccountInvalidException() {
        super(HttpCode.CODE_ACCOUNT_INVALID, "账号或者密码错误");
    }

}
