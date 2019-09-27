<!DOCTYPE html>

<html>
    <head>
        <title>Ejemplo MVC con JSP y Servlets</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Ejemplo MVC con JSP y Servlets</h1>
        <h2>A�adir persona</h2>
        <form name='form1' method='post' action='./personas.do'>
            <table border='1'>
                <tr>
                    <td>Nombre</td>
                    <td><input type='text' name='nombre' id='nombre'/></td>
                </tr>
                <tr>
                    <td>Edad</td>
                    <td> <input type='number' name='edad' id='edad'/></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type='text' name='email' id='email'/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type='password' name='password' id='password'/></td>
                </tr>
            </table>
            <input type='submit' value='Enviar'/>
            <input type='hidden' name="queHacer" id="queHacer" value='add'/>
        </form>
        
        <h2>Buscar persona</h2>
        <form name='formBusq' method='get' action='./personas.do'> <!--metodo get-->
            <table border='1'>
                <tr>
                    <td>Nombre</td>
                    <td><input type='text' name='nombre' id='nombre'/></td>
                </tr>
            </table>
            <input type='submit' value='Enviar'/>
            <input type='hidden' name="queHacer" id="queHacer" value='irABuscar'/>
        </form>
        
        <h2>Modificar Persona</h2>
        <form name='formMod' method='get' action='./personas.do'> <!--metodo get-->
            <table border='1'>
                <tr>
                    <td>Nombre</td>
                    <td><input type='text' name='nombre' id='nombre'/></td>
                </tr>
            </table>
            <input type='submit' value='Enviar'/>
            <input type='hidden' name="queHacer" id="queHacer" value='irAModificar'/>
        </form>
    </body>
</html>
