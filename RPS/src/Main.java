public class Main {
    public static void main(String [] args){
        Logic logic = new Logic();
        Database database = new Database();
        UI ui = new UI();
        Engine engine = new Engine( database, logic, ui);
        ui.StartUp(engine);
    }
}
