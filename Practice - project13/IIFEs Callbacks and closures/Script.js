const empId = (function() {
    let count = 0;
    return function() {
      ++count;
      return `emp${count}`;
    };
  })();
  
  console.log("New Emplyee IDs are listed here");
  console.log("Pradeep Pathapalem: "+empId()); 
  console.log("Aravind Rapur: "+empId()); 
  console.log("Srikanth M : "+empId());
   

  console.log("\n"); 

  function fullName(firstName, lastName, callback){
    console.log("My name is " + firstName + " " + lastName);
    callback(firstName);
  }
  
  var greeting = function(firstName){
    console.log('Welcome ' + firstName);
  };
  
  fullName("Pradeep", "Pathapalem", greeting);
  console.log("\n");
  fullName("Aravind", "Rapur", greeting);
  console.log("\n");
  fullName("Srikanth", "M", greeting);