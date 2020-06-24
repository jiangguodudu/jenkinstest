 package com.lujiatao.jenkinstest;
 
 import org.testng.Assert;
 import org.testng.annotations.Test;

 /**
 * @author Administrator
 * @date 2020/06/24
 */
public class JenkinsTest {
    
    @Test
    public void testCase1() {
        Assert.assertEquals(100, 100);
    }
    
    @Test
    public void testCase2() {
        Assert.assertEquals("1000", "1000");
    }
    
    @Test
    public void testCase3() {
        Assert.assertEquals(100, 99);
    }

}
