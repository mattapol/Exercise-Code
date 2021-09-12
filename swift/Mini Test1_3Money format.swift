func formatBaht(amount: Double) -> String {
    let x = Int(amount*100)
    let y = x/100
    let z = x - (y*100)
    return "\(y) baht \(z) satang"
}

let input = Double(readLine() ?? "") ?? 0.0
print(formatBaht(amount: input)) 