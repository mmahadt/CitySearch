/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mmahad.bese14seecs
 */
public class Lab05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Parse and read CSV file
        String csvFile = "C:/Users/mmahad.bese14seecs/Documents/NetBeansProjects/Lab05/src/lab05/GeoLiteCity-Location.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] GeoLiteCity_Location = line.split(cvsSplitBy);

                System.out.println("Country [code= " + GeoLiteCity_Location[1] + " , name=" + GeoLiteCity_Location[0] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        ///////////////////////////////////////////////////////////////
    }
    
}
