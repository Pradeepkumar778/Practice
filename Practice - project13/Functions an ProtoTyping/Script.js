function Student(Rollno, sname, yearOfBirth){   
    this.Rollno= Rollno; 
    this.sname= sname; 
    this.yearOfBirth= yearOfBirth; 
} 


Student.prototype.calculateAge= function(){  
    console.log('The current age is: '+(2024 - this.yearOfBirth)); 
} 
console.log(Student.prototype); 
  

let Student1= new Student('101', 'Kalyan', 2000);  
console.log(Student1) ;
Student1.calculateAge(); 

let Student2= new Student('102', 'Sai', 1998); 
console.log(Student2) 
Student2.calculateAge();

let Student3= new Student('103', 'Surya', 1996); 
console.log(Student3) 
Student3.calculateAge();