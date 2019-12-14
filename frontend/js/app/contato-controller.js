app.controller('ContatoController', ContatoController);

function ContatoController($scope, ContatoService){

    $scope.model = new Object();

    $scope.inserir = function(){
        ContatoService.inserir($scope.model).then(
            function (resposta){
                $('#mensagem').modal();
                limparFormulario();
            },
            function (resposta){
                $('#erro').modal();
                console.info( resposta );
            }
        );
    }

    var limparFormulario = function(){
        $scope.model = new Object();
    }
}