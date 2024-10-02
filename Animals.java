public class Animals {
    void makeNoice() {
        System.out.println("I make noise");
    }
}

class Dogs extends Animals {
    @Override
    void makeNoice() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Fetching the ball");
    }
}