import java.util.Scanner;

public class StackDemo
{
    int[] ar;
    int top;
    StackDemo() {
        ar = new int[5];
        top = -1;
    }
    void push()
    {
        if(top==ar.length-1) {
            System.out.println("Stack full");
        }
        else{
            System.out.println("Enter data");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();
            top=top+1;
            ar[top]=data;
            System.out.println("Data inserted");
        }
    }
    void pop(){
        if(top==-1) {
            System.out.println("Stack Empty");
        }
        else {
            System.out.println("deleted..." + ar[top]);
            top = top-1;
        }

    }
    void view(){
        if(top==-1){
            System.out.println("STACK EMPTY / UNDERFLOW");
        }
        else{
            System.out.println("STACK ELEMENT");
            for(int i=top;i>=0;i--){
                System.out.println(ar[i]);
            }
        }
    }
    public static void main(String[] args) {
        StackDemo obj = new StackDemo();
        while(true){
            System.out.println("\nPress 1 for PUSH");
            System.out.println("Press 2 for POP");
            System.out.println("Press 3 for DISPLAY");
            System.out.println("Press 4 for EXIT");

            System.out.println("ENTER YOUR CHOICE ");
            Scanner sc= new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> obj.push();
                case 2 -> obj.pop();
                case 3 -> obj.view();
                case 4 -> System.exit(0);
                default -> System.out.println("Wrong Choice");
            }
        }
    }
}
