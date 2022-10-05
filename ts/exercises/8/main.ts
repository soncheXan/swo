type device = 'Mobile' | 'Desktop' | 'Labtop';

let persona1: {
    username:string,
    email:string,
    device:device
} = {
    username: "Juan",
    email: "juan@gmail.com",
    device: "Desktop"
};

let persona2: {
    username:string,
    email:string,
    device:device
} = {
    username: "Sergio",
    email: "sergio@gmail.com",
    device: "Labtop"
};

let personas:any = [persona1, persona2];



function imprimir():void{
    document.write(
        "<table>"+
            "<tr>"+
                "<th>Nombre</th>"+
                "<th>Email</th>"+
                "<th>Dispositivo</th>"+
            "</tr>"
    );

    for(let persona of personas){
        document.write("<tr>");
        for(let key in persona){
            document.write("<td>"+persona[key]+"</td>");
        }
        document.write("</tr>");
    }
    document.write("</table>");
}
imprimir();

        
