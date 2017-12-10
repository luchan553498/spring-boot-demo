'use strict';

/**
 * BookController
 * @constructor
 */
var BookController = function($scope, $http) {
    $scope.fetchBookList = function() {
        $http.get('/book/list/all').success(function(bookList){
            console.log(bookList);
            $scope.books = bookList;
            angular.element(document).ready(function () {
                var dtTable = $('#book');
                dtTable.dataTable();
            })
        });
    };

    $scope.editBook = function(book) {
        $scope.bookEdit = book;
    };

    $scope.saveBook = function (book) {
        $http.post('book/')
    }

    $scope.addNewBook = function(newBook) {
        $http.post('book/add/newBook/' + newBook).success(function() {
            $scope.fetchBookList();
        });
        $scope.bookName = '';
    };

    $scope.removeBook = function(book) {
        $http.delete('/book/removeBook/' + book).success(function() {
            $scope.fetchBookList();
        });
    };

    $scope.removeAllBooks = function() {
        $http.delete('/book/removeAllBooks').success(function() {
            $scope.fetchBookList();
        });

    };

    $scope.fetchBookList();


};