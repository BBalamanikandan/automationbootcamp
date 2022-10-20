package org.sample.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.List;

public class SupplierActiveFacilities {
    static WebDriver wb;

    public static void main(String[] args) {
        try {
            WebDriverManager.chromedriver().setup();
            wb = new ChromeDriver();
            wb.manage().window().maximize();
            wb.navigate().to("https://adidas.trustrace.biz");
            wb.findElement(By.xpath("//*[@type='email']")).sendKeys("ttuser@uatadidasgroup.com");
            wb.findElement(By.xpath("//*[@type='password']")).sendKeys("TT@brand001");
            wb.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
            Thread.sleep(3000);
            wb.findElement(By.xpath("//div[contains(text(),'Supplier')]")).click();
            Thread.sleep(3000);
            wb.findElement(By.xpath("//*[contains(text(),'Reset')]")).click();
            Thread.sleep(3000);
            short sup_count = Short.parseShort(wb.findElement(By.className("font-bold")).getText());
            System.out.println(sup_count+" suppliers are active in BIZ domain right now...");

            List<WebElement> supNames = wb.findElements(By.xpath("//*[@class='supplier-title']/a"));

            if(sup_count==supNames.size()) {
                for (int i = 0; i <sup_count; i++) {
                    Thread.sleep(3000);

                    String supCompanyName = wb.findElement(By.xpath("(//*[@class='supplier-title']/a)["+(i+1)+"]")).getText();
                    wb.findElement(By.xpath("//*[@type='text']")).sendKeys(supCompanyName + Keys.ENTER);
                    Thread.sleep(3000);
                    String sup_Company_Name =wb.findElement(By.xpath("(//*[@class='supplier-title']/a)["+(i+1)+"]")).getText();


                    if (sup_Company_Name.trim().equals(supCompanyName)) {
                        short facCount = Short.parseShort(wb.findElement(By.xpath("//*[contains(text(),'Facilities')]/span")).getText());
                        System.out.println("Supplier Code : " + supCompanyName + "\nAssociated Facilities Shown in supplier's card view is " + facCount);
                        wb.findElement(By.xpath("(//*[@class='supplier-title']/a)["+(i+1)+"]")).click();
                        Thread.sleep(3000);
                        String facCnt = wb.findElement(By.xpath("//span[contains(text(),'FAC')]")).getText();
                        //System.out.println("facilities text inside profile view: "+facCnt);
                        String[] fac = facCnt.split(" ");
                        //System.out.println("extracted facility count from text :"+fac[1]);
                        short facCount2 = Short.parseShort(fac[1].substring(1, fac[1].length() - 1));
                        System.out.println("Associated Facilities Shown inside supplier's company view is " + facCount2);
                        if (facCount == facCount2)
                            System.out.println("Number Facilities Association Matched between Card View and Profile View");
                        else
                            System.out.println("Number Facilities Association Mismatched!!!\nCard View: " + facCnt + "\nProfile View:" + facCount2);

                    } else {
                        System.out.println("Vendor code mismatched btw card view and profile view...\n" + supCompanyName + "\n" + wb.findElement(By.xpath("(//*[@class='supplier-title']/a)["+(i+1)+"]")).getText());
                    }
                    wb.findElement(By.xpath("//*[contains(text(),'Back')]")).click();
                    Thread.sleep(3000);
                    wb.findElement(By.xpath("//*[@type='text']")).clear();
                    Thread.sleep(3000);
                    wb.findElement(By.xpath("//*[contains(text(),'Reset')]")).click();
                    Thread.sleep(3000);
                }
            }else{
                System.out.println("Total number suppliers count and elements count doesn't match\nUI count:"+sup_count+"\tElements Count:"+supNames.size());
            }
        }catch (Exception e){
             System.out.println("Exception Raised : "+e.getMessage());
        }finally {
            wb.quit();
            wb=null;
        }

    }

}
