export class proyecto{
    id?:number;
    nombreproy:String;
    descripcion:String;
    urlproy:String;

    constructor(nombreproy:String, descripcion:String, urlproy:String){
        this.nombreproy = nombreproy;
        this.descripcion = descripcion;
        this.urlproy = urlproy;
    }
}