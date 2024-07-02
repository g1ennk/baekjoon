class Solution {
    public int solution(int chicken) {
        int freeChicken = 0;
        int coupons = chicken;
        
        while(coupons >= 10) {
            int newFreeChicken = coupons / 10;
            freeChicken += newFreeChicken;
            coupons = newFreeChicken + (coupons % 10);
        }
        
        return freeChicken;
    }
}