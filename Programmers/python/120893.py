def solution(my_string):
    answer = ''
    for x in [*my_string] :
        if (ord(x) >= 65 and ord(x) <= 90) : answer += chr(ord(x) + 32)
        else : answer += chr(ord(x) - 32)
    
    return answer