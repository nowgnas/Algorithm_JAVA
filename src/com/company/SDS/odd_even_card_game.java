package com.company.SDS;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
*
3
8
1 4 4 12 3 17 18 4
10
17 11 16 1 19 18 13 12 8 13
20
3 3 5 14 5 11 17 18 1 5 13 14 3 14 18 6 2 7 13 13
*/
public class odd_even_card_game {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());
        System.out.println(test);

        for (int i = 0; i < test; i++) {
            String[] cardNum = br.readLine().split(" ");
            ArrayList<String> cardList = new ArrayList<>(Arrays.asList(cardNum));
            Collections.sort(cardList);
        }
    }
}
