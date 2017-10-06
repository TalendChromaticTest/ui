package org.talend.component;

import org.talend.component.list.large.Large;
import org.talend.component.list.table.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * A List is used to easy access to WebElements of the react-talend-component List component.
 *
 */
public class List extends Component {

    static final String NAME = "List";

    static final String LIST_SELECTOR = ".tc-list";

    static final String ADD_BTN_SELECTOR = ".tc-actionbar-container .btn-primary";

    static final String ACTION_BAR_SELECTOR = ".tc-actionbar-container #%s.btn";

    /**
     * List constructor.
     *
     * @param driver Selenium WebDriver
     */
    List(WebDriver driver) {
        super(driver, NAME, LIST_SELECTOR);
    }

    /**
     * Get add button of the list.
     *
     * @return WebElement button
     */
    public WebElement getAddButton() {
        return this.getElement().findElement(By.cssSelector(ADD_BTN_SELECTOR));
    }

    /**
     * Get add button of the list.
     *
     * @return WebElement button
     */
    public WebElement getActionBarButtonById(String id) {
        return this.getElement().findElement(By.cssSelector(String.format(ACTION_BAR_SELECTOR, id)));
    }

    /**
     * Get the table display element manager.
     *
     * @return Large the table element manager
     */
    public Table getTable() {
        return new Table(driver);
    }

    /**
     * Get the table display element manager.
     *
     * @return Large the table element manager
     */
    public Large getLarge() {
        return new Large(driver);
    }

    /**
     * Get the table display element manager identified by id.
     *
     * @param id The table id
     * @return Large the table element manager
     */
    public Table getTable(final String id) {
        return new Table(driver, id);
    }
}
