
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kconlac.extraindeco.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.kconlac.extraindeco.block.TrenitalialogosmallBlock;
import net.kconlac.extraindeco.block.Trenitalialogo4Block;
import net.kconlac.extraindeco.block.Trenitalialogo3Block;
import net.kconlac.extraindeco.block.Trenitalialogo2Block;
import net.kconlac.extraindeco.block.TraintableBlock;
import net.kconlac.extraindeco.block.TrainbinBlock;
import net.kconlac.extraindeco.block.TicketmachineBlock;
import net.kconlac.extraindeco.block.StationbenchBlock;
import net.kconlac.extraindeco.block.SignalBlock;
import net.kconlac.extraindeco.block.Signal2Block;
import net.kconlac.extraindeco.block.ShortscharfenbergcouplerBlock;
import net.kconlac.extraindeco.block.ScharfenbergcouplerBlock;
import net.kconlac.extraindeco.block.Sbblogo4Block;
import net.kconlac.extraindeco.block.Sbblogo3Block;
import net.kconlac.extraindeco.block.Sbblogo2Block;
import net.kconlac.extraindeco.block.SBBlogoBlock;
import net.kconlac.extraindeco.block.SBBflirtlogo4Block;
import net.kconlac.extraindeco.block.SBBflirtlogo3Block;
import net.kconlac.extraindeco.block.SBBflirtlogo2Block;
import net.kconlac.extraindeco.block.SBBflirtlogo1Block;
import net.kconlac.extraindeco.block.SBBdoorredBlock;
import net.kconlac.extraindeco.block.SBBblueBlock;
import net.kconlac.extraindeco.block.SBBRABe514Block;
import net.kconlac.extraindeco.block.SBBRABe5144Block;
import net.kconlac.extraindeco.block.SBBRABe5143Block;
import net.kconlac.extraindeco.block.SBBRABe5142Block;
import net.kconlac.extraindeco.block.PlatformsignbaseBlock;
import net.kconlac.extraindeco.block.Platformsign9Block;
import net.kconlac.extraindeco.block.Platformsign8Block;
import net.kconlac.extraindeco.block.Platformsign7Block;
import net.kconlac.extraindeco.block.Platformsign6Block;
import net.kconlac.extraindeco.block.Platformsign5Block;
import net.kconlac.extraindeco.block.Platformsign4Block;
import net.kconlac.extraindeco.block.Platformsign3Block;
import net.kconlac.extraindeco.block.Platformsign2TBlock;
import net.kconlac.extraindeco.block.Platformsign2Block;
import net.kconlac.extraindeco.block.Platformsign1TBlock;
import net.kconlac.extraindeco.block.Platformsign1Block;
import net.kconlac.extraindeco.block.Platformsign10Block;
import net.kconlac.extraindeco.block.LuggagerackBlock;
import net.kconlac.extraindeco.block.IcdaylineBlock;
import net.kconlac.extraindeco.block.Icdayline4Block;
import net.kconlac.extraindeco.block.Icdayline3Block;
import net.kconlac.extraindeco.block.Icdayline2Block;
import net.kconlac.extraindeco.block.DprBlock;
import net.kconlac.extraindeco.block.DoorredBlock;
import net.kconlac.extraindeco.block.DBlogo2Block;
import net.kconlac.extraindeco.block.DBlogo1Block;
import net.kconlac.extraindeco.ExtraindecoMod;

