public class SpawnMonstre {
    public static Monstre create(String id){
        switch(id){
            case "Chauve-souris":
                return new Chauve_souris();
            case "Gobelin":
                return new Gobelin();
            case "Geant":
                return new Geant();
            case "Orc":
                return new Orc();
            case "Necromant":
                return new Necromant();
            case "Dragon":
                return new Dragon();
            case "Dragon-Venerable":
                return new Dragon_Venerable();
        }
        return new Gobelin();
    }
} 