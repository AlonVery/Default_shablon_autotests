package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTests {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stepka\\Desktop\\chromedriver-win64\\chromedriver.exe");
        open("https://github.com/");
    }

    public static void open(String url) {
        WebDriver driver = new ChromeDriver();
        try {
            // Откройте веб-страницу
            driver.get(url);

            // Найдите элемент на странице
            WebElement element = driver.findElement(By.id("hero_user_email"));

            // Выполните действия над элементом
            element.sendKeys("Тестовое сообщение");
            element.submit();

            // Получите заголовок страницы
            String title = driver.getTitle();
            System.out.println("Заголовок страницы: " + title);
        } finally {
            // Закройте браузер
            driver.quit();
        }
    };
}
