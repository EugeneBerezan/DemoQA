package pageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.enums.InteractionBlockOptions;
import pageObjects.enums.WidgetBlockOptions;
import utils.Driver;

public class NavigateTo extends BasePage {

    public static class RegistrationBlock {

        private static final By REGISTRATION = By.xpath("//aside//a[text()='Registration']");

        public static RegistrationPage selectOption() throws InterruptedException {
            Driver.getInstance().findElement(REGISTRATION).click();
            return new RegistrationPage();
        }
    }

    public static class InteractionBlock {

        private static final By INTERACTION_BLOCK = By.xpath("//h3[text()='interaction']//ancestor::aside");
        private static final By DROPPABLE_OPTION = By.linkText("Droppable");
        private static final By DRAGGABLE_OPTION = By.linkText("Draggable");
        private static final By RESIZABLE_OPTION = By.linkText("Resizabale");
        private static final By SELECTABLE_OPTION = By.linkText("Selectable");
        private static final By SORTABLE_OPTION = By.linkText("Sortable");

        public static void selectOption(InteractionBlockOptions interactionBlockOptions) {
            switch (interactionBlockOptions) {
                case DRAGGABLE:
                    select(DRAGGABLE_OPTION);
                    new DraggablePage();
                    break;
                case DROPPABLE:
                    select(DROPPABLE_OPTION);
                    new DroppablePage();
                    break;
                case RESIZABLE:
                    select(RESIZABLE_OPTION);
                    new ResizablePage();
                    break;
                case SELECTABLE:
                    select(SELECTABLE_OPTION);
                    new SelectablePage();
                    break;
                case SORTABLE:
                    select(SORTABLE_OPTION);
                    new SortablePage();
                    break;
                default:
                    Assert.fail("Something went terribly wrong with Category select");

            }
        }

        static void select(By optionLocator) {
            selectOptionInBlock(INTERACTION_BLOCK, optionLocator);
        }
    }

    public static class WidgetBlock {

        private static final By WIDGET_BLOCK = By.xpath("//h3[text()='Widget']//ancestor::aside");
        private static final By ACCORDION_OPTION = By.linkText("Accordion");
        private static final By AUTOCOMPLETE_OPTION = By.linkText("Autocomplete");
        private static final By DATEPICKER_OPTION = By.linkText("Datepicker");
        private static final By MENU_OPTION = By.linkText("Menu");
        private static final By SLIDER_OPTION = By.linkText("Slider");
        private static final By TABS_OPTION = By.linkText("Tabs");
        private static final By TOOLTIP_OPTION = By.linkText("Tooltip");

        public void selectOption(WidgetBlockOptions widgetBlockOptions) {
            switch (widgetBlockOptions) {
                case ACCORDION:
                    select(ACCORDION_OPTION);
                    new AccordionPage();
                    break;
                case AUTOCOMPLETE:
                    select(AUTOCOMPLETE_OPTION);
                    new AutocompletePage();
                    break;
                case DATEPICKER:
                    select(DATEPICKER_OPTION);
                    new DatepickerPage();
                    break;
                case MENU:
                    select(MENU_OPTION);
                    new MenuPage();
                    break;
                case SLIDER:
                    select(SLIDER_OPTION);
                    new SliderPage();
                    break;
                case TABS:
                    select(TABS_OPTION);
                    new TabsPage();
                    break;
                case TOOLTIP:
                    select(TOOLTIP_OPTION);
                    new TooltipPage();
                    break;
                default:
                    Assert.fail("Something went terribly wrong with Category select");

            }
        }

        void select(By optionLocator) {
            selectOptionInBlock(WIDGET_BLOCK, optionLocator);
        }
    }
}