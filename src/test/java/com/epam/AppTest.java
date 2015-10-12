package test.java.com.epam;

import main.java.com.epam.App;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{

    double delta = 0;

    @Test
    public void sum(){
        double res1 = App.calculate(7,2,'+');
        double res2 = 7+2;
        Assert.assertEquals(res1,res2,delta);
    }

    @Test
    public void sub(){
        double res1 = App.calculate(7,2,'-');
        double res2 = 7-2;
        Assert.assertEquals(res1,res2,delta);
    }

    @Test
    public void mul(){
        double res1 = App.calculate(7,2,'*');
        double res2 = 7*2;
        Assert.assertEquals(res1,res2,delta);
    }

    @Test
    public void dev(){
        double res1 = App.calculate(7,2,'/');
        double res2 = 3.5;
        Assert.assertEquals(res1,res2,delta);
    }

    @Test
    public void mulZero(){
        double res1 = App.calculate(7,0,'*');
        double res2 = 0;
        Assert.assertEquals(res1,res2,delta);
    }

    @Test
    public void devZero(){
        double res1 = App.calculate(7,0,'/');
        double res2 = 997;
        Assert.assertEquals(res1, res2,delta);
    }

}

