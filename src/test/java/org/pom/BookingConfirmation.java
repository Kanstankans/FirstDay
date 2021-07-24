package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends LibGlobalCommon {
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "order_no")
	private WebElement orderno;
	@FindBy(id = "my_itinerary")
	private WebElement itiner;

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getItiner() {
		return itiner;
	}

	public void BookConfirm() {
		getvalue(getOrderno());
		click(getItiner());
		
		

	}

}
