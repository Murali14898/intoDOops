package factoryDesign;

public class IosFactory implements FlutterFactory{
    @Override
    public Button create_button() {
        return new IosButton();
    }

    @Override
    public Navbar create_navbar() {

        return new IosNavbar();
    }
}
