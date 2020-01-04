app.config(function($routeProvider) {
    $routeProvider
    .when("/login", {
        templateUrl : "views/login.html"
    })
    .when("/", {
        templateUrl : "views/perfil.html"
    })
    .when("/indisponibilidade", {
        templateUrl : "views/indisponibilidade.html"
    })
    .when("/perfil", {
        templateUrl : "views/perfil.html"
    })
    .when("/propostas", {
        templateUrl : "views/propostas.html"
    })
    .otherwise({
        templateUrl : "views/404.html"
    })
    
});