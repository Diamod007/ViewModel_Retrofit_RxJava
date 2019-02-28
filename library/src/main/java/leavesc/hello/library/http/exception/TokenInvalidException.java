package leavesc.hello.library.http.exception;

import leavesc.hello.library.http.config.HttpCode;
import leavesc.hello.library.http.exception.base.BaseException;

/**
 * 作者：leavesC
 * 时间：2018/10/25 21:37
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class TokenInvalidException extends BaseException {

    public TokenInvalidException() {
        super(HttpCode.CODE_TOKEN_INVALID, "Token失效");
    }

}
