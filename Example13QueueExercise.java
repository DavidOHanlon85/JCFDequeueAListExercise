package slideDeckChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.jar.Attributes.Name;

public class Example13QueueExercise {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		Collections.addAll(list, "Aidan", "Claire", "Niamh", "Una", "Annie");
		
		Queue<String> names = new LinkedList<String>(list);
		
		while(!names.isEmpty()) {
			System.out.println("Dequeue ...");
			System.out.println(names.poll());
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(names);
		
		Queue<String> names2 = new PriorityQueue<String>(list);
		
		while(!names2.isEmpty()) {
			System.out.println("Dequeue ...");
			System.out.println(names2.poll());
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
