
import java.util.ArrayList;

public class PhoneDirectory {

    // Data fields
    /** The ArrayList to contain the directory data */
    private ArrayList<DirectoryEntry> theDirectory = new ArrayList<DirectoryEntry>();
    //methods 
    public String addOrChangeEntry(String aName, String newNumber) {//method to add or change entry 
        for (int i = 0; i< theDirectory.size(); i++) {
            if(theDirectory.get(i).getName().equals(aName)){//compare the name to the aName 
                //aNmae is found!
                String temp= theDirectory.get(i).getNumber();
                theDirectory.get(i).setNumber(newNumber);
                return temp;// return old number per instructions 

            }
            
        }
        //aName is not found then add the aName and phone number as new entry 
        theDirectory.add(new DirectoryEntry(aName, newNumber));
        return null;

    }
    //remove an entry 
    public DirectoryEntry removeEntry(String aName) {//class name used as a return data type. for directory entry 
        for (int i = 0; i< theDirectory.size(); i++) {
            if(theDirectory.get(i).getName().equals(aName)){//compare the name to the aName 
                //aNmae is found! then delete the entry
                DirectoryEntry temp= theDirectory.get(i); //hold it before deleting 
                theDirectory.remove(i);
                return temp;
            } 
    } 
    return null;// right place to be
}
public void print(){
    for (int i = 0; i< theDirectory.size(); i++) {
        System.out.println(theDirectory.get(i).getName()+" "+theDirectory.get(i).getNumber());
    }

}
}
