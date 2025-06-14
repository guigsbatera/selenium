package automation.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleTest extends BateTest {

  @Test
  public void acessarGoogle() {

    WebElement inputPesquisa = driver.findElement(By.id("APjFqb"));
    inputPesquisa.sendKeys("Corinthians" + Keys.ENTER);

    // Exemplo de asserção
    // String resultado = driver.findElement(By.id("result-stats")).getText();
    // assertTrue(resultado, resultado.contains("Aproximadamente"));
  }
}
