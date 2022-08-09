class Solution {
public int majorityElement(int[] nums) {
Arrays.sort(nums);
int c=1,ans=0,next=0;
if(nums.length==1)
return nums[0];
else
{
for(int i=0;i<nums.length-1;i++)
{
next=nums[i+1];
if(nums[i]==next)
{
c++;
if(c>nums.length/2)
{
ans=nums[i];
break;
}
}
else
c=1;
}
return ans;

}
}
}