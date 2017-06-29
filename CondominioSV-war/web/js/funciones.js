/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validaCampos(idx){
   // var isValid = true;
    if(idx==="inputusuario"){
        if(document.getElementById("inputusuario").value.length<4){
            alert("El campo usuario no tiene caracteres suficientes");
            document.getElementById("inputusuario").style.background = "red";
     //       isValid = false;
        } else {
            document.getElementById("inputusuario").style.background = "white";
        }
    }
    if(idx==="inputpassword"){
        if(document.getElementById("inputpassword").value.length<6){
            alert("El campo password no tiene caracteres suficientes");
            document.getElementById("inputpassword").style.background = "red";
            //isValid = false;
        } else {
            document.getElementById("inputpassword").style.background = "white";
        }
    }
}

function estiloNormal(elemId){
    document.getElementById(elemId).style.background = "white";
}