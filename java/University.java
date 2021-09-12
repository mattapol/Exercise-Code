public class University {
	public Student[] student;
	private int count = 0;

  public University(int n) {
    student = new Student[n];
  }
  public void addStudent(Student s){
    if(count < student.length)
    {
    		student[count] = s;
    		count++;
    }
    	else System.out.println ("FULL");
  }
  public void print(){
    for(int i=0;i<count;i++){
    	System.out.println (student[i]);
    }
  }
  public void calGradeAllStu(){
    for(int i=0;i<count; i++){
    		student[i].calGrade();
    }
	}
	public int search(String n){
    for(int i=0;i<count; i++){
    	if(student[i].getName().equals(n))
    		return i;
    }
    return -1;
  }
  public int countUndergrad(){
    int num=0;
    for(int i=0;i<count; i++){
    	if(student[i] instanceof UnderGrad)
    			num++;
  	}
    return num;
  }
  public int countPostgrad(){
    int num=0;
    for(int i=0;i<count; i++){
    	if(student[i] instanceof PostGrad)
    		num++;
    }
    return num;
  }
 	public int countPass(){
 		int num=0;
 		for(int i=0; i<count;i++){
 			if(student[i].getGrade().equals("pass"))
 				num++;
 		}
 		return num;
 	}
}
