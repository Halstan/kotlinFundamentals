fun main() {

    val salt = 5
    val palabra = "Profesor pongame 20 por favor xd"

    /**
     * steveCrypt es un algoritmo de encriptación que recorre el string dado
     * lo descompone en char y lo suma por las veces dado en la salt y le concatena
     * un steve al final de cada palabra
     * @param word es la cadena de texto a encriptar
     * @param salt es el numero de veces que se va encriptar la cadena
     * */
    fun steveCrypt(word: String, salt: Int){
        var encrypt = ""
        for (w in word){
            if (w.isLetter() || w.isWhitespace() || w.isDigit()){
                for (i in salt downTo 1){
                    encrypt = w + i + "steve"
                }
                print(encrypt)
            }
        }
    }

    /**
     * steveDecrypt es un algoritmo de des-encriptación que recorre el string dado
     * elimina la palabra steve
     * lo descompone en char y lo resta las veces dado en la salt
     * @param word es la cadena de texto a des-encriptar
     * @param salt es el numero de veces que se va des-encriptar la cadena
     * */
    fun steveDecrypt(word: String, salt: Int){
        val deEncrypt = word.replace("steve", "")
        var encrypt: Char? = null
        for (w in deEncrypt){
                for (i in salt downTo 1){
                    encrypt = w - i
                }
            print(encrypt)
        }
    }

    steveDecrypt("Qstevesstevepstevegstevefstevetstevepstevessteve!steveqstevepsteveostevehstevebstevenstevefsteve!steve3steve1steve!steveqstevepstevessteve!stevegstevebstevewstevepstevessteve!steveysteveesteve", salt)
    steveCrypt(palabra, salt)

}