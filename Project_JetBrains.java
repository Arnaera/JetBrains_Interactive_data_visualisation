/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_jetbrains;

import java.util.Scanner;

/**
 *
 * @author Arnaera
 */
public class Project_JetBrains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    static String call_chain_func(String myString){    
    Scanner in = new Scanner(System.in);
    int i = 0;
    String Start_Map_String = "";
    String Filter_String = "";
    String Finish_Map_String = "";
    String [] SplittedStrings = myString.split("%>%");
    while ((i < SplittedStrings.length) && (("map").equals(SplittedStrings[i].substring(0, 3))))
            {
            Start_Map_String = Start_Map_String +  "(" + SplittedStrings[i].substring(SplittedStrings[i].indexOf("(")+1, SplittedStrings[i].indexOf(")")) +")&";
            i++; 
   }
    while ((i < SplittedStrings.length) && (("filter").equals(SplittedStrings[i].substring(0, 6))))
    {
            Filter_String = Filter_String +  "(" + SplittedStrings[i].substring(SplittedStrings[i].indexOf("(")+1, SplittedStrings[i].indexOf(")")) +")&";
            i++;
    }
    while ((i < SplittedStrings.length) && (("map").equals(SplittedStrings[i].substring(0, 3)))) 
    {
            Finish_Map_String = Finish_Map_String +  "(" + SplittedStrings[i].substring(SplittedStrings[i].indexOf("(")+1, SplittedStrings[i].indexOf(")")) +")&";
            i++;
    }
    System.out.println(Start_Map_String);
    System.out.println(Filter_String);
    System.out.println(Finish_Map_String);
     if((Start_Map_String.lastIndexOf("&") == Start_Map_String.length()-1) && (Start_Map_String.length() != 0))
     {  
     Start_Map_String = Start_Map_String.substring(0, Start_Map_String.length()-1);
     }
     if((Filter_String.lastIndexOf("&") == Filter_String.length()-1) && (Filter_String.length() != 0))
     {  
     Filter_String = Filter_String.substring(0, Filter_String.length()-1);
     }
     if((Finish_Map_String.lastIndexOf("&") == Finish_Map_String.length()-1) && (Finish_Map_String.length() != 0 ))
     {  
     Finish_Map_String = Finish_Map_String.substring(0, Finish_Map_String.length()-1);
     }
     if (!"".equals(Start_Map_String))
     {
     Finish_Map_String = Finish_Map_String.replace("element", Start_Map_String);
     }
     if (!"".equals(Start_Map_String))
     {
     Filter_String = Filter_String.replace("element", Start_Map_String);
     }
     if ("".equals(Finish_Map_String))
     {
         Finish_Map_String = "element";
     }
     String Finish_String = "filter{" + Filter_String + "}%>%map{"+ Finish_Map_String + "}";
     i = 0;
     if(myString.equals(SplittedStrings[i]))
    {
        return ("TYPE ERROR");
    }
     else{
     return(Finish_String);
     }  
     }
}
    
