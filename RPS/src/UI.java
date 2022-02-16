import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private Engine engine;
    Scanner sc;

    UI(){
        this.sc = new Scanner(System.in);
    }

    void StartUp(Engine engine){
        this.engine = engine;
        ArrayList<Mode> modes = engine.getModes();
        String toPlay;
        try {
            do {
                OpenGame(modes);
                System.out.println("Do you want to play again? \n");
                System.out.println("Input 1 to play again");
                toPlay = sc.nextLine();
            } while (toPlay.equals("1"));
            System.out.println("Thank for playing!");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    void OpenGame(ArrayList<Mode> modes) throws Exception{
        System.out.println("Welcome to RPS, What mode do you want to play?\n" +
                "Enter the line number of what you want to play");
        for (Mode mode : modes) {
            System.out.println(mode);
        }

        selectMode(modes);
    }

    private void selectMode(ArrayList<Mode> modes) throws Exception {
        //validate result
        Mode selectedMode = null;
        boolean isCorrect;
        do {
            String result = sc.nextLine();
            isCorrect = true;
            switch (result) {
            case "1":
                selectedMode = modes.get(0);
                break;
            case "2":
                selectedMode = modes.get(1);
                break;
            default:
                isCorrect = false;
                System.out.println("no such mode / input incorrect\n");
                System.out.println("Enter again!");
            }
        } while (!isCorrect);
        System.out.println(selectedMode + " selected\n");
        playGame(selectedMode);
    }


    void displayOutcome(Outcome outcome){
        System.out.println(outcome.message + "\n");
    }

    void playGame(Mode mode) throws Exception{
        System.out.println("Playing " + mode + " game\n");
        Outcome outcome = engine.playGame(mode);
        this.displayOutcome(outcome);
    }

    AssetType getPlayerInput() {
        ArrayList<AssetType> assets = engine.getAssetTypes();
        System.out.println("Please input the integer for your move");
        for (AssetType asset : assets) {
            System.out.println(asset);
        }

        AssetType selectedAssetType = null;
        boolean isCorrect;
        do{
            String result = sc.nextLine();
            isCorrect = true;
        switch(result) {
        case "1":
            selectedAssetType = assets.get(0);
            break;
        case "2":
            selectedAssetType = assets.get(1);
            break;
        case "3":
            selectedAssetType = assets.get(2);
            break;
        default:
            System.out.println("no such assetType / input incorrect, please try again");
            isCorrect = false;
        }
        } while(!isCorrect);

        assert(selectedAssetType != null);

        System.out.println(selectedAssetType + " selected\n");
        return selectedAssetType;


    }
}
