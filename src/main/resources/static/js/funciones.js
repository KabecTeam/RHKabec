function validaFormularioContratacion(){
    var nombre=document.getElementById("nombre");
    var paterno=document.getElementById("paterno");
    var materno=document.getElementById("materno");
    if(nombre.value.length==0){
        alert("El campo Nombre es obligatorio");
        nombre.focus();
        return false;
    }else
    if(paterno.value.length ==0){
        alert("El campo Apellido Paterno es obligatorio");
        paterno.focus();
        return false;
    }else
    if(materno.value.length == 0){
        alert("El campo Apellido Materno es obligatorio");
        materno.focus();
        return false;
    }
}

function validaFormularioContratacion1(){
    var idConsultor=document.getElementById("id_Consultor");
    var FechaIngreso=document.getElementById("FechaIngreso");
    var FechaAltaIMSS=document.getElementById("FechaAltaIMSS");
    var continuar1=document.getElementById("continuar1");
    if(idConsultor.value.length==0){
        alert("El Campo idConsultor es obligatorio");
        idConsultor.focus();
        return false;
    }else 
        if(FechaIngreso.value.length == 0){
        alert("El Campo Fecha de ingreso  es obligatorio");
        FechaIngreso.focus();
        return false;
    }else
        if(FechaAltaIMSS.value.length==0){
         alert("El Campo Fecha de Alta IMSS  es obligatorio");
         FechaAltaIMSS.focus();
         return false;
    }else{
        continuar1.action="contratacion2.jsp";
        continuar1.submit();
        return true;
    }
    
}