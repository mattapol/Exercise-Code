let x = Int(readLine() ?? "") ?? 0
let y = Int(readLine() ?? "") ?? 0
let z = Int(readLine() ?? "") ?? 0
if x > y && x > z {
 print(x)
}else if y > x && y > z {
 print(y)
}else if z > x && z > x {
 print(z)
}


/*
var numbers:[Int] = []
var m = 0
for _ in 0..<3 {
  let num = Int(readLine() ?? "") ?? 0
  numbers.append(num)
  if num > m {
      m = num
  }
}
print("\(m)")
*/
