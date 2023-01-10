
function init():void{
    const newName:HTMLInputElement = document.querySelector('#names')!;
    const add:HTMLInputElement = document.querySelector('#add')!;
    let namesArray:string[]=[];

    add.addEventListener('click', function(){
        namesArray.push(newName.value);
        newName.value = '';

        if(namesArray.length == 3){
            alert("Ya ha agregado tres nombres");
            namesArray.forEach((value:string, index:number):void =>
                document.write("<h4>"+ index +" "+ value+"<br></h4>")
            );
        }
    });
}