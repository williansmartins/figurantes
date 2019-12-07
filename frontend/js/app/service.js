app.factory('FiguranteService', FiguranteService);

function FiguranteService($http){
    
    FiguranteService.buscarTodos = function() {
        return $http({
            method : "GET",
            url : "http://localhost:9090/figurantes"
        })
    };

    return FiguranteService;
}