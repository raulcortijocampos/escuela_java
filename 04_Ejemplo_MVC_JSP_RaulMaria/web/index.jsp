<!DOCTYPE html>

<html>
    <head>
        <title>Ejemplo MVC con JSP y Servlets</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="estilo/estilo.jsp"/>
    </head>
    <body>
        <div class="agarrate">
        <h1>Ejemplo MVC con JSP y Servlets</h1>
        <h2>Añadir persona</h2>
        <form name='form1' method='post' action='./personas.do'>
            <table border='1'>
                <tr>
                    <td>Nombre</td>
                    <td><input type='text' name='nombre' id='nombre' value='lala'/></td>
                </tr>
                <tr>
                    <td>Edad</td>
                    <td> <input type='number' name='edad' id='edad' value='23'/></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type='text' name='email' id='email' value="@."/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type='password' name='password' id='password' value='1234'/></td>
                </tr>
            </table>
            <input type='submit' value='Enviar'/>
            <input type='hidden' name="queHacer" id="queHacer" value='add'/>
        </form>
        
        <h2>Buscar persona</h2><img src=""/>
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
        
        <h2>Borrar Persona</h2>
        <form name='formBorr' method='post' action='./personas.do'> <!--metodo get-->
            <table border='1'>
                <tr>
                    <td>Nombre</td>
                    <td><input type='text' name='nAntiguo' id='nAntiguo'/></td>
                </tr>
            </table>
            <input type='submit' value='Borrar' onclick="poner()"/>
            <input type='hidden' name="nombreABorrar" id="nombreABorrar" />
            <input type='hidden' name="queHacer" id="queHacer" value='borrar'/>
        </form>
        </div>
    <script>
         let cajaNum1 = document.getElementById("nAntiguo");
         let campoNombre=document.getElementById("nombreABorrar");
         
    function poner(){
        let cajaNum1 = document.getElementById("nAntiguo");
         let campoNombre=document.getElementById("nombreABorrar");
         campoNombre.value=cajaNum1.value;
    }
    </script>
    </body>
    
</html>
