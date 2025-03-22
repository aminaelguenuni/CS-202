import java.io.*;                 


class DequeApp
   {
   public static void main(String[] args) 
      {
            Deque deque = new Deque(5);
        
            deque.insertRight(10);
            deque.insertRight(20);
            deque.insertRight(30);
            deque.display(); 
        
            deque.insertLeft(5);
            deque.insertLeft(1);
            deque.display(); 
        
            System.out.println("Removed from left: " + deque.removeLeft());
            deque.display(); 
        
            System.out.println("Removed from right: " + deque.removeRight()); 
            deque.display(); 
        
            System.out.println("Is deque empty? " + deque.isEmpty()); 
            System.out.println("Is deque full? " + deque.isFull()); 
            //wrapper arround case testing

            deque.insertRight(40);
            deque.insertRight(50);
            deque.insertRight(60);
            deque.display(); 
    
            System.out.println("Removed from left: " + deque.removeLeft()); 
            deque.display(); 
    
            System.out.println("Is deque empty? " + deque.isEmpty()); 
            System.out.println("Is deque full? " + deque.isFull()); 

      }  

   }  



class Deque
   {
   private int maxSize; //max size of the queue
   private int[] dekArray; //array container
   private int left; //left end index
   private int right; //right end index
   private int nItems; //actual number of items in queue

   public Deque(int s) 
      {
      maxSize = s;
      dekArray = new int[maxSize];
      int center = maxSize/2 - 1;
      left = center+1;            
      right = center;             
      nItems = 0;
      }
//--------------------------------------------------------------
   public void insertLeft(int j) // put item at left of deque
      {
         if(left == 0)               // deal with wraparound
            left = maxSize;
         dekArray[--left] = j;       // insert and decrement left
         nItems++;                   // one more item, house keeping
      }
//--------------------------------------------------------------
   public void insertRight(int j) // put item at right of deque
      {
        if (right == maxSize - 1) { 
            right = -1;
        }
        dekArray[++right] = j; 
        nItems++; 
      
      }
//--------------------------------------------------------------
   public int removeLeft()      // take item from left of deque
      {
         int  temp = dekArray[left++]; // get value and incr left
         if(left == maxSize)        // deal with wraparound
            left = 0;
         nItems--;                  // one less item
         return temp; 
      }
//--------------------------------------------------------------
   public int removeRight()    // take item from right of deque
      {
      int temp = dekArray[right--]; 
      if (right == -1) { 
        right = maxSize - 1;
      }
      nItems--; 
      return temp;      
      }
//--------------------------------------------------------------
   public boolean isEmpty()    // true if deque is empty
      { 
         return nItems==0;
       }
//--------------------------------------------------------------
   public boolean isFull()     
      { 
         return nItems == maxSize;
      }
//--------------------------------------------------------------
   public int size()           // number of items in deque
      { 
         return nItems;
      }
//--------------------------------------------------------------
   public void display()
      {
      int index = left;
      for (int i = 0; i < nItems; i++) {
        System.out.print(dekArray[index] + " ");
        index = (index + 1) % maxSize; // handle wrap-around cases
      }
      System.out.println();
      
      }  
//--------------------------------------------------------------
   }  

