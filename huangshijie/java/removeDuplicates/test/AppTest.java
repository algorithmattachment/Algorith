import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.FromDataPoints;

import javax.sound.midi.Soundbank;
import java.security.acl.LastOwnerException;
import java.util.*;

import static org.junit.Assert.*;

public class AppTest {

    private App app;

    @Before
    public void setUp() {
         app=new App();
    }

    @Test
    public void testremoveDuplicates() {
        int[] a = {1, 2, 2, 1, 4, 1, 4};
        int[] b = {1, 2, 4};
        int a1 = app.removeDuplicates(a);
        int b1 = app.removeDuplicates(b);
        //System.out.println(a1 + "---" + b1);
        Assert.assertEquals(a1, b1);
    }

    @Test
    public void testremoveDuplicates_1() {

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        Random random = new Random();
        int [] a=new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            a[i] = random.nextInt(100000);
        }
        long ram = runtime.freeMemory();//开始时内存
        long time1 = System.nanoTime();//开始的时间
        app.removeDuplicates(a);
        System.out.println((System.nanoTime()-time1)/1000000000);
        System.out.println((ram-runtime.freeMemory())/(1024*1024));
    }
}