class Customer{
    private x: string
    private y: string
    
    
    public get firstname():string{
        return this.x;
    }
    public set firstname(value:string){
        this.x=value;
    }
    
    }


let myCustomer =new Customer();

myCustomer.firstname="Pratyush";
console.log(myCustomer.firstname); 