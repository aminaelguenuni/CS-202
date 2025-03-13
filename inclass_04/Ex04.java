import java.util.*;
public class Ex04{
    public static void main(String[] args) {
       //input and testing
       ArrayList<Integer> numbers= new ArrayList<Integer>();// to declare an array list, have a memory spot for it in the storage space. 
       Scanner keyboard=new Scanner(System.in);
       System.out.print("Enter the sequence of integers (ends with 0):  ");
       int temp=keyboard.nextInt();
       while (temp!=0) {
        numbers.add(temp);
        temp=keyboard.nextInt();
       }
       System.out.println(numbers);
       System.out.println("The max value in this sequence is "+max(numbers));
       System.out.println("The sum value of all the element of this sequence is "+sum(numbers));
       System.out.print("The sequence with no duplication is : "+nodup(numbers));
    }
    //Q1
    public static int max(ArrayList<Integer> list){ //Linear search algorithm 
        int max=list.get(0);// get first value of the array list
        for (int i= 0; i < list.size(); i++) { //loop structure to iterate through the array 
            if (max<list.get(i)) { // if the array list thing is bigger max value then max should be updated. 
                max=list.get(i);    
            }  
        }
        return max; // return the final value of max.   
    }
    //Q2 
    public static int sum(ArrayList<Integer> list){
        int sum=0;
        for (int i= 0; i < list.size(); i++) { //loop structure to iterate through the array 
            sum+=list.get(i);
        }
        return sum;
    }
    //Q3
    public static ArrayList <Integer> nodup(ArrayList<Integer> list){ // see if the number is present in the second array if not we put it, if not, leave it. 
        ArrayList <Integer> result=new ArrayList<Integer>(); // new empthy array list
        for (int i= 0; i < list.size(); i++) { //loop structure to iterate through the array 
            if (result.indexOf(list.get(i))==-1) { // check if the ith element is in the result list already 
                result.add(list.get(i));
            }
        }
        return result;
    }
}