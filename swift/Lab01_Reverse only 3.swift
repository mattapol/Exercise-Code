var str: [String] = []
for _ in 0..<3 {
  let name = readLine() ?? ""
  str.append(name)
}
for i in str.reversed() {
    print("\(i)")

}
