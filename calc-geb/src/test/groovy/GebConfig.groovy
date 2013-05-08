import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver

driver = { new FirefoxDriver() }

environments {

    // grails -Dgeb.env=chrome test-app
    chrome {
        driver = { new ChromeDriver() }
    }

    // grails -Dgeb.env=firefox test-app
    firefox {
        driver = { new FirefoxDriver() }
    }
}