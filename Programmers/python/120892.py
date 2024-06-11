def solution(cipher, code):
    list = [*cipher]
    length = len([*cipher])
    quotient = (length // code)
    answer = ''
    print(quotient)
    for x in range(quotient) :
        answer += list[code*(x + 1) - 1]
    
    return answer