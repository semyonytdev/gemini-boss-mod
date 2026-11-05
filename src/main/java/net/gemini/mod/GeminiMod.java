package net.gemini.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeminiMod implements ModInitializer {
    public static final String MOD_ID = "geminimod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Пример кастомного предмета (Торт Gemini)
    public static final Item GEMINI_CAKE = new Item(new Item.Settings().maxCount(1));

    @Override
    public void onInitialize() {
        LOGGER.info("Инициализация Gemini Boss Mod...");
        
        // Регистрация торта
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "gemini_cake"), GEMINI_CAKE);
    }
}
