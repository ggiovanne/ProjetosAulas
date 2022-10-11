public class Programa {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    /*
     * Para alterar este cabeçalho de licença, escolha License Headers em Project Properties.
     * Para alterar este arquivo de modelo, escolha Ferramentas | Modelos
     * e abra o modelo no editor.
     */
    pacote  com . loiane . cursojava . aula52 . laboratórios ;

    importar  java . útil . Scanner ;
    importar  java . útil . registro . Nível ;
    importar  java . útil . registro . Registrador ;

    /**
     *
     * @autor loiane
     */
    classe  pública Teste {

        public  static  void  main ( String [] args ) {

            Scanner  scan = new  Scanner ( System . in );
            Agenda  agenda = nova  Agenda ();

            int  opcao = 1 ;

            while ( opcao != 3 ){
                opcao = obterOpcaoMenu ( scan );

                if ( opcao == 1 ){ //Consultar contato
                    consultarContato ( scan , agenda );
                } else  if ( opcao == 2 ){ //Adicionar contato
                    adicionarContato ( scan , agenda );
                }
            }
        }

        public  static  void  adicionarContato ( Scanner  scan , Agenda  agenda ){
            tente {
                Sistema . fora . println ( "Criando um contato, entre com as informações" );
                String  nome = leInformacaoString ( scan , "Entre com o nome do contato" );
                String  telefone = leInformacaoString ( scan , "Entre com o telefone do contato" );
                String  email = leInformacaoString ( scan , "Entre com o email do contato" );

                Contato  contato = novo  Contato ();
                contato . setNome ( nome );
                contato . setEmail ( email );
                contato . setTelefone ( telefone );

                Sistema . fora . println ( "Contate a ser criado: " );
                Sistema . fora . println ( contato );

                agenda . adicionarContato ( contato );
            } catch ( AgendaCheiaExeption  e ) {
                Sistema . fora . println ( por exemplo , getMessage ());

                Sistema . fora . println ( "Contatos da agenda" );
                Sistema . fora . println ( agenda );
            }
        }

        public  static  void  consultarContato ( Scanner  scan , Agenda  agenda ){
            String  nomeContato = leInformacaoString ( scan , "Entre com o nome do contato a ser pesquisado: " );
            tente {
                if ( agenda . consultaContatoPorNome ( nomeContato ) >= 0 ){
                    Sistema . fora . println ( "Contato existe" );
                }
            } catch ( ContatoNaoExisteException  e ) {
                Sistema . fora . println ( por exemplo , getMessage ());
            }
        }

        public  static  String  leInformacaoString ( Scanner  scan , String  msg ){
            Sistema . fora . println ( msg );
            String  entrada = scan . próximaLinha ();
            retorno  de entrada ;
        }

        public  static  int  obterOpcaoMenu ( Scanner  scan ){

            boolean  entradaValida = false ;
            int  opcao = 3 ;

            while (! entradaValida ){
                Sistema . fora . println ( "Digite a opção desejada:" );
                Sistema . fora . println ( "1: Consulte contato" );
                Sistema . fora . println ( "2: Adicionar contato" );
                Sistema . fora . println ( "3: Sair" );

                tente {
                    String  entrada = scan . próximaLinha ();
                    opcao = inteiro . parseInt ( entrada );

                    if ( operação == 1 || operação == 2 || operação == 3 ){
                        entradaValida = true ;
                    } senão {
                        throw  new  Exception ( "Entrada inválida" );
                    }
                }
            catch ( Exceção  e ){
                    Sistema . fora . println ( "Entrada inválida, digite novamente\n" );
                }
            }

            retornar  opcao ;
        }
    }
}