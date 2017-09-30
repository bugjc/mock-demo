package com.junit4;

import org.junit.*;

public class Junit4Learning {

    /**
     * 最先执行的类全局方法
     */
    @BeforeClass
    public static void globalInit() {
        System.out.println("global Init invoked!");
    }

    /**
     * 最后执行的类全局方法
     */
    @AfterClass
    public static void globalDestroy() {
        System.out.println("global Destroy invoked!");
    }


    @Before
    public void testBefore(){
        System.out.println("testBefore");
    }

    @After
    public void testAfter(){
        System.out.println("testAfter");
    }

    /**
     * 示例1：测试方法
     */
    @Test
    public void test() {
        System.out.println(" This is a test method ");
    }

    /**
     * 示例二：2秒之后关闭测试方法--超时测试
     * @throws InterruptedException
     */
    @Ignore
    @Test(timeout=2000)
    public void testTimeout() throws InterruptedException {
        while(true) {
            Thread.sleep(1000);
            System.out.println("run forever...");
        }
    }

    /**
     * 示例二：程序运行抛出InterruptedException异常则测试通过
     * @throws InterruptedException
     */
    @Test(expected = InterruptedException.class)
    public void testExpected() throws Exception {
        throw new InterruptedException();
    }

}
