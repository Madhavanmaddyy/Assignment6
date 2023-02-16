package week4.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class TextBox {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://leafground.com/select.xhtml;jsessionid=node0297llw43prfo1hkr9eef8nsf102385.node0");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
	 driver.findElement(By.xpath("//span[text()='Text Box']")).click();
     driver.findElement(By.xpath("//input[@name='j_idt88:name']")).sendKeys("Madhavan");
     driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']")).clear();
     driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']")).sendKeys("Mumbai");
     driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("madhavan2401@gmail.com");
     driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']")).clear();
     driver.findElement(By.xpath("//input[@name='j_idt106:j_idt116_input']")).sendKeys("02.04.2001");
     boolean enabled = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt93']")).isEnabled();
     System.out.println(enabled);
     driver.close();

}
}
