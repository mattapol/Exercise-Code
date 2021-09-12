let num =  Int(readLine() ?? "") ?? 0
var sequence = [0,1]
if num == 1 {
    print("1")
}else
{
    for _ in 0...num - 2 {
        let first = sequence[sequence.count - 2]
        let second = sequence.last!
        sequence.append(first + second)
}
    for i in sequence{
    if i != 0{
        print("\(i)",terminator : " ")
    }else if num <= 0{
        print("nothing")
    }
}
}
