public class Birds {
    public static void main(String[] args) {
        Bird[] birds = {new Chicken("Red", true),
                new Eagle("Black", false),
                new Penguin("Black and White",true),
                new Swallow("Black", false)};
        for (Bird brd:birds) {
            brd.fly();
            System.out.println(brd.getFeathers());
            System.out.println(brd.getLayEggs());
        }
    }
}