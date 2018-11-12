function llamar(){
    $('#f').on('change', function(ev) {
        var f = ev.target.files[0];
        var fr = new FileReader();

        fr.onload = function(ev2) {
            console.dir(ev2);
            $('#i').attr('src', ev2.target.result);
        };

        fr.readAsDataURL(f);
    });}

function actualizar() {

    var imgEdit = document.getElementById("i");

    if(imgEdit.getAttribute('src')=="#"){
        alert("no has seleccionado una imagen");
    }else{
        enviarEditar();

    }
    console.log(imgEdit);
}

function editarLog() {
    document.getElementById('f').value="";
    document.getElementById('i').src="#";
    var  nombre;

    $('.optradio:checked').each(function(indice, elemento){

        var fila = $(this).parents(".list-afiliados");
        entidad =  $(this).val(); //Se obtiene la entidad
        nombre = fila.find(".valor").text();  //Se obtiene el nombre de la entidad
        document.getElementById('obtenerEntidad').innerHTML=nombre;

    });

}

function enviarEditar(){

    var ENTIDAD= entidad;
    var LOGO= document.getElementById('i').src;
    console.log(LOGO)
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

function regresarMenuFrecuente () {
    try {
        parent.regresarMenuFrecuente();
    } catch (error) {
        window.history.go(-1);
    }
}
