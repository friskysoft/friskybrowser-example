package pages;

import com.friskysoft.framework.Element;

public class GitHubPage {

    public Element searchBox = new Element(".header-search-input");

    public Element menu = new Element("nav.menu");

    public Element users = new Element("//a[contains(text(),'Users')]");

    public Element allItems = new Element("#user_search_results > div");

    public Element firstItem = new Element("#user_search_results :first-child .text-normal a");

}
