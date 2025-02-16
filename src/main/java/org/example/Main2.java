package org.example;

import org.example.Service.RetryMethod;
import org.example.Util.RetryMethodUtil;

public class Main2 {
    public static void main(String[] args) throws Exception{
        RetryMethod retryMethod = new RetryMethod();
        String retry = RetryMethodUtil.retry(9, () -> {
            try {
                return retryMethod.throwExceptionMethod();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(retry);
    }
}
