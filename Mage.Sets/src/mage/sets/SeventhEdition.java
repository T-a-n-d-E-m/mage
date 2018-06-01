/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.ExpansionSet;
import mage.cards.g.GoblinWarDrums;
import mage.cards.s.StormShaman;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author North
 */
public final class SeventhEdition extends ExpansionSet {

    private static final SeventhEdition instance = new SeventhEdition();

    public static SeventhEdition getInstance() {
        return instance;
    }

    private SeventhEdition() {
        super("Seventh Edition", "7ED", ExpansionSet.buildDate(2001, 3, 11), SetType.CORE);
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Abyssal Horror", 115, Rarity.RARE, mage.cards.a.AbyssalHorror.class));
        cards.add(new SetCardInfo("Abyssal Specter", 116, Rarity.UNCOMMON, mage.cards.a.AbyssalSpecter.class));
        cards.add(new SetCardInfo("Adarkar Wastes", 325, Rarity.RARE, mage.cards.a.AdarkarWastes.class));
        cards.add(new SetCardInfo("Aether Flash", 172, Rarity.UNCOMMON, mage.cards.a.AetherFlash.class));
        cards.add(new SetCardInfo("Agonizing Memories", 117, Rarity.UNCOMMON, mage.cards.a.AgonizingMemories.class));
        cards.add(new SetCardInfo("Air Elemental", 58, Rarity.UNCOMMON, mage.cards.a.AirElemental.class));
        cards.add(new SetCardInfo("Aladdin's Ring", 286, Rarity.RARE, mage.cards.a.AladdinsRing.class));
        cards.add(new SetCardInfo("Anaconda", 229, Rarity.UNCOMMON, mage.cards.a.Anaconda.class));
        cards.add(new SetCardInfo("Ancestral Memories", 59, Rarity.RARE, mage.cards.a.AncestralMemories.class));
        cards.add(new SetCardInfo("Ancient Silverback", 230, Rarity.RARE, mage.cards.a.AncientSilverback.class));
        cards.add(new SetCardInfo("Angelic Page", 1, Rarity.COMMON, mage.cards.a.AngelicPage.class));
        cards.add(new SetCardInfo("Arcane Laboratory", 60, Rarity.UNCOMMON, mage.cards.a.ArcaneLaboratory.class));
        cards.add(new SetCardInfo("Archivist", 61, Rarity.RARE, mage.cards.a.Archivist.class));
        cards.add(new SetCardInfo("Ardent Militia", 2, Rarity.UNCOMMON, mage.cards.a.ArdentMilitia.class));
        cards.add(new SetCardInfo("Balduvian Barbarians", 173, Rarity.COMMON, mage.cards.b.BalduvianBarbarians.class));
        cards.add(new SetCardInfo("Baleful Stare", 62, Rarity.UNCOMMON, mage.cards.b.BalefulStare.class));
        cards.add(new SetCardInfo("Beast of Burden", 287, Rarity.RARE, mage.cards.b.BeastOfBurden.class));
        cards.add(new SetCardInfo("Bedlam", 174, Rarity.RARE, mage.cards.b.Bedlam.class));
        cards.add(new SetCardInfo("Befoul", 118, Rarity.UNCOMMON, mage.cards.b.Befoul.class));
        cards.add(new SetCardInfo("Bellowing Fiend", 119, Rarity.RARE, mage.cards.b.BellowingFiend.class));
        cards.add(new SetCardInfo("Benthic Behemoth", 63, Rarity.RARE, mage.cards.b.BenthicBehemoth.class));
        cards.add(new SetCardInfo("Bereavement", 120, Rarity.UNCOMMON, mage.cards.b.Bereavement.class));
        cards.add(new SetCardInfo("Birds of Paradise", 231, Rarity.RARE, mage.cards.b.BirdsOfParadise.class));
        cards.add(new SetCardInfo("Blanchwood Armor", 232, Rarity.UNCOMMON, mage.cards.b.BlanchwoodArmor.class));
        cards.add(new SetCardInfo("Blaze", 175, Rarity.UNCOMMON, mage.cards.b.Blaze.class));
        cards.add(new SetCardInfo("Blessed Reversal", 3, Rarity.RARE, mage.cards.b.BlessedReversal.class));
        cards.add(new SetCardInfo("Blood Pet", 121, Rarity.COMMON, mage.cards.b.BloodPet.class));
        cards.add(new SetCardInfo("Bloodshot Cyclops", 176, Rarity.RARE, mage.cards.b.BloodshotCyclops.class));
        cards.add(new SetCardInfo("Bog Imp", 122, Rarity.COMMON, mage.cards.b.BogImp.class));
        cards.add(new SetCardInfo("Bog Wraith", 123, Rarity.UNCOMMON, mage.cards.b.BogWraith.class));
        cards.add(new SetCardInfo("Boil", 177, Rarity.UNCOMMON, mage.cards.b.Boil.class));
        cards.add(new SetCardInfo("Boomerang", 64, Rarity.COMMON, mage.cards.b.Boomerang.class));
        cards.add(new SetCardInfo("Breath of Life", 4, Rarity.UNCOMMON, mage.cards.b.BreathOfLife.class));
        cards.add(new SetCardInfo("Brushland", 326, Rarity.RARE, mage.cards.b.Brushland.class));
        cards.add(new SetCardInfo("Bull Hippo", 233, Rarity.UNCOMMON, mage.cards.b.BullHippo.class));
        cards.add(new SetCardInfo("Caltrops", 288, Rarity.UNCOMMON, mage.cards.c.Caltrops.class));
        cards.add(new SetCardInfo("Canopy Spider", 234, Rarity.COMMON, mage.cards.c.CanopySpider.class));
        cards.add(new SetCardInfo("Castle", 5, Rarity.UNCOMMON, mage.cards.c.Castle.class));
        cards.add(new SetCardInfo("Charcoal Diamond", 289, Rarity.UNCOMMON, mage.cards.c.CharcoalDiamond.class));
        cards.add(new SetCardInfo("Circle of Protection: Black", 6, Rarity.COMMON, mage.cards.c.CircleOfProtectionBlack.class));
        cards.add(new SetCardInfo("Circle of Protection: Blue", 7, Rarity.COMMON, mage.cards.c.CircleOfProtectionBlue.class));
        cards.add(new SetCardInfo("Circle of Protection: Green", 8, Rarity.COMMON, mage.cards.c.CircleOfProtectionGreen.class));
        cards.add(new SetCardInfo("Circle of Protection: Red", 9, Rarity.COMMON, mage.cards.c.CircleOfProtectionRed.class));
        cards.add(new SetCardInfo("Circle of Protection: White", 10, Rarity.COMMON, mage.cards.c.CircleOfProtectionWhite.class));
        cards.add(new SetCardInfo("City of Brass", 327, Rarity.RARE, mage.cards.c.CityOfBrass.class));
        cards.add(new SetCardInfo("Cloudchaser Eagle", 11, Rarity.COMMON, mage.cards.c.CloudchaserEagle.class));
        cards.add(new SetCardInfo("Coat of Arms", 290, Rarity.RARE, mage.cards.c.CoatOfArms.class));
        cards.add(new SetCardInfo("Compost", 235, Rarity.UNCOMMON, mage.cards.c.Compost.class));
        cards.add(new SetCardInfo("Confiscate", 65, Rarity.UNCOMMON, mage.cards.c.Confiscate.class));
        cards.add(new SetCardInfo("Coral Merfolk", 66, Rarity.COMMON, mage.cards.c.CoralMerfolk.class));
        cards.add(new SetCardInfo("Corrupt", 124, Rarity.COMMON, mage.cards.c.Corrupt.class));
        cards.add(new SetCardInfo("Counterspell", 67, Rarity.COMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Creeping Mold", 236, Rarity.UNCOMMON, mage.cards.c.CreepingMold.class));
        cards.add(new SetCardInfo("Crimson Hellkite", 178, Rarity.RARE, mage.cards.c.CrimsonHellkite.class));
        cards.add(new SetCardInfo("Crossbow Infantry", 12, Rarity.COMMON, mage.cards.c.CrossbowInfantry.class));
        cards.add(new SetCardInfo("Crypt Rats", 125, Rarity.UNCOMMON, mage.cards.c.CryptRats.class));
        cards.add(new SetCardInfo("Crystal Rod", 291, Rarity.UNCOMMON, mage.cards.c.CrystalRod.class));
        cards.add(new SetCardInfo("Dakmor Lancer", 126, Rarity.UNCOMMON, mage.cards.d.DakmorLancer.class));
        cards.add(new SetCardInfo("Daring Apprentice", 68, Rarity.RARE, mage.cards.d.DaringApprentice.class));
        cards.add(new SetCardInfo("Dark Banishing", 127, Rarity.COMMON, mage.cards.d.DarkBanishing.class));
        cards.add(new SetCardInfo("Darkest Hour", 128, Rarity.RARE, mage.cards.d.DarkestHour.class));
        cards.add(new SetCardInfo("Deflection", 69, Rarity.RARE, mage.cards.d.Deflection.class));
        cards.add(new SetCardInfo("Delusions of Mediocrity", 70, Rarity.RARE, mage.cards.d.DelusionsOfMediocrity.class));
        cards.add(new SetCardInfo("Dingus Egg", 292, Rarity.RARE, mage.cards.d.DingusEgg.class));
        cards.add(new SetCardInfo("Disenchant", 13, Rarity.COMMON, mage.cards.d.Disenchant.class));
        cards.add(new SetCardInfo("Disorder", 179, Rarity.UNCOMMON, mage.cards.d.Disorder.class));
        cards.add(new SetCardInfo("Disrupting Scepter", 293, Rarity.RARE, mage.cards.d.DisruptingScepter.class));
        cards.add(new SetCardInfo("Dregs of Sorrow", 129, Rarity.RARE, mage.cards.d.DregsOfSorrow.class));
        cards.add(new SetCardInfo("Drudge Skeletons", 130, Rarity.COMMON, mage.cards.d.DrudgeSkeletons.class));
        cards.add(new SetCardInfo("Duress", 131, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Eager Cadet", 14, Rarity.COMMON, mage.cards.e.EagerCadet.class));
        cards.add(new SetCardInfo("Early Harvest", 237, Rarity.RARE, mage.cards.e.EarlyHarvest.class));
        cards.add(new SetCardInfo("Earthquake", 180, Rarity.RARE, mage.cards.e.Earthquake.class));
        cards.add(new SetCardInfo("Eastern Paladin", 132, Rarity.RARE, mage.cards.e.EasternPaladin.class));
        cards.add(new SetCardInfo("Elder Druid", 238, Rarity.RARE, mage.cards.e.ElderDruid.class));
        cards.add(new SetCardInfo("Elite Archers", 15, Rarity.RARE, mage.cards.e.EliteArchers.class));
        cards.add(new SetCardInfo("Elvish Archers", 239, Rarity.RARE, mage.cards.e.ElvishArchers.class));
        cards.add(new SetCardInfo("Elvish Champion", 240, Rarity.RARE, mage.cards.e.ElvishChampion.class));
        cards.add(new SetCardInfo("Elvish Lyrist", 241, Rarity.UNCOMMON, mage.cards.e.ElvishLyrist.class));
        cards.add(new SetCardInfo("Elvish Piper", 242, Rarity.RARE, mage.cards.e.ElvishPiper.class));
        cards.add(new SetCardInfo("Engineered Plague", 133, Rarity.UNCOMMON, mage.cards.e.EngineeredPlague.class));
        cards.add(new SetCardInfo("Ensnaring Bridge", 294, Rarity.RARE, mage.cards.e.EnsnaringBridge.class));
        cards.add(new SetCardInfo("Equilibrium", 71, Rarity.RARE, mage.cards.e.Equilibrium.class));
        cards.add(new SetCardInfo("Evacuation", 72, Rarity.RARE, mage.cards.e.Evacuation.class));
        cards.add(new SetCardInfo("Fallen Angel", 134, Rarity.RARE, mage.cards.f.FallenAngel.class));
        cards.add(new SetCardInfo("Familiar Ground", 243, Rarity.UNCOMMON, mage.cards.f.FamiliarGround.class));
        cards.add(new SetCardInfo("Fear", 135, Rarity.COMMON, mage.cards.f.Fear.class));
        cards.add(new SetCardInfo("Femeref Archers", 244, Rarity.UNCOMMON, mage.cards.f.FemerefArchers.class));
        cards.add(new SetCardInfo("Feroz's Ban", 295, Rarity.RARE, mage.cards.f.FerozsBan.class));
        cards.add(new SetCardInfo("Fervor", 181, Rarity.RARE, mage.cards.f.Fervor.class));
        cards.add(new SetCardInfo("Fighting Drake", 73, Rarity.UNCOMMON, mage.cards.f.FightingDrake.class));
        cards.add(new SetCardInfo("Final Fortune", 182, Rarity.RARE, mage.cards.f.FinalFortune.class));
        cards.add(new SetCardInfo("Fire Diamond", 296, Rarity.UNCOMMON, mage.cards.f.FireDiamond.class));
        cards.add(new SetCardInfo("Fire Elemental", 183, Rarity.UNCOMMON, mage.cards.f.FireElemental.class));
        cards.add(new SetCardInfo("Fleeting Image", 74, Rarity.RARE, mage.cards.f.FleetingImage.class));
        cards.add(new SetCardInfo("Flight", 75, Rarity.COMMON, mage.cards.f.Flight.class));
        cards.add(new SetCardInfo("Flying Carpet", 297, Rarity.RARE, mage.cards.f.FlyingCarpet.class));
        cards.add(new SetCardInfo("Fog", 245, Rarity.COMMON, mage.cards.f.Fog.class));
        cards.add(new SetCardInfo("Force Spike", 76, Rarity.COMMON, mage.cards.f.ForceSpike.class));
        cards.add(new SetCardInfo("Forest", 328, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 329, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 330, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 331, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Foul Imp", 136, Rarity.UNCOMMON, mage.cards.f.FoulImp.class));
        cards.add(new SetCardInfo("Fugue", 137, Rarity.UNCOMMON, mage.cards.f.Fugue.class));
        cards.add(new SetCardInfo("Fyndhorn Elder", 246, Rarity.UNCOMMON, mage.cards.f.FyndhornElder.class));
        cards.add(new SetCardInfo("Gang of Elk", 247, Rarity.UNCOMMON, mage.cards.g.GangOfElk.class));
        cards.add(new SetCardInfo("Gerrard's Wisdom", 16, Rarity.UNCOMMON, mage.cards.g.GerrardsWisdom.class));
        cards.add(new SetCardInfo("Ghitu Fire-Eater", 184, Rarity.UNCOMMON, mage.cards.g.GhituFireEater.class));
        cards.add(new SetCardInfo("Giant Cockroach", 138, Rarity.COMMON, mage.cards.g.GiantCockroach.class));
        cards.add(new SetCardInfo("Giant Growth", 248, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Giant Octopus", 77, Rarity.COMMON, mage.cards.g.GiantOctopus.class));
        cards.add(new SetCardInfo("Giant Spider", 249, Rarity.COMMON, mage.cards.g.GiantSpider.class));
        cards.add(new SetCardInfo("Glacial Wall", 78, Rarity.UNCOMMON, mage.cards.g.GlacialWall.class));
        cards.add(new SetCardInfo("Glorious Anthem", 17, Rarity.RARE, mage.cards.g.GloriousAnthem.class));
        cards.add(new SetCardInfo("Goblin Chariot", 185, Rarity.COMMON, mage.cards.g.GoblinChariot.class));
        cards.add(new SetCardInfo("Goblin Digging Team", 186, Rarity.COMMON, mage.cards.g.GoblinDiggingTeam.class));
        cards.add(new SetCardInfo("Goblin Elite Infantry", 187, Rarity.COMMON, mage.cards.g.GoblinEliteInfantry.class));
        cards.add(new SetCardInfo("Goblin Gardener", 188, Rarity.COMMON, mage.cards.g.GoblinGardener.class));
        cards.add(new SetCardInfo("Goblin Glider", 189, Rarity.UNCOMMON, mage.cards.g.GoblinGlider.class));
        cards.add(new SetCardInfo("Goblin King", 190, Rarity.RARE, mage.cards.g.GoblinKing.class));
        cards.add(new SetCardInfo("Goblin Matron", 191, Rarity.UNCOMMON, mage.cards.g.GoblinMatron.class));
        cards.add(new SetCardInfo("Goblin Raider", 192, Rarity.COMMON, mage.cards.g.GoblinRaider.class));
        cards.add(new SetCardInfo("Goblin Spelunkers", 193, Rarity.COMMON, mage.cards.g.GoblinSpelunkers.class));
        cards.add(new SetCardInfo("Goblin War Drums", 194, Rarity.UNCOMMON, GoblinWarDrums.class));
        cards.add(new SetCardInfo("Gorilla Chieftain", 250, Rarity.COMMON, mage.cards.g.GorillaChieftain.class));
        cards.add(new SetCardInfo("Grafted Skullcap", 298, Rarity.RARE, mage.cards.g.GraftedSkullcap.class));
        cards.add(new SetCardInfo("Granite Grip", 195, Rarity.COMMON, mage.cards.g.GraniteGrip.class));
        cards.add(new SetCardInfo("Grapeshot Catapult", 299, Rarity.UNCOMMON, mage.cards.g.GrapeshotCatapult.class));
        cards.add(new SetCardInfo("Gravedigger", 139, Rarity.COMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Greed", 140, Rarity.RARE, mage.cards.g.Greed.class));
        cards.add(new SetCardInfo("Grizzly Bears", 251, Rarity.COMMON, mage.cards.g.GrizzlyBears.class));
        cards.add(new SetCardInfo("Healing Salve", 18, Rarity.COMMON, mage.cards.h.HealingSalve.class));
        cards.add(new SetCardInfo("Heavy Ballista", 19, Rarity.UNCOMMON, mage.cards.h.HeavyBallista.class));
        cards.add(new SetCardInfo("Hibernation", 79, Rarity.UNCOMMON, mage.cards.h.Hibernation.class));
        cards.add(new SetCardInfo("Hill Giant", 196, Rarity.COMMON, mage.cards.h.HillGiant.class));
        cards.add(new SetCardInfo("Hollow Dogs", 141, Rarity.COMMON, mage.cards.h.HollowDogs.class));
        cards.add(new SetCardInfo("Holy Strength", 20, Rarity.COMMON, mage.cards.h.HolyStrength.class));
        cards.add(new SetCardInfo("Honor Guard", 21, Rarity.COMMON, mage.cards.h.HonorGuard.class));
        cards.add(new SetCardInfo("Horned Turtle", 80, Rarity.COMMON, mage.cards.h.HornedTurtle.class));
        cards.add(new SetCardInfo("Howl from Beyond", 142, Rarity.COMMON, mage.cards.h.HowlFromBeyond.class));
        cards.add(new SetCardInfo("Howling Mine", 300, Rarity.RARE, mage.cards.h.HowlingMine.class));
        cards.add(new SetCardInfo("Hurricane", 252, Rarity.RARE, mage.cards.h.Hurricane.class));
        cards.add(new SetCardInfo("Impatience", 197, Rarity.RARE, mage.cards.i.Impatience.class));
        cards.add(new SetCardInfo("Infernal Contract", 143, Rarity.RARE, mage.cards.i.InfernalContract.class));
        cards.add(new SetCardInfo("Inferno", 198, Rarity.RARE, mage.cards.i.Inferno.class));
        cards.add(new SetCardInfo("Inspiration", 81, Rarity.COMMON, mage.cards.i.Inspiration.class));
        cards.add(new SetCardInfo("Intrepid Hero", 22, Rarity.RARE, mage.cards.i.IntrepidHero.class));
        cards.add(new SetCardInfo("Iron Star", 301, Rarity.UNCOMMON, mage.cards.i.IronStar.class));
        cards.add(new SetCardInfo("Island", 332, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 333, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 334, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 335, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ivory Cup", 302, Rarity.UNCOMMON, mage.cards.i.IvoryCup.class));
        cards.add(new SetCardInfo("Jalum Tome", 303, Rarity.RARE, mage.cards.j.JalumTome.class));
        cards.add(new SetCardInfo("Jandor's Saddlebags", 304, Rarity.RARE, mage.cards.j.JandorsSaddlebags.class));
        cards.add(new SetCardInfo("Jayemdae Tome", 305, Rarity.RARE, mage.cards.j.JayemdaeTome.class));
        cards.add(new SetCardInfo("Karplusan Forest", 336, Rarity.RARE, mage.cards.k.KarplusanForest.class));
        cards.add(new SetCardInfo("Kjeldoran Royal Guard", 23, Rarity.RARE, mage.cards.k.KjeldoranRoyalGuard.class));
        cards.add(new SetCardInfo("Knight Errant", 24, Rarity.COMMON, mage.cards.k.KnightErrant.class));
        cards.add(new SetCardInfo("Knighthood", 25, Rarity.UNCOMMON, mage.cards.k.Knighthood.class));
        cards.add(new SetCardInfo("Lava Axe", 199, Rarity.COMMON, mage.cards.l.LavaAxe.class));
        cards.add(new SetCardInfo("Leshrac's Rite", 144, Rarity.UNCOMMON, mage.cards.l.LeshracsRite.class));
        cards.add(new SetCardInfo("Levitation", 82, Rarity.UNCOMMON, mage.cards.l.Levitation.class));
        cards.add(new SetCardInfo("Lightning Blast", 200, Rarity.COMMON, mage.cards.l.LightningBlast.class));
        cards.add(new SetCardInfo("Lightning Elemental", 201, Rarity.COMMON, mage.cards.l.LightningElemental.class));
        cards.add(new SetCardInfo("Llanowar Elves", 253, Rarity.COMMON, mage.cards.l.LlanowarElves.class));
        cards.add(new SetCardInfo("Lone Wolf", 254, Rarity.COMMON, mage.cards.l.LoneWolf.class));
        cards.add(new SetCardInfo("Longbow Archer", 26, Rarity.UNCOMMON, mage.cards.l.LongbowArcher.class));
        cards.add(new SetCardInfo("Looming Shade", 145, Rarity.COMMON, mage.cards.l.LoomingShade.class));
        cards.add(new SetCardInfo("Lord of Atlantis", 83, Rarity.RARE, mage.cards.l.LordOfAtlantis.class));
        cards.add(new SetCardInfo("Lure", 255, Rarity.UNCOMMON, mage.cards.l.Lure.class));
        cards.add(new SetCardInfo("Mahamoti Djinn", 84, Rarity.RARE, mage.cards.m.MahamotiDjinn.class));
        cards.add(new SetCardInfo("Mana Breach", 85, Rarity.UNCOMMON, mage.cards.m.ManaBreach.class));
        cards.add(new SetCardInfo("Mana Clash", 202, Rarity.RARE, mage.cards.m.ManaClash.class));
        cards.add(new SetCardInfo("Mana Short", 86, Rarity.RARE, mage.cards.m.ManaShort.class));
        cards.add(new SetCardInfo("Marble Diamond", 306, Rarity.UNCOMMON, mage.cards.m.MarbleDiamond.class));
        cards.add(new SetCardInfo("Maro", 256, Rarity.RARE, mage.cards.m.Maro.class));
        cards.add(new SetCardInfo("Master Healer", 27, Rarity.RARE, mage.cards.m.MasterHealer.class));
        cards.add(new SetCardInfo("Mawcor", 87, Rarity.RARE, mage.cards.m.Mawcor.class));
        cards.add(new SetCardInfo("Meekstone", 307, Rarity.RARE, mage.cards.m.Meekstone.class));
        cards.add(new SetCardInfo("Megrim", 146, Rarity.UNCOMMON, mage.cards.m.Megrim.class));
        cards.add(new SetCardInfo("Memory Lapse", 88, Rarity.COMMON, mage.cards.m.MemoryLapse.class));
        cards.add(new SetCardInfo("Merfolk Looter", 89, Rarity.UNCOMMON, mage.cards.m.MerfolkLooter.class));
        cards.add(new SetCardInfo("Merfolk of the Pearl Trident", 90, Rarity.COMMON, mage.cards.m.MerfolkOfThePearlTrident.class));
        cards.add(new SetCardInfo("Might of Oaks", 257, Rarity.RARE, mage.cards.m.MightOfOaks.class));
        cards.add(new SetCardInfo("Millstone", 308, Rarity.RARE, mage.cards.m.Millstone.class));
        cards.add(new SetCardInfo("Mind Rot", 147, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Monstrous Growth", 258, Rarity.COMMON, mage.cards.m.MonstrousGrowth.class));
        cards.add(new SetCardInfo("Moss Diamond", 309, Rarity.UNCOMMON, mage.cards.m.MossDiamond.class));
        cards.add(new SetCardInfo("Mountain", 337, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 338, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 339, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 340, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nature's Resurgence", 259, Rarity.RARE, mage.cards.n.NaturesResurgence.class));
        cards.add(new SetCardInfo("Nature's Revolt", 260, Rarity.RARE, mage.cards.n.NaturesRevolt.class));
        cards.add(new SetCardInfo("Nausea", 148, Rarity.COMMON, mage.cards.n.Nausea.class));
        cards.add(new SetCardInfo("Necrologia", 149, Rarity.UNCOMMON, mage.cards.n.Necrologia.class));
        cards.add(new SetCardInfo("Nightmare", 150, Rarity.RARE, mage.cards.n.Nightmare.class));
        cards.add(new SetCardInfo("Nocturnal Raid", 151, Rarity.UNCOMMON, mage.cards.n.NocturnalRaid.class));
        cards.add(new SetCardInfo("Northern Paladin", 28, Rarity.RARE, mage.cards.n.NorthernPaladin.class));
        cards.add(new SetCardInfo("Ogre Taskmaster", 203, Rarity.UNCOMMON, mage.cards.o.OgreTaskmaster.class));
        cards.add(new SetCardInfo("Okk", 204, Rarity.RARE, mage.cards.o.Okk.class));
        cards.add(new SetCardInfo("Opportunity", 91, Rarity.UNCOMMON, mage.cards.o.Opportunity.class));
        cards.add(new SetCardInfo("Opposition", 92, Rarity.RARE, mage.cards.o.Opposition.class));
        cards.add(new SetCardInfo("Oppression", 152, Rarity.RARE, mage.cards.o.Oppression.class));
        cards.add(new SetCardInfo("Orcish Artillery", 205, Rarity.UNCOMMON, mage.cards.o.OrcishArtillery.class));
        cards.add(new SetCardInfo("Orcish Oriflamme", 206, Rarity.UNCOMMON, mage.cards.o.OrcishOriflamme.class));
        cards.add(new SetCardInfo("Ostracize", 153, Rarity.COMMON, mage.cards.o.Ostracize.class));
        cards.add(new SetCardInfo("Pacifism", 29, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Pariah", 30, Rarity.RARE, mage.cards.p.Pariah.class));
        cards.add(new SetCardInfo("Patagia Golem", 310, Rarity.UNCOMMON, mage.cards.p.PatagiaGolem.class));
        cards.add(new SetCardInfo("Persecute", 154, Rarity.RARE, mage.cards.p.Persecute.class));
        cards.add(new SetCardInfo("Phantom Warrior", 93, Rarity.UNCOMMON, mage.cards.p.PhantomWarrior.class));
        cards.add(new SetCardInfo("Phyrexian Colossus", 311, Rarity.RARE, mage.cards.p.PhyrexianColossus.class));
        cards.add(new SetCardInfo("Phyrexian Hulk", 312, Rarity.UNCOMMON, mage.cards.p.PhyrexianHulk.class));
        cards.add(new SetCardInfo("Pillage", 207, Rarity.UNCOMMON, mage.cards.p.Pillage.class));
        cards.add(new SetCardInfo("Pit Trap", 313, Rarity.UNCOMMON, mage.cards.p.PitTrap.class));
        cards.add(new SetCardInfo("Plague Beetle", 155, Rarity.COMMON, mage.cards.p.PlagueBeetle.class));
        cards.add(new SetCardInfo("Plains", 341, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 342, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 343, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 344, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pride of Lions", 261, Rarity.UNCOMMON, mage.cards.p.PrideOfLions.class));
        cards.add(new SetCardInfo("Prodigal Sorcerer", 94, Rarity.COMMON, mage.cards.p.ProdigalSorcerer.class));
        cards.add(new SetCardInfo("Purify", 31, Rarity.RARE, mage.cards.p.Purify.class));
        cards.add(new SetCardInfo("Pygmy Pyrosaur", 208, Rarity.COMMON, mage.cards.p.PygmyPyrosaur.class));
        cards.add(new SetCardInfo("Pyroclasm", 209, Rarity.UNCOMMON, mage.cards.p.Pyroclasm.class));
        cards.add(new SetCardInfo("Pyrotechnics", 210, Rarity.UNCOMMON, mage.cards.p.Pyrotechnics.class));
        cards.add(new SetCardInfo("Raging Goblin", 211, Rarity.COMMON, mage.cards.r.RagingGoblin.class));
        cards.add(new SetCardInfo("Rag Man", 156, Rarity.RARE, mage.cards.r.RagMan.class));
        cards.add(new SetCardInfo("Raise Dead", 157, Rarity.COMMON, mage.cards.r.RaiseDead.class));
        cards.add(new SetCardInfo("Rampant Growth", 262, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Razorfoot Griffin", 32, Rarity.COMMON, mage.cards.r.RazorfootGriffin.class));
        cards.add(new SetCardInfo("Razortooth Rats", 158, Rarity.COMMON, mage.cards.r.RazortoothRats.class));
        cards.add(new SetCardInfo("Reckless Embermage", 212, Rarity.RARE, mage.cards.r.RecklessEmbermage.class));
        cards.add(new SetCardInfo("Reclaim", 263, Rarity.COMMON, mage.cards.r.Reclaim.class));
        cards.add(new SetCardInfo("Redwood Treefolk", 264, Rarity.COMMON, mage.cards.r.RedwoodTreefolk.class));
        cards.add(new SetCardInfo("Reflexes", 213, Rarity.COMMON, mage.cards.r.Reflexes.class));
        cards.add(new SetCardInfo("Regeneration", 265, Rarity.COMMON, mage.cards.r.Regeneration.class));
        cards.add(new SetCardInfo("Relentless Assault", 214, Rarity.RARE, mage.cards.r.RelentlessAssault.class));
        cards.add(new SetCardInfo("Remove Soul", 95, Rarity.COMMON, mage.cards.r.RemoveSoul.class));
        cards.add(new SetCardInfo("Reprisal", 33, Rarity.UNCOMMON, mage.cards.r.Reprisal.class));
        cards.add(new SetCardInfo("Reprocess", 159, Rarity.RARE, mage.cards.r.Reprocess.class));
        cards.add(new SetCardInfo("Revenant", 160, Rarity.RARE, mage.cards.r.Revenant.class));
        cards.add(new SetCardInfo("Reverse Damage", 34, Rarity.RARE, mage.cards.r.ReverseDamage.class));
        cards.add(new SetCardInfo("Rod of Ruin", 314, Rarity.UNCOMMON, mage.cards.r.RodOfRuin.class));
        cards.add(new SetCardInfo("Rolling Stones", 35, Rarity.RARE, mage.cards.r.RollingStones.class));
        cards.add(new SetCardInfo("Rowen", 266, Rarity.RARE, mage.cards.r.Rowen.class));
        cards.add(new SetCardInfo("Sabretooth Tiger", 215, Rarity.COMMON, mage.cards.s.SabretoothTiger.class));
        cards.add(new SetCardInfo("Sacred Ground", 36, Rarity.RARE, mage.cards.s.SacredGround.class));
        cards.add(new SetCardInfo("Sacred Nectar", 37, Rarity.COMMON, mage.cards.s.SacredNectar.class));
        cards.add(new SetCardInfo("Sage Owl", 96, Rarity.COMMON, mage.cards.s.SageOwl.class));
        cards.add(new SetCardInfo("Samite Healer", 38, Rarity.COMMON, mage.cards.s.SamiteHealer.class));
        cards.add(new SetCardInfo("Sanctimony", 39, Rarity.UNCOMMON, mage.cards.s.Sanctimony.class));
        cards.add(new SetCardInfo("Scathe Zombies", 161, Rarity.COMMON, mage.cards.s.ScatheZombies.class));
        cards.add(new SetCardInfo("Scavenger Folk", 267, Rarity.UNCOMMON, mage.cards.s.ScavengerFolk.class));
        cards.add(new SetCardInfo("Sea Monster", 97, Rarity.COMMON, mage.cards.s.SeaMonster.class));
        cards.add(new SetCardInfo("Seasoned Marshal", 40, Rarity.UNCOMMON, mage.cards.s.SeasonedMarshal.class));
        cards.add(new SetCardInfo("Seeker of Skybreak", 268, Rarity.COMMON, mage.cards.s.SeekerOfSkybreak.class));
        cards.add(new SetCardInfo("Seismic Assault", 216, Rarity.RARE, mage.cards.s.SeismicAssault.class));
        cards.add(new SetCardInfo("Serpent Warrior", 162, Rarity.COMMON, mage.cards.s.SerpentWarrior.class));
        cards.add(new SetCardInfo("Serra Advocate", 41, Rarity.UNCOMMON, mage.cards.s.SerraAdvocate.class));
        cards.add(new SetCardInfo("Serra Angel", 42, Rarity.RARE, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Serra's Embrace", 43, Rarity.UNCOMMON, mage.cards.s.SerrasEmbrace.class));
        cards.add(new SetCardInfo("Shanodin Dryads", 269, Rarity.COMMON, mage.cards.s.ShanodinDryads.class));
        cards.add(new SetCardInfo("Shatter", 217, Rarity.COMMON, mage.cards.s.Shatter.class));
        cards.add(new SetCardInfo("Shield Wall", 44, Rarity.COMMON, mage.cards.s.ShieldWall.class));
        cards.add(new SetCardInfo("Shivan Dragon", 218, Rarity.RARE, mage.cards.s.ShivanDragon.class));
        cards.add(new SetCardInfo("Shock", 219, Rarity.COMMON, mage.cards.s.Shock.class));
        cards.add(new SetCardInfo("Sisay's Ring", 315, Rarity.UNCOMMON, mage.cards.s.SisaysRing.class));
        cards.add(new SetCardInfo("Sky Diamond", 316, Rarity.UNCOMMON, mage.cards.s.SkyDiamond.class));
        cards.add(new SetCardInfo("Skyshroud Falcon", 45, Rarity.COMMON, mage.cards.s.SkyshroudFalcon.class));
        cards.add(new SetCardInfo("Sleight of Hand", 98, Rarity.COMMON, mage.cards.s.SleightOfHand.class));
        cards.add(new SetCardInfo("Soul Feast", 163, Rarity.UNCOMMON, mage.cards.s.SoulFeast.class));
        cards.add(new SetCardInfo("Soul Net", 317, Rarity.UNCOMMON, mage.cards.s.SoulNet.class));
        cards.add(new SetCardInfo("Southern Paladin", 46, Rarity.RARE, mage.cards.s.SouthernPaladin.class));
        cards.add(new SetCardInfo("Spellbook", 318, Rarity.UNCOMMON, mage.cards.s.Spellbook.class));
        cards.add(new SetCardInfo("Spined Wurm", 270, Rarity.COMMON, mage.cards.s.SpinedWurm.class));
        cards.add(new SetCardInfo("Spineless Thug", 164, Rarity.COMMON, mage.cards.s.SpinelessThug.class));
        cards.add(new SetCardInfo("Spirit Link", 47, Rarity.UNCOMMON, mage.cards.s.SpiritLink.class));
        cards.add(new SetCardInfo("Spitting Earth", 220, Rarity.COMMON, mage.cards.s.SpittingEarth.class));
        cards.add(new SetCardInfo("Squall", 271, Rarity.COMMON, mage.cards.s.Squall.class));
        cards.add(new SetCardInfo("Standing Troops", 48, Rarity.COMMON, mage.cards.s.StandingTroops.class));
        cards.add(new SetCardInfo("Starlight", 49, Rarity.UNCOMMON, mage.cards.s.Starlight.class));
        cards.add(new SetCardInfo("Static Orb", 319, Rarity.RARE, mage.cards.s.StaticOrb.class));
        cards.add(new SetCardInfo("Staunch Defenders", 50, Rarity.UNCOMMON, mage.cards.s.StaunchDefenders.class));
        cards.add(new SetCardInfo("Steal Artifact", 99, Rarity.UNCOMMON, mage.cards.s.StealArtifact.class));
        cards.add(new SetCardInfo("Stone Rain", 221, Rarity.COMMON, mage.cards.s.StoneRain.class));
        cards.add(new SetCardInfo("Storm Cauldron", 320, Rarity.RARE, mage.cards.s.StormCauldron.class));
        cards.add(new SetCardInfo("Storm Crow", 100, Rarity.COMMON, mage.cards.s.StormCrow.class));
        cards.add(new SetCardInfo("Storm Shaman", 222, Rarity.UNCOMMON, StormShaman.class));
        cards.add(new SetCardInfo("Strands of Night", 165, Rarity.UNCOMMON, mage.cards.s.StrandsOfNight.class));
        cards.add(new SetCardInfo("Stream of Life", 272, Rarity.COMMON, mage.cards.s.StreamOfLife.class));
        cards.add(new SetCardInfo("Stronghold Assassin", 166, Rarity.RARE, mage.cards.s.StrongholdAssassin.class));
        cards.add(new SetCardInfo("Sudden Impact", 223, Rarity.UNCOMMON, mage.cards.s.SuddenImpact.class));
        cards.add(new SetCardInfo("Sulfurous Springs", 345, Rarity.RARE, mage.cards.s.SulfurousSprings.class));
        cards.add(new SetCardInfo("Sunweb", 51, Rarity.RARE, mage.cards.s.Sunweb.class));
        cards.add(new SetCardInfo("Sustainer of the Realm", 52, Rarity.UNCOMMON, mage.cards.s.SustainerOfTheRealm.class));
        cards.add(new SetCardInfo("Swamp", 346, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 347, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 348, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 349, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tainted Aether", 167, Rarity.RARE, mage.cards.t.TaintedAether.class));
        cards.add(new SetCardInfo("Teferi's Puzzle Box", 321, Rarity.RARE, mage.cards.t.TeferisPuzzleBox.class));
        cards.add(new SetCardInfo("Telepathic Spies", 101, Rarity.COMMON, mage.cards.t.TelepathicSpies.class));
        cards.add(new SetCardInfo("Telepathy", 102, Rarity.UNCOMMON, mage.cards.t.Telepathy.class));
        cards.add(new SetCardInfo("Temporal Adept", 103, Rarity.RARE, mage.cards.t.TemporalAdept.class));
        cards.add(new SetCardInfo("Thieving Magpie", 104, Rarity.UNCOMMON, mage.cards.t.ThievingMagpie.class));
        cards.add(new SetCardInfo("Thorn Elemental", 273, Rarity.RARE, mage.cards.t.ThornElemental.class));
        cards.add(new SetCardInfo("Thoughtleech", 274, Rarity.UNCOMMON, mage.cards.t.Thoughtleech.class));
        cards.add(new SetCardInfo("Throne of Bone", 322, Rarity.UNCOMMON, mage.cards.t.ThroneOfBone.class));
        cards.add(new SetCardInfo("Tolarian Winds", 105, Rarity.COMMON, mage.cards.t.TolarianWinds.class));
        cards.add(new SetCardInfo("Trained Armodon", 275, Rarity.COMMON, mage.cards.t.TrainedArmodon.class));
        cards.add(new SetCardInfo("Trained Orgg", 224, Rarity.RARE, mage.cards.t.TrainedOrgg.class));
        cards.add(new SetCardInfo("Tranquility", 276, Rarity.COMMON, mage.cards.t.Tranquility.class));
        cards.add(new SetCardInfo("Treasure Trove", 106, Rarity.UNCOMMON, mage.cards.t.TreasureTrove.class));
        cards.add(new SetCardInfo("Treefolk Seedlings", 277, Rarity.UNCOMMON, mage.cards.t.TreefolkSeedlings.class));
        cards.add(new SetCardInfo("Tremor", 225, Rarity.COMMON, mage.cards.t.Tremor.class));
        cards.add(new SetCardInfo("Twiddle", 107, Rarity.COMMON, mage.cards.t.Twiddle.class));
        cards.add(new SetCardInfo("Uktabi Wildcats", 278, Rarity.RARE, mage.cards.u.UktabiWildcats.class));
        cards.add(new SetCardInfo("Underground River", 350, Rarity.RARE, mage.cards.u.UndergroundRiver.class));
        cards.add(new SetCardInfo("Unholy Strength", 168, Rarity.COMMON, mage.cards.u.UnholyStrength.class));
        cards.add(new SetCardInfo("Unsummon", 108, Rarity.COMMON, mage.cards.u.Unsummon.class));
        cards.add(new SetCardInfo("Untamed Wilds", 279, Rarity.UNCOMMON, mage.cards.u.UntamedWilds.class));
        cards.add(new SetCardInfo("Venerable Monk", 53, Rarity.COMMON, mage.cards.v.VenerableMonk.class));
        cards.add(new SetCardInfo("Vengeance", 54, Rarity.UNCOMMON, mage.cards.v.Vengeance.class));
        cards.add(new SetCardInfo("Verduran Enchantress", 280, Rarity.RARE, mage.cards.v.VerduranEnchantress.class));
        cards.add(new SetCardInfo("Vernal Bloom", 281, Rarity.RARE, mage.cards.v.VernalBloom.class));
        cards.add(new SetCardInfo("Vigilant Drake", 109, Rarity.COMMON, mage.cards.v.VigilantDrake.class));
        cards.add(new SetCardInfo("Vizzerdrix", 110, Rarity.RARE, mage.cards.v.Vizzerdrix.class));
        cards.add(new SetCardInfo("Volcanic Hammer", 226, Rarity.COMMON, mage.cards.v.VolcanicHammer.class));
        cards.add(new SetCardInfo("Wall of Air", 111, Rarity.UNCOMMON, mage.cards.w.WallOfAir.class));
        cards.add(new SetCardInfo("Wall of Bone", 169, Rarity.UNCOMMON, mage.cards.w.WallOfBone.class));
        cards.add(new SetCardInfo("Wall of Fire", 227, Rarity.UNCOMMON, mage.cards.w.WallOfFire.class));
        cards.add(new SetCardInfo("Wall of Spears", 323, Rarity.UNCOMMON, mage.cards.w.WallOfSpears.class));
        cards.add(new SetCardInfo("Wall of Swords", 55, Rarity.UNCOMMON, mage.cards.w.WallOfSwords.class));
        cards.add(new SetCardInfo("Wall of Wonder", 112, Rarity.RARE, mage.cards.w.WallOfWonder.class));
        cards.add(new SetCardInfo("Western Paladin", 170, Rarity.RARE, mage.cards.w.WesternPaladin.class));
        cards.add(new SetCardInfo("Wildfire", 228, Rarity.RARE, mage.cards.w.Wildfire.class));
        cards.add(new SetCardInfo("Wild Growth", 282, Rarity.COMMON, mage.cards.w.WildGrowth.class));
        cards.add(new SetCardInfo("Wind Dancer", 113, Rarity.UNCOMMON, mage.cards.w.WindDancer.class));
        cards.add(new SetCardInfo("Wind Drake", 114, Rarity.COMMON, mage.cards.w.WindDrake.class));
        cards.add(new SetCardInfo("Wing Snare", 283, Rarity.UNCOMMON, mage.cards.w.WingSnare.class));
        cards.add(new SetCardInfo("Wood Elves", 284, Rarity.COMMON, mage.cards.w.WoodElves.class));
        cards.add(new SetCardInfo("Wooden Sphere", 324, Rarity.UNCOMMON, mage.cards.w.WoodenSphere.class));
        cards.add(new SetCardInfo("Worship", 56, Rarity.RARE, mage.cards.w.Worship.class));
        cards.add(new SetCardInfo("Wrath of God", 57, Rarity.RARE, mage.cards.w.WrathOfGod.class));
        cards.add(new SetCardInfo("Yavimaya Enchantress", 285, Rarity.UNCOMMON, mage.cards.y.YavimayaEnchantress.class));
        cards.add(new SetCardInfo("Yawgmoth's Edict", 171, Rarity.UNCOMMON, mage.cards.y.YawgmothsEdict.class));
    }
}
