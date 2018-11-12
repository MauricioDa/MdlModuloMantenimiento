function obtenerEmpleado(){

    if (validarEntradas() == true){
        mostrarBarraProgreso();
        $('#frmFolio').submit();    }
    else{
        alert("no juncia ");
    }


}

function validarEntradas(){
    var entidad= document.getElementById('entidad');
    var expediente=document.getElementById('expediente');
    var status=document.getElementById('status');
    var estado;
    var valido;

        if (entidad.value == null || entidad.value == ""){
            valido=false;
            alert("te falta llenar entidad");

        }else{
            if(expediente.value == null || expediente.value == ""){
                alert("te falta llenar expediente");
            }else{
                valido=true;
            }

        }
        return valido;
}

function sendEnt(){
    var expediente=document.getElementById('entidad').value;
    var entidad=document.getElementById('expediente').value;

    if(expediente==""||entidad=="") {
        alerte("No has llenado los campos requeridos");
    }else{
        document.getElementById('entidadMod').innerHTML=entidad;
        document.getElementById('expedienteMod').innerHTML=expediente;
    }
}
