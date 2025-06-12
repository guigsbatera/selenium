package automation.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTes {
  private WebDriver driver;
  private final String URL_BASE = "https://www.google.com/?hl=pt-BR";
  private final String CAMINHO_DRIVE = "src/test/java/automation/resource/chromedriver";

  private void iniciar() {
    System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVE);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(URL_BASE);
  }

  @Test
  public void acessarGoogle() {
    iniciar();

    WebElement inputPesquisa = driver.findElement(By.id("APjFqb"));
    inputPesquisa.sendKeys("Corinthians" + Keys.ENTER);
  }
}
