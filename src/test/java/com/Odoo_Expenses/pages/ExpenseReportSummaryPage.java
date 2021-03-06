package com.Odoo_Expenses.pages;

import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpenseReportSummaryPage {

    public ExpenseReportSummaryPage() {
        PageFactory.initElements (Driver.getDriver (), this);
    }
    @FindBy( xpath = "//input[@name='name']" )
    public WebElement expenseReportSummaryLink;
    @FindBy( xpath = "//div[@class='o_input_dropdown']/input" )
    public WebElement employeeLink;
    @FindBy( xpath = "//div//input[@class='o_input ui-autocomplete-input']" )
    public WebElement employeeNameLink;
    @FindBy( xpath = "//input[@class='o_input ui-autocomplete-input']" )
    public WebElement nameText;
    @FindBy( xpath = "(//li[@class='ui-menu-item'])[1]" )
    public WebElement name;

    @FindBy(xpath = "//div//button[@class='btn btn-sm btn-default oe_highlight o_expense_sheet_approve']")
    public WebElement approveButton;

    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement popup;

    @FindBy(xpath = "(//ul[@id='ui-id-3']/li)[2]/a")
    public WebElement ashley;


}
