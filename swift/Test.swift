/*class Rectange {
    var width: Int = 0
    var height: Int =0

    init(width: Int, height: Int) {
        self.width = width
        self.height = height
    }
    func description() -> String {
        return "A rectange \(width) x \(height)"
    }
}    
var shape1 = Rectange(width: 5, height: 10)
shape1.description() */

    func minMax(array: [Int]) -> (min: Int, max: Int)? {
    if array.isEmpty { return nil }
      var currentMin = array[0]
      var currentMax = array[0]
    for value in array[1..<array.count] {
        if value < currentMin {
            currentMin = value
        } else if value > currentMax {
            currentMax = value
        }
    }
    return (currentMin, currentMax)
}
if let bounds = minMax(array: [8, -6, 2, 109, 3, 71]) {
    print("min is \(bounds.min) and max is \(bounds.max)")
}


/*
let num = Int(readLine() ?? "Input num") ?? 0
let x = Int(readLine() ?? "This year is : ") ?? 0
let y = Int(readLine() ?? "Your birthyears : ") ?? 0
func greet(says: String, times: Int) {
    for _ in 0..<times {
        print("\(says) Isarapan ") 
    }
}
greet(says: "hello", times: num)

func age(years: Int, birth: Int) {
    var new_years = 0
    if years>2500 {
        new_years = years-birth
         print("Age = \(new_years) and birthyears = \(birth)") 
    }else {
         print("Error, You are older")
    }
}
age(years: x, birth: y)

print("Test Function")
greet(says: "hello", times: num)
*/

