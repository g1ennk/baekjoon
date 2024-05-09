#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    // 초기화
    int lambSkewersPrice = 12000;
    int drinkPrice = 2000;
    int freeDrinkCount = n / 10;

    // 양꼬치 계산
    int totalSkewerPrice = lambSkewersPrice * n;
    
    // 음료수 계산
    int totalDrinkPrice = drinkPrice * (k - freeDrinkCount);
    
    // 총 계산
    int totalPrice = totalSkewerPrice + totalDrinkPrice;
    
    return totalPrice;
}