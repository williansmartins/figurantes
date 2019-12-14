app.factory('ContatoService', ContatoService);

function ContatoService($http){
    
    ContatoService.inserir = function(model) {
        return $http({
            method : "POST",
            url : "http://localhost:9090/contato/inserir",
            data: model
        })
    };

    ContatoService.buscar = function() {
        return $http({
            method : "GET",
            url : "http://localhost:9090/contato/inserir",
        })
    };

    return ContatoService;
}