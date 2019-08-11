package com.baizhi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GithubDay1ApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("=====1=====");
        System.out.println("=====2=====");
        System.out.println("=====3=====");
        System.out.println("我是小黑");
        System.out.println("我是小黑，我寫了一行");
        System.out.println("我是小白");

    }

    public void TestBanner() {
        int a = 1;
        int b = 2;
        int i = a + b;
        System.out.println(i);
    }

}
