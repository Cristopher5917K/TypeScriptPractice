interface Product {
    id:number;
    name:string;
    price:number;
    Stock:boolean;
    description?:string;
    category:'food'|'drink'|'cleaning';
}

const manzana:Product ={ 
    id:1,
    name:'manzana',
    price: 0.5,
    Stock:true,
    description:'fruta roja',
    category:'food'
}

console.log(manzana);