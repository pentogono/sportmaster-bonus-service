package ru.itpark;

public class SportmasterBonusService {
    public int calculateBonus (int totalAmount, int purchaseAmount) {
        int result ;
        int blueCardBonuceThousand=50;
        int silverCardBonuceThousand=70;
        int goldCardBonuceThousand=100;
        int blueCardMinLevel=1;
        int blueCardMaxLevel=15_000;
        int silverCardMinLevel=15_001;
        int silverCardMaxLevel=150_000;
        int purchaseDevidedThousand=purchaseAmount/1_000;

        if (totalAmount >= blueCardMinLevel && totalAmount <= blueCardMaxLevel) {
            result=blueCardBonuceThousand*purchaseDevidedThousand; // blue card

        } else if (totalAmount >= silverCardMinLevel && totalAmount <= silverCardMaxLevel) {
            result=silverCardBonuceThousand*purchaseDevidedThousand; // silver card

        } else {
            result=goldCardBonuceThousand*purchaseDevidedThousand; //gold card

        }
        return  result;

    }

}
