import Foundation

func filterItems ( length : Int ,list : [String] ) -> [String] {
    var result: [String] = []
    for i in 0..<list.count{
        if list[i].count == length {
            result.append(list[i])
        }
    }
    return result

}


let inputString = readLine() ?? ""
let input: [String] = inputString.components(separatedBy: " ")
let number = Int(readLine() ?? "") ?? 0
let result: [String] = filterItems(length: number, list: input)
print(result.joined(separator: " "))