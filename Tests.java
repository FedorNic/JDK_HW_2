package Code.Junior.Home_work.HW_2;

public class Tests {

    @MyTestAnnotation(order = 5)
    public static void thirdTest() {
        System.out.println("thirdTest запущен");
    }

    @MyTestAnnotation(order = -2)
    public static void firstTest() {
        System.out.println("firstTest запущен");
    }

    @MyTestAnnotation(order = 10)
    @Skip
    public static void skipTest() {
        System.out.println("skipTest запущен");
    }

    @MyTestAnnotation
    public static void secondTest() {
        System.out.println("secondTest запущен");
    }

    @BeforeEach
    public static void beforeEachTest() {
        System.out.println("beforeEachTest запущен");
    }

    @AfterEach
    public static void afterEachTest() {
        System.out.println("afterEachTest запущен");
    }

    @BeforeEach
    public static void beforeEachTestTwo() {
        System.out.println("beforeEachTestTwo запущен");
    }
}