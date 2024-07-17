def solution(my_string):
    answer = 0
    list = [*my_string]
    for x in list :
        if (ord(x) >=48 and ord(x) <= 57) :
            answer += ord(x) - 48
    return answer