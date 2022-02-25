
/**
 * Write a description of class Main here.
 *
 * @author (Pedro)
 * @version (06-06-2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
                Scanner scan = new Scanner (System.in);
                
                //Variaveis
                String nome;
                
                byte diaNascimento;
                byte mesNascimento;
                int anoNascimento;
                
                byte diaAtual;
                byte mesAtual;
                int anoAtual;
                
                
                int idade;
                String signo;
                String resposta;
                
                //Entradas pessoais
                System.out.print("\fDigite seu nome: ");
                nome = scan.nextLine();
                
                System.out.print("Digite a sua dia de nascimento: ");
                diaNascimento = scan.nextByte();
                
                System.out.print("Digite a seu mês de nascimento: ");
                mesNascimento = scan.nextByte();
                
                System.out.print("Digite o seu ano de nascimento: ");
                anoNascimento = scan.nextInt();
               
                
                //Entradas programa
                System.out.print("Digite o dia atual: ");
                diaAtual = scan.nextByte();
                
                System.out.print("Digite o mês atual: ");
                mesAtual = scan.nextByte();
                
                System.out.print("Digite o ano atual: ");
                anoAtual = scan.nextInt();
            
            
                //idade          
                    if((mesAtual < mesNascimento) || (mesNascimento == mesAtual && diaAtual < diaNascimento)){
                            idade = anoAtual - anoNascimento - 1;
                        }else{
                            idade = anoAtual - anoNascimento;
                        }
                
                        
                //Signo    
                if(mesNascimento == 3 && diaNascimento >=21 && diaNascimento <=31 || mesNascimento == 4 && diaNascimento >=1 && diaNascimento <= 19){
                    signo = "Aries";
                }else if(mesNascimento == 4 && diaNascimento >=20 && diaNascimento <=30 || mesNascimento == 5 && diaNascimento >=1 && diaNascimento <=20){
                    signo = "Touro";
                }else if(mesNascimento == 5 && diaNascimento >=21 && diaNascimento <=31 || mesNascimento == 6 && diaNascimento >=1 && diaNascimento <=20 ){
                    signo = "Gemeos";
                }else if(mesNascimento == 6 && diaNascimento >=21 && diaNascimento <=30 || mesNascimento == 7 && diaNascimento >=1 && diaNascimento <=22){
                    signo = "Cancer";
                }else if(mesNascimento == 7 && diaNascimento >=23 && diaNascimento <=31 || mesNascimento == 8 && diaNascimento >=1 && diaNascimento <=22){
                    signo = "Leão";
                }else if(mesNascimento == 8 && diaNascimento >=23 && diaNascimento <=30 || mesNascimento == 9 && diaNascimento >=1 && diaNascimento <=22){
                    signo = "Virgem";
                }else if(mesNascimento == 9 && diaNascimento >=23 && diaNascimento <=30 || mesNascimento == 10 && diaNascimento >=1 && diaNascimento <=22){
                    signo = "Libra";
                }else if(mesNascimento == 10 && diaNascimento >=23 && diaNascimento <=31 || mesNascimento == 11 && diaNascimento >=1 && diaNascimento <=21){
                    signo = "Escorpião";
                }else if(mesNascimento == 11 && diaNascimento >=22 && diaNascimento <=30 || mesNascimento == 12 && diaNascimento >=1 && diaNascimento <=20){
                    signo = "Sargitario";
                }else if(mesNascimento == 12 && diaNascimento >=21 && diaNascimento  <=31 || mesNascimento == 1 && diaNascimento >=1 && diaNascimento <=19){
                    signo = "Capricornio";
                }else if(mesNascimento == 1 && diaNascimento >=20 && diaNascimento <=30 || mesNascimento == 2  && diaNascimento >=1 && diaNascimento <=17){
                    signo = "Aquario";
                }else{
                    signo = "Peixes";
                }
                
                //Saida
                if(mesAtual < 1 || mesAtual > 12 || mesNascimento < 1 || mesNascimento > 12){
                    resposta = "Erro, este mês não existe!";
                }else if(diaAtual < 1 || diaAtual > 31 || diaNascimento < 1 || diaNascimento > 31){
                    resposta = "Erro, este dia não existe!";
                }else if(anoNascimento > anoAtual){
                    resposta = "Erro, este ano não extiste!";
                }else if((mesNascimento == 4 || mesNascimento == 6 || mesNascimento == 9 || mesNascimento == 11) && (diaNascimento == 31)){
                    resposta = "Erro, este mes nascimento não tem 31 dias";
                }else if((mesAtual == 4 || mesAtual == 6 || mesAtual == 9 || mesAtual == 11) && (diaAtual == 31)){
                    resposta = "Erro, este mes atual não tem 31 dias";
                }else if(diaAtual == 29 && mesAtual == 2 && anoAtual % 400 != 0){
                    resposta = "Erro, não é ano bisexto";
                }else if(diaNascimento == 29 && mesNascimento == 2 && anoNascimento % 400 != 0){
                    resposta = "Erro, não é ano bisexto";
                }else if(idade < 0){
                    resposta = "A SORA TÁ ME TROLLANDO E TU NÃO DEVIA TER NASCIDO SEU CORNO";
                }else if(diaNascimento == diaAtual && mesNascimento == mesAtual){
                    resposta = ("Feliz aniversário, agora me dá meus ponto" + "\nNome: " + nome + "\n Data nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + "\nData atual: " + diaAtual + "/" + mesAtual + "/" + anoAtual + "\nVocê tem: " + idade  + " anos." + "\nVocê é do signo: " + signo );                     ;
                }else if(idade == 0){
                    resposta = ("Que novinho querido, agora me dá meus ponto" + "\nNome: " + nome + "\n Data nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + "\nData atual: " + diaAtual + "/" + mesAtual + "/" + anoAtual + "\nVocê tem: " + idade  + " anos." + "\nVocê é do signo: " + signo );
                }else{
                    resposta = ("Nome: " + nome + "\n Data nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + "\nData atual: " + diaAtual + "/" + mesAtual + "/" + anoAtual + "\nVocê tem: " + idade  + " anos." + "\nVocê é do signo: " + signo );                    
                }
                
                System.out.println("\f" + resposta);
               
        
        }
      
    }
      


