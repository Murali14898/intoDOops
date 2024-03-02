package factoryDesign;

public class Ios implements Flutter{
    @Override
    public FlutterFactory getFactory() {
        return new IosFactory() ;
    }
}
