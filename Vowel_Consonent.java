package com.Bridgelab;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Vowel_Consonent {
    static Logger logger = Logger.getLogger(Vowel_Consonent.class);

    public static void main(String[] args){

        BasicConfigurator.configure();

        logger.info("enter a alphabet to check for vowel or consonant");
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        switch (ch)
        {
            case 'a' :

            case 'e' :

            case 'i' :

            case 'o' :

            case 'u' :
                logger.info("enter character is an vowel");
                break;
            default:
                logger.info("entered character is an consonant");
        }


    }
}
