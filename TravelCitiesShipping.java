import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TravelCitiesShipping {
    
	public static class LinkedListNode{
        String val;
        LinkedListNode next;
    
        LinkedListNode(String node_value) {
            val = node_value;
            next = null;
        }
    };
    
    public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, String val){
        if(head == null) {
            head = new LinkedListNode(val);
        }
        else {
            LinkedListNode end = head;
            while (end.next != null) {
                end = end.next;
            }
            LinkedListNode node = new LinkedListNode(val);
            end.next = node;
        }
        return head;
    }
	
	static LinkedListNode updateRoute(LinkedListNode initialRoute, String[] citiesToSkip) {
		

    }
	
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        LinkedListNode res;
        
        int initialRoute_size = 0;
        initialRoute_size = Integer.parseInt(in.nextLine());
        int initialRoute;
        String initialRoute_item;
        LinkedListNode initialRoute = null;
        for(initialRoute = 0; initialRoute < initialRoute_size; initialRoute++) { 
            try {
                initialRoute_item = in.nextLine();
            } catch (Exception e) {
                initialRoute_item = null;
            }
            initialRoute = insert_node_into_singlylinkedlist(initialRoute, initialRoute_item);
        }
        
        
        int citiesToSkip_size = 0;
        citiesToSkip_size = Integer.parseInt(in.nextLine());
        String[] citiesToSkip = new String[citiesToSkip_size];
        String citiesToSkip_item;
        for(int citiesToSkip_i = 0; citiesToSkip_i < citiesToSkip_size; citiesToSkip_i++) {
            try {
                citiesToSkip_item = in.nextLine();
            } catch (Exception e) {
                citiesToSkip_item = null;
            }
            citiesToSkip[citiesToSkip_i] = citiesToSkip_item;
        }
        
        res = updateRoute(initialRoute, citiesToSkip);
        while (res != null) {
            bw.write(res.val);
            bw.newLine();
            res = res.next;
        }
        
        bw.close();
    }
}
