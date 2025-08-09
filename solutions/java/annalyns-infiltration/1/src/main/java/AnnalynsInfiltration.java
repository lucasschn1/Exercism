class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
     return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }
    public static boolean canFreePrisoner(
    boolean knightIsAwake,
    boolean archerIsAwake,
    boolean prisonerIsAwake,
    boolean petDogIsPresent
) {
    // todos acordadados - falso
    if (knightIsAwake && archerIsAwake && prisonerIsAwake) {
            return false;
    }  
        
    if (petDogIsPresent) {
        if (archerIsAwake && !knightIsAwake) {
            return false;
        } else if (!prisonerIsAwake && archerIsAwake && knightIsAwake) {
            return false;
        } else {
            return true;
        }
    } else {
        return !knightIsAwake && !archerIsAwake && prisonerIsAwake;
    }
  }
}

