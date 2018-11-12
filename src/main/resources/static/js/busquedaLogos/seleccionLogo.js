var img;
var selec;


function previewFile() {
    var preview = document.getElementById('imagenNew');
    var file2    = document.querySelector('input[type=file]').files[0];
    var reader  = new FileReader();

    reader.addEventListener("load", function () {
        preview.src = reader.result;
    }, false);

    if (file2) {
        reader.readAsDataURL(file2);
    }
}

function guardarLogo(){
    img  = document.getElementById("imagenNew");
    selec= document.getElementById("entidadesNew");
    if(img.getAttribute('src')=="#" || img.getAttribute('src')==null){
        alert("no has seleccionado una imagen");
    }
    else if(selec.selectedIndex==0){
        alert("Seleccione una Entidad")
    }else {
        enviarElemNew();
    }


}

function limpiar(){
    document.getElementById('nombreImg').value="";
    document.getElementById('imagenNew').src="#";
    document.getElementById('entidadesNew').selectedIndex=0;
}

function enviarElemNew(){
    var ENTIDAD= selec.options[selec.selectedIndex].value;
    var LOGO= img.getAttribute ('src');
    var request={
        ENTIDAD: ENTIDAD,
        LOGO: LOGO
    };
    $.ajax({
        url: "enviar-logo",//url del controler a realizar la peticion
        type: 'POST',   // tipo de petiion
        data: request  // datos a enviar al controller
    }).done(function (datos) {
        // respuesta de extito
        console.log(datos);
        location.reload();
    });

}


