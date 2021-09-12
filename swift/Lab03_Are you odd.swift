import Foundation
func isOdd ( list : [Int] ) -> Bool {
    var result = false
    for i in 0..<list.count{
        if list[i]%2 != 0 {
            result = true
        }else {
            result = false
            break
        }
    }
    return result

}


let inputString = readLine() ?? ""
let numbers: [Int] = inputString.components(separatedBy: ",").flatMap{ Int($0) }
let result: Bool = isOdd(list: numbers)
print(result)