/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_jetbrains;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static project_jetbrains.Project_JetBrains.call_chain_func;
/**
 *
 * @author Arnaera
 */
public class Project_Tests {
    
    @Test
  public void test() {
    String firstIn ="filter{(element>10)}%>%filter{(element<20)}";
    String secondIn ="map{(element+10)}%>%filter{(element>10)}%>%map{(element*element)}";
    String thirdIn ="filter{(element>0)}%>%filter{(element<0)}%>%map{(element*element)";
    String forthIn ="dadaefefsfr";
    String fifthIn ="123124352452";
    String sixthIn ="map{(5*element)}%>%filter{(element>3)}%>%filter{(element<15)}%>%map{(e*element)}";
    assertEquals("filter{(element>10)&(element<20)}%>%map{element}",  call_chain_func(firstIn));
    assertEquals("filter{((element+10)>10)}%>%map{((element+10)*(element+10))}",  call_chain_func(secondIn));
    assertEquals("filter{(element>0)&(element<0)}%>%map{(element*element)}", call_chain_func(thirdIn));
    assertEquals("TYPE ERROR",call_chain_func(forthIn));
    assertEquals("TYPE ERROR",call_chain_func(fifthIn));
    assertEquals("filter{((5*element)>3)&((5*element)<15)}%>%map{(e*(5*element))}",call_chain_func(sixthIn));
  }
    } 
    
