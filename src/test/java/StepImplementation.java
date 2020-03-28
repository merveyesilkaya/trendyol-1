import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepImplementation {
    WebDriver driver;
    @BeforeScenario
    public void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TESTINIUM\\IdeaProjects\\trendyol\\libs\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }
    @Step("trendyol'a git")
    public void implementation1() {
        driver.get("https://www.trendyol.com/");

    }
}