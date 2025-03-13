import java.util.*;
public class pa2{
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> disc = new ArrayList<ArrayList<Integer>>(); //disc
        //input 
        //disk part
        Scanner keyboard=new Scanner(System.in);

        int size=keyboard.nextInt();

        //read the whole disc 
        for (int i = 0; i < size; i++) {
            // create new list 
            ArrayList<Integer> row= new ArrayList<Integer>();
            int rowsize=keyboard.nextInt();
            // read the date into each row and line
            for (int j = 0; j< rowsize; j++) 
                row.add(keyboard.nextInt());
            disc.add(row);

        }
         //print disc+ this is not really needed 
         for (int i = 0; i < size; i++) {
            System.out.println(disc.get(i));
            }

        //second part of input
        int nbquery=keyboard.nextInt();//reading the query nb
        // Process each query
        for (int i = 0; i < nbquery; i++) {
            // Read the coordinates (x, y)
            int x = keyboard.nextInt();
            int y = keyboard.nextInt();

            if (x >= 1 && x <= disc.size() && y >= 1 && y <= disc.get(x - 1).size()) {

                System.out.println(disc.get(x - 1).get(y - 1)); //printing the corresponding value
            } else {
                System.out.println("ERROR!");
    }
        }

    }
}