app.controller('FiguranteController', FiguranteController);

function FiguranteController($scope, FiguranteService){

    function popularCampos(){
        $scope.nome = "Willians Martins de Morais";
        $scope.cpf = "333.666.999-88";
        $scope.email = "professorwillians@gmail.com";
        $scope.senha = "secreta";
        $scope.idade = "37";
        $scope.etinia = "pardo";
        $scope.genero = "m";
        $scope.altura = "1.78";
        $scope.peso = "80.00";
        $scope.cidade = "Itapevi";
        $scope.estado = "São Paulo";
        $scope.caracteristicas = "sem tatuagem";
    }

    $scope.salvar = function(){
        FiguranteService.buscarTodos().then(
            function (resposta){
                console.info( resposta );
            },
            function (resposta){
                console.info( resposta );
            }
        );
    }

    popularCampos();
}