package factoryDesign;

public class Andriod implements Flutter{
    @Override
    public FlutterFactory getFactory() {
        return new AndriodFactory();
    }
}
