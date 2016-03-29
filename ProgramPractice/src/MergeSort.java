import java.util.*;
 public class MergeSort
{
	 static void printArray(int[] inputArray){
		 for(int i=0;i<inputArray.length;i++){
			 System.out.println(inputArray[i]);
		 }
	 }
	 static int[] readInputArray(){
		 int[] a={4,5,1,2,9,2,6};
		 return a;
		 }
	    static void Sorting(int[] inputArray){
	    	 Sort(inputArray,0,inputArray.length-1);
	    	 
	    }
	    static void Sort(int[] inputArray, int low, int high){
	    	if(low<high){
	    		int mid=(low+high)/2;
	    		Sort(inputArray,low,mid);
	    		Sort(inputArray,mid+1,high);
	    		Merge(inputArray,low,mid,high);    		
	    	}
	    }
	    static void Merge(int[] inputArray, int low, int mid, int high){
	    	int[] temp=new int[high-low+1];
	    	int left=low;
	    	int right=mid+1;
	    	int k=0;
	    	while(left<=mid&&right<=high){
	    		if(inputArray[left]<=inputArray[right]){
	    			temp[k]=inputArray[left];
	    			left=left+1;
	    		}
	    			else {
	    				temp[k]=inputArray[right];
	    				right=right+1;
	    			}
	    		k=k+1;
	    		}
	    	if(left<=mid){
	    		while(left<=mid){
	    		temp[k]=inputArray[left];
	    		left=left+1;
	    		k=k+1;
	    	}
	    	}
	    		else if(right<=high){
	    			while(right<=high){
	    				temp[k]=inputArray[right];
	    				right=right+1;
	    				k=k+1;
	    				
	    			}
	    		}
	    	for(int h=0;h<temp.length;h++){
	    		inputArray[low+h]=temp[h];

	    	}
	    	}
	  
	public static void main(String[] args) 
    {
    	int[] inputArray = readInputArray();
       System.out.println("Input Array Elements");
       printArray(inputArray);
       Sorting(inputArray);
       System.out.println("Sorted Array");
       printArray(inputArray);
       
                }   	
    }


