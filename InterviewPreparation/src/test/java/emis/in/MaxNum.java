package emis.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxNum {
public static void main(String[] args) {
	
	//List<Integer> l = new ArrayList<Integer>(Arrays.asList(2,4,3,1,5,6,7,4));
	
	//Collections.sort(l);
	
	//System.out.println(l.size()-1);
	
	int [] a = {5,6,7};
	
	int [] b= {5,10,7};
	
	int count =0;
	for (int i = 0; i < a.length; i++)
    {
        for (int j = 0; j < b.length; j++)
        {
        
            if(a[i] == b[j])
            {
             
             System.out.println("Common element is : "+(a[i]));
             count ++;
            
             }
        }
    }
	System.out.println("the common values in the array: "+count);
}

}
