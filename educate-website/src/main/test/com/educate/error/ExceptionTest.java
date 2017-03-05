package com.educate.error;

import org.junit.Test;

/**
 * Created by sun on 2017/3/5.
 */
public class ExceptionTest {

    @Test
    public void ExceptionTest() throws LogicException {
        throw new LogicException(ResultCode.EXCEPTION, "this is test exception", "param1", "param2");
    }
}
