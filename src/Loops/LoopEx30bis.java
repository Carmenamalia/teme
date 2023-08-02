package Loops;

import java.util.Scanner;

/*
    #
   ###
  #####
 #######
#########
 */
public class LoopEx30bis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            /* 2*1+1=3
                2*2+1=5
                2*3+1=7
             */
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("#");
            }System.out.println();
        }

    }
}

