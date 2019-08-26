package moe.nive.bruhcraft.init;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.potion.Potion;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Bruh.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@SuppressWarnings("unused")
public class Bruh {

    public final static String MODID = "bruhcraft";
    private static final Logger LOGGER = LogManager.getLogger();

    public Bruh() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onBlocks(final RegistryEvent.Register<Block> event) {

    }

    @SubscribeEvent
    public static void onItems(final RegistryEvent.Register<Item> event) {

    }

    @SubscribeEvent
    public static void onSounds(final RegistryEvent.Register<SoundEvent> event) {

    }

    @SubscribeEvent
    public static void onPotions(final RegistryEvent.Register<Potion> event) {

    }

    @SubscribeEvent
    public static void onEnchantments(final RegistryEvent.Register<Enchantment> event) {

    }

    @SubscribeEvent
    public static void onRecipes(final RegistryEvent.Register<IRecipeSerializer<?>> event) {

    }

    @SubscribeEvent
    public static void onProfessions(final RegistryEvent.Register<VillagerProfession> event) {

    }


}
