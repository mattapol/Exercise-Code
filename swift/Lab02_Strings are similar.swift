let input1 = readLine() ?? ""
let input2 = readLine() ?? ""
if (input1==input2) {
    print("exact match")
}else if input2.lowercased() == input1.lowercased() {
    print("similar")
}else {
    print("not the same")
}
