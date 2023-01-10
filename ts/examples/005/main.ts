class Vehiculo{
    matricula:string;

    constructor(matricula:string){
        this.matricula = matricula;
    }
}

class Coche extends Vehiculo{
    marca:string
    modelo:string
    precio:number

    constructor(marca:string, modelo:string, precio:number, matricula:string){
        super(matricula);
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    addCar(marca:string, modelo:string, precio:number):void{
        console.log(marca + modelo + precio);
    }
}

let coche1 = new Coche('Seat', 'Ibiza', 1600, '12434JDK');
coche1.addCar(coche1.marca, coche1.modelo, coche1.precio);

interface IRobot{
    size:number,
    message:string,
    printMessage(message:string):void;
}

let miRobot: IRobot = {
    size : 19,
    message : 'Hola',
    printMessage(message:string){
        console.log(message);
    }
}

interface Persona{
    nombre:string,
    edad:number;
}
interface IEmpleado{
    sueldo:number,
    codEmpleado:number;
}
interface IEmpleadoTaller extends IEmpleado{
    plus:number;
}
class Empleado implements Persona{
    nombre: string = 'Pepe';
    edad:number = 90;
}

let empleadoTallerUno: IEmpleadoTaller = {
    sueldo:100,
    codEmpleado:89,
    plus:12
}
