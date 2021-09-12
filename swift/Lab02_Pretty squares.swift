let input = Int(readLine() ?? "") ?? 0
for row in 0..<input {
    for col in 0..<input {
        print(row == 0 || row == input-1 ? (col == 0 || row == 0 && row == input-1 || col == input-1 ? "+":"-"):(col == 0 || col == input-1 ? "|":" "), terminator:"")
    }
    print("")
}
