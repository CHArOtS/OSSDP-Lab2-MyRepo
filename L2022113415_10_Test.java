import org.junit.Assert;
import org.junit.Test;

public class L2022113415_10_Test {

    private final Solution10 solution = new Solution10();//这么牛逼兄弟

    // 无整数，无负数，一个数字
    @Test
    public void testNoIntegerNoNegativeOneNumber() {
        String expression = "3/4";
        String expected = "3/4";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 无整数，无负数，两个数字
    @Test
    public void testNoIntegerNoNegativeTwoNumbers() {
        String expression = "1/3+1/4";
        String expected = "7/12";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 无整数，无负数，多个数字
    @Test
    public void testNoIntegerNoNegativeMultipleNumbers() {
        String expression = "1/3+1/4+1/6";
        String expected = "3/4";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 有整数（分母为1），无负数，一个数字
    @Test
    public void testWithIntegerNoNegativeOneNumber() {
        String expression = "2/1";
        String expected = "2/1";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 有整数（分母为1），无负数，两个数字
    @Test
    public void testWithIntegerNoNegativeTwoNumbers() {
        String expression = "2/1+1/3";
        String expected = "7/3";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 有整数（分母为1），无负数，多个数字
    @Test
    public void testWithIntegerNoNegativeMultipleNumbers() {
        String expression = "2/1+1/3+1/4";
        String expected = "31/12";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 纯整数（分母为1），无负数，两个数字
    @Test
    public void testPureIntegerNoNegativeTwoNumbers() {
        String expression = "2/1+3/1";
        String expected = "5/1";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 纯整数（分母为1），无负数，多个数字
    @Test
    public void testPureIntegerNoNegativeMultipleNumbers() {
        String expression = "2/1+1/1+4/1";
        String expected = "7/1";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 无整数，有负数，一个数字
    @Test
    public void testNoIntegerWithNegativeOneNumber() {
        String expression = "-1/3";
        String expected = "-1/3";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 无整数，有负数，两个数字
    @Test
    public void testNoIntegerWithNegativeTwoNumbers() {
        String expression = "1/3-1/4";
        String expected = "1/12";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 无整数，有负数，多个数字
    @Test
    public void testNoIntegerWithNegativeMultipleNumbers() {
        String expression = "-1/3-1/4+5/6";
        String expected = "1/4";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 有整数（分母为1），有负数，一个数字
    @Test
    public void testWithIntegerWithNegativeOneNumber() {
        String expression = "-7/1";
        String expected = "-7/1";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 有整数（分母为1），有负数，两个数字
    @Test
    public void testWithIntegerWithNegativeTwoNumbers() {
        String expression = "2/1-7/2";
        String expected = "-3/2";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 有整数（分母为1），有负数，多个数字
    @Test
    public void testWithIntegerWithNegativeMultipleNumbers() {
        String expression = "-2/1+10/9+1/4-1/6";
        String expected = "-29/36";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 纯整数（分母为1），有负数，两个数字
    @Test
    public void testPureIntegerWithNegativeTwoNumbers() {
        String expression = "-2/1+2/1";
        String expected = "0/1";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 纯整数（分母为1），有负数，多个数字
    @Test
    public void testPureIntegerWithNegativeMultipleNumbers() {
        String expression = "-2/1+2/1+5/1";
        String expected = "5/1";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 无整数，纯负数，一个数字（重叠的测试空间）
    @Test
    public void testNoIntegerPureNegativeOneNumber() {
        String expression = "-2/3";
        String expected = "-2/3";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 无整数，纯负数，两个数字
    @Test
    public void testNoIntegerPureNegativeTwoNumbers() {
        String expression = "-1/3-1/4";
        String expected = "-7/12";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 无整数，纯负数，多个数字
    @Test
    public void testNoIntegerPureNegativeMultipleNumbers() {
        String expression = "-1/3-1/4-1/6";
        String expected = "-3/4";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 有整数（分母为1），纯负数，一个数字（重复的测试空间）
    @Test
    public void testWithIntegerPureNegativeOneNumber() {
        String expression = "-2/1";
        String expected = "-2/1";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 有整数（分母为1），纯负数，两个数字
    @Test
    public void testWithIntegerPureNegativeTwoNumbers() {
        String expression = "-2/1-1/3";
        String expected = "-7/3";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 有整数（分母为1），纯负数，多个数字
    @Test
    public void testWithIntegerPureNegativeMultipleNumbers() {
        String expression = "-2/1-1/3-1/4-1/6";
        String expected = "-11/4";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 纯整数（分母为1），纯负数，两个数字
    @Test
    public void testPureIntegerPureNegativeTwoNumbers() {
        String expression = "-3/1-2/1";
        String expected = "-5/1";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    // 纯整数（分母为1），纯负数，多个数字
    @Test
    public void testPureIntegerPureNegativeMultipleNumbers() {
        String expression = "-3/1-2/1-7/1";
        String expected = "-12/1";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

}
