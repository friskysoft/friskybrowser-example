package pages;

import com.friskysoft.framework.Element;

public class GooglePage {

    public Element searchBox = new Element("input[name=q]");
    public Element searchResults = new Element("div.g");
    public Element searchResultLinks = new Element("div.g a");
    public Element searchButton = new Element("input[value='Google Search']");

}
