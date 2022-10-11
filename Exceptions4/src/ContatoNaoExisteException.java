public class ContatoNaoExisteException {

    pacote  com . loiane . cursojava . aula52 . laboratórios ;

    /**
     *
     * @autor loiane
     */
    classe  pública ContatoNaoExisteException  extends  Exception {

        private  String  nomeContato ;

    public  ContatoNaoExisteException ( String  nomeContato ) {
            isso . nomeContato = nomeContato ;
        }

        @ Substituir
        public  String  getMessage () {
            return  "Contato " + nomeContato + " não existe na agenda!" ;
        }


    }
}
