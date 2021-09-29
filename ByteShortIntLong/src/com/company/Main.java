package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByteMin = Byte.MIN_VALUE;
        byte myByteMax = Byte.MAX_VALUE;
        int myIntergerMin = Integer.MIN_VALUE;
        int myIntergerMax = Integer.MAX_VALUE;
        double myDoubleMin = Double.MIN_VALUE;
        double myDoubleMax = Double.MAX_VALUE;

        System.out.printf("byte min is %d & max value is %d \n", myByteMin , myByteMax);
        System.out.printf("Int min is %d & max value is %d \n", myIntergerMin, myIntergerMax);
        System.out.printf("Double min is %e & max value is %e \n", myDoubleMin, myDoubleMax);

    }
}
