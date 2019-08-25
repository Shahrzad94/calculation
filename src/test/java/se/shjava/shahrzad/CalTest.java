package se.shjava.shahrzad;

import org.junit.Assert;
import org.junit.Test;

public class CalTest {


@Test
    public void test_addition_show_correct_result() {

        double number1=5;
        double number2=6;

        double correctResult= 11;

        double result= Calculation.addition(number1, number2);

        Assert.assertEquals(correctResult, result, 0);
    }

    public void test_subtraction_show_correct_result() {

        double number1= 10.5;
        double number2= 2.5;

        double correctResult= 8;

        double result= Calculation.subtraction(number1, number2);

        Assert.assertEquals(correctResult, result,0);

    }

    public void test_division_show_correct_result() {

        double number1= 25;
        double number2= 5;

        double correctResult= 5;

        double result= Calculation.subtraction(number1, number2);

        Assert.assertEquals(correctResult, result,0);}

    public void test_multipls_show_correct_result() {

        double number1= 10;
        double number2= 2.5;

        double correctResult= 25;

        double result= Calculation.subtraction(number1, number2);

        Assert.assertEquals(correctResult, result,0);

    }

}


