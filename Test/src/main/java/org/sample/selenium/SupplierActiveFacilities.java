package org.sample.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class SupplierActiveFacilities {
    static WebDriver wb;
    static LocalTime start,end;

    static short sup_count,successRate;

    static List<String> failedCompanies;

    static void waitM(long x) throws InterruptedException {
        Thread.sleep(x);
    }
    public static void main(String[] args) {
        try {
            start=LocalTime.now();
            WebDriverManager.chromedriver().setup();
            wb = new ChromeDriver();
            wb.manage().window().maximize();
            wb.navigate().to("https://adidas.trustrace.biz");
            wb.findElement(By.xpath("//*[@type='email']")).sendKeys("ttuser@uatadidasgroup.com");
            wb.findElement(By.xpath("//*[@type='password']")).sendKeys("TT@brand001");
            wb.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
            waitM(2000);
            wb.findElement(By.xpath("//div[contains(text(),'Supplier')]")).click();
            waitM(2000);
            wb.findElement(By.xpath("//*[contains(text(),'Reset')]")).click();
            waitM(1000);
            sup_count = Short.parseShort(wb.findElement(By.className("font-bold")).getText());
            System.out.println(sup_count+" suppliers are active in BIZ domain right now...");

            List<WebElement> supNames = wb.findElements(By.xpath("//*[@class='supplier-title']/a"));
            failedCompanies=new ArrayList<>();

            if(sup_count==supNames.size()) {
               for (int i = 0; i <sup_count; i++) {
                    System.out.println("\n-------------------------$$$$$$$$$$$$$$$$$----------------------");
                   waitM(1000);

                    String supCompanyName = wb.findElement(By.xpath("(//*[@class='supplier-title']/a)["+(i+1)+"]")).getText();
                   waitM(1500);
                   short facCount=0;
                   try {
                       facCount = Short.parseShort(wb.findElement(By.xpath("(//*[contains(text(),'Facilities')]/span)[" + (i + 1) + "]")).getText());
                   }catch (NoSuchElementException e){
                       if(wb.findElement(By.xpath("(//*[contains(text(),'Facilities')]/span)[" + (i + 1) + "]")).isDisplayed())
                        facCount = Short.parseShort(wb.findElement(By.xpath("(//*[contains(text(),'Facilities')]/span)[" + (i + 1) + "]")).getText());
                   }catch (NumberFormatException e){

                       if(!(wb.findElement(By.xpath("(//*[contains(text(),'Facilities')]/span)[" + (i + 1) + "]")).getText().contains("None") || wb.findElement(By.xpath("(//*[contains(text(),'Facilities')]/span)[" + (i + 1) + "]")).getText().isEmpty() || wb.findElement(By.xpath("(//*[contains(text(),'Facilities')]/span)[" + (i + 1) + "]")).getText().isBlank()))
                           facCount = Short.parseShort(wb.findElement(By.xpath("(//*[contains(text(),'Facilities')]/span)[" + (i + 1) + "]")).getText());
                   }
                    System.out.println("Supplier's Company Name : " + supCompanyName + "\nAssociated Facilities Shown in supplier's card view is " + facCount);
                    wb.findElement(By.xpath("(//*[@class='supplier-title']/a)["+(i+1)+"]")).click();
                    waitM(4000);
                    String facCnt = wb.findElement(By.xpath("//span[contains(text(),'FAC')]")).getText();
                    //System.out.println("facilities text inside profile view: "+facCnt);
                    String[] fac = facCnt.split(" ");
                    //System.out.println("extracted facility count from text :"+fac[1]);
                    short facCount2 = Short.parseShort(fac[1].substring(1, fac[1].length() - 1));
                    System.out.println("Associated Facilities Shown inside supplier's company view is " + facCount2);

                        if (facCount == facCount2) {
                            System.out.println("Number Facilities Association Matched between Card View and Profile View");
                            successRate += 1;
                        } else {
                            System.out.println("Number Facilities Association Mismatched!!!\nCard View: " + facCount + "\nProfile View:" + facCount2);
                            failedCompanies.add(supCompanyName);
                        }
                    wb.findElement(By.xpath("//*[contains(text(),'Back')]")).click();
                    waitM(1000);
                    wb.findElement(By.xpath("//*[contains(text(),'Reset')]")).click();
                    waitM(1000);
               }

                wb.quit();
                wb=null;
                end=LocalTime.now();
                System.out.println("\n\n-----------------------$$----------------------\nExecution started at "+start);
                System.out.println("Execution completed at "+end);
                System.out.println("\n Out of "+sup_count+" suppliers "+successRate+" supplier-facilities association verification passed. \nTime taken for this verification to complete "+start.until(end, ChronoUnit.SECONDS)+" Seconds");
                System.out.println("\n\n Supplier-Facilities Association Mismatched company names as follows...");

                short temp=0;
                for (String s:failedCompanies)
                    System.out.println(++temp+". "+s);

            }else{
                System.out.println("Total number suppliers count and elements count doesn't match\nUI count:"+sup_count+"\tElements Count:"+supNames.size());
            }
        }catch (Exception e) {
            System.out.println("Exception Raised : " + e);
        }
    }

}
