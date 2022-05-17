/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Practicee;

/**
 *
 * @author Admin
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class Practice3 {
   public String hienthi(){
       String s="";               
        double[][] weather = new double[10][4];
        
        //Doc file vao mang 2 chieu
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\weather.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bfr = new BufferedReader(isr);
            String line = bfr.readLine();
            int row = 0;
            while(line != null){
                String[] array = line.split(" ");
                for (int col = 0; col < 4; col++){
                    weather[row][col] = Double.parseDouble(array[col]);
                }
                row++;
                line = bfr.readLine();
            }
            fis.close();
            isr.close();
            bfr.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        //for (int row = 0; row < 10; row++){
        //    for (int col = 0; col < 4; col++)
        //        System.out.print(weather[row][col] + " ");
        //    System.out.println();
        //}
        
        //Tinh trung binh cong NHIET DO va DO AM
        double avgTemp = 0;
        double avgHum = 0;
        for (int row = 0; row < 10; row++){
            avgTemp += weather[row][2];
            avgHum += weather[row][3];
        }
        avgTemp = avgTemp/10;
        avgHum = avgHum/10;
        
        //In ket qua ra man hinh
        s+="Nhiet do trung binh la: " + avgTemp;
        s+="\nDo am trung binh la: " + avgHum;
        return s;
    } 
    
}
