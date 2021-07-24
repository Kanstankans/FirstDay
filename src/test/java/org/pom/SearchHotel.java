package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends LibGlobalCommon {
	public void SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "location")
	private WebElement selLoc;
	@FindBy(id = "hotels")
	private WebElement selHot;
	@FindBy(id = "room_type")
	private WebElement selRoom;
	@FindBy(id = "room_nos")
	private WebElement noRoom;
	@FindBy(id = "adult_room")
	private WebElement adRoom;
	@FindBy(id = "child_room")
	private WebElement chilRoom;

	public WebElement getSelLoc() {
		return selLoc;
	}

	public WebElement getSelHot() {
		return selHot;
	}

	public WebElement getSelRoom() {
		return selRoom;
	}

	public WebElement getNoRoom() {
		return noRoom;
	}

	public WebElement getAdRoom() {
		return adRoom;
	}

	public WebElement getChilRoom() {
		return chilRoom;
	}

	public void srchHotel(String location, String hotels, String room_type, String room_nos, String adult_room,
			String child_room) {
		dropDownVisibleText(getSelLoc(),location);
		dropDownVisibleText(getSelHot(),hotels);
		dropDownVisibleText(getSelRoom(), room_type);
		dropDownVisibleText(getNoRoom(),room_nos);
		dropDownVisibleText(getAdRoom(), adult_room);
		dropDownVisibleText(getChilRoom(), child_room);
		
	}
}
