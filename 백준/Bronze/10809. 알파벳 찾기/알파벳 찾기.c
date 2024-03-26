#include <stdio.h>

int main()

{
    // 문자열 입력 받기
    char inputArr[100];
    scanf("%s", inputArr);

    // -1로 전체 초기화
    int alphabetArr[27];
    for (int i = 0; i < 26; i++)
    {
        alphabetArr[i] = -1;
    }

    // 돌면서 저장
    for (int i = 0; inputArr[i] != '\0'; i++)
    {
        int inputIndex = inputArr[i] - 97;
        if (alphabetArr[inputIndex] == -1)
        {
            alphabetArr[inputIndex] = i;
        }
    }

    // 전체 출력
    for (int i = 0; i < 26; i++)
    {
        printf("%d ", alphabetArr[i]);
    }
    printf("\n");

    return 0;
}
