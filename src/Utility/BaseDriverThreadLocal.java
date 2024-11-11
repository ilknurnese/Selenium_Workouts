package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriverThreadLocal {

    //final anahtar kelimesi burada, driver değişkeninin
    // başka bir ThreadLocal nesnesine yeniden atanamayacağını garanti eder,
    // bu da kodun okunabilirliği ve güvenliği için iyidir.
    //
    //driver değişkeninin ThreadLocal<WebDriver> nesnesine
    // her zaman aynı referansı tutması amaçlandığından,
    // bu değişkene final eklemek iyi bir yaklaşımdır.
    // Yani, ThreadLocal nesnesi sadece bir kere oluşturulur ve aynı kalır.


    //    If you plan to run tests in parallel,
//    it’s better to create independent WebDriver instances for each test
//    instead of using a static WebDriver.
//    You can achieve this by using ThreadLocal,
//    which allows each test to have its own WebDriver instance.
//
//    With ThreadLocal<WebDriver>,
//    each test class or test method gets its own isolated WebDriver instance.
//    This ensures that tests are independent of each other.
//    In parallel tests, each thread has its own WebDriver instance,
//    avoiding any conflicts or dependency issues.

//    The final keyword in this context ensures that
//    the driver variable will not be reassigned to a different ThreadLocal instance.
//    This improves code readability and safety,
//    as it guarantees the driver reference will always point to the same ThreadLocal instance
//    throughout the application’s lifecycle.
//
//    Since the driver variable is intended to hold a single ThreadLocal<WebDriver> instance,
//    it’s good practice to mark it as final.

        private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

        public static void setup() {
            if (driver.get() == null) {
                WebDriver webDriver = new ChromeDriver();
                webDriver.manage().window().maximize();
                webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
                webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                driver.set(webDriver); // ThreadLocal içine WebDriver koy
            }
        }

        public static WebDriver getDriver() {
            return driver.get(); // Thread'e özgü WebDriver döndür
        }

        public static void tearDown() {
            if (driver.get() != null) {
                MyFunc.Bekle(3); // Gerekirse bekleme süresini ayarlayın
                driver.get().quit();
                driver.remove(); // ThreadLocal'den WebDriver'ı kaldır
            }
        }
    }


