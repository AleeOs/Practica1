/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Alexis
 */
public class Helper {
    
    public static int RetornarValor(String Nombre){
    
        int numero=0;
        int letra=0;
        
        for (int j = 0; j < Nombre.length(); j++){
         boolean flag = Character.isDigit(Nombre.charAt(j));
         if (flag){
             
             numero++;
             
         }
         else {
             
             letra++;
         }
         
        }
        
     return numero;
     
    }
        
public static int RetornarCE (String Nombre)
{
    int ce=0;
    
    for (int j = 0; j < Nombre.length(); j++){
        boolean flag = Character.isLetter(Nombre.charAt(j));
        
        if(!flag) {
                //System.out.println("'"+ nombre.charAt(j)+"' is a number");
                if(Nombre.charAt(j)=='@')
                {
                    ce++;
                }
                 if(Nombre.charAt(j)=='~')
                {
                    ce++;
                }
                 if(Nombre.charAt(j)=='/')
                {
                    ce++;
                }
                 if(Nombre.charAt(j)==';')
                {
                    ce++;
                }
                 if(Nombre.charAt(j)==':')
                {
                    ce++;
                }
                 if(Nombre.charAt(j)=='"')
                {
                    ce++;
                }
                 if(Nombre.charAt(j)=='!')
                {
                    ce++;
                }
                  if(Nombre.charAt(j)==' ')
                {
                    ce++;
                }
             }
           

        }
        return ce;
    }
        









//cedula
 public static int RetornarValor1(String Cedula){
    
        int numero1=0;
        int letra1=0;
        
        for (int j = 0; j < Cedula.length(); j++){
         boolean flag = Character.isDigit(Cedula.charAt(j));
         if (flag){
             
             numero1++;
             
         }
         else {
             
             letra1++;
         }
         
        }
        
     return letra1;
     
    }
        
public static int RetornarCE1 (String Cedula)
{
    int ce=0;
    
    for (int j = 0; j < Cedula.length(); j++){
        boolean flag = Character.isDigit(Cedula.charAt(j));
        
        if(!flag) {
                //System.out.println("'"+ nombre.charAt(j)+"' is a number");
                if(Cedula.charAt(j)=='@')
                {
                    ce++;
                }
                 if(Cedula.charAt(j)=='~')
                {
                    ce++;
                }
                 if(Cedula.charAt(j)=='/')
                {
                    ce++;
                }
                 if(Cedula.charAt(j)==';')
                {
                    ce++;
                }
                 if(Cedula.charAt(j)==':')
                {
                    ce++;
                }
                 if(Cedula.charAt(j)=='"')
                {
                    ce++;
                }
                 if(Cedula.charAt(j)=='!')
                {
                    ce++;
                }
                  if(Cedula.charAt(j)==' ')
                {
                    ce++;
                }
             }
           

        }
        return ce;
    }
        



//telefono 

public static int RetornarValor2(String Telefono){
    
        int numero2=0;
        int letra2=0;
        
        for (int j = 0; j < Telefono.length(); j++){
         boolean flag = Character.isDigit(Telefono.charAt(j));
         if (flag){
             
             numero2++;
             
         }
         else {
             
             letra2++;
         }
         
        }
        
     return letra2;
     
    }
        
public static int RetornarCE2 (String Telefono)
{
    int ce=0;
    
    for (int j = 0; j < Telefono.length(); j++){
        boolean flag = Character.isDigit(Telefono.charAt(j));
        
        if(!flag) {
                //System.out.println("'"+ nombre.charAt(j)+"' is a number");
                if(Telefono.charAt(j)=='@')
                {
                    ce++;
                }
                 if(Telefono.charAt(j)=='~')
                {
                    ce++;
                }
                 if(Telefono.charAt(j)=='/')
                {
                    ce++;
                }
                 if(Telefono.charAt(j)==';')
                {
                    ce++;
                }
                 if(Telefono.charAt(j)==':')
                {
                    ce++;
                }
                 if(Telefono.charAt(j)=='"')
                {
                    ce++;
                }
                 if(Telefono.charAt(j)=='!')
                {
                    ce++;
                }
                  if(Telefono.charAt(j)==' ')
                {
                    ce++;
                }
             }
           

        }
        return ce;
    }
        
}


    





    
        
    
       
     
    
    
    

