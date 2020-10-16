package com.baizhi.git_2004;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitTests {

    @Test
    public void contextLoads() {
        System.out.println("=====");
        System.out.println("=====");
    }

    @Test
    public void testDev() {
        System.out.println("dev");
        System.out.println("==dev===");
        System.out.println("==dev3===");

        int a = 10;
        int b = 20;
        String str = "lalal";
        String aaa="hehehe";

        int bbb = 20;
        int ccc = 30;
        bbb = bbb + ccc;

        String[] aasd = {"2", "3", "6"};
        for (int i = 0; i < aasd.length; i++) {
            String s = aasd[i];
            System.out.println(s);
        }
        System.out.println(bbb);

    }

}
