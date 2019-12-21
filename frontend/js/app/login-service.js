app.factory('LoginService', LoginService);

function LoginService($http){
    
    LoginService.autenticar = function(model) {
        return $http({
            method : "POST",
            url : "http://localhost:9090/login/autenticar/",
            data: model
        })
    }

    LoginService.cadastrar = function(model) {
        return $http({
            method : "POST",
            url : "http://localhost:9090/login",
            data: model
        })
    }

    return LoginService;
};