package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class RacetrackController {

    public static void main(String[] args) {

        AsphaltOvalIntermediateOrSS phoenix = new AsphaltOvalIntermediateOrSS("phoenix", "phoenix", 4, 0, false, 18.8701, 11, false);
        AsphaltOvalShort bristol = new AsphaltOvalShort("bristol", "bristol", 4, 0, false, 13.326, 24, 1);
        AsphaltRoad lagunaSeca = new AsphaltRoad("laguna seca", "monterey", 7, 5, false, 70.1, 929, 749);
        DirtOval eldora = new DirtOval("eldora", "new weston", 4, 0, false, 12.599, 24, "clay");
        DirtRoadRallyRX charlotte = new DirtRoadRallyRX("charlotte", "concord", 2, 5, true, 34.5, 708, 703, "clay", true, 1, 1);
        DirtRoadRallyStage olympusStageOne = new DirtRoadRallyStage("olympus rally ss 1", "deckerville", 26, 18, false, 446.5, 163, 78, "mixed dirt", false, 11.8);



    }
}
