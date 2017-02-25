import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;
import pageObjects.enums.InteractionBlockOptions;
import pageObjects.enums.WidgetBlockOptions;

public class HomePageTests extends BaseTestClass {

    @Test
    public void Check_If_Home_Page_Available() {

        Assert.assertTrue(HomePage.isAt());

    }

    @Test
    public void Check_If_Registration_Form_Available() throws InterruptedException {

        NavigateTo.RegistrationBlock.selectOption();

        Assert.assertTrue(RegistrationPage.isAt());

    }

    @Test
    public void Check_If_Interaction_Draggable_Form_Available() {

        NavigateTo.InteractionBlock.selectOption(InteractionBlockOptions.DRAGGABLE);

        Assert.assertTrue(DraggablePage.isAt());

    }

    @Test
    public void Check_If_Interaction_Droppable_Form_Available() {

        NavigateTo.InteractionBlock.selectOption(InteractionBlockOptions.DROPPABLE);

        Assert.assertTrue(DroppablePage.isAt());

    }

    @Test
    public void Check_If_Interaction_Resizable_Form_Available() {

        NavigateTo.InteractionBlock.selectOption(InteractionBlockOptions.RESIZABLE);

        Assert.assertTrue(ResizablePage.isAt());

    }

    @Test
    public void Check_If_Interaction_Selectable_Form_Available() {

        NavigateTo.InteractionBlock.selectOption(InteractionBlockOptions.SELECTABLE);

        Assert.assertTrue(SelectablePage.isAt());

    }

    @Test
    public void Check_If_Interaction_Sortable_Form_Available() {

        NavigateTo.InteractionBlock.selectOption(InteractionBlockOptions.SORTABLE);

        Assert.assertTrue(SortablePage.isAt());

    }

    @Test
    public void Check_If_Widget_Accordion_Form_Available() {

        NavigateTo.WidgetBlock.selectOption(WidgetBlockOptions.ACCORDION);

        Assert.assertTrue(AccordionPage.isAt());

    }

    @Test
    public void Check_If_Widget_Autocomplete_Form_Available() {

        NavigateTo.WidgetBlock.selectOption(WidgetBlockOptions.AUTOCOMPLETE);

        Assert.assertTrue(AutocompletePage.isAt());

    }

    @Test
    public void Check_If_Widget_Datepicker_Form_Available() {

        NavigateTo.WidgetBlock.selectOption(WidgetBlockOptions.DATEPICKER);

        Assert.assertTrue(DatepickerPage.isAt());

    }

    @Test
    public void Check_If_Widget_Menu_Form_Available() {

        NavigateTo.WidgetBlock.selectOption(WidgetBlockOptions.MENU);

        Assert.assertTrue(MenuPage.isAt());

    }

    @Test
    public void Check_If_Widget_Slider_Form_Available() {

        NavigateTo.WidgetBlock.selectOption(WidgetBlockOptions.SLIDER);

        Assert.assertTrue(SliderPage.isAt());

    }

    @Test
    public void Check_If_Widget_Tabs_Form_Available() {

        NavigateTo.WidgetBlock.selectOption(WidgetBlockOptions.TABS);

        Assert.assertTrue(TabsPage.isAt());

    }

    @Test
    public void Check_If_Widget_Tooltip_Form_Available() {

        NavigateTo.WidgetBlock.selectOption(WidgetBlockOptions.TOOLTIP);

        Assert.assertTrue(TooltipPage.isAt());

    }
}
