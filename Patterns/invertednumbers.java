import java.util.*;

public class invertednumbers {

        public static void main (String arg[]) {
            int n = 5;
            
            //outer loop
            for(int i=1; i<=n; i++) {
                //inner loop
                for(int j=1; j<=n-i+1; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        
    }
    
    

