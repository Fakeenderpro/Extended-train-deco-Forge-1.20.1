
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kconlac.extraindeco.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.kconlac.extraindeco.item.IronpoleItem;
import net.kconlac.extraindeco.item.DisplayItem;
import net.kconlac.extraindeco.ExtraindecoMod;

public class ExtraindecoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraindecoMod.MODID);
	public static final RegistryObject<Item> TRAIN_TABLE = block(ExtraindecoModBlocks.TRAIN_TABLE);
	public static final RegistryObject<Item> TRAINBIN = block(ExtraindecoModBlocks.TRAINBIN);
	public static final RegistryObject<Item> PLATFORMSIGN_1 = block(ExtraindecoModBlocks.PLATFORMSIGN_1);
	public static final RegistryObject<Item> PLATFORMSIGN_2 = block(ExtraindecoModBlocks.PLATFORMSIGN_2);
	public static final RegistryObject<Item> PLATFORMSIGN_3 = block(ExtraindecoModBlocks.PLATFORMSIGN_3);
	public static final RegistryObject<Item> PLATFORMSIGN_4 = block(ExtraindecoModBlocks.PLATFORMSIGN_4);
	public static final RegistryObject<Item> PLATFORMSIGN_5 = block(ExtraindecoModBlocks.PLATFORMSIGN_5);
	public static final RegistryObject<Item> PLATFORMSIGN_6 = block(ExtraindecoModBlocks.PLATFORMSIGN_6);
	public static final RegistryObject<Item> PLATFORMSIGN_7 = block(ExtraindecoModBlocks.PLATFORMSIGN_7);
	public static final RegistryObject<Item> PLATFORMSIGN_8 = block(ExtraindecoModBlocks.PLATFORMSIGN_8);
	public static final RegistryObject<Item> PLATFORMSIGN_9 = block(ExtraindecoModBlocks.PLATFORMSIGN_9);
	public static final RegistryObject<Item> PLATFORMSIGN_10 = block(ExtraindecoModBlocks.PLATFORMSIGN_10);
	public static final RegistryObject<Item> PLATFORMSIGN_1_T = block(ExtraindecoModBlocks.PLATFORMSIGN_1_T);
	public static final RegistryObject<Item> PLATFORMSIGN_2_T = block(ExtraindecoModBlocks.PLATFORMSIGN_2_T);
	public static final RegistryObject<Item> LUGGAGERACK = block(ExtraindecoModBlocks.LUGGAGERACK);
	public static final RegistryObject<Item> TRENITALIALOGO1 = block(ExtraindecoModBlocks.TRENITALIALOGO1);
	public static final RegistryObject<Item> SB_BBLUE = block(ExtraindecoModBlocks.SB_BBLUE);
	public static final RegistryObject<Item> ICDAYLINE1 = block(ExtraindecoModBlocks.ICDAYLINE1);
	public static final RegistryObject<Item> ICDAYLINE_2 = block(ExtraindecoModBlocks.ICDAYLINE_2);
	public static final RegistryObject<Item> ICDAYLINE_3 = block(ExtraindecoModBlocks.ICDAYLINE_3);
	public static final RegistryObject<Item> ICDAYLINE_4 = block(ExtraindecoModBlocks.ICDAYLINE_4);
	public static final RegistryObject<Item> TRENITALIALOGOSMALL = block(ExtraindecoModBlocks.TRENITALIALOGOSMALL);
	public static final RegistryObject<Item> TRENITALIALOGO_2 = block(ExtraindecoModBlocks.TRENITALIALOGO_2);
	public static final RegistryObject<Item> TRENITALIALOGO_3 = block(ExtraindecoModBlocks.TRENITALIALOGO_3);
	public static final RegistryObject<Item> TRENITALIALOGO_4 = block(ExtraindecoModBlocks.TRENITALIALOGO_4);
	public static final RegistryObject<Item> SB_BLOGO = block(ExtraindecoModBlocks.SB_BLOGO);
	public static final RegistryObject<Item> SBBLOGO_2 = block(ExtraindecoModBlocks.SBBLOGO_2);
	public static final RegistryObject<Item> SBBLOGO_3 = block(ExtraindecoModBlocks.SBBLOGO_3);
	public static final RegistryObject<Item> SBBLOGO_4 = block(ExtraindecoModBlocks.SBBLOGO_4);
	public static final RegistryObject<Item> SBBRA_BE_514 = block(ExtraindecoModBlocks.SBBRA_BE_514);
	public static final RegistryObject<Item> SBBRA_BE_5142 = block(ExtraindecoModBlocks.SBBRA_BE_5142);
	public static final RegistryObject<Item> SBBRA_BE_5143 = block(ExtraindecoModBlocks.SBBRA_BE_5143);
	public static final RegistryObject<Item> SBBRA_BE_5144 = block(ExtraindecoModBlocks.SBBRA_BE_5144);
	public static final RegistryObject<Item> SB_BFLIRTLOGO_1 = block(ExtraindecoModBlocks.SB_BFLIRTLOGO_1);
	public static final RegistryObject<Item> SB_BFLIRTLOGO_2 = block(ExtraindecoModBlocks.SB_BFLIRTLOGO_2);
	public static final RegistryObject<Item> SB_BFLIRTLOGO_3 = block(ExtraindecoModBlocks.SB_BFLIRTLOGO_3);
	public static final RegistryObject<Item> SB_BFLIRTLOGO_4 = block(ExtraindecoModBlocks.SB_BFLIRTLOGO_4);
	public static final RegistryObject<Item> D_BLOGO_1 = block(ExtraindecoModBlocks.D_BLOGO_1);
	public static final RegistryObject<Item> D_BLOGO_2 = block(ExtraindecoModBlocks.D_BLOGO_2);
	public static final RegistryObject<Item> SB_BDOORRED = block(ExtraindecoModBlocks.SB_BDOORRED);
	public static final RegistryObject<Item> DPR = block(ExtraindecoModBlocks.DPR);
	public static final RegistryObject<Item> SIGNAL = block(ExtraindecoModBlocks.SIGNAL);
	public static final RegistryObject<Item> SIGNAL_2 = block(ExtraindecoModBlocks.SIGNAL_2);
	public static final RegistryObject<Item> SCHARFENBERGCOUPLER = block(ExtraindecoModBlocks.SCHARFENBERGCOUPLER);
	public static final RegistryObject<Item> IRONPOLE = REGISTRY.register("ironpole", () -> new IronpoleItem());
	public static final RegistryObject<Item> PLATFORMSIGNBASE = block(ExtraindecoModBlocks.PLATFORMSIGNBASE);
	public static final RegistryObject<Item> SHORTSCHARFENBERGCOUPLER = block(ExtraindecoModBlocks.SHORTSCHARFENBERGCOUPLER);
	public static final RegistryObject<Item> STATIONBENCH = block(ExtraindecoModBlocks.STATIONBENCH);
	public static final RegistryObject<Item> TICKETMACHINE = block(ExtraindecoModBlocks.TICKETMACHINE);
	public static final RegistryObject<Item> DISPLAY = REGISTRY.register("display", () -> new DisplayItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
