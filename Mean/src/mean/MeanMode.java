import java.util.Scanner;
public class MeanMode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the data: ");
        int total = sc.nextInt();
        
        int nums[] = new int[total];
        for(int i = 0; i < total; i++){
            System.out.print("Enter data number "+(i+1)+": ");
            nums[i] = sc.nextInt();
        }
        int x = getMode(nums);
        System.out.println("\nMean = "+getMean(nums));
        if(currentHighestCount == 1){
            System.out.println("Mode = None");
        }else{
            System.out.println("Mode = "+modeSt);
        }
    }
    static double getMean(int nums[]){
        int tot = 0;
        for(int i = 0; i < nums.length; i++){
            tot += nums[i];
        }
        return ((double)tot/nums.length);
    }
    
    static String modeSt = "";
    static int currentHighestCount;
    
    static int getMode(int nums[]){
        int currentHighestInd = 0;
        
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > currentHighestCount){
                currentHighestCount = count;
                currentHighestInd = i;
                modeSt = nums[i]+"";
            }else if(count == currentHighestCount){
                boolean done = false;
                for(int k = 0; k < i ; k++){
                    if(nums[i] == nums[k]){
                        done = true;
                    }
                }
                
                if(done == false){
                    if(modeSt == ""){
                        modeSt = nums[i]+"";
                    }else{
                        modeSt += ", "+nums[i];
                    }
                }
                
            }
        }
        return nums[currentHighestInd];
    }
    
}
