package com.Bridgelab;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class SwapToNumber {
    static Logger logger = Logger.getLogger(SwapToNumber.class);

    public static void main(String[] args){

        BasicConfigurator.configure();
        logger.info("enter a number A");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        logger.info("enter second number B you want to exchange with ");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp ;
        logger.info("value of A "+a);
        logger.info("value of B "+b);
    }
}
