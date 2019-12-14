app.factory('LoginService', LoginService);

function LoginService($http){
    
    LoginService.autenticar = function(email, senha) {
        return $http({
            method : "GET",
            url : "http://localhost:9090/login/validar/" + email + "/" + senha
        })
    }

    return LoginService;
};