import org.junit.*;


public class MassTestAdd {

    static СheckArray сheckArray;
    static String text1 = "Отсутствует единица или четверка";

    @BeforeClass
    public static void init() {
        сheckArray = new СheckArray();
        System.out.println("@BeforeClass");
    }

    @Test
    public void test1() {
        int[] arr = {2, 6, 3, 3, 6, 3, 3, 2, 4};
        Assert.assertFalse(text1, сheckArray.oneFour(arr));

    }

    @Test
    public void test2() {
        int[] arr = {2, 2, 5, 3, 2, 6, 3, 2, 1};
        Assert.assertFalse(text1, сheckArray.oneFour(arr));

    }

    @Test
    public void test3() {
        int[] arrIn = {2, 2, 4, 4, 2, 6, 3, 2, 1};
        int[] arrOut = {2, 6, 3, 2, 1};

        Assert.assertArrayEquals(arrOut, сheckArray.nextFour(arrIn));

    }

    @Test
    public void test4() {
        int[] arrIn = {2, 2, 4, 3, 2, 6, 3, 2, 1};
        int[] arrOut = {3, 2, 6, 3, 2, 1};
        Assert.assertArrayEquals(arrOut, сheckArray.nextFour(arrIn));

    }

    @Test
    public void test5() {
        int[] arrIn = {2, 2, 4, 3, 2, 6, 4, 2, 1};
        int[] arrOut = {2, 1};
        Assert.assertArrayEquals(arrOut, сheckArray.nextFour(arrIn));

    }

    @Test
    public void test6() {
        int[] arrIn = {2, 2, 1, 3, 2, 6, 3, 2, 1};
        int[] arrOut = {2, 1};
        Assert.assertArrayEquals(arrOut, сheckArray.nextFour(arrIn));

    }

}
