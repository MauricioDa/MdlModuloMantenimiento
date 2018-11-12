var json = [
    {
    nombre :"hola",
    id:1
    },
    {
        nombre :"mundo",
        id:2
    }
    ];

$(document).ready(function () {
    cargarTablaPersonaGestor(bsfOperador);
});




function activeSelectedButton(event){
    $("#btnCircle1").removeClass("active")
    $("#btnCircle2").removeClass("active")
    $("#btnCircle3").removeClass("active")
    $(event).addClass("active",true);

}

function seleccionarListaGestores(){
    $("#modalSeleccionarPersona").modal("show");
}


function cargarTabla(datos) {

    $('#tablaGestor,#tablaPersonas').DataTable(
        {
            searching: true,
            data: datos,

            "columns": [
                {"data": "nombre"},
                {"data": "id"}
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

function cargarTablaPersonaGestor(datos){

    $.ajax({
        data:JSON.stringify(),
        url:"",
        type:"post",
        beforeSend:function () {

        },
        success: function(data){
            cargarTabla(data);
        },
        error: function(data){
            msjAlerta("Aviso:");
        }
    });
}




