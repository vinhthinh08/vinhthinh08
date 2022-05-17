/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Practicee;

/**
 *
 * @author Admin
 */
public class Practice1 {
    public String ketqua() {
        char[][] a = {{'A','B','A','C','C','D','E','E','D','E'},{'D','B','A','B','C','A','E','E','A','D'},{'E','D','D','A','C','B','E','E','A','D'},
        {'E','D','D','A','C','B','E','E','A','D'},{'C','B','A','E','D','C','E','E','A','D'},{'A','B','D','C','C','E','E','A','D','E'},
        {'B','B','E','C','C','D','E','E','A','D'},{'B','B','A','C','C','D','E','A','D','E'},{'E','B','E','C','C','D','E','E','A','D'}};
        char[] ketqua ={'D','B','D','C','C','D','A','E','A','D'};
        String s="";
        s+="| Sinh vien | Diem |";
        s+="\n|--------------|---------|";
        for( int i =0;i<a.length;i++){
            int  diem =10;
            for(int j =0;j<a[i].length;j++){
                if(a[i][j]!=ketqua[j])diem--;
            }
            s+="\n|       "+(i+1)+"         |    "+diem+"     |";
        }
        return s;
    }
    
}
