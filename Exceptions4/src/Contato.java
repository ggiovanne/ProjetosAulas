public class Contato {

    pacote  com . loiane . cursojava . aula52 . laboratórios ;


    classe  pública Contato {

        contador estático  privado = 0 ; _

        id int  privado ;
        nome da string  privada ;
        privado  String  telefone ;
        e- mail privado String  ;

        contato público (){
            contador ++;
            id = contador ;
        }

        /**
         * @return o id
         */
        public  int  getId () {
            ID de retorno ;
        }


        /**
         * @return o nome
         */
        public  String  getNome () {
            retornar  nome ;
        }

        /**
         * @param nome o nome a definir
         */
        public  void  setNome ( String  nome ) {
            isso . nome = nome ;
        }

        /**
         * @return o telefone
         */
        public  String  getTelefone () {
            telefone de retorno ;
        }

        /**
         * @param telefone o telefone a definir
         */
        public  void  setTelefone ( String  telefone ) {
            isso . telefone = telefone ;
        }

        /**
         * @return o e-mail
         */
        public  String  getEmail () {
            e-mail de retorno ;
        }

        /**
         * @param email o email para definir
         */
        public  void  setEmail ( String  email ) {
            isso . e- mail = e- mail ;
        }

        @ Substituir
        public  String  toString () {
            Cadeia  s = "[" ;
            s += "Id: " + ID ;
            s += ", Nome: " + nome ;
            s += ", Telefone: " + telefone ;
            s += ", E-mail: " + e- mail ;
            s += "]" ;
            retornar  s ;
        }


    }
}
