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
document.write(productos5.Fruta1);
var productos6={
    nombre:[],
    presentacion:[],
    valor:[]
}
for (i = 0; i < 3; i++) {
    productos6.nombre[i]=prompt("Digite nombre del producto: ");
    productos6.presentacion[i]=prompt("Digite presentacion del producto: ");
    productos6.valor[i]=prompt("Digite valor del producto: ");
}
for (pro in productos6) {
    document.write(pro+": "+productos6[pro]+"<br>");
}
document.write("<table border='1'>");
for (pro in productos6) {
    document.write("<tr>");
    for (i = 0; i < 3; i++) {
        document.write("<td>");
        document.write(productos6[pro][i]);
        document.write("</td>");
    }
    document.write("</tr>");
}
document.write("</table>");*/
var arreglo1=[3,5,9,10,12,15,16,17,18], arreglo2=[1,2,4,6,7,8,11,13,14];
var sum1=0, sum2=0;
for (i = 0; i < arreglo1.length; i++) {
    sum1=sum1+arreglo1[i];
    sum2=sum2+arreglo2[i];
    document.write(arreglo1[i]+"+"+arreglo2[i]+"="+(arreglo1[i]+arreglo2)+"<br>");
}
document.write(sum1+"+"+sum2+"="+(sum1+sum2));
