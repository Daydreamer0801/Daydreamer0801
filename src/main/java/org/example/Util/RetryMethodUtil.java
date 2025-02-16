package org.example.Util;

public class RetryMethodUtil {
    public static <T> T retry (int count, Runner<T> runner) throws Exception {
        Exception exception = null;
        for (int i = 0; i < count; i++) {
            try {
                return runner.execute();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                exception = e;
            }
        }
        if (exception == null) {
            throw new Exception("exception is null");
        }
        throw exception;
    }

    public interface Runner<T> {
        T execute();
    }
}
