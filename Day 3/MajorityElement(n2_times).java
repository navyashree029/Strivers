//Optimal approach
class Solution {
    public int majorityElement(int[] v) {
        int n = v.length;
        int ele = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(cnt == 0){
                ele = v[i];
                cnt = 1;
            }
            else if(ele == v[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return ele;
        
    }
}




// Better appraoch:
class Solution {
    public int majorityElement(int[] v) {
        int n = v.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }
}





//Brute force method
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int cnt =0;
            for(int j = 0;j < n; j++){
                if(nums[j] == nums[i])
                {
                    cnt++;
                }
            }
            if(cnt > (n/2)) return nums[i];
        }
     return -1;
    }

}
