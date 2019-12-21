angular
.module('principal')
.controller('LoginController', loginController);

function loginController($scope, $location, LoginService ){
    $scope.model = new Object();
    $scope.model.email = "maria@teste.com";
    $scope.model.senha = "secreta1";

    $scope.autenticar = function(){
        LoginService.autenticar($scope.model.email, $scope.model.senha).then(
            function(resposta){
                console.info(resposta.data);
                if(resposta.data == true){
                    //alert('Deu Certo');
                    $location.path('/perfil');
                }else{
                    alert('Deu Erro');
                }
            },
            function(resposta){
                console.info(resposta.data);
                alert('Deu Erro');
            }

        );
      }

}