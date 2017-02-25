import pageObjects.*;
import pageObjects.enums.InteractionBlockOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    public void Check_If_Draggable_Form_Available() {

        NavigateTo.InteractionBlock.selectOption(InteractionBlockOptions.DRAGGABLE);

        Assert.assertTrue(DraggablePage.isAt());

    }

    @Test
    public void Check_If_Droppable_Form_Available() {

        NavigateTo.InteractionBlock.selectOption(InteractionBlockOptions.DROPPABLE);

        Assert.assertTrue(DroppablePage.isAt());

    }

    @Test
    public void Check_If_Resizable_Form_Available() {

        NavigateTo.InteractionBlock.selectOption(InteractionBlockOptions.RESIZABLE);

        Assert.assertTrue(ResizablePage.isAt());

    }

    @Test
    public void Check_If_Selectable_Form_Available() {

        NavigateTo.InteractionBlock.selectOption(InteractionBlockOptions.SELECTABLE);

        Assert.assertTrue(SelectablePage.isAt());

    }

    @Test
    public void Check_If_Sortable_Form_Available() {

        NavigateTo.InteractionBlock.selectOption(InteractionBlockOptions.SORTABLE);

        Assert.assertTrue(SelectablePage.isAt());

    }
}
