// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        // Read total persons
        int totalPersons = sc.nextInt();
        sc.nextLine();
        
        // Read t-shirt sizes
        int[] tShirtSizes = new int[6];
        for (int i = 0; i < 6; i++) {
            tShirtSizes[i] = sc.nextInt();
        }
        sc.nextLine();
        
        // Read bundle sizes
        int tShirtBundleSize = sc.nextInt();
        int penBundleSize = sc.nextInt();
        
        // Calculate T-shirts bundles
        int tShirtBundles = calculateTShirtBundles(tShirtSizes, tShirtBundleSize);
        
        // Calculate pen bundles
        int[] penDistribution = calculatePenBundles(totalPersons, penBundleSize);
        int penBundles = penDistribution[0];
        int remainingPens = penDistribution[1];

        // Print
        System.out.println(tShirtBundles);
        System.out.println(penBundles + " " + remainingPens);

    
       
    }
    
    public static int calculateTShirtBundles(int[] sizes, int bundleSize) {
        int bundleCount = 0;
        for (int size : sizes) {
            bundleCount += (size + bundleSize - 1) / bundleSize; 
        }
        
        return bundleCount;
    }
    
    public static int[] calculatePenBundles(int persons, int bundleSize) {
        int[] distribution = new int[2];
        distribution[0] = persons / bundleSize;
        distribution[1] = persons % bundleSize;
        
        return distribution;
    }
}