
class HighArrayApp // app class
   {
   public static void main(String[] args)
      {
      int maxSize = 50;            // array size
      HighArray arr;                // reference to array // declaring the object. as arr an object name 
      arr = new HighArray(maxSize); // create the array// object estination 

      arr.insert(77);               // insert 10 items
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);
      arr.insert(33);// example value 

      arr.display();                // display items

      int searchKey = 35;           // search for item
      if( arr.find(searchKey) )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can't find " + searchKey);

      arr.delete(00);               // delete 3 items
      arr.delete(55);
      arr.delete(99);

      arr.display();                // display items again

      System.out.println("The highest key in the array is "+arr.getMax());
      arr.removeMax();
      System.out.println("The array without the max is  ");
      arr.display();

      arr.noDups();
      System.out.println("The array without duplicates is ");
      arr.display();

      }  // end main()

   }  // end class HighArrayApp


class HighArray // an entity class with no main classes.
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items stands for the number of elements in the array. 
   //-----------------------------------------------------------
   public HighArray(int max)         // constructor, non default construcor
      {
      a = new long[max];                 // create the array
      nElems = 0;                        // no items yet
      }
   //-----------------------------------------------------------
   public boolean find(long searchKey) //linear search algorithm 
      {                              // find specified value
      int j;
      for(j=0; j<nElems; j++)            // for each element,
         if(a[j] == searchKey)           // found item?
            break;                       // exit loop before end
      if(j == nElems)                    // gone to end?
         return false;                   // yes, can't find it
      else
         return true;                    // no, found it
      }  // end find()
   //-----------------------------------------------------------
   public void insert(long value) {  // put element into array
      a[nElems]=value;                // to put the new value in the array.
      nElems++;                      // increment size increment the index 
      }
   //-----------------------------------------------------------
   public boolean delete(long value) // a boolean function 
      {
      int j;
      for(j=0; j<nElems; j++)        // look for it
         if( value == a[j] )
            break;
      if(j==nElems)                  // can't find it
         return false;
      else                           // found it
         {
         for(int k=j; k<nElems; k++) // move higher ones down
            a[k] = a[k+1];              // overide that value and shift everthing else to the right 
         nElems--;                   // decrement size
         return true;
         }
      }  // end delete()
   //-----------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }

      // Q1 
      public long getMax(){ //Method 1
            if(nElems==0){ //In the case of an empthy array 
                return -1;
            } 
            else{
             long  max=a[0]; //initial
            for(int i=0; i<nElems; i++){
                if(a[i]>max){
                    max=a[i];
                }
            }
              return max;
             
            }
        }

        

      
      //Q2 
          public long removeMax() {
            long max = getMax();// use previous method +no need to an object as it is part of the entity class. 

            delete(max); //delete the max 

            return max;   
        }

        //Q3

        public void noDups(){// no duplication 
         for (int i = 1; i < nElems; i++) { // going thropugh the array 
            for(int j=i+1; j<nElems; j++){
               if(a[j]==a[i]){
                  for(int k=j; k<nElems; k++){ // delete the dups that we found
                     a[k] = a[k+1];            
                     nElems--; 
                     j--;
                  } 
               }

            }
         }
         
      } 
      
   }       