let currency = readLine() ?? ""
let input = Int(readLine() ?? "") ?? 0
if currency == "EUR" {
  print("\(input) euros = \(input*36) baht")
}
else if currency == "USD" {
  print("\(input) US dollars = \(input*31) baht")
}
else if currency == "GBP" {
  print("\(input) GB pound = \(input*41) baht") 
}
