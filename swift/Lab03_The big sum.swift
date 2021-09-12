import Foundation

func bigsum ( list : [Int] ) -> Int {
    return list.reduce(0, +)

}

let inputString = readLine() ?? ""
let numbers: [Int] = inputString.components(separatedBy: ",").flatMap{Int(String($0))}
let result: Int = bigsum(list: numbers)
print(result)