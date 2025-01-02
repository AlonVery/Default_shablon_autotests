

[Downloads | Selenium](https://www.selenium.dev/downloads/) - 
Устанавливаем селениум - импортим в разделе Project structure - libraries - dependencies

[Chrome for Testing availability](https://googlechromelabs.github.io/chrome-for-testing/) - 
Тут можно скачать как драйвер так и сам хром для авто тестирования относительно версии драйвера.

Устанавливаем хром.
Устанавливаем chromeDriver распаковываем. Дописываем в идею идентификацию драйвера.

В настройку gradle добавляем в dependencies
```
implementation 'org.seleniumhq.selenium:selenium-java:4.27.0' // Замените на актуальную версию
```
Устанавливаем плагин Test Automation
Запускаем билд gradle.

В итоге получается в Main.java:
```
package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stepka\\Desktop\\chromedriver-win64\\chromedriver.exe"); // вставляем ссылку положения драйвера
        WebDriver webdriver = new ChromeDriver();
    }
}
```
Можно еще забилдить gradle файл - ``` ./gradlew build```  
и если после билда ошибок не возникнет, то запуск дальше

Итогом запускаем Main класс, после должен открыться без ошибок хром.