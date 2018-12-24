package com.duoc.grupo.pvm.testcalendar

class Persona{
    var rut:Int=0
    var nombres:String="Tu Nombre"
    var apellidos:String="Tu Apellido"
    var sexo:Char='N'
    var fechaDeNacimiento:String="00/00/0000"//Instant.now().toString()//"00/00/0000"
    var correoElectronico:String="tucorreo@dominio.extension"
    var nombreUsuario:String="Tu Nombre de Usuario"
    var claveUsuario:String="Tu clave de usuario"


    /**
     * Busca una persona, recibe una lista con un codigo a comparar y retorna el indice donde se encontro
     * Si no se encontro retorna -1 como codigo de error
     */
    fun buscar(listaPersonas:MutableList<Persona>, rut:Int):Int{
        var encontrado:Int=-1
        var i:Int=-1

        for (i in listaPersonas.indices){
            if(listaPersonas[i].rut==rut){
                encontrado=i
                break
            }
        }
        return encontrado;
    }

    /**
     * Recupera una persona dada una lista y el codigo.
     * La lista es de objetos que contengan dicho codigo.
     * en caso de error o la busqueda de como resultado menor que cero, esta funcion retorna null.
     * Ante este escenario, el tipo de dato objeto esta como nuleable(? al final del tipo)
     */
    fun recuperar(listaPersonas:MutableList<Persona>, rut:Int):Persona?/*<--*/{
        if(buscar(listaPersonas,rut)>=0) {
            return listaPersonas[buscar(listaPersonas, rut)]
        }else return null
    }

    /**
     *  Agrega una persona a la lista de personas
     *  Si existe no la agrega y envia un mensaje booleano
     */
    fun agregar(listaPersonas:MutableList<Persona>,persona:Persona):Boolean {
        var agregado: Boolean = false
        var encontrado: Int = buscar(listaPersonas, persona.rut)
        if (encontrado < 0){
            listaPersonas.add(persona)
            agregado = true
        }
        return agregado
    }
    /**
     *  Elimina una persona a de lista de personas
     *  Si no existe no la elimina y envia un mensaje booleano
     */
    fun eliminar(listaPersonas:MutableList<Persona>,persona:Persona):Boolean{
        var eliminado: Boolean = false
        var perRecup:Persona?= recuperar(listaPersonas, persona.rut)
        if (perRecup!=null){
            listaPersonas.remove(persona)
            eliminado = true
        }
        return eliminado
    }
}