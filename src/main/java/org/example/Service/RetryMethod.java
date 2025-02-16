package org.example.Service;

import org.example.Pojo.People;

public class RetryMethod {
    private static  int count = 0;

    public String throwExceptionMethod() throws Exception{
        People people = new People();
        people.setAge(123);
        people.setSex("男");
        people.setName("李四");
        count++;
        if (count != 3) {
            throw new RuntimeException("test");
        }
        return people.toString();
    }
}
