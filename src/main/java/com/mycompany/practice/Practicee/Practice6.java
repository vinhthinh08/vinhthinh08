/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Practicee;
public class Practice6 {
public String maHoa(String vanBan){
// gan gia tri cho chuoi
vanBan=vanBan.toUpperCase();
String s ="";
for(int i=0;i<vanBan.length();i++)if(vanBan.charAt(i)==' ')s+=" ";
else if(vanBan.charAt(i)+5>'Z')s = s + (char)('A'+vanBan.charAt(i)-'Z'+5);
else s=s+ (char)((vanBan.charAt(i)+5));
return s;
}
public String giaiMa(String vanBan){
vanBan=vanBan.toUpperCase();
String s ="";
for(int i=0;i<vanBan.length();i++)if(vanBan.charAt(i)==' ')s+=" ";
else if(vanBan.charAt(i)<'A')s= s+ (char)(vanBan.charAt(i)-5+'Z');
else s = s + (char)((vanBan.charAt(i)-5));
return s;
}  
}
