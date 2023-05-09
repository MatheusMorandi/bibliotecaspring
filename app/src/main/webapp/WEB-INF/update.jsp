<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html lang="pt-br">

    <head>

        <meta charset="UTF-8" />

        <title>Atualizar Livro</title>

    </head>

    <body>

        <h1>Atualizar Livro</h1>

        <form action = "/insert" method = "post">
            
            <input type = "hidden" name = "id" value = "${livro.id}" />

            <input type = "text" name = "titulo" value = "${livro.titulo}"/>
            
            <button type = "submit">Salvar</button>
             
        </form>

    </body>

</html>