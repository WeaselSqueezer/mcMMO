package com.gmail.nossr50.skills.swords;

import com.gmail.nossr50.config.AdvancedConfig;

public class Swords {
    public static int    bleedMaxBonusLevel = AdvancedConfig.getInstance().getBleedMaxBonusLevel();
    public static int    bleedMaxTicks      = AdvancedConfig.getInstance().getBleedMaxTicks();
    public static int    bleedBaseTicks     = AdvancedConfig.getInstance().getBleedBaseTicks();
    public static double bleedMaxChance     = AdvancedConfig.getInstance().getBleedChanceMax();

    public static boolean counterAttackRequiresBlock = AdvancedConfig.getInstance().getCounterRequiresBlock();
    public static int     counterAttackMaxBonusLevel = AdvancedConfig.getInstance().getCounterMaxBonusLevel();
    public static double  counterAttackModifier      = AdvancedConfig.getInstance().getCounterModifier();
    public static double  counterAttackMaxChance     = AdvancedConfig.getInstance().getCounterChanceMax();

    public static double serratedStrikesModifier   = AdvancedConfig.getInstance().getSerratedStrikesModifier();
    public static int    serratedStrikesBleedTicks = AdvancedConfig.getInstance().getSerratedStrikesTicks();
}
