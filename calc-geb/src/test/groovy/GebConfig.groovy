import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver

environments {

    chrome {
        driver = { new ChromeDriver() }
    }

    firefox {
        driver = { new FirefoxDriver() }
    }
}
