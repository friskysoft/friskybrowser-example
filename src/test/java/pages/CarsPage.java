package pages;

import com.friskysoft.framework.Element;

public class CarsPage {

    // home page
    public Element homePage = new Element("div.page");
    public Element searchNowButton = new Element("//button[contains(text(), 'Search Now')]");
    public Element searchModal = new Element("div.modal");
    public Element makeDropdown = new Element("select[ng-model='selections.make']");
    public Element makeDropdownOptionByLabel(String label) {
        return new Element("select[ng-model='selections.make'] option[label='" + label + "']");
    }
    public Element zipInput = new Element("input.zip-field");
    public Element searchSubmit = new Element("button[type='submit']");

    // results page
    public Element searchResultListing = new Element("#listings");
    public Element searchResultTitle = new Element("//h1[@class='srp-header']");

}
