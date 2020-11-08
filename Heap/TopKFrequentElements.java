class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue() - b.getValue());
        
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            pq.add(e);
            if(pq.size()>k)
                pq.poll();
        }
        
        int[] res = new int[k];
        for(int i=0;i<res.length;i++){
            res[i] = pq.poll().getKey();}
        
        return res;
    
    }
}