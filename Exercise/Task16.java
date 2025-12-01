

// First, define the Animal interface (as provided in the image)
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

// Now, create the Gorilla class that implements Animal
class Gorilla implements Animal {

    /**
     * Puts food in the cage and returns true if it's meal time.
     * @param timeToEat True if it's the scheduled meal time.
     * @return True if the animal was successfully fed.
     */
    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("// put gorilla food into cage");
            return true;
        }
        return false;
    }

    /**
     * Grooms the gorilla.
     */
    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("// lather, rinse, repeat");
    }

    /**
     * Attempts to pet the gorilla, but at a risk.
     */
    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("// pet at your own risk");
    }
    
    // You could add a main method here to test it:
    /*
    public static void main(String[] args) {
        Gorilla koko = new Gorilla();
        koko.feed(true);
        koko.groom();
        koko.pet();
    }
    */
}public class Task16 {

}
