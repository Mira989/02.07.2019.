package main;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.fill_out_form.AutoDelete;
import page.fill_out_form.AutoLogIn;
import page.fill_out_form.AutoPost;
import page.fill_out_form.AutoReg;
import page.fill_out_form.ManualEdit;
import page.fill_out_form.ManualLogIn;
import page.fill_out_form.ManualPost;
import page.fill_out_form.ManualReg;
import page.objects.HomePage;
import page.tests.TestHomePage;


public class Start {

	public static void main(String[] args) throws Exception {
		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//dr.manage().window().maximize();
		Thread.sleep(2000);
		
		HomePage.openHomePage(dr);
		try {
			Scanner sc = new Scanner(System.in);
			//REGISTRATION Choose between manually and automation
		/*	System.out.println("Choose your way to register: Manually=1 or Auto=2");
			Scanner sc = new Scanner(System.in);
			int reg = sc.nextInt();
			
			if (reg==1)ManualReg.registration(dr);
			else if (reg==2)AutoReg.allDataRegistration(dr);
			else System.out.println("You have choose the wrong number.");*/
			
			//LOGIN Choose between manually and automation
			System.out.println("Choose your way to login: Manually=1 or Auto=2");
			int log = sc.nextInt();
			
			if (log==1)ManualLogIn.logIn(dr);
			else if (log==2)AutoLogIn.allDataLogIn(dr);
			else System.out.println("You have choose the wrong number.");
			
			//POST Choose between manually and automation
			System.out.println("Choose your way to post: Manually=1 or Auto=2");
			int post = sc.nextInt();
			
			if (post==1)ManualPost.post(dr);
			else if (post==2)AutoPost.allDataPost(dr);
			else System.out.println("You have choose the wrong number.");
			
			//DELETE first two posts
			AutoDelete.delete(dr, 0);
			//AutoDelete.delete(dr, 1);
			
			//EDIT first post
			ManualEdit.editPost(dr, 1);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		dr.quit();
	}
}


