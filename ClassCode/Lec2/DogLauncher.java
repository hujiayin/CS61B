// public class DogLauncher {
//     public static void main(String[] args) {
//         Dog d = new Dog(51); 
//         // d.weightInPounds = 25; 
//         d.makeNoise();
//     }    
// }

/**
public class DogLauncher {
    public static void main(String[] args) {
        Dog smallDog;  // Declaration of a Dog variable. 
        new Dog(20);  // Instantiation of the Dog class as a Dog Object.
        smallDog = new Dog(5); // Instantiation and Assignment. 
        Dog hugeDog = new Dog(150); // Declaration, Instantiation and Assignment
        smallDog.makeNoise(); 
        hugeDog.makeNoise(); // Invocation of the 150lb Dog's makeNoise method
    }    
}
 */



public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog(15); 
        Dog d2 = new Dog(100); 
        // Dog bigger = Dog.maxDog(d, d2); 
        Dog bigger = d.maxDog(d2);
        bigger.makeNoise();

        /** Access static variable by the class name */
        // System.out.println(d.binomen); // It works. Not good.
        // System.out.println(d2.binomen);
        System.out.println(Dog.binomen);
    }    
}
