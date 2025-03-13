public class MyList{
    // data fields
    public Node head=null; 
    public int size=0;

    // methods
    //first method "a" 

    public int front(){

        return head.data;//only works if head != null
    }
    // "b"
    public int size(){
        return size;
    }
    // "c"
    public void insert_head(int insert_me){
        //step 1
        Node temp=new Node(insert_me);
        //step 2
        temp.next=head;
        //step 3:assign the new node as the head of the linked list
        head=temp;
        // head= new Node(insert_me, head); to diminish the code needed. 3 in 1 
        size++;
    }
    //"d"
    public void delete_head(){
        //assign the second node in the list as the head
        head=head.next;
        size--;
    }
    //"e"
    public void display(){
        for (Node temp=head; temp!=null;temp=temp.next) {// temp is an iterator 
            System.out.print("->"+temp.data);

        }
        System.out.println();
    }   
    //f
    public int get_back(){
        for (Node temp=head; temp!=null;temp=temp.next) {// temp is an iterator 
            if(temp.next==null){
                return temp.data;
            }
        }
        return -1;
    }

     //g
     public void insert_back(int insert_me) {
        if (head == null) {
            head = new Node(insert_me);
            return;
        }
        Node temp = head;
        while (temp.next != null) 
        temp = temp.next;  
        temp.next = new Node(insert_me);
        size++;
    }

    //h
    public void delete_back(){

        Node temp=head;
        for (; temp.next.next!=null;temp=temp.next) {// temp is an iterator
            
        }
        temp.next = null;
        size--;
    } 

    //i
    
    public boolean search(int target){
        for (Node temp=head; temp!=null;temp=temp.next) {// temp is an iterator 
            if(temp.data==target){
                return true;
            }
        }
             return false;
    }

    //j
    public void insert(int after_me, int insert_me){
        for (Node temp=head; temp!=null;temp=temp.next) {// temp is an iterator
            if(after_me==temp.data){
                Node newNode = new Node(insert_me);
                newNode.next = temp.next; 
                temp.next = newNode; 
                size++;

            }
        }
        
    }
    //k
    public void remove(int delete_me){
        if (head.data == delete_me) {
            head = head.next;  
            size--;
            
        }
        for (Node temp=head; temp!=null&& temp.next!=null ;temp=temp.next) {// temp is an iterator 
            if(delete_me==temp.next.data){
                temp.next = temp.next.next;
                size--; 
            }
        }

    }
    
} 
        

