/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Umman Hasan
 */
public class Utils
{
     public static String firstLetterUppercase(String value) {
        /*ilk herf adinda (firstLetter) bir deyisken yaziriq verilen sozun ilk 
        herfini tapiriq substring(0,1)-in komekliyi ile, ilk herfi toUpperCase()
        methodunun komekliyi ile BOYUK herfe seviririk
        */
        String firstLetter = value.substring(0, 1).toUpperCase();
        /*herfler adinda yeni (letters) bir deyisken yaziriq verilen sozun qalan 
        herflerini tapiriq substring(1, value.length())-in komekliyi ile, basqa
       herflerin hamisni toLowerCase()-in komekliyi ile balaca herfle yaziriq
        */
        String letters = value.substring(1, value.length()).toLowerCase();
        return firstLetter + letters;
    }
}
