
let орс="0";
while (орс != "T"){
    opc = prompt("Escribe la letra \n"
    + "(S): Suma \n"
    + "(R) Resta \n"
    + "(A) Ayuda \n", "");
    
    if (opc == "s") suma();
    if (opc == "r") resta();
    if (opc == "a") ayuda();
}

function suma(){   
    let a, b;
    a = prompt("Digite el primer numero: ");
    a = parseFloat(a);
    b = prompt("Digite el primer numero: ");
    b = parseFloat(b);
    return alert("Resultado: " +  (a + b));
}

function resta(){
    let a, b;
    a = prompt("Digite el primer numero: ");
    a = parseFloat(a);
    b = prompt("Digite el primer numero: ");
    b = parseFloat(b);
    return alert("Resultado: " +  (a - b));
}

function ayuda(){
    alert("Instrucciones: \n"
    + "Pulse s si quiere sumar \n"
    + "Pulse r si desea restar \n"
    + "Pulse T para salir del programa")
}