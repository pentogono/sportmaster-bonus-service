package ru.itpark.service;

public class SportmasterBonusService {
    public int calculateBonus(int totalAmount, int purchaseAmount) {

        int blueCardBonus = 50;
        int silverCardBonus = 70;
        int goldCardBonus = 100;
        int blueCardMinLevel = 0;
        int blueCardMaxLevel = 15_000;
        int silverCardMinLevel = 15_001;
        int silverCardMaxLevel = 150_000;
        int thousand = 1_000;

        int purchaseDevideThousand = purchaseAmount / thousand;

        if (totalAmount >= blueCardMinLevel && totalAmount <= blueCardMaxLevel) {
            return blueCardBonus * purchaseDevideThousand;

        }
        if (totalAmount >= silverCardMinLevel && totalAmount <= silverCardMaxLevel) {
            return silverCardBonus * purchaseDevideThousand;

        }
        return goldCardBonus * purchaseDevideThousand;
    }

}
