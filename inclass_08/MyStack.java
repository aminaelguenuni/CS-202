public class MyStack {

    //data fields
    private int[]a;// container for the stack
    private int maxsize;// max size of the array/stack
    private int topindex;// top item in the stack

    //methods
    public MyStack(int size){
        maxsize=size;
        a=new int[maxsize];
        topindex=0;// initially stack is empthy 
    }
    public void push(int item){
        topindex++;
        a[topindex]=item;
    }
    public int pop(){
        int temp=a[topindex];
        topindex--;
        return temp;
    }
    public boolean isEmpthy(){
        if (topindex==-1) 
            return true;
        else 
            return false;
        
    }
    public boolean isFull(){
        return topindex==maxsize-1;
    }
    public void display(){
        for (int index = 0; index <= topindex; index++) {
            System.out.print(a[index]+"");
            
        }
    }

}