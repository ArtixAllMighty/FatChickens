package jackdaw.fatchicken.registry;

import jackdaw.fatchicken.FatChickenMod;
import jackdaw.fatchicken.blocks.ChickenBlock;
import jackdaw.fatchicken.blocks.FishBlock;
import jackdaw.fatchicken.blocks.IceCreamLog;
import jackdaw.fatchicken.blocks.PigBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FatChickenMod.MODID);
    public static RegistryObject<Block> FATCHICKEN = BLOCKS.register("fatchicken", () -> new ChickenBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().noOcclusion().destroyTime(1.0f)));
    public static RegistryObject<Block> FATPIG = BLOCKS.register("fatpig", () -> new PigBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().noOcclusion().destroyTime(1.0f)));
    public static RegistryObject<Block> FATFISH = BLOCKS.register("fatfish", () -> new FishBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().noOcclusion().destroyTime(1.0f)));

    public static RegistryObject<Block> CAKE = BLOCKS.register("icecreamlog", () -> new IceCreamLog(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().noOcclusion().destroyTime(1.0f)));

}
