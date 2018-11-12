var json = [
    {
        "userId": "",
        "id": "",
        "title": "",
        "body": "",
        "body": ""
    },
    {
        "userId": 1,
        "id": 2,
        "title": "qui est esse",
        "body": "est rerum tempore ",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 1,
        "title": "sunt aut facere re",
        "body": "em eveniet architecto",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 2,
        "title": "qui est esse",
        "body": "est rerum tempore ",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 1,
        "title": "sunt aut facere re",
        "body": "em eveniet architecto",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 2,
        "title": "qui est esse",
        "body": "est rerum tempore ",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 1,
        "title": "sunt aut facere re",
        "body": "em eveniet architecto",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 2,
        "title": "qui est esse",
        "body": "est rerum tempore ",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 1,
        "title": "sunt aut facere re",
        "body": "em eveniet architecto",
        "body": "em eveniet architecto",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 2,
        "title": "qui est esse",
        "body": "est rerum tempore ",
        "body": "em eveniet architecto",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 1,
        "title": "sunt aut facere re",
        "body": "em eveniet architecto",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 2,
        "title": "qui est esse",
        "body": "est rerum tempore ",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 1,
        "title": "sunt aut facere re",
        "body": "em eveniet architecto",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 2,
        "title": "qui est esse",
        "body": "est rerum tempore ",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 1,
        "title": "sunt aut facere re",
        "body": "em eveniet architecto",
        "body": "em eveniet architecto"
    },
    {
        "userId": 1,
        "id": 2,
        "title": "qui est esse",
        "body": "est rerum tempore ",
        "body": "em eveniet architecto"
    }];


//inicia document Ready
$(document).ready(function () {

    cargarTabla(json);
    cargarTablaPersonaGestor(bsfOperador);
});
//remueve la clase error de los elementos
function removeHasError(element) {
    $(element).parent().removeClass("has-error");
}

$("#btnTest").click(function () {
    var dato =  $("#selectTest").val();
    $("#modalActualizacionPlantilla").modal.show()
    msjExito(dato);
});

function cargarTabla(datos) {

    $('#tablaEjemplo').DataTable(
        {
            searching: true,
            data: datos,

            "columns": [
                {"data": "userId"},
                {"data": "id"},
                {"data": "title"},
                {"data": "body"},
                {"data": "body"}
            ]
            // ,"aoColumnDefs": [
            //     {
            //         "mRender": function ( data, type, row ) {
            //             return '<span style="padding-right:3px;">'+number_format(data,2)+'</span>';
            //         },"aTargets": [1]
            //     },
            //     {className: "text-right", "targets": [1]}
            // ]

        });

}

function cargarTablaGestor(datos) {

    $('#tablaGestor').DataTable(
        {
            searching: true,
            data: datos,

            "columns": [
                {"data": "nombre"},
                {"data": "idExt"}
            ]
            // ,"aoColumnDefs": [
            //     {
            //         "mRender": function ( data, type, row ) {
            //             return '<span style="padding-right:3px;">'+number_format(data,2)+'</span>';
            //         },"aTargets": [1]
            //     },
            //     {className: "text-right", "targets": [1]}
            // ]

        });

}

function cargarTablaPersonaGestor(bsfOperador){

    $.ajax({
        data:JSON.stringify(bsfOperador),
        url:"/BsfGestores/service/person-list",
        type:"post",
        beforeSend:function () {
            mostrarBarraProgreso();
        },
        success: function(data){
            console.log(data);
            cargarTablaGestor(data);
        },
        error: function(data){
            msjAlerta("Aviso:");
        }
    });
}
