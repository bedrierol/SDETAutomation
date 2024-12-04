package lesson2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class HomeworkSeleniumBrowserNavigation {
    public static void main(String[] args) {
        // Tarayıcı sürücüsünü başlat
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Pencerenin boyutunu ayarla
            driver.manage().window().setSize(new Dimension(300, 500));
            System.out.println("Pencere boyutu ayarlandı: 300x500");

            // 2. Pencerenin pozisyonunu ayarla
            driver.manage().window().setPosition(new Point(100, 400));
            System.out.println("Pencere pozisyonu ayarlandı: (100, 400)");

            // 3. İlk URL'yi aç
            driver.get("https://www.orioninc.com/");
            String firstPageTitle = driver.getTitle();
            System.out.println("İlk sayfa başlığı: " + firstPageTitle);


            // 4. Sayfayı https://www.amazon.com/'a yönlendir
            driver.navigate().to("https://www.amazon.com/");

            // 5. Geri navigasyon yap ve URL'yi yazdır
            driver.navigate().back();
            System.out.println("Geri Dönülen URL: " + driver.getCurrentUrl());

            // 6. İleri navigasyon yap
            driver.navigate().forward();

            // 7. Yeni sekme aç, Google sayfasını yükle ve kaynak kodu yazdır
            ((ChromeDriver) driver).executeScript("window.open('https://www.google.com', '_blank');");
            Set<String> windowHandles = driver.getWindowHandles();
            String lastTab = windowHandles.toArray()[windowHandles.size() - 1].toString();
            driver.switchTo().window(lastTab);
            System.out.println("Google Sayfa Kaynak Kodu: " + driver.getPageSource());

            // 8. İlk sekmeye geri dön ve URL'yi yazdır
            String firstTab = windowHandles.toArray()[0].toString();
            driver.switchTo().window(firstTab);
            System.out.println("İlk Sekmenin URL'si: " + driver.getCurrentUrl());

            // 9. Son sekmeye geç ve sayfayı yenile
            driver.switchTo().window(lastTab);
            driver.navigate().refresh();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 10. Tüm sekmeleri kapat
            driver.quit();
            System.out.println("Tüm sekmeler kapatıldı.");
        }
    }
}
