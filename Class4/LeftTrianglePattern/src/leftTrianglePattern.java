import java.util.Scanner;

public class leftTrianglePattern  
{    
public static void main(String args[])   
{    
//i for rows and j for columns      
//row denotes the number of rows you want to print  
int i, j;    
//Outer loop work for rows  
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
for (i=1; i<=row; i++)   
{  
//inner loop work for space      
for (j=2*(row-i); j>=0; j--)         
{  
//prints space between two stars      
System.out.print(" ");   
}   
//inner loop for columns  
for (j=0; j< 2*i - 1; j++ )   
{   
//prints star      
System.out.print("*");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   
}  