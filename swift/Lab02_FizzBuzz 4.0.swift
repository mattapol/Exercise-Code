let num1 =  Int(readLine() ?? "") ?? 0
let num2 =  Int(readLine() ?? "") ?? 0
for i in 1...20{
    if i % num1 == 0 && i % num2 == 0  {
        print("FizzBuzz")
    }else if i % num2 == 0{
        print("Buzz")
    }else if i % num1 == 0  {
        print("Fizz")
    }else{
        print("\(i)")
    }
}
