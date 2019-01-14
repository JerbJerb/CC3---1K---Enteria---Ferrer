
package mean;
import java.util.Scanner;
        
public class Mean {

    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);    
       
       System.out.println("How many numbers?");
       int x = in.nextInt();
       int[] val = new int[x];
       
       for(int a=0;a<val.length; a++){
           System.out.println("Enter number for Index "+a);
           val[a]=in.nextInt();
       }
       
       double luck = mean(val);
       int muck = mode(val,x); 
       System.out.println("The mean is "+ luck);
       System.out.println("The mode is "+muck);
       }  
            
    public static double mean(int[] m){
        double sum= 0;
        for(int i = 0 ; i <m.length ; i++){
            sum+= m[i];            
        }
        return sum / m.length;
    }
    public static int mode(int a[],int n){
        int maxValue = 0, maxCount = 0, i, j;
         for(i=0;i<n;++i){
             int count=0;
             for(j=0; j<n ;++j){
                  if (a[j]==a[i])
                      ++count;
             }
             if(count > maxCount){
                 maxCount = count;
                 maxValue = a[i];
             }
         }return maxValue;
    }
             
}  
  
   
    

