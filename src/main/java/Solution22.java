/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Scanner;

public class Solution22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = new int[100];

        int count = 0;

        int largest = 0;

        boolean yn = true;
        while(yn) {

            System.out.print("Enter any number.");
            int x = input.nextInt();

            System.out.println("enter another number : yes or no");
            String decision = input.nextLine();


            switch(decision)
            {
                case "yes":
                    yn = true;
                    break;

                case "no":
                    yn = false;
                    break;

                default:
                    System.out.println("please enter again ");
                    boolean repeat = true;

                    while (repeat)
                    {
                        System.out.println("enter another number : yes or no");
                        decision = input.nextLine();

                        switch (decision)
                        {
                            case "yes":
                                yn = true;
                                repeat = false;
                                break;

                            case "no":
                                yn = repeat = false;
                                break;
                            default:
                                repeat = true;
                        }
                    }
                    break;
            }

            if (contain(nums, x)) {
                System.out.println("Number already entered. Please Enter a different number.");
                continue;

            }

            nums[count++] = x;
            largest = Math.max(x, largest);

        }

        System.out.println("The largest number is " + largest);
        input.close();

    }

    public static boolean contain(int[] nums, int x) {

        for (int n : nums)
            if (n == x)

                return true;
        return false;
    }

}
