#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    if (n == 1) {
        answer = 0;
    } else if (n == 2) {
        answer = 2;
    } else if (n % 2 == 0) {
        int k = n/2;
        answer = (2+n)*k/2;
    } else {
        int k = (n-1)/2;
        answer = (1+n)*k/2;
    }
        

    return answer;
}
