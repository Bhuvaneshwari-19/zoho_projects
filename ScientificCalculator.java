/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scientificCalculator;
import java.util.Scanner;
public class ScientificCalculator {
    public static void main(String[] args) {
        System.out.println("\t\tSCIENTIFIC CALCULATOR");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("1. Arithmetic operation");
        System.out.println("2. Trigonometric operation");
        System.out.println("3. Square Root");
        System.out.println("4. Logarithm");
        System.out.println("5. Exponential");
        System.out.println("6. Factorial");
        System.out.println("7. Value of Pi");
        System.out.println("Enter your choice: ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1->{
              arithmetic();  
            }
            case 2->{
                trigonometric();
            }
            case 3->{
                sqrt();
            }
            case 4->{
                logarithm();
            }
            case 5->{
                exponents();
            }
            case 6->{
                factorial();
            }
            case 7->{
                System.out.println("The value of Pi is: 3.14159265358979323846264");
                break;
            }
                
                
        }
    }
    
    static void arithmetic(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4.Division");
        System.out.println("Enter your choice: ");
        int ch=sc.nextInt();
        switch(ch){
            case 1->{
                System.out.println("Enter number 1:");
                int n1=sc.nextInt();
                System.out.println("Enter number 2:");
                int n2=sc.nextInt();
                System.out.println(n1+" + "+n2+" = "+(n1+n2));
                break;
            }
            case 2->{
                System.out.println("Enter number 1:");
                int n1=sc.nextInt();
                System.out.println("Enter number 2:");
                int n2=sc.nextInt();
                System.out.println(n1+" - "+n2+" = "+(n1-n2));
                break;
            }
            case 3->{
                System.out.println("Enter number 1:");
                int n1=sc.nextInt();
                System.out.println("Enter number 2:");
                int n2=sc.nextInt();
                System.out.println(n1+" * "+n2+" = "+(n1*n2));
                break;
            }
            case 4->{
                System.out.println("Enter number 1:");
                int n1=sc.nextInt();
                System.out.println("Enter number 2:");
                int n2=sc.nextInt();
                System.out.println(n1+" / "+n2+" = "+(n1/n2));
                break;
            }
            default-> System.out.println("Enter valid option.");
        }
    }
    
    static void trigonometric(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. sin\n2. cos\n3.tan");
        System.out.println("enter your choice");
        int ch=sc.nextInt();
        switch(ch){
            case 1->{
                System.out.println("Enter the degree value: ");
                int deg=sc.nextInt();
                System.out.println("The sin "+deg+" value is : "+Math.sin(deg));
                break;
            }
            case 2->{
                System.out.println("Enter the degree value: ");
                int deg=sc.nextInt();
                System.out.println("The cos "+deg+" value is : "+Math.cos(deg));
                break;
            }
            case 3->{
                System.out.println("Enter the degree value: ");
                int deg=sc.nextInt();
                System.out.println("The tan "+deg+" value is : "+Math.tan(deg));
                break;
            }
            default-> System.out.println("Enter valid option.");
        }
    }
    
    static void sqrt(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to find square root:");
        int n=sc.nextInt();
        System.out.println("The square root of "+n+" is "+Math.sqrt(n));
    }
    
    static void logarithm(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Natural logarithm(base e)\n2. Logarithm Base 10\n3. Logarithm with other base");
        int ch=sc.nextInt();
        switch(ch){
            case 1->{
                System.out.println("Enter the number to find log");
                double naturalLog=sc.nextDouble();
                System.out.println("The natural logarithm of "+naturalLog+" is "+Math.log(naturalLog));
            }
            case 2->{
                System.out.println("Enter the number to find log");
                double base10Log=sc.nextDouble();
                System.out.println("The logarithm base 10 of "+base10Log+" is "+Math.log(base10Log));
            }
            case 3->{
                System.out.println("Enter the number to find log");
                double numberLog=sc.nextDouble();
                System.out.println("Enter the base value: ");
                double baseValue=sc.nextDouble();
                System.out.println("The logarithm of "+numberLog+" with base "+baseValue+" is "+(Math.log(numberLog) / Math.log(baseValue)));
            }
        }
    }
    
    static void exponents(){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number and its power, separated by a space: ");
        int a=sc.nextInt();
        int p=sc.nextInt();
        System.out.println("The value of "+a+" raised to the power of "+p+" is "+Math.pow(a, p));
    }
    
    static void factorial(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int num=sc.nextInt();
        int fact= 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("The factorial of "+num+" is "+fact);
    }
}
