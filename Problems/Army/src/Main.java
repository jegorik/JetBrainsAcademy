    public static void createArmy() {
        for (int i = 0; i < 5; i++) {
            new Unit("unit" + i);
        }
        for (int i = 0; i < 3; i++) {
            new Knight("knight" + i);
        }

        new General("general");
        new Doctor("doctor");
    }
