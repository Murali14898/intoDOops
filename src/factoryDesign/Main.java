package factoryDesign;

public class Main {
    public static void main(String[] args) {
        String andriod_button=new Andriod().getFactory().create_button().printButton();
        String ios_button=new Ios().getFactory().create_button().printButton();
        String andriod_Navbar=new Andriod().getFactory().create_navbar().printNavBar();
        String ios_navbar=new Ios().getFactory().create_navbar().printNavBar();
        System.out.println(andriod_button);
        System.out.println(andriod_Navbar);
        System.out.println(ios_button);
        System.out.println(ios_navbar);
    }
}
