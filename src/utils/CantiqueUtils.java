/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import resources.textes.CantiqueFiles;

/**
 *
 * @author blaise
 */
public class CantiqueUtils {
    private static File file;
    public static String getCantiqueString(int number){
        if(number < 0 || number > 654) return "Entrez un numero compris entre 1 et 654 ";
        try {
            InputStream is = CantiqueFiles.class.getResourceAsStream("/resources/textes/H"+number+".txt");
            Scanner sc = new Scanner(is, StandardCharsets.UTF_8);
            String content = "";
            while (sc.hasNextLine()) {                
                content += "\n" + sc.nextLine();
            }
//            List<String> lines = Files.readAllLines(file.toPath());
            return content;
        } catch (Exception ex) {}
        return "Entrez un numero compris entre 1 et 654 ";
    }
}
