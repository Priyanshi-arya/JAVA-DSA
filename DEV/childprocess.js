let cp = require("child_process");
console.log("Trying to open googluu");
cp.execSync("start chrome https:\\www.google.com");
console.log("opened googluu");
// There are so many modules in js 
// like we can add one more file into this and have a genuine output