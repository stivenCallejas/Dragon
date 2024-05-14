
import java.util.Scanner;

// Clase para representar un nodo en el cuestionario
class QuestionNode {

    private String question;
    private String answer;
    private QuestionNode yesNode;
    private QuestionNode noNode;

    public QuestionNode(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.yesNode = null;
        this.noNode = null;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setYesNode(QuestionNode yesNode) {
        this.yesNode = yesNode;
    }

    public void setNoNode(QuestionNode noNode) {
        this.noNode = noNode;
    }

    public QuestionNode getNextNode(boolean userAnswer) {
        return userAnswer ? yesNode : noNode;
    }
}

public class QuizMaze {

    public static void main(String[] args) {
        // Crear nodos para el cuestionario
        QuestionNode start = new QuestionNode("¿ una bicicleta Es un animal?", null);
      
        QuestionNode yesAnimal = new QuestionNode("¿Tiene pelo?", "Perro");
        QuestionNode noAnimal = new QuestionNode("¿Tiene ruedas?", "Bicicleta");



        // Conectar nodos
        start.setYesNode(yesAnimal);
        start.setNoNode(noAnimal);

        // Iniciar el cuestionario
        QuestionNode currentNode = start;
        Scanner scanner = new Scanner(System.in);

        while (currentNode.getAnswer() == null) {
            System.out.println(currentNode.getQuestion());
            System.out.print("Respuesta (sí/no): ");
            String userResponse = scanner.nextLine().toLowerCase();

            if (userResponse.equals("sí")) {
                currentNode = currentNode.getNextNode(true);
            } else if (userResponse.equals("no")) {
                currentNode = currentNode.getNextNode(false);
            } else {
                System.out.println("Respuesta no válida. Por favor, responde con 'sí' o 'no'.");
            }
        }

       System.out.println("¡Has encontrado: " + currentNode.getAnswer() + "!");
    }
}
