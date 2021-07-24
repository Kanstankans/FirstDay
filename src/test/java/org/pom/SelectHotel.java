package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobalCommon {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Submit")
	private WebElement btnClick;
	@FindBy(id="radiobutton_0")
	private WebElement btnClick1;
	@FindBy(id="continue")
	private WebElement btnClick2;
	public WebElement getBtnClick() {
		return btnClick;
	}
	public WebElement getBtnClick1() {
		return btnClick1;
	}
	public WebElement getBtnClick2() {
		return btnClick2;
	}
	public void SelHotel() {
		click(getBtnClick());
		click(getBtnClick1());
		click(getBtnClick2());
	}

}
