public class Ex08 {

    public static void main(String[] args) {
        MyStack s =new MyStack(5);
        if (s.isEmpthy()) {
            System.out.println("Stack is empthy"); 
        }else{
            System.err.println(" Stack is not empthy");
        }
        s.push(10);
        s.push(20);
        s.push(30);

        if (s.isFull()) {
            System.out.println("Stack is full"); 
        }else{
            System.err.println(" Stack is not full");
        }
        s.display();
        System.out.println("The top value"+s.pop()+" is popped out!");
        s.display();
    }
}