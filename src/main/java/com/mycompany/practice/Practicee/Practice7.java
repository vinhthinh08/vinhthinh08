/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Practicee;

/**
 *
 * @author Admin
 */
public class Practice7 {
    public boolean isNguyenTo(int n){
        int count =0;
        for(int i =1;i<=n;i++)if(n%i==0)count++;
        return count==2;
    }
    public boolean isSuperNguyenTo(int n){
        while(n>0){
            if(isNguyenTo(n))n/=10;
            else return false;
        }
        return true;
    }
    public String hienThi(int n) {
        String s ="So sieu nguyen to co "+n+" chu so la : ";
        int ketThuc = (int)Math.pow(10,n)-1;//voi n =4 thi ket thuc = 9999
        int batdau =(int)Math.pow(10,n-1);//voi n =4 thi bat dau  =1000
        for(int i=batdau;i<ketThuc;i++)if(isSuperNguyenTo(i))s=s+i+" ";
        return s;
    }
}
