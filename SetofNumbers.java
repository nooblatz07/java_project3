import java.util.*;
public class SetofNumbers {
 public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
   int setA[] = {1, 2, 3, 4, 5,} ;
   int setB[] = {2, 7 ,8, 9 ,10} ;
   boolean checkA = false;
   boolean checkB = false;
   
   System.out.print("Enter a number: ");
   int num = sc.nextInt();
   
   for(int i=0; i<setA.length; i++){
      if(setA[i]==num){
         checkA = true;
         break;
      }
   }
   for(int i=0; i<setB.length; i++){
      if(setB[i]==num){
         checkB = true;
         break;
      }
   }
   
   if(checkA&&checkB)
   System.out.print(num + " is an element of A and B");
   else if(checkA)
   System.out.print(num + " is an element of A");
   else if(checkB)
   System.out.print(num + " is an element of B");
   else
   System.out.print(num + " is neither the two elements");
 }
}