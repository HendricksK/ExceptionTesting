/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.exceptiontesting;



/**
 *
 * @author kurvin
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import cputgroup3a.exceptiontesting.service.ExceptionTestingService;
import cputgroup3a.exceptiontesting.service.Impl.ExceptionTestingServiceImpl;
import cputgroup3a.exceptiontesting.configuration.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class ExceptionTestingTest {
    
    public ExceptionTestingTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    public static ExceptionTestingService ts;
    
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void empty() throws Exception{
            int []array = new int[1];
            array[0] = ts.calculate(123);
            array[1] = ts.calculate(800);
    }
        
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ts = (ExceptionTestingService) ctx.getBean("ET");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
