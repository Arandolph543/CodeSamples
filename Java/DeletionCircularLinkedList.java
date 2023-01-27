/*Description: Given a linkedlist delete k node given from the linkedlist.
Author: April Randolph
Date: 01/23/23
 */
import java.lang.*;
import java.io.*;

class Node {
    int value;
    Node right,left;
    Node(int value) {
        data = value;
        left=right=null;
    }
}

public class DeletionCircularLinkedList


    public static void main(String[] args) {
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in)));
            System.out.println("Please enter the numbers as a list: ");
            String input = buff.readLine();

        } catch(IOException ex) {
            System.out.println(ex);
        }
    }
}
