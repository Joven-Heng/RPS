import java.util.ArrayList;
import java.util.Arrays;

public class Database {
    private ArrayList<Mode> modes;
    private ArrayList<AssetType> assetTypes;
    int winCounter;

    Database(){
        this.updateDatabase();
    }

    // This would be eventually populated to read from a text or soemthing but
    // for a MVP, we will just rely on the function itself
    void updateDatabase(){
        modes = new ArrayList<>(Arrays.asList(Mode.values()));
        assetTypes = new ArrayList<>(Arrays.asList(AssetType.values()));
    }

    ArrayList<Mode> getModes(){
        return modes;
    }

    ArrayList<AssetType> getAssetTypes(){
        return assetTypes;
    }




}

