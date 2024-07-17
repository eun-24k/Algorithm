def solution(my_string, n):
    answer = ''
    ms = [*my_string]
    i = 0
    while (i < n) :
        answer += ms[i]
        i += 1

    return answer