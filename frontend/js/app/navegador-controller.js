angular.module('principal')
.controller('NavegadorController', 
    function ($scope, $location, $localStorage, $rootScope) {

        $scope.storage = $localStorage;
        $scope.flagMostrarMenu = false;

        $scope.logout = function(){
        	var objetoGlogal = {
            	"localstorage" : null,
            	"flagMostrarMenu" : false
            }

            $rootScope.$broadcast('topic', objetoGlogal);
            $location.path("/login");
        }

        $scope.$on('topic', function (event, objetoGlogal) { 
            $scope.storage = objetoGlogal.localstorage;
        	$scope.flagMostrarMenu = objetoGlogal.flagMostrarMenu;
        });

        //este apresentarMensagem eh global
        apresentarMensagem = function(mensagem, callback){
            alert(mensagem);
        };

        init = function() {
            // console.info("NavegadorController");
        };
        
    	init();
});