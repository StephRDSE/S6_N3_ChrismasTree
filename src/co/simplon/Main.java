package co.simplon;


import java.util.Scanner;



public class Main {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		boolean endOfProg = false;
		
		do {
			String answer = null;
			System.out.println("Voulez vous dessiner un arbre de noel ?");
			System.out.println("0) Non, sortir du programme." + "\n" + "1) Oui.");
			answer = in.nextLine();
			System.out.println(answer);
			switch (answer) {
			case "1":
				input();
				break;
			case "0":
				System.out.println("Bonne journée");
				endOfProg = true;
				break;
			default:
				System.out.println("Donnez une réponse correcte");
			}
		} while (!endOfProg);
		in.close();

	}
	// Ecrire un algorithme qui prend en entrée un nombre entier entre 5 et 25
	// qui désignera la hauteur d'un sapin à dessiner en mode console.
	// Une fonction de création de l'arbre doit être réalisée.
	// Elle prend en paramètre la hauteur de l'arbre
	// et renvoie sous forme d'un tableau de chaînes de caractères les étages du
	// tableau.
	// Une fonction de création de chaque étage de l'arbre doit être créée
	// et être utilisée dans la fonction de création de l'arbre.

	public static void input() {

		int stages;

		System.out.println("De quelle hauteur souhaitez vous votre sapin ? \n Proposez un nombre en 5 et 25 !");

		stages = Integer.parseInt(in.nextLine());

		drawTree(stages);
	}

	public static String createStage(int largeStages, int stage) {
		String result = "";
		String writedCell = "#";
		String emptyCell = " ";
		String[] sentence = new String[largeStages];

		for (int posX = 0; posX < ((largeStages - 1) / 2 - stage); posX++) {
			sentence[posX] = emptyCell;
		}
		for (int posX = ((largeStages - 1) / 2 - stage); posX < ((largeStages - 1) / 2 + 1 + stage); posX++) {
			sentence[posX] = writedCell;
		}
		for (int posX = ((largeStages - 1) / 2 + 1 + stage); posX < (largeStages); posX++) {
			sentence[posX] = emptyCell;
		}
		for (int s = 0; s < largeStages; s++) {
			result += sentence[s];
		}
		return result;
	}
	public static String createWood(int largeStages, int stage) {
		String result = "";
		String writedCell = "#";
		String emptyCell = " ";
		String[] sentence = new String[largeStages];

		for (int posX = 0; posX < ((largeStages - 1) / 2 - 1); posX++) {
			sentence[posX] = emptyCell;
		}
		for (int posX = ((largeStages - 1) / 2 - 1); posX < ((largeStages - 1) / 2 + 2 ); posX++) {
			sentence[posX] = writedCell;
		}
		for (int posX = ((largeStages - 1) / 2 + 2 ); posX < (largeStages); posX++) {
			sentence[posX] = emptyCell;
		}
		for (int s = 0; s < largeStages; s++) {
			result += sentence[s];
		}
		return result;
	}

	public static void drawTree(int height) {

		String[] heightTree = new String[height + 3];
		int width = (height - 1) * 2 + 1;

		for (int i = 0; i < height; i++) {

			heightTree[i] = createStage(width, i);

		}
		for (int t = height; t < height + 3; t++) {

			heightTree[t] = createWood(width, t);

		}

		for (int j = 0; j < height; j++) {
			System.out.println(heightTree[j]);

		}
		for (int k = height; k < height+3; k++) {
			System.out.println(heightTree[k]);

		}

	}

}
