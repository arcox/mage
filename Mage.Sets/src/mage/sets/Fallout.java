package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class Fallout extends ExpansionSet {

    private static final Fallout instance = new Fallout();

    public static Fallout getInstance() {
        return instance;
    }

    private Fallout() {
        super("Fallout", "PIP", ExpansionSet.buildDate(2024, 3, 8), SetType.SUPPLEMENTAL);

        cards.add(new SetCardInfo("Abundant Growth", 194, Rarity.COMMON, mage.cards.a.AbundantGrowth.class));
        cards.add(new SetCardInfo("Agent Frank Horrigan", 89, Rarity.RARE, mage.cards.a.AgentFrankHorrigan.class));
        cards.add(new SetCardInfo("All That Glitters", 155, Rarity.COMMON, mage.cards.a.AllThatGlitters.class));
        cards.add(new SetCardInfo("Almost Perfect", 90, Rarity.RARE, mage.cards.a.AlmostPerfect.class));
        cards.add(new SetCardInfo("Alpha Deathclaw", 91, Rarity.RARE, mage.cards.a.AlphaDeathclaw.class));
        cards.add(new SetCardInfo("Anguished Unmaking", 209, Rarity.RARE, mage.cards.a.AnguishedUnmaking.class));
        cards.add(new SetCardInfo("Arcane Signet", 224, Rarity.UNCOMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Ash Barrens", 253, Rarity.COMMON, mage.cards.a.AshBarrens.class));
        cards.add(new SetCardInfo("Assemble the Legion", 210, Rarity.RARE, mage.cards.a.AssembleTheLegion.class));
        cards.add(new SetCardInfo("Ayula, Queen Among Bears", 348, Rarity.RARE, mage.cards.a.AyulaQueenAmongBears.class));
        cards.add(new SetCardInfo("Basilisk Collar", 225, Rarity.RARE, mage.cards.b.BasiliskCollar.class));
        cards.add(new SetCardInfo("Bastion of Remembrance", 182, Rarity.UNCOMMON, mage.cards.b.BastionOfRemembrance.class));
        cards.add(new SetCardInfo("Behemoth Sledge", 211, Rarity.UNCOMMON, mage.cards.b.BehemothSledge.class));
        cards.add(new SetCardInfo("Biomass Mutation", 740, Rarity.RARE, mage.cards.b.BiomassMutation.class));
        cards.add(new SetCardInfo("Black Market", 183, Rarity.RARE, mage.cards.b.BlackMarket.class));
        cards.add(new SetCardInfo("Blasphemous Act", 188, Rarity.RARE, mage.cards.b.BlasphemousAct.class));
        cards.add(new SetCardInfo("Bloodforged Battle-Axe", 226, Rarity.RARE, mage.cards.b.BloodforgedBattleAxe.class));
        cards.add(new SetCardInfo("Brass Knuckles", 227, Rarity.UNCOMMON, mage.cards.b.BrassKnuckles.class));
        cards.add(new SetCardInfo("Buried Ruin", 254, Rarity.UNCOMMON, mage.cards.b.BuriedRuin.class));
        cards.add(new SetCardInfo("Canopy Vista", 255, Rarity.RARE, mage.cards.c.CanopyVista.class));
        cards.add(new SetCardInfo("Canyon Slough", 256, Rarity.RARE, mage.cards.c.CanyonSlough.class));
        cards.add(new SetCardInfo("Captain of the Watch", 157, Rarity.RARE, mage.cards.c.CaptainOfTheWatch.class));
        cards.add(new SetCardInfo("Casualties of War", 476, Rarity.RARE, mage.cards.c.CasualtiesOfWar.class));
        cards.add(new SetCardInfo("Champion's Helm", 228, Rarity.RARE, mage.cards.c.ChampionsHelm.class));
        cards.add(new SetCardInfo("Chaos Warp", 189, Rarity.RARE, mage.cards.c.ChaosWarp.class));
        cards.add(new SetCardInfo("Cinder Glade", 257, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Clifftop Retreat", 258, Rarity.RARE, mage.cards.c.ClifftopRetreat.class));
        cards.add(new SetCardInfo("Command Tower", 259, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Corpsejack Menace", 742, Rarity.UNCOMMON, mage.cards.c.CorpsejackMenace.class));
        cards.add(new SetCardInfo("Crucible of Worlds", 357, Rarity.MYTHIC, mage.cards.c.CrucibleOfWorlds.class));
        cards.add(new SetCardInfo("Deadly Dispute", 184, Rarity.COMMON, mage.cards.d.DeadlyDispute.class));
        cards.add(new SetCardInfo("Desolate Mire", 146, Rarity.RARE, mage.cards.d.DesolateMire.class));
        cards.add(new SetCardInfo("Dr. Madison Li", 3, Rarity.MYTHIC, mage.cards.d.DrMadisonLi.class));
        cards.add(new SetCardInfo("Dragonskull Summit", 261, Rarity.RARE, mage.cards.d.DragonskullSummit.class));
        cards.add(new SetCardInfo("Entrapment Maneuver", 160, Rarity.RARE, mage.cards.e.EntrapmentManeuver.class));
        cards.add(new SetCardInfo("Evolving Wilds", 263, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exotic Orchard", 264, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Explorer's Scope", 231, Rarity.COMMON, mage.cards.e.ExplorersScope.class));
        cards.add(new SetCardInfo("Ferrous Lake", 148, Rarity.RARE, mage.cards.f.FerrousLake.class));
        cards.add(new SetCardInfo("Fertile Ground", 195, Rarity.COMMON, mage.cards.f.FertileGround.class));
        cards.add(new SetCardInfo("Fervent Charge", 215, Rarity.RARE, mage.cards.f.FerventCharge.class));
        cards.add(new SetCardInfo("Fireshrieker", 232, Rarity.UNCOMMON, mage.cards.f.Fireshrieker.class));
        cards.add(new SetCardInfo("Forest", 325, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Fraying Sanity", 175, Rarity.RARE, mage.cards.f.FrayingSanity.class));
        cards.add(new SetCardInfo("Gary Clone", 16, Rarity.UNCOMMON, mage.cards.g.GaryClone.class));
        cards.add(new SetCardInfo("General's Enforcer", 217, Rarity.UNCOMMON, mage.cards.g.GeneralsEnforcer.class));
        cards.add(new SetCardInfo("Guardian Project", 199, Rarity.RARE, mage.cards.g.GuardianProject.class));
        cards.add(new SetCardInfo("Hancock, Ghoulish Mayor", 45, Rarity.RARE, mage.cards.h.HancockGhoulishMayor.class));
        cards.add(new SetCardInfo("Hardened Scales", 200, Rarity.RARE, mage.cards.h.HardenedScales.class));
        cards.add(new SetCardInfo("Heroic Intervention", 202, Rarity.RARE, mage.cards.h.HeroicIntervention.class));
        cards.add(new SetCardInfo("Heroic Reinforcements", 218, Rarity.UNCOMMON, mage.cards.h.HeroicReinforcements.class));
        cards.add(new SetCardInfo("Hornet Queen", 878, Rarity.RARE, mage.cards.h.HornetQueen.class));
        cards.add(new SetCardInfo("Hour of Reckoning", 161, Rarity.RARE, mage.cards.h.HourOfReckoning.class));
        cards.add(new SetCardInfo("Hullbreaker Horror", 344, Rarity.RARE, mage.cards.h.HullbreakerHorror.class));
        cards.add(new SetCardInfo("Impassioned Orator", 162, Rarity.COMMON, mage.cards.i.ImpassionedOrator.class));
        cards.add(new SetCardInfo("Inexorable Tide", 460, Rarity.RARE, mage.cards.i.InexorableTide.class));
        cards.add(new SetCardInfo("Intangible Virtue", 163, Rarity.UNCOMMON, mage.cards.i.IntangibleVirtue.class));
        cards.add(new SetCardInfo("Intelligence Bobblehead", 134, Rarity.UNCOMMON, mage.cards.i.IntelligenceBobblehead.class));
        cards.add(new SetCardInfo("Island", 319, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Isolated Chapel", 269, Rarity.RARE, mage.cards.i.IsolatedChapel.class));
        cards.add(new SetCardInfo("Jungle Shrine", 270, Rarity.UNCOMMON, mage.cards.j.JungleShrine.class));
        cards.add(new SetCardInfo("Keeper of the Accord", 164, Rarity.RARE, mage.cards.k.KeeperOfTheAccord.class));
        cards.add(new SetCardInfo("Lethal Scheme", 185, Rarity.RARE, mage.cards.l.LethalScheme.class));
        cards.add(new SetCardInfo("Liberty Prime, Recharged", 5, Rarity.MYTHIC, mage.cards.l.LibertyPrimeRecharged.class));
        cards.add(new SetCardInfo("Lord of the Undead", 345, Rarity.RARE, mage.cards.l.LordOfTheUndead.class));
        cards.add(new SetCardInfo("Mantle of the Ancients", 165, Rarity.RARE, mage.cards.m.MantleOfTheAncients.class));
        cards.add(new SetCardInfo("Marshal's Anthem", 166, Rarity.RARE, mage.cards.m.MarshalsAnthem.class));
        cards.add(new SetCardInfo("Martial Coup", 167, Rarity.RARE, mage.cards.m.MartialCoup.class));
        cards.add(new SetCardInfo("Masterwork of Ingenuity", 234, Rarity.RARE, mage.cards.m.MasterworkOfIngenuity.class));
        cards.add(new SetCardInfo("Mechanized Production", 178, Rarity.MYTHIC, mage.cards.m.MechanizedProduction.class));
        cards.add(new SetCardInfo("Memorial to Glory", 799, Rarity.COMMON, mage.cards.m.MemorialToGlory.class));
        cards.add(new SetCardInfo("Morbid Opportunist", 186, Rarity.UNCOMMON, mage.cards.m.MorbidOpportunist.class));
        cards.add(new SetCardInfo("Mossfire Valley", 273, Rarity.RARE, mage.cards.m.MossfireValley.class));
        cards.add(new SetCardInfo("Mountain", 323, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mr. House, President and CEO", 7, Rarity.MYTHIC, mage.cards.m.MrHousePresidentAndCEO.class));
        cards.add(new SetCardInfo("Myriad Landscape", 274, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Nomad Outpost", 277, Rarity.UNCOMMON, mage.cards.n.NomadOutpost.class));
        cards.add(new SetCardInfo("Nuka-Cola Vending Machine", 137, Rarity.UNCOMMON, mage.cards.n.NukaColaVendingMachine.class));
        cards.add(new SetCardInfo("Open the Vaults", 168, Rarity.RARE, mage.cards.o.OpenTheVaults.class));
        cards.add(new SetCardInfo("Overflowing Basin", 152, Rarity.RARE, mage.cards.o.OverflowingBasin.class));
        cards.add(new SetCardInfo("Path of Ancestry", 279, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Path to Exile", 169, Rarity.UNCOMMON, mage.cards.p.PathToExile.class));
        cards.add(new SetCardInfo("Pitiless Plunderer", 187, Rarity.UNCOMMON, mage.cards.p.PitilessPlunderer.class));
        cards.add(new SetCardInfo("Plains", 317, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Powder Ganger", 65, Rarity.RARE, mage.cards.p.PowderGanger.class));
        cards.add(new SetCardInfo("Puresteel Paladin", 170, Rarity.RARE, mage.cards.p.PuresteelPaladin.class));
        cards.add(new SetCardInfo("Putrefy", 747, Rarity.UNCOMMON, mage.cards.p.Putrefy.class));
        cards.add(new SetCardInfo("Radstorm", 37, Rarity.RARE, mage.cards.r.Radstorm.class));
        cards.add(new SetCardInfo("Rancor", 205, Rarity.UNCOMMON, mage.cards.r.Rancor.class));
        cards.add(new SetCardInfo("Ravages of War", 354, Rarity.MYTHIC, mage.cards.r.RavagesOfWar.class));
        cards.add(new SetCardInfo("Roadside Reliquary", 282, Rarity.UNCOMMON, mage.cards.r.RoadsideReliquary.class));
        cards.add(new SetCardInfo("Rogue's Passage", 283, Rarity.UNCOMMON, mage.cards.r.RoguesPassage.class));
        cards.add(new SetCardInfo("Rootbound Crag", 284, Rarity.RARE, mage.cards.r.RootboundCrag.class));
        cards.add(new SetCardInfo("Ruinous Ultimatum", 220, Rarity.RARE, mage.cards.r.RuinousUltimatum.class));
        cards.add(new SetCardInfo("Scattered Groves", 286, Rarity.RARE, mage.cards.s.ScatteredGroves.class));
        cards.add(new SetCardInfo("Scavenger Grounds", 287, Rarity.RARE, mage.cards.s.ScavengerGrounds.class));
        cards.add(new SetCardInfo("Secure the Wastes", 171, Rarity.RARE, mage.cards.s.SecureTheWastes.class));
        cards.add(new SetCardInfo("Shadowblood Ridge", 288, Rarity.RARE, mage.cards.s.ShadowbloodRidge.class));
        cards.add(new SetCardInfo("Sheltered Thicket", 289, Rarity.RARE, mage.cards.s.ShelteredThicket.class));
        cards.add(new SetCardInfo("Silver Shroud Costume", 142, Rarity.UNCOMMON, mage.cards.s.SilverShroudCostume.class));
        cards.add(new SetCardInfo("Single Combat", 172, Rarity.RARE, mage.cards.s.SingleCombat.class));
        cards.add(new SetCardInfo("Skullclamp", 238, Rarity.UNCOMMON, mage.cards.s.Skullclamp.class));
        cards.add(new SetCardInfo("Smoldering Marsh", 292, Rarity.RARE, mage.cards.s.SmolderingMarsh.class));
        cards.add(new SetCardInfo("Sol Ring", 239, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 240, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Squirrel Nest", 206, Rarity.UNCOMMON, mage.cards.s.SquirrelNest.class));
        cards.add(new SetCardInfo("Sticky Fingers", 191, Rarity.COMMON, mage.cards.s.StickyFingers.class));
        cards.add(new SetCardInfo("Stolen Strategy", 192, Rarity.RARE, mage.cards.s.StolenStrategy.class));
        cards.add(new SetCardInfo("Sungrass Prairie", 295, Rarity.RARE, mage.cards.s.SungrassPrairie.class));
        cards.add(new SetCardInfo("Sunpetal Grove", 297, Rarity.RARE, mage.cards.s.SunpetalGrove.class));
        cards.add(new SetCardInfo("Sunscorched Divide", 153, Rarity.RARE, mage.cards.s.SunscorchedDivide.class));
        cards.add(new SetCardInfo("Swamp", 321, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swiftfoot Boots", 242, Rarity.UNCOMMON, mage.cards.s.SwiftfootBoots.class));
        cards.add(new SetCardInfo("Tainted Field", 298, Rarity.UNCOMMON, mage.cards.t.TaintedField.class));
        cards.add(new SetCardInfo("Tainted Peak", 300, Rarity.UNCOMMON, mage.cards.t.TaintedPeak.class));
        cards.add(new SetCardInfo("Talisman of Conviction", 243, Rarity.UNCOMMON, mage.cards.t.TalismanOfConviction.class));
        cards.add(new SetCardInfo("Talisman of Hierarchy", 247, Rarity.UNCOMMON, mage.cards.t.TalismanOfHierarchy.class));
        cards.add(new SetCardInfo("Talisman of Indulgence", 248, Rarity.UNCOMMON, mage.cards.t.TalismanOfIndulgence.class));
        cards.add(new SetCardInfo("Tarmogoyf", 349, Rarity.MYTHIC, mage.cards.t.Tarmogoyf.class));
        cards.add(new SetCardInfo("Temple of Abandon", 302, Rarity.RARE, mage.cards.t.TempleOfAbandon.class));
        cards.add(new SetCardInfo("Temple of Malice", 307, Rarity.RARE, mage.cards.t.TempleOfMalice.class));
        cards.add(new SetCardInfo("Temple of Plenty", 309, Rarity.RARE, mage.cards.t.TempleOfPlenty.class));
        cards.add(new SetCardInfo("Temple of Silence", 310, Rarity.RARE, mage.cards.t.TempleOfSilence.class));
        cards.add(new SetCardInfo("Temple of Triumph", 312, Rarity.RARE, mage.cards.t.TempleOfTriumph.class));
        cards.add(new SetCardInfo("Temple of the False God", 311, Rarity.UNCOMMON, mage.cards.t.TempleOfTheFalseGod.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 313, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("V.A.T.S.", 50, Rarity.RARE, mage.cards.v.VATS.class));
        cards.add(new SetCardInfo("Valorous Stance", 174, Rarity.UNCOMMON, mage.cards.v.ValorousStance.class));
        cards.add(new SetCardInfo("Vandalblast", 355, Rarity.UNCOMMON, mage.cards.v.Vandalblast.class));
        cards.add(new SetCardInfo("Vault 101: Birthday Party", 28, Rarity.RARE, mage.cards.v.Vault101BirthdayParty.class));
        cards.add(new SetCardInfo("Vigor", 347, Rarity.RARE, mage.cards.v.Vigor.class));
        cards.add(new SetCardInfo("Walking Ballista", 352, Rarity.RARE, mage.cards.w.WalkingBallista.class));
        cards.add(new SetCardInfo("War Room", 1068, Rarity.RARE, mage.cards.w.WarRoom.class));
        cards.add(new SetCardInfo("Wasteland", 361, Rarity.RARE, mage.cards.w.Wasteland.class));
        cards.add(new SetCardInfo("Wear // Tear", 222, Rarity.UNCOMMON, mage.cards.w.WearTear.class));
        cards.add(new SetCardInfo("Wild Growth", 208, Rarity.COMMON, mage.cards.w.WildGrowth.class));
        cards.add(new SetCardInfo("Windbrisk Heights", 315, Rarity.RARE, mage.cards.w.WindbriskHeights.class));
    }
}
