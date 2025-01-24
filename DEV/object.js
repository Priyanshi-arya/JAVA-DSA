let king={
    name:"Shah Rukh",
    lastName:"khan",
    address:{
        city:"Bandra , Mumbai",
        state:"Maharastra"
    }
    , age:59,
      iskingStar:true,
      movies:["Om Shanti Om", "Kal Ho Na Ho", "Mai Hoo Na"],
      sayHi:function(){
        console.log("King Says Hii");
      }
};
// console.log(king.name);
// console.log(king.age);
// console.log("My Fav Movie: " ,king.movies[0]);
// king.sayHi();
for(let key in king){
    console.log(key," : " , king[key]);
}