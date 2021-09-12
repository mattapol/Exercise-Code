import Foundation
func batchConvert(amounts: [Int]) {
    var sum = 0
    for i in amounts {
        let x = i * 36
        print("\(x), ",terminator : "")
        sum += x
    }
    print("total: \(sum)")
    
    
}


let amounts = (readLine() ?? "").components(separatedBy: ",").map { Int($0) ?? 0 }
batchConvert(amounts: amounts)
