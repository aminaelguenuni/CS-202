public class ex06 {
    public static void main(String[] args) {
        MyList list1=new MyList();
        list1.insert_head(40);
        list1.insert_head(30);
        list1.insert_head(20);
        list1.insert_head(10);
        list1.insert_head(90);
        list1.display();
        list1.delete_head();
        list1.display();
        System.out.println("The first node is "+list1.front());
        System.out.println("The size of the list is :"+list1.size());
        System.out.println("The last item in the list is : "+list1.get_back());

        list1.insert_back(50);
        list1.display();

        list1.delete_back();
        list1.display();

        System.out.println("This value is available in this list : "+list1.search(40));

       list1.insert(20, 98);
       list1.display();

       list1.remove(98);
       list1.display();
    }
}
