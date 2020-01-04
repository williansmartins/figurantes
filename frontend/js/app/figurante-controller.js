app.controller('FiguranteController', FiguranteController);

function FiguranteController($scope, FiguranteService, $localStorage, $rootScope){

    $scope.model = new Object();
    $scope.model.endereco = new Object();
    $storage = $localStorage;

    function popularCampos(){
        $scope.model.nome = "Willians Martins de Morais";
        $scope.model.cpf = "333.666.999-88";
        $scope.model.email = "professorwillians@gmail.com";
        $scope.model.senha = "secreta";
        $scope.model.idade = "37";
        $scope.model.etinia = "pardo";
        $scope.model.genero = "m";
        $scope.model.altura = "1.78";
        $scope.model.peso = "80.00";
        $scope.model.endereco.cidade = "Itapevi";
        $scope.model.endereco.estado = "São Paulo";
        $scope.model.caracteristicas = "sem tatuagem";
    }

    var buscarTodos = function(){
        FiguranteService.buscarTodos().then(
            function (resposta){
                //console.info( resposta.data );
                $scope.figurantes = resposta.data;
            },
            function (resposta){
                //console.info( resposta );
            }
        );
    }

    var buscarUm = function(){
        FiguranteService.buscarUm(1).then(
            function (resposta){
                //console.info( resposta.data );
                $scope.figurante = resposta.data;
            },
            function (resposta){
                //console.info( resposta );
            }
        );
    }

    var limparFormulario = function(){
        $scope.model = new Object();
    }

    $scope.salvar = function(){

        FiguranteService.inserir($scope.model).then(
            function (resposta){
                console.info( resposta.data );
                buscarTodos();
                limparFormulario();
            },
            function (resposta){
                console.info( resposta );
            }
        );
    }

    $scope.excluir = function(id){
        alert("e agora??? " + id);
    }
    
    $scope.preencherFormulario = function(entidade){
        $scope.model = entidade;
    }
    
    var atualizarTopico = function(){
        $rootScope.$broadcast('topic', 'objetoGlogal');
    }
    
    init = function() {
        atualizarTopico();
    
        //popularCampos();
        // buscarUm();
        buscarTodos();
    };
  
    init();
}