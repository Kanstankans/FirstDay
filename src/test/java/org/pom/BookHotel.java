package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends LibGlobalCommon {
	public BookHotel() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="first_name")
	private WebElement fstName;
	@FindBy(id="last_name")
	private WebElement lstName;
	@FindBy(id="address")
	private WebElement addrre;
	@FindBy(id="cc_num")
	private WebElement cno;
	@FindBy(id="cc_type")
	private WebElement cty;
	@FindBy(id="cc_exp_month")
	private WebElement cmon;
	@FindBy(id="cc_exp_year")
	private WebElement cyr;
	@FindBy(id="cc_cvv")
	private WebElement ccvv;
	@FindBy(id="book_now")
	private WebElement btncli;
	public WebElement getFstName() {
		return fstName;
	}
	public WebElement getLstName() {
		return lstName;
	}
	public WebElement getAddrre() {
		return addrre;
	}
	public WebElement getCno() {
		return cno;
	}
	public WebElement getCty() {
		return cty;
	}
	public WebElement getCmon() {
		return cmon;
	}
	public WebElement getCyr() {
		return cyr;
	}
	public WebElement getCcvv() {
		return ccvv;
	}
	public WebElement getBtncli() {
		return btncli;
	}
	public void BokHotel(String first_name,String last_name,String  address,String cc_num,String cc_type,String cc_exp_month,String cc_exp_year,String  cc_cvv) {
		type(getFstName(),first_name );
		type(getLstName(),last_name);
		type(getAddrre(), address);
		type(getCno(), cc_num);
		dropDownVisibleText(getCty(),cc_type );
		dropDownVisibleText(getCmon(), cc_exp_month);
		dropDownVisibleText(getCyr(), cc_exp_year);
		type(getCcvv(), cc_cvv);
		click(getBtncli());
	}
	
}
