app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "views/figurante-home.html"
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