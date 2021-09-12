func greetAndMeet(name: String = "") -> String {
    let result = name != "" ? "Pleased to meet you \(name).":"I do not know you."
    return result
}
let input = readLine() ?? ""
let output = greetAndMeet(name: input)
print(output)
