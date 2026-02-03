public class Case7 {
    public static void main(String[] args) {

        int n = 1000000;  
        int odd = 0;
        double x,y;

        for (int i = 0; i < n; i++) {

             x = -1 + 2 * Math.random();
             y = -1 + 2 * Math.random();

        
            if (x < 0) {
                odd++;
            }
            
            else if (x > 0 && y > 0 && y < 1 - x) {
                odd++;
            }
        }

        double probability = (double) odd / n;
        System.out.println("Probability = " + probability);
    }
}
    

