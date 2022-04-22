/*var productos={
    fruta:["Mango","Pera","Kiwi"],
    verduras:{
        verdura1: "Tomate",
        verdura2: "Cebolla",
        verdura3: "Ajo"
    },
    saludo:function(){alert("Hola "+productos.fruta[1])}
}
document.write("Objeto 1: "+productos.fruta[2]+"<br>");
//document.write("Objeto 2: "+productos.saludo()+"<br>");
document.write("Objeto 3: "+productos.verduras.verdura2+"<br><br><br>");


var productos2=[
    ["Piña","Banano","Naranjas"],
    { verdura1: "Tomate", verdura2: "Cebolla", verdura3: "Ajo"},
    "Arroz",
    function hola(){alert("Hola")}
]
document.write("Arreglo 1: "+productos2[0][2]+"<br>");
document.write("Arreglo 2: "+productos2[1].verdura2+"<br>");
document.write("Arreglo 3: "+productos2[2]());
var productos3=[];
//llenar
for(i=0;i<5;i++){
    productos3[i]=prompt("Digite una fruta:");
}
//mostrar
for(i=0;i<productos3.length;i++){
    document.write("Dato "+i+": "+productos3[i]+"<br>");
}
var productos4={
    pro1: "Tomate",
    pro2: "Cebolla",
    pro3: "Ajo"
}
for ( pro in productos4) {
    document.write("Propiedad: "+pro+": "+productos4[pro]+"<br>");
}
var productos5={}
Object.defineProperty(productos5,"Fruta1",{value:"Manzana",writable:true,enumerable:true,configurable:true});
document.write(productos5.Fruta1);*/