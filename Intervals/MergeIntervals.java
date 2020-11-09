class Solution {
    public int[][] merge(int[][] intervals) {
    
          int len = intervals.length;
          int[] start = new int[len];
          int[] end = new int[len];
          
          for(int i=0;i<len;i++) {
              start[i] = intervals[i][0];
              end[i] = intervals[i][1];
          }
          
          Arrays.sort(start);
          Arrays.sort(end);
          List<int[]> res = new LinkedList<>();
          
          for(int i=0,j=0;i<len;i++) {
              if( i == len-1 || start[i+1] > end[i]) {
                  res.add(new int[]{start[j],end[i]});
                  j = i+1;
              }
          }
          
          return res.toArray(new int[res.size()][]);
      }
  }