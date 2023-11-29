/*public class first {
    static void func(){
        System.out.println("Hello world");
    }
public static void main(String[] args) {
    func();
}
}
*/
/*public class first {
    static void func(int a){
        System.out.println(a+50);
    }
public static void main(String[] args) {
    func(10);
}
}
***************************************** method **********************************
public class first {
    static int func(int a){
        System.out.println(a+50);
        return a + 10;
    }
public static void main(String[] args) {
    func(20);
}
}*/
/************************ if else ************************************************** 
public class first {
    static void func(int age){
        if(age<18){
            System.out.println("Not legal");
        }
        else{
        System.out.println("Legal");
        }
        
    }
public static void main(String[] args) {
    func(20);
    func(10);
    func(18);
}
}*/
//********************************************* fctorial using recursion *******************************************
/*public class first {
    static int func(int k){
        if(k>1){
            return k * func(k-1);
        }
        else {
            return 1;
        }
    }
public static void main(String[] args) {
    System.out.println(func(10));
}
}*/
//************************************************** input in java *********************************************************
/*import java.util.*;
public class first {
public static void main(String[] args) {
    Scanner op = new Scanner(System.in);
    int a = op.nextInt();
    System.out.println(a);
    op.close();
}
}*/
//************************************* even odd **********************************************
/*import java.util.*;
public class first {
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = value.nextInt();
    if(a%2==0){
        System.out.println("Entered number "+a+" is even . ");
    }
    else{
        System.out.println("Entered number "+a+" is odd . ");
    }
    value.close();
}
}*/
//*********************************** sum of n no *********************************************
/*import java.util.*;
public class first {
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = value.nextInt();
    int sum = 0 ;
    for (int i = 0; i <= a; i++) {
        sum = sum + i ;
    }
    System.out.println(sum);
    value.close();
}
}*/
//*********************************** table *********************************************
/*import java.util.*;
public class first {
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = value.nextInt();
    System.out.print("Till where : ");
    int b = value.nextInt();
    int sum ;
    for (int i = 1; i <= b; i++) {
        sum= a * i ;
        System.out.println(a+" * "+i+" = "+sum );
    }
    
    value.close();
}
}*/
//***************************** Pattern question ********************************************
/*import java.util.*;
public class first {
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = value.nextInt();
    //System.out.print("Till where : ");
    int b = value.nextInt();
    for (int i = 0; i <=a; i++) {
        for (int j = 0; j <=b; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    value.close();
}
}*/
//**************************************************************************************************
/*import java.util.*;
public class first {
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = value.nextInt();
    //System.out.print("Till where : ");
    int b = value.nextInt();
    for (int i = 1; i <=a; i++) {
        for (int j = 1; j <=b; j++) {
            if (i==1 || j ==1 || i == a || j == b) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    value.close();
}
}*/
//***************************************************************************************************
/*import java.util.*;
public class first {
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = value.nextInt();
    //System.out.print("Till where : ");
    int b = value.nextInt();
    for (int i = 0; i <=a; i++) {
        for (int j = 0; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    value.close();
}
}
*/
//*************************************************************************************************** 
/*import java.util.*;
public class first {
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = value.nextInt();
    //System.out.print("Till where : ");
    int b = value.nextInt();
    for (int i = a; i>=1; i--) {
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    value.close();
}
}*/
//************************************************* method af avg ***************************************
/*import java.util.*;
public class first {
    static int average(){
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the values of a,b,c :");
    int a = value.nextInt();
    //System.out.print("Till where : ");
    int b = value.nextInt();
    int c = value.nextInt();
    
        int avg = (a+b+c)/3;
        value.close();
        return avg ;
    }
public static void main(String[] args) {
    
    System.out.print("The average is : "+average());
    
}
}*/
//********************************************** sum of odd no ************************************************
/*import java.util.*;
public class first {
    static int sumofodd(){
    Scanner value = new Scanner(System.in);
    System.out.print("Enter a number :");
    int a = value.nextInt();
    //System.out.print("Till where : ");
    //int b = value.nextInt();
    //int c = value.nextInt();
    int sum = 0 ;
    for (int i = 0; i <= a; i++) {
        if (i%2!=0) {
            sum = sum + i;
        }
        
    }
        value.close();
        return sum ;
    }
public static void main(String[] args) {
    
    System.out.print("The sum of odd numbers are : "+sumofodd());
    
}
}*/
//********************************************** greater ********************************************************
/*import java.util.*;
public class first {
    static int  greaternumber(){
    Scanner value = new Scanner(System.in);
    System.out.print("Enter two numbers :");
    int a = value.nextInt();
    //System.out.print("Till where : ");
    int b = value.nextInt();
    //int c = value.nextInt();
    //int sum = 0 ;
    //for (int i = 0; i <= a; i++) {
        if (a>b) {
            //sum = sum + i;
            System.out.println(a + " is greater");
        }
        else{
            System.out.println(b + " is greater");
        }
    //}
        value.close();
        return 0 ;
    }
public static void main(String[] args) {
    
    System.out.println(greaternumber());
    
}
}*/
//***************************************************infinite loop ****************************************************************** 
/*public class first {
public static void main(String[] args) {
    do {
        System.out.println("Hi");
    } while (true);
    
}
}*/
//********************************************************* array ***********************************************************************
/*import java.util.*;
public class first {
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the size of the array : " );
    int size = value.nextInt();
    int arr[]= new int[size];
    System.out.print("Enter the values of array : ");
    for (int i = 0; i < size; i++) {
        
        arr[i] = value.nextInt();
    }
    System.out.print("Enter the key : ");
    int key = value.nextInt();
    for (int i = 0; i < size; i++) {
        if (arr[i]==key) {
            System.out.println("Index : "+ i);
        }
    }
    value.close();
}
}*/
//*************************************************************** 2d array *********************************************************************
/*import java.util.*;
public class first{
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the size of rows : ");
    int x = value.nextInt();
    System.out.print("Enter the size of columns : ");
    int y = value.nextInt();
    int [] [] arr = new int[x][y];
    System.out.println("Enter the values of array : ");
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            arr[i][j] = value.nextInt();
        }
    }
    System.out.println("Values of array : ");
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            System.out.println("["+ i +"] ["+ j +"] = " + arr[i][j]);
        }
    }
    value.close();
}
}*/
//**************************************************************** 2d array x found *****************************************************************
/*
import java.util.*;
public class first{
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the size of rows : ");
    int x = value.nextInt();
    System.out.print("Enter the size of columns : ");
    int y = value.nextInt();
    int [] [] arr = new int[x][y];
    System.out.print("Enter the value or array : ");
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            arr[i][j] = value.nextInt();
        }
    }
    System.out.print("Enter the key : ");
    int a = value.nextInt();
    for (int i = 0; i <x; i++) {
        for (int j = 0; j < y; j++) {
            if (arr[i][j]==a) {
                System.out.print("Found at : "+ "["+(i+1)+"] ["+(j+1)+"]");
            }
        }
        System.out.println();
    }
}
}
*/
//********************************************************* tranpose  ************************************************************* 
/*import java.util.*;
public class first{
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the size of rows : ");
    int x = value.nextInt();
    System.out.print("Enter the size of columns : ");
    int y = value.nextInt();
    int [] [] arr = new int[x][y];
    System.out.print("Enter the value or array : ");
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            arr[i][j] = value.nextInt();
        }
    }
    //System.out.print("Enter the key : ");
    //int a = value.nextInt();
    for (int j = 0; j <y; j++) {
        for (int i = 0; i < x; i++) {
            System.out.print("["+arr[i][j]+"]");
        }
        System.out.println();
    }
    value.close();
}
}
*/
//************************************************************************** string *************************************************
/*import java.util.*;
public class first {
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    String a ;
    a = value.nextLine();
    for (int i = 0; i < a.length() ; i++) {
        System.out.println(a.charAt(i));
    }
    System.out.println();
    value.close();
}
}*/
//******************************************************************************************************************************************
/*import java.util.*;
public class first {
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    String a = value.nextLine();
    String result = ""; 
    for (int i = 0; i < a.length() ; i++) {
        if (a.charAt(i)=='e') {
            result +='i';
        }
        else{
            result+=a.charAt(i);
        }
    }
    System.out.println(result);
    value.close();
}
}*/
//******************************************************************************************************************************************
/*import java.util.*;
public class first {
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter your email adress : ");
    String a = value.nextLine();
    String result = ""; 
    for (int i = 0; i < a.length() ; i++) {
        if (a.charAt(i)=='@') {
            break;
        }
        else{
            result+=a.charAt(i);
        }
    }
    System.out.print("Username : "+result.toUpperCase());
    value.close();
}
}*/
//**************************************************************** switch case ****************************************************************
/*import java.util.*;
public class first{
public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("Enter the size of rows : ");
    int rows = value.nextInt();
    System.out.print("Enter the size of columns : ");
    int columns = value.nextInt();
    int [] [] matrix1 = new int[rows][columns];
    int [] [] matrix2 = new int[rows][columns];
    int [] [] resultmatrix = new int[rows][columns];
    System.out.print("Enter the values of First matrix : ");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            matrix1[i][j] = value.nextInt();
        }
    }
    System.out.print("Enter the values of Second matrix : ");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            matrix2[i][j] = value.nextInt();
        }
    }
    System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
    int choice = value.nextInt();
    switch (choice) {
        case 1 :
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultmatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
            break;
        case 2 : 
    for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultmatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        break;
        case 3 : 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultmatrix[i][j] = 0;
                for (int k = 0; k < columns; k++) {
                    resultmatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        break ; 
        default:System.out.println("Invalid choice");
            break;
    }
    System.out.println("Resultant matrix is this : ");
    for (int i = 0; i < rows ; i++) {
        for (int j = 0; j <columns; j++) {
            System.out.print("["+resultmatrix[i][j] + "] ");
        }
        System.out.println();
    }
    value.close();
}
}*/
//****************************************** insertion and deletion of an element in an array  ***************************************************
/*import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        // Define the original array
        System.out.print("Enter the size of the array : ");
        int size = value.nextInt();
        int [] array = new int[size];
        System.out.print("Enter the values of array : ");
    for (int i = 0; i < size; i++) {
            array[i] = value.nextInt();
    }
        System.out.print("Original Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the element to insert: ");
        int elementToInsert = value.nextInt();
    
        System.out.print("Enter the position (0 to " + size + ") to insert the element: ");
        int position = value.nextInt();

        if (position < 0 || position > size) {
            System.out.println("Invalid position. Element cannot be inserted.");
        } else {
            int[] newArray = new int[size + 1];

            for (int i = 0; i < position; i++) {
                newArray[i] = array[i];
            }

            newArray[position] = elementToInsert;

            for (int i = position; i < size; i++) {
                newArray[i + 1] = array[i];
            }

            System.out.println("Updated Array : ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }

        }
            System.out.println("\nSize of updated array is : " +( size + 1));
        value.close();
    }
}
*/
import java.util.*;
public class first {
class Main{
    int x ; 
}
public static void main(String[] args) {
    Main obj = new Main();
    System.out.println(obj);
}
}