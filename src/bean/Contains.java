/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Umman Hasan
 */
public class Contains
{

    public static boolean arrayContains(int[] array, int number) {
        for (int value : array) {
            if (number == value) {
                return true;
            }
        }
        return false;
    }
}
