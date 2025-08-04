package day6;
import java.util.Arrays;

public class arrayeee
{
	public static void main(String[] args) {
	    int [] temp= {73,74,75,71,69,72,76,73};
	    int[] ans= new int[8];
	    
	    for (int i=0;i<temp.length;i++){
	        int count=1;
            boolean isLarge=false;
	        for( int j=i;j<temp.length-1;j++){
	            if (temp[i]>temp[j+1]){
	                count++;
	            }
	            else if(temp[i]<temp[j+1]){
	                isLarge=true;
	                break;
	                
	            }
	        }
	        if(isLarge){
	            ans[i]=count;
	        }else{
	            ans[i]=0;
	        }
	    }
		System.out.println(Arrays.toString(ans));
	}
}