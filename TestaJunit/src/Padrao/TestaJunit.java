package Padrao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

public class TestaJunit {
@Test
	public void teste() {
	System.setProperty("webdriver.chrome.driver", "C:/Users/monke/Desktop/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("http://10.10.38.170:8080/IASS/login");
	WebElement element = driver.findElement(By.name("usuario.login"));
	element.sendKeys("admin");
	element = driver.findElement(By.name("usuario.senha"));
	element.sendKeys("@dmin321");
	driver.findElement(By.className("btn")).click();
	driver.navigate().to("http://10.10.38.170:8080/IASS/especialidade");
	
	driver.findElement(By.name("e.descricao")).sendKeys("Ginocologista");
	driver.findElement(By.name("e.limiteConsulta")).sendKeys("50");
	Select selectFerias = new Select(driver.findElement(By.name("e.sexo")));
	selectFerias.selectByVisibleText("Ambos");
	driver.findElement(By.name("e.limiteConsExt")).sendKeys("10");
	driver.findElement(By.name("e.limiteConsInt1")).sendKeys("10");
	driver.findElement(By.name("e.valorCons1")).sendKeys("500");
	driver.findElement(By.name("e.limiteConsInt2")).sendKeys("10");
	driver.findElement(By.name("e.valorCons2")).sendKeys("500");
	driver.findElement(By.name("e.limiteConsInt3")).sendKeys("10");
	driver.findElement(By.name("e.valorCons3")).sendKeys("500");
	driver.findElement(By.name("e.limiteConsInt4")).sendKeys("10");
	driver.findElement(By.name("e.valorCons4")).sendKeys("500");
	driver.findElement(By.name("e.valorCons4")).sendKeys(Keys.ENTER);
	boolean resultado = driver.getPageSource().contains("Cadastro efetuado com suesso!");
	assertFalse(resultado);
	driver.close();
		

	}

}
