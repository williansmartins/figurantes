app.factory('FiguranteService', FiguranteService);

function FiguranteService($http){
    
    FiguranteService.buscarTodos = function() {
        return $http({
            method : "GET",
            url : "http://localhost:9090/figurantes"
        })
    };

    FiguranteService.buscarUm = function(id) {
        return $http({
            method : "GET",
            url : "http://localhost:9090/figurantes/" + id
        })
    };

    FiguranteService.inserir = function(model) {
        return $http({
            method : "POST",
            url : "http://localhost:9090/figurantes",
            data: model
        })
    };

    FiguranteService.excluir = function(id) {
        return $http({
            method : "DELETE",
            url : "http://localhost:9090/figurantes/" + id,
        })
    };    

    FiguranteService.atualizar = function(model) {
        return $http({
            method : "PUT",
            url : "http://localhost:9090/figurantes/" + model.id,
            data: model
        })
    };    

    return FiguranteService;
}