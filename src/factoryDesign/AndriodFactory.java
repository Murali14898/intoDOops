package factoryDesign;

public class AndriodFactory implements  FlutterFactory{
    @Override
    public Button create_button() {
        return new AndriodButton();
    }

    @Override
    public Navbar create_navbar() {
        return new AndriodNavbar();
    }
}
