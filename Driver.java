/*
Author: Christopher Roberts
E-mail: cmr663@psu.edu
Course: CMPSC 221
Assigment: Programming Assigment 1
Due Date: 2/18/2020
File: Trivia.java
Purpose: Java app that implements a trivia game using JOptionplane
Compiler/IDE: IntelliJ IDEA
Operating System: MS Windows 10
References: https://www.geeksforgeeks.org/arraylist-in-java/, https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#listIterator--, https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
 */

import javax.swing.*;
import java.util.*;
class Driver {
    int n = 10;
    public static void main(String[] args)
    {

        Random rand = new Random();
        String response = "";
        int response2 = 0;
        String defResponse = "Your answer?";
        String cancelMes = "I guess this one is not for you.";

        ArrayList<QnA> Storage = new ArrayList<QnA>(11);
        QnA obj1 = new QnA("Diamonds are made up almost entirely of what element?", "CARBON");
        QnA obj2 = new QnA("What natural phenomena are measured by the Richter scale?","EARTHQUAKES");
        QnA obj3 = new QnA("Which animal has the longest tongue relative to its total size?","CHAMELEON");
        QnA obj4 = new QnA("What is information collected through formal observation or measurement called?","DATA");
        QnA obj5 = new QnA("When you are awake and alert, your brain wave pattern consists primarily of __________ waves.","BETA");
        QnA obj6 = new QnA("The founder of psychology is ______.","WILHELM WUNDT");
        QnA obj7 = new QnA("What is the ability that allows to see objects in three dimensions although the images that strike the retina are two-dimensional; allows us to judge distance.","DEPTH PERCEPTION");
        QnA obj8 = new QnA("What do you call the number of complete wavelengths that pass a point in a given time?","FREQUENCY");
        QnA obj9 = new QnA("What is a tone's experienced highness or lowness; depends on frequency","PITCH");
        QnA obj10 = new QnA("What is the area of the brain stem that controls heart rate and breathing?","MEDULLA");
        Storage.add(obj1);
        Storage.add(obj2);
        Storage.add(obj3);
        Storage.add(obj4);
        Storage.add(obj5);
        Storage.add(obj6);
        Storage.add(obj7);
        Storage.add(obj8);
        Storage.add(obj9);
        Storage.add(obj10);
        QnA obj = new QnA("","");

        JOptionPane.showMessageDialog(null, "Welcome to the Science trivia game!");

        do{
            obj = Storage.get(rand.nextInt(Storage.size()));
            response = obj.displayQuestion();
            if (response == null || response.equals(defResponse))
            {
                JOptionPane.showMessageDialog(null, cancelMes);
                response2 = JOptionPane.showConfirmDialog(null, "Would you like to play again?");
            }
            else if(obj.checkAnswer(response)){
                JOptionPane.showMessageDialog(null, "You are Correct!");
                response2 = JOptionPane.showConfirmDialog(null, "Would you like to play again?");
            }
            else if (!obj.checkAnswer(response))
            {
                JOptionPane.showMessageDialog(null, "That is not correct!");
                response2 = JOptionPane.showConfirmDialog(null, "Would you like to play again?");
            }
        }while (response2 == 0);


    }

}
