/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int cont=0,suma=0;
       System.out.println("ingresa cantidad de numeros a ingresar");              
       int c = sc.nextInt();
        while(cont!=c){
       System.out.println("Ingresa numero");   
       int num=sc.nextInt();
       if(num%3==0){
       suma=suma+num;
       }
       cont++;
       }
        System.out.println("Suma de multiplos de 3 es:"+suma);               
    }
}