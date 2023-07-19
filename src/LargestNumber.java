import java.util.*;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size=scanner.nextInt();
        ArrayList<String> al = new ArrayList<>();
        for (int i=0;i<size;i++)
        {
            al.add(scanner.next());
        }
        findLargest(al);
    }
    static void findLargest(ArrayList<String> al)
    {
        Collections.sort(al, new Comparator<String>()
        {

            @Override public int compare(String X, String Y)
            {


                String XY = X + Y;


                String YX = Y + X;


                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });

        Iterator it = al.iterator();

        while (it.hasNext())
            System.out.print(it.next());
    }

}
