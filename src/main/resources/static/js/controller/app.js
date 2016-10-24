var app = angular.module('myApp',[]);

app.controller('myController',	function($scope,$http){
	
	$scope.personList = function(){
		$http.get("http://localhost:8080/persons").success(function(response){ // ung get("http://localhost:8080/persons") yan ung tinatawag na rest webservice try mo access http://localhost:8080/persons json response tawag jan yan ung nirereturn ng java code or kahit anong language via http para makipagcommunicate sa ibang technology.
			$scope.persons = response;
			console.log(response);
		});
	};
	
	$scope.personList(); //calling function personList() 

});