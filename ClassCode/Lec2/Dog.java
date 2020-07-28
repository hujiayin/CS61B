public class Dog { 
    public int weightInPounds; // Instance Variable
    public static String binomen = "Canis familiaris";

    /** One integer Constructor for dogs. */
    public Dog(int w) {  
        weightInPounds = w;
    }

    // Non-static Method, aka Instance Method -- 
    public void makeNoise() {  
        if (weightInPounds < 10) {
            System.out.println("yip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark!");
        } else {
            System.out.println("woooooooof!");
        }
    }

    // public static void main(String[] args) {
    //     makeNoise();
    // }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }

    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this; 
        }
        return d2;
    }
}