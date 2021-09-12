func smallest(a : Int = 0,b : Int = 0,c : Int = 0 ) -> Int {
    return min(a,b,c)

}

let x = Int(readLine() ?? "") ?? 0
let y = Int(readLine() ?? "") ?? 0
let z = Int(readLine() ?? "") ?? 0
let result: Int = smallest(a: x, b: y, c: z)
print("The smallest is \(result)")