import javax.swing.JOptionPane;

 

public class tryCatch {

 

    public static void main(String[] args) {

        // declaração de variáveis

        int idade = 0;

        String sexo = "";

        String aux;

 

        //entrada de dados

        try {

            aux = JOptionPane.showInputDialog("Digite sua idade");

            idade = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Digite seu sexo, MASCULINO ou FEMININO.");

            sexo = aux;

      

            sexo = sexo.toUpperCase(); // Conversão realizada para que seja indiferente se a pessoa digitar o sexo em maiúsculo ou minúsculo.

 

        if (idade < 18 && sexo.equals("MASCULINO") ){

            JOptionPane.showMessageDialog(null, "Você é um menino.");

        }else if (idade < 18 && sexo.equals("FEMININO") ){

            JOptionPane.showMessageDialog(null, "Você é uma menina.");

        }else if (idade >= 18 && sexo.equals("MASCULINO") ){

            JOptionPane.showMessageDialog(null, "Você é um homem.");

        }else if (idade >= 18 && sexo.equals("FEMININO") ){

            JOptionPane.showMessageDialog(null, "Você é uma mulher.");

        }else{

        JOptionPane.showMessageDialog(null, "Você digitou um sexo inválido!"); //verificação feita para garantir um feedback quando a pessou digitar algo diferente dos sexos válidos.

        }

    } catch (NumberFormatException e) {

        JOptionPane.showMessageDialog(null, "Entre somente com um número Inteiro para sua idade",

            "E R R O", JOptionPane.ERROR_MESSAGE);

    }

    } 

} 