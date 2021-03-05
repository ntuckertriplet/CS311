import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import edu.iastate.cs311.hw2.Heap;
import org.junit.jupiter.api.Test;

public class HeapTest {

    @Test
    public void CreateHeap() {

        Heap<Integer> pq = new Heap<>();

        pq.add(10);
        pq.add(15);
        pq.add(20);
        pq.add(30);
        pq.add(25);
        pq.add(25);
        pq.add(30);
        pq.add(40);
        pq.add(35);
        pq.add(50);
        pq.add(10);
        pq.showHeap();
        System.out.println(pq.getLastInternal());
        pq.trimEveryLeaf();
        pq.showHeap();
        while (!pq.isEmpty()) {
            System.out.println(pq.removeMin());
        }

        List<String> alist = new ArrayList<String>();
        alist.add("TGA");
        alist.add("ACG");
        alist.add("GCT");
        alist.add("GTA");
        System.out.println("Before sorting: " + alist.toString());
        Heap.heapSort(alist);System.out.println("After sorting: " + alist.toString());
    }
}
