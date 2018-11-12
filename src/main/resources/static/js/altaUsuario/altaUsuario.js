var entidad;
var sucursal;
var expediente;
var fechaNacimiento;
var nombre;
var apellidoPaterno;
var apellidoMaterno;
var numeroCelular;
var foto;
var activo;

function selecImg(){
    $('#f').on('change', function(ev) {
        var f = ev.target.files[0];
        var fr = new FileReader();

        fr.onload = function(ev2) {
            console.dir(ev2);
            $('#i').attr('src', ev2.target.result);
        };

        fr.readAsDataURL(f);
    });}

function enviarInf() {
     entidad=document.getElementById('entidad').value;
     sucursal=document.getElementById('sucursal').value;
     expediente=document.getElementById('expediente').value;
     fechaNacimiento=document.getElementById('FechaNacimiento').value;
     nombre=document.getElementById('nombre').value;
     apellidoPaterno=document.getElementById('appelidoPatern').value;
     apellidoMaterno=document.getElementById('apellidoMatern').value;
     numeroCelular=document.getElementById('celular').value;
     foto=document.getElementById('i').src;
     var estatus=document.getElementById('estatus');
     activo=estatus.checked;

    if(entidad==""){
        alert("no ingreso una entidad");
    }else{
        if(sucursal==""){
            alert("no ingreso una sucursal");
        }else{
            if(expediente==""){
                alert("no ingreso un expediente");
            }else{
                if(nombre==""){
                    alert("no ingreso un nombre");
                }else{
                    if(apellidoPaterno==""){
                        alert("no ingreso el apellido paterno");
                    }
                    else{
                        sendData();
                    }
                }
            }
        }
    }
}

function sendData() {
    var request = {
         entidad : entidad,
         sucursal :sucursal,
         expediente : expediente,
         fechaNacimiento : fechaNacimiento,
         nombre : nombre,
         apellidoPaterno : apellidoPaterno,
         apellidoMaterno : apellidoMaterno,
         numeroCelular : numeroCelular,
         foto : foto,
         activo :activo,
    };
    $.ajax({
        url: "send-user",//url del controler a realizar la peticion
        type: 'POST',   // tipo de petiion
        data: request  // datos a enviar al controller
    }).done(function (datos) {
        // respuesta de extito
        console.log(datos);
        location.reload();
    });
}