public class ExtraindecoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraindecoMod.MODID);
	public static final RegistryObject<Block> TRAIN_TABLE = REGISTRY.register("train_table", () -> new TraintableBlock());
	public static final RegistryObject<Block> TRAINBIN = REGISTRY.register("trainbin", () -> new TrainbinBlock());
	public static final RegistryObject<Block> PLATFORMSIGN_1 = REGISTRY.register("platformsign_1", () -> new Platformsign1Block());
	public static final RegistryObject<Block> PLATFORMSIGN_2 = REGISTRY.register("platformsign_2", () -> new Platformsign2Block());
	public static final RegistryObject<Block> PLATFORMSIGN_3 = REGISTRY.register("platformsign_3", () -> new Platformsign3Block());
	public static final RegistryObject<Block> PLATFORMSIGN_4 = REGISTRY.register("platformsign_4", () -> new Platformsign4Block());
	public static final RegistryObject<Block> PLATFORMSIGN_5 = REGISTRY.register("platformsign_5", () -> new Platformsign5Block());
	public static final RegistryObject<Block> PLATFORMSIGN_6 = REGISTRY.register("platformsign_6", () -> new Platformsign6Block());
	public static final RegistryObject<Block> PLATFORMSIGN_7 = REGISTRY.register("platformsign_7", () -> new Platformsign7Block());
	public static final RegistryObject<Block> PLATFORMSIGN_8 = REGISTRY.register("platformsign_8", () -> new Platformsign8Block());
	public static final RegistryObject<Block> PLATFORMSIGN_9 = REGISTRY.register("platformsign_9", () -> new Platformsign9Block());
	public static final RegistryObject<Block> PLATFORMSIGN_10 = REGISTRY.register("platformsign_10", () -> new Platformsign10Block());
	public static final RegistryObject<Block> PLATFORMSIGN_1_T = REGISTRY.register("platformsign_1_t", () -> new Platformsign1TBlock());
	public static final RegistryObject<Block> PLATFORMSIGN_2_T = REGISTRY.register("platformsign_2_t", () -> new Platformsign2TBlock());
	public static final RegistryObject<Block> LUGGAGERACK = REGISTRY.register("luggagerack", () -> new LuggagerackBlock());
	public static final RegistryObject<Block> TRENITALIALOGO1 = REGISTRY.register("trenitalialogo1", () -> new DoorredBlock());
	public static final RegistryObject<Block> SB_BBLUE = REGISTRY.register("sb_bblue", () -> new SBBblueBlock());
	public static final RegistryObject<Block> ICDAYLINE1 = REGISTRY.register("icdayline1", () -> new IcdaylineBlock());
	public static final RegistryObject<Block> ICDAYLINE_2 = REGISTRY.register("icdayline_2", () -> new Icdayline2Block());
	public static final RegistryObject<Block> ICDAYLINE_3 = REGISTRY.register("icdayline_3", () -> new Icdayline3Block());
	public static final RegistryObject<Block> ICDAYLINE_4 = REGISTRY.register("icdayline_4", () -> new Icdayline4Block());
	public static final RegistryObject<Block> TRENITALIALOGOSMALL = REGISTRY.register("trenitalialogosmall", () -> new TrenitalialogosmallBlock());
	public static final RegistryObject<Block> TRENITALIALOGO_2 = REGISTRY.register("trenitalialogo_2", () -> new Trenitalialogo2Block());
	public static final RegistryObject<Block> TRENITALIALOGO_3 = REGISTRY.register("trenitalialogo_3", () -> new Trenitalialogo3Block());
	public static final RegistryObject<Block> TRENITALIALOGO_4 = REGISTRY.register("trenitalialogo_4", () -> new Trenitalialogo4Block());
	public static final RegistryObject<Block> SB_BLOGO = REGISTRY.register("sb_blogo", () -> new SBBlogoBlock());
	public static final RegistryObject<Block> SBBLOGO_2 = REGISTRY.register("sbblogo_2", () -> new Sbblogo2Block());
	public static final RegistryObject<Block> SBBLOGO_3 = REGISTRY.register("sbblogo_3", () -> new Sbblogo3Block());
	public static final RegistryObject<Block> SBBLOGO_4 = REGISTRY.register("sbblogo_4", () -> new Sbblogo4Block());
	public static final RegistryObject<Block> SBBRA_BE_514 = REGISTRY.register("sbbra_be_514", () -> new SBBRABe514Block());
	public static final RegistryObject<Block> SBBRA_BE_5142 = REGISTRY.register("sbbra_be_5142", () -> new SBBRABe5142Block());
	public static final RegistryObject<Block> SBBRA_BE_5143 = REGISTRY.register("sbbra_be_5143", () -> new SBBRABe5143Block());
	public static final RegistryObject<Block> SBBRA_BE_5144 = REGISTRY.register("sbbra_be_5144", () -> new SBBRABe5144Block());
	public static final RegistryObject<Block> SB_BFLIRTLOGO_1 = REGISTRY.register("sb_bflirtlogo_1", () -> new SBBflirtlogo1Block());
	public static final RegistryObject<Block> SB_BFLIRTLOGO_2 = REGISTRY.register("sb_bflirtlogo_2", () -> new SBBflirtlogo2Block());
	public static final RegistryObject<Block> SB_BFLIRTLOGO_3 = REGISTRY.register("sb_bflirtlogo_3", () -> new SBBflirtlogo3Block());
	public static final RegistryObject<Block> SB_BFLIRTLOGO_4 = REGISTRY.register("sb_bflirtlogo_4", () -> new SBBflirtlogo4Block());
	public static final RegistryObject<Block> D_BLOGO_1 = REGISTRY.register("d_blogo_1", () -> new DBlogo1Block());
	public static final RegistryObject<Block> D_BLOGO_2 = REGISTRY.register("d_blogo_2", () -> new DBlogo2Block());
	public static final RegistryObject<Block> SB_BDOORRED = REGISTRY.register("sb_bdoorred", () -> new SBBdoorredBlock());
	public static final RegistryObject<Block> DPR = REGISTRY.register("dpr", () -> new DprBlock());
	public static final RegistryObject<Block> SIGNAL = REGISTRY.register("signal", () -> new SignalBlock());
	public static final RegistryObject<Block> SIGNAL_2 = REGISTRY.register("signal_2", () -> new Signal2Block());
	public static final RegistryObject<Block> SCHARFENBERGCOUPLER = REGISTRY.register("scharfenbergcoupler", () -> new ScharfenbergcouplerBlock());
	public static final RegistryObject<Block> PLATFORMSIGNBASE = REGISTRY.register("platformsignbase", () -> new PlatformsignbaseBlock());
	public static final RegistryObject<Block> SHORTSCHARFENBERGCOUPLER = REGISTRY.register("shortscharfenbergcoupler", () -> new ShortscharfenbergcouplerBlock());
	public static final RegistryObject<Block> STATIONBENCH = REGISTRY.register("stationbench", () -> new StationbenchBlock());
	public static final RegistryObject<Block> TICKETMACHINE = REGISTRY.register("ticketmachine", () -> new TicketmachineBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
