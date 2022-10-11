public class AgendaCheiaException {
    *
            * Para alterar este cabeçalho de licença, escolha License Headers em Project Properties.
* Para alterar este arquivo de modelo, escolha Ferramentas | Modelos
* e abra o modelo no editor.
            */
    pacote  com . loiane . cursojava . aula52 . laboratórios ;

    /**
     *
     * @autor loiane
     */
    public  class  AgendaCheiaExeption  estende  Exception {

        @ Substituir
        public  String  getMessage () {
            return  "Agenda já está cheia" ;
        }

    }
}
