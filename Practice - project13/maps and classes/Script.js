var map1 = new Map(); 
map1.set("first name", "Pradeep"); 
map1.set("last name", "Pathapalem"); 
map1.set("friend 1","Karthik") 
    .set("friend 2","Sai"); 
console.log(map1); 
console.log("map1 has friend 3 ? " + map1.has("friend 3")); 
console.log("get value for key = friend 3 - "+ map1.get("friend 3")); 
console.log("delete element with key = friend 2 - " + map1.delete("friend 2")); 
map1.clear(); 
console.log(map1);



class Employee
{
    constructor(id,name)
    {
    this.id=id;
    this.name=name;
    }
    detail()
    {
      document.writeln(this.id+" " + this.name+"<br>")
    }
}

var e1=new Employee(101,"Pradeep");
var e2=new Employee(102,"Surya");
e1.detail(); 
e2.detail();