import java.util.ArrayList;
import java.util.Random;

public class EntityAI implements Entity{
    Asset asset;
    String name;

    EntityAI(String name, AssetType assetType){
        this.name = name;
        this.asset = new Asset(assetType);
    }

    EntityAI(String name, ArrayList<AssetType> assets){
        this.asset = RandomiseAsset(assets);
        this.name = name;
    }

    private Asset RandomiseAsset(ArrayList<AssetType> assets) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(assets.size());
        Asset asset = new Asset(assets.get(randomIndex));
        return asset;
    }

    public Asset showHand(){
        return asset;
    }

    public String getName(){
        return name;
    }
}
