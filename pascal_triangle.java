class Solution {
    public List<Integer> generateRow(int rowNum){
        List<Integer> ls=new LinkedList<Integer>();
        ls.add(1);
        int ans=1;
        for(int i=1;i<rowNum;i++){
            ans=ans*(rowNum-i);
            ans=ans/i;
            ls.add(ans);
        }
        return ls;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tempList= new LinkedList<>();
        for(int i=1;i<=numRows;i++){
            tempList.add(generateRow(i));
        }
        return tempList;
    }
}
