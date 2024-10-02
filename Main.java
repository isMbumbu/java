public class Main{
    public static void main(String[] args) {
        Person person=new Person("Andrew", 30);

        System.out.println("Name is: "+person.getName()+" and age: "+person.getAge());
                // Upcasting: create an instance of Dogs and refer to it as Animals
                Animals animal = new Dogs();
        
                // Call the overridden method
                animal.makeNoice(); // This will print "Bark"
                
                // Downcasting: cast the Animals reference back to Dogs
                if (animal instanceof Dogs) {
                    Dogs dog = (Dogs) animal; // Safe downcasting
                    dog.fetch(); // This will print "Fetching the ball"
                } else {
                    System.out.println("The animal is not a Dog.");
                }
            

    }
}
