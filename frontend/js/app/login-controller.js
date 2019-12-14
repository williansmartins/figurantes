angular
.module('principal')
.controller('LoginController', loginController);

function loginController($scope, LoginService ){
    $scope.model = new Object();

    $scope.autenticar = function(){
        LoginService.autenticar($scope.model.email, $scope.model.senha).then(
            function(resposta){
                console.info(resposta.data);
                if(resposta.data == true){
                    alert('Deu Certo');
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