package org.pome;

import org.emp.Test2;
import org.pom.BookHotel;
import org.pom.LibGlobalCommon;
import org.pom.LoginPage;
import org.pom.SearchHotel;
import org.testng.annotations.Test;

public class BookingInfo extends LibGlobalCommon{
	@Test
	public void test1()  {
		
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
	}
		
		@Test
		public void test2() throws InterruptedException
		{
		LoginPage loginpge=new LoginPage();
		loginpge.Login("Kanstankans", "Kanstan2");
		Thread.sleep(7000);
		}
		
		@Test
		
		private void test3() {
			SearchHotel srchtl=new SearchHotel();
			srchtl.srchHotel("Sydney", "Hotel Sunshine", "Double", "1 - One", "1 - One", "1-One");

		}
		
		@Test
		private void test4() {
			BookHotel bokhtl=new BookHotel();
			bokhtl.BokHotel("Kanstan", "Kans", "Rameswaram", "4920147820158295", "VISA", "November", "2021", "3961");

		}
		
		
	}

	


