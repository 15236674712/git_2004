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
    }

}
