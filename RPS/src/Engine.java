import java.util.ArrayList;

public class Engine {
    Database database;
    UI ui;
    Logic logic;
    ArrayList<Mode> modes;
    ArrayList<AssetType> assetTypes;

    Engine(Database database, Logic logic, UI ui){
        this.database = new Database();
        this.logic = logic;
        this.modes = database.getModes();
        this.assetTypes= database.getAssetTypes();
        this.ui = ui;
    }

    ArrayList<Mode> getModes(){
        return this.modes;
    }

    Outcome playGame(Mode mode) throws Exception{
        if(mode == Mode.AI_VS_AI){
            return StartAIVSAI();
        }
        if(mode == Mode.AI_VS_HUMAN){
            return StartAIVSHUMAN();
        } else {
            throw new Exception("No mode found");
        }
    }

    ArrayList<AssetType> getAssetTypes(){
        return this.assetTypes;
    }

    Outcome StartAIVSHUMAN() throws Exception{
        ArrayList<Entity> players = new ArrayList<>();
        Entity player = new EntityPlayer("Human", getPlayerAsset());
        Entity ai = new EntityAI("AI", assetTypes);
        players.add(player);
        players.add(ai);
        return logic.showOutcome(players);
    }

    Outcome StartAIVSAI() throws Exception{
        ArrayList<Entity> players = new ArrayList<>();
        Entity ai1 = new EntityAI("AI1",assetTypes);
        Entity ai2 = new EntityAI("AI2",assetTypes);
        players.add(ai1);
        players.add(ai2);
        return logic.showOutcome(players);
    }

    AssetType getPlayerAsset(){
        return ui.getPlayerInput();

    }






}
