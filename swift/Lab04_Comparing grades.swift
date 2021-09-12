class Student {
     var id: Int, firstName: String, lastName: String, grades: [Float]
     init(id: Int, firstName: String, lastName: String, grades: [Float] = []) {
         self.id = id
         self.firstName = firstName
         self.lastName = lastName
         self.grades = grades
     }
     func hasHigherAverageThan(_ item: Student) -> Bool {
         return self.average() > item.average()
     }
     func average() -> Float{
         var sum :Float = 0.0, average:Float = 0.0
         for i in 0..<grades.count {
             average += 1
             sum += grades[i]
         }
         return sum/average
     }
     func addGrade(_ value: Float) {
         return grades.append(value)
     }
     func numberOfGrades() -> Int {
         return grades.count
     }
     func fullName() -> String {
         return "\(firstName) \(lastName)"
     }
 }