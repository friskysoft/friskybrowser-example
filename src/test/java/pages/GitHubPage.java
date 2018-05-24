package pages;

import com.friskysoft.framework.Element;

public class GitHubPage {

    public Element searchBox = new Element(".header-search-input");

    public Element menu = new Element("nav.menu");

    public Element users = new Element("//a[contains(text(),'Users')]");

    public Element firstItem = new Element("div.user-list:first-child .user-list-info a");

}
