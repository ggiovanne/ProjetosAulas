public class Agenda {
    /*
     * Para alterar este cabeçalho de licença, escolha License Headers em Project Properties.
     * Para alterar este arquivo de modelo, escolha Ferramentas | Modelos
     * e abra o modelo no editor.
     */
    pacote  com . loiane . cursojava . aula52 . laboratórios ;

    /**
     *
     * @autor loiane
     */
    Classe  pública Agenda {

        contato privado [] contatos ;

        Agenda pública (){
            contatos = novo  contato [ 5 ];
        }

        public  void  adicionarContato ( Contato  c ) throws  AgendaCheiaExeption {

            boolean  cheia = true ;
            for ( int  i = 0 ; i < contatos . comprimento ; i ++){
                if ( contatos [ i ] == null ){
                    contatos [ i ] = c ;
                    cheia = falso ;
                    quebrar ;
                }
            }

            if ( cheia ){
                lançar  nova  AgendaCheiaExeption ();
            }
        }

        public  int  consultaContatoPorNome ( String  nome ) lança  ContatoNaoExisteException {

            for ( int  i = 0 ; i < contatos . comprimento ; i ++){
                if ( contatos [ i ] != null ){
                    if ( contatos [ i ]. getNome (). equalsIgnoreCase ( nome )){
                        retorno  eu ;
                    }
                }
            }
            lançar  novo  ContatoNaoExisteException ( nome );
        }

        @ Substituir
        public  String  toString () {
            Cadeia  s = "" ;
            para ( Contato  c : contatos ){
                if ( c != null ){
                    s += c . toString () + "\n" ;
                }
            }
            retornar  s ;
        }

    }
}
