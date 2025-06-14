package automation.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BateTest {

  protected static WebDriver driver;
  private static final String URL_BASE = "https://www.google.com/?hl=pt-BR";
  private static final String CAMINHO_DRIVE = "src/test/java/automation/resource/chromedriver";

  @BeforeAll
  public static void iniciar() {
    System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVE);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(URL_BASE);
  }

  @AfterAll
  public static void finalizar() {
    driver.quit();
  }
}
