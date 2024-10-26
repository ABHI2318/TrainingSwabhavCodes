package com.aurion.test;
import java.util.Arrays;



import java.util.List;
import java.util.stream.Collectors;

public class StreamsAssign {
    public static void main(String[] args) {
        String[] namesArray = {"Jayesh", "Nimesh", "Mark", "Mahesh", "Ramesh"};

        // Q4
        List<String> namesList = Arrays.asList(namesArray);

      
        List<String> firstThreeChars = namesList.stream()
                .map(name -> name.length() >= 3 ? name.substring(0, 3) : name)  
                .collect(Collectors.toList());


        System.out.println(firstThreeChars);
        
        //Q5
        List<String> shortNames = namesList.stream()
                .filter(name -> name.length() <= 4)  
                .collect(Collectors.toList());


        System.out.println(shortNames);
    }
}
