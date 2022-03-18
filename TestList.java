import java.util.Scanner;

/**
 give an implementation of the size () methode for the SingleLinkedList class,
 assuming that we did not maintain size as an instance variable.
 */

public class TestList {
    public static void main(String[] args) {
     SingleyLinkedList<Integer>list=new SingleyLinkedList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("1-add first \n 2-add last \n 3-remove first \n 0-exit");
        int choices=-1;
        while (choices !=0){
            System.out.println("enter number");
            choices=input.nextInt();
            switch (choices){
                case 1:
                    System.out.println("enter number");
                    list.addfirst(input.nextInt());
                    System.out.println("sirst number="+list.first()+"\t last number="+ " "+list.last()+"\t size= "+list.size());
                    break;
                case 2:
                    System.out.println("enter number");
                    list.addlast(input.nextInt());
                    System.out.println("first="+list.first()+"\t last="+list.last()+"\t size="+list.size());
                    break;
                case 3:
                    System.out.println("Remove first "+list.removefirst());
                    System.out.println("first="+ list.first()+"\t last="+" "+list.last()+"\t size"+list.size());
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        }
    }
}
