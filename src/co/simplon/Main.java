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
				System.out.println("Bonne journ�e");
				endOfProg = true;
				break;
			default:
				System.out.println("Donnez une r�ponse correcte");
			}
		} while (!endOfProg);
		in.close();

	}
	// Ecrire un algorithme qui prend en entr�e un nombre entier entre 5 et 25
	// qui d�signera la hauteur d'un sapin � dessiner en mode console.
	// Une fonction de cr�ation de l'arbre doit �tre r�alis�e.
	// Elle prend en param�tre la hauteur de l'arbre
	// et renvoie sous forme d'un tableau de cha�nes de caract�res les �tages du
	// tableau.
	// Une fonction de cr�ation de chaque �tage de l'arbre doit �tre cr��e
	// et �tre utilis�e dans la fonction de cr�ation de l'arbre.

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
