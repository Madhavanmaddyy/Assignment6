package week4.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox {
	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node0297llw43prfo1hkr9eef8nsf102385.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-fw pi-check-square layout-menuitem-icon'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click(); 
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[6]")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
		boolean enabled = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).isSelected();
	    System.out.println(enabled);
	    driver.close();
	}

}

