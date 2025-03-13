public class ex05 {
    public static void main(String[] args) {
        PhoneDirectory contact =new PhoneDirectory();
        contact.addOrChangeEntry("Tom", "0673739603");
        contact.addOrChangeEntry("Nik", "0673973153");
        contact.addOrChangeEntry("Mary", "067548792");
        //system out print will not work
        contact.print();
        System.out.println();
        contact.addOrChangeEntry("Nik", "000000000000");
        contact.print();
        System.out.println();

        contact.removeEntry("Nik");
        contact.print();
        System.out.println();

        contact.removeEntry("Amina");
        contact.print();

    }
    
}
