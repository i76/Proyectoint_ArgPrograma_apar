export class HardSoftskill {
    id?:number;
    nombre:String;
    valor:number;
    imgHS:string;
    colorbar:String
   

    constructor(nombre: String, valor: number, imgHS: string,colorbar:String){
            this.nombre = nombre;
            this.valor = valor;
            this.imgHS = imgHS;
            this.colorbar = colorbar;    
    
    }
   

}
    