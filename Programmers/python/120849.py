def solution(my_string):
    answer = ''
    list = [*my_string]
    _list = [*my_string]
    print(len([*my_string]))
    for x in list :
        print(x)
        if (x == 'a') :
            _list.remove('a')
        elif (x == 'e') :
            _list.remove('e')
        elif (x == 'i') :
            _list.remove('i')
        elif (x == 'o') :
            _list.remove('o')
        elif (x == 'u') :
            _list.remove('u')

    print(_list)
    return ''.join(_list)

