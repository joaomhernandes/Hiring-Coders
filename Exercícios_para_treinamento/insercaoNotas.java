import javax.swing.JOptionPane;
public class insercaoNotas {
    public static void main(String[] args) {
// declaração de variáveis.
        float nota = 0;
        float media = 0;
        String nomeAluno = "";
        float maiorMedia = 0;
        String melhorAluno = "";
        int continua = 0;

//Loop while verifica se será inserido as notas de outro aluno.
        while (continua == 0){
            nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno" + continua);
            media = 0;
//Loop for para solicitar três notas e calcular a média.
            for (int i = 1; i <= 3; i++ ){
                nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota"+ i + " do aluno"));
                media += nota; 
            }
            media = media/3;
//Condicional if realiza a verificação da maior média 
//e salva os valores do nome do aluno com maior média e o válor de sua média.
            if (media > maiorMedia){
                maiorMedia = media;
                melhorAluno = nomeAluno;
            }
//Utilizei JOptionPane.showOptionDialog para realizar a decisão de adicionar as notas outro aluno
//Seu uso é feito da seguinte forma: as opções são dadas pelo objeto options na ordem que será mostrado na tela,
//e será retornado na varável "continua" o valor de seu índice, no caso, 0 para SIM e 1 para NAO.
            Object[] options = { "SIM", "NAO"};
                continua = JOptionPane.showOptionDialog(null, "Deseja inserir as notas de outro aluno?", "Warning",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);         
        }
//Exibição da maior média e do nome do aluno que a tirou.
        JOptionPane.showMessageDialog(null, "Maior Media = " + maiorMedia + " Nome = " + melhorAluno,

            "information", JOptionPane.INFORMATION_MESSAGE);
    }
} 