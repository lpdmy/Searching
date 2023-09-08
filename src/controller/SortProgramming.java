/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import model.Element;
import view.Menu;

public class SortProgramming extends Menu<String> {

    static String[] mc = {"Linear Search", "Binary Search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SortProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }

    @Override
            public void execute(int n) {
                int value;
                switch (n) {
                    case 1:
                        algorithm.buddleSort(array);
                        library.display(array);
                        value = library.getInt("\nEnter number to find: ", 1, 100);
                        if (algorithm.linearSearch(array, value) == -1) {
                            System.out.println("No value in array");
                        } else {
                            System.out.println("Found value: " + value + " at index: " + algorithm.linearSearch(array, value));
                        }
                        break;
                    case 2:
                        algorithm.buddleSort(array);
                        library.display(array);
                        value = library.getInt("\nEnter number to find: ", 1, 100);
                        if (algorithm.binarySearch(array, value) == -1) {
                            System.out.println("No value in array");
                        } else {
                            System.out.println("Found value: " + value + " at index: " + algorithm.binarySearch(array, value));
                        }
                        break;

                    case 3:
                        System.exit(0);
                        break;
                }
            }

   
}
