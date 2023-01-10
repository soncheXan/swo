const showArray:Function = (array:string[]):void =>{
    const ul:HTMLElement = document.createElement("ul");
    array.forEach((element:string):void =>{
        const li:HTMLElement = document.createElement("li");
        const nombre:Text = document.createTextNode(element);
        ul.appendChild(li);
        li.appendChild(nombre);
    });
    document.getElementById("body")?.appendChild(ul);
}

function init(){
    const arrayName:string[] = ["Rafa", "Carlos", "Raquel"];
    const button:HTMLButtonElement = document.querySelector("#remove")!;
    
    showArray(arrayName);
    
    button.addEventListener('click', function ():void {
        let arrayNameCopy:string[] = ["Rafa", "Carlos", "Raquel"];
        let randomNumber:number = Math.round(Math.random()*(arrayName.length-1));
        arrayNameCopy.splice(randomNumber, 1);
        showArray(arrayNameCopy, randomNumber);
    });
}
