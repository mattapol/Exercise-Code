func square(num : Int = 0 ) -> Int {
    return num*num

}

let inputString = readLine() ?? ""
let input = Int(inputString) ?? 0
let output: Int = square(num: input)
print("\(input) * \(input) = \(output)")