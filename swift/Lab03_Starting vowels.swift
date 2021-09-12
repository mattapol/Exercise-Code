import Foundation
func countStartVowels ( list : [String] ) -> Int {
    var c = 0, h = ""
     for i in list{
         h = i.lowercased()
         if h.hasPrefix("a") || h.hasPrefix("e") || h.hasPrefix("i") || h.hasPrefix("o") || h.hasPrefix("u"){
             c = c+1
         }
     }
     return c

}


let inputString = readLine() ?? ""
let input: [String] = inputString.components(separatedBy: ",")
let result: Int = countStartVowels(list: input)
print(result)