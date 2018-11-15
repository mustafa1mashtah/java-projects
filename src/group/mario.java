package group;

import java.util.Scanner;

public class mario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me a pyramid Hight!");
        Integer hight;


        hight = scanner.nextInt();
        while (!(hight>0 && hight<24)) {
            System.out.println("give me a pyramid Hight!");
            hight = scanner.nextInt();
        }

            Integer sum = hight + 1;
            Integer spaces = hight - 1;
            Integer hashes = sum - spaces;


            for (int i = 0; i < hight; i++) {
                for (int j = 0; j < spaces; j++) {


                    System.out.print(" ");
                }


                for (int j = 0; j < hashes; j++) {
                    System.out.print("#");

                }
                System.out.format("\n");
                spaces--;
                hashes++;

            }

        }

        }



