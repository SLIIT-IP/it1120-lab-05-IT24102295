import java.util.Scanner;

public class IT24102295Lab5Q2{
       public static void main(String[] args){

             Scanner input=new Scanner(System.in);
             
             System.out.print("Enter the number of new members introduced: ");
             int Newmem=input.nextInt();
               
             if (Newmem<0)
                {System.out.print("invalid input");}
             else
             {
               String prize;
             switch (Newmem)
               {
               case 0:prize="No Prize";
                      break;
               case 1:prize="pen";
                      break;
               case 2:prize="Umbrella";
                      break;
               case 3:prize="Bag";
                      break;
               case 4:prize="Travelling chair";
                      break;
               default:prize="Headphone";
               }
               System.out.print("Prize is a: "+prize);
             }
        }
}