app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "views/conteudo1.html"
    })
    .when("/conteudo1", {
        templateUrl : "views/conteudo1.html"
    })
    .when("/conteudo2", {
        templateUrl : "views/conteudo2.html"
    })
    
});