/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Practicee;

/**
 *
 * @author Admin
 */
public class Practice14_15 {
     public String removeNonLetter(String s){
       s = s.replaceAll("[^a-zA-Z ]","");
       s = s.replaceAll("\\s+ ", " ").trim();
       return s;
   }
   public String removeBank(String s){
       s = s.strip();
       return s;
   }
   /*public int demTu(String s){
       int dem =1;
       if(s.isEmpty())return 0;
       if(s.charAt(0)!=' '&&s.charAt(s.length()-1)!=' '){
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==' ')dem++;
       }
    }
    else{
        s = removeBank(s);
        dem=demTu(s);
    }
       return dem;
   }*/
   public String chuanHoa(String vanBan){
       
       vanBan = removeNonLetter(vanBan);
       vanBan=vanBan.toLowerCase();
    String[] string = vanBan.split(" ");
    for(int i=0;i<string.length;i++){
        string[i]=string[i].substring(0, 1).toUpperCase() + string[i].substring(1);
    }
    String s="";
    for (String string2 : string) s=s+" "+string2;
    return s+"\n chuoi co "+(string.length)+" tu";
    } 
    
}
