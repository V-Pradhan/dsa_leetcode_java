import java.util.HashSet;
import java.util.PriorityQueue;

public class Thirdmax_minheap {

    public static void main(String args[]){
        int nums[] = {2,4,3,1,4,1,4,5,6,7,1,2,3,7,3};
        System.out.println("Third max number = "+minheap(nums));
    }

    public static int minheap(int nums[]){
    PriorityQueue<Integer>pq = new PriorityQueue<>();
    HashSet<Integer>set = new HashSet<>();

    
    for(int i = 0;i<nums.length;i++){
        if(set.contains(nums[i])){
            continue;
        }

        if(pq.size()<3){
            pq.add(nums[i]);
            set.add(nums[i]);
        }
        else{
            if(nums[i]>pq.peek()){
                set.remove(pq.poll());
                pq.add(nums[i]);
                set.add(nums[i]);
            }
        }
    }
    if(pq.size() != 2) return pq.peek();
    pq.poll();
    return pq.peek();
    
}
}
