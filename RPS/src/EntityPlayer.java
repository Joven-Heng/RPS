public class EntityPlayer implements Entity{
    private final Asset asset;
    private final String name;

    EntityPlayer(String name, AssetType assetType){
        this.name = name;
        this.asset = new Asset(assetType);
    }

    public Asset showHand(){
        return asset;
    }

    public String getName(){
        return name;
    }


}
