let str = readLine() ?? ""
for i in 9..<Int(str,radix:36)!{
    var s = ""
    for _ in 9..<i{
        s += " "
    }
    for _ in 9...i{
        s += String(i+1,radix:36).uppercased()+" "

    }
    print(s.dropLast())
}
