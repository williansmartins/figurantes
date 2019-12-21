angular
.module('principal')
.controller('LoginController', loginController);

function loginController($scope, $location, LoginService, $rootScope, $localStorage ){
    $scope.model = new Object();
    $scope.model.email = "maria@teste.com";
    $scope.model.senha = "secreta1";
    $scope.flagErro = false;
    $storage = $localStorage;

    $scope.autenticar = function(){
        LoginService.autenticar($scope.model).then(
            function(resposta){
                console.info(resposta.data);
                if(resposta.data == true){                    
                    $storage.flagMostrarMenu = true;
                    //atualiza navegador controller
                    $rootScope.$broadcast('topic', '');
                    $location.path('/perfil');
                }else{
                    $scope.flagErro = true;
                }
            },
            function(resposta){
                console.info(resposta.data);
                alert('Deu Erro');
            }

        );
    }

    $scope.cadastrarUsuario = function(){
      LoginService.cadastrar($scope.model).then(
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