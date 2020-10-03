import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MaxFinderTest {
    MaxFinder<Integer> maxInt;
    MaxFinder<Float> maxFloat;
    MaxFinder<String> maxString;
    @Before
    public void init(){
        maxInt=new MaxFinder<>();
        maxFloat=new MaxFinder<>();
        maxString=new MaxFinder<>();
    }

    @Test
    public void maxIntegerTest1(){
        Assert.assertThat(8,is(maxInt.findMax(8,3,5)));
    }

    @Test
    public void maIntegerTest2(){
        Assert.assertThat(8,is(maxInt.findMax(3,8,5)));
    }

    @Test
    public void maxIntegerTest3(){
        Assert.assertThat(8,is(maxInt.findMax(3,5,8)));

    }

    @Test
    public void maxFloatTest1(){
        Assert.assertThat(4.9f,is(maxFloat.findMax(4.9f,2.1f,1.0f)));
    }

    @Test
    public void maxFloatTest2(){
        Assert.assertThat(4.9f,is(maxFloat.findMax(2.1f,4.9f,1.0f)));
    }

    @Test
    public void maxFloatTest3(){
        Assert.assertThat(4.9f,is(maxFloat.findMax(2.1f,1.0f,4.9f)));
    }

    @Test
    public void maxStringTest1(){
        Assert.assertThat("c",is(maxString.findMax("a","b","c")));
    }

    @Test
    public void maxStringTest2(){
        Assert.assertThat("c",is(maxString.findMax("b","a","c")));
    }

    @Test
    public void maxStringTest3(){
        Assert.assertThat("d",is(maxString.findMax("b","c","d","a")));
    }
}
