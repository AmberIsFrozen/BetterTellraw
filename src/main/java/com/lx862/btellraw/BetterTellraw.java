package com.lx862.btellraw;

import com.lx862.btellraw.commands.BtellrawCommand;
import com.lx862.btellraw.config.Config;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterTellraw implements ModInitializer {
    public static final String MOD_ID = "btellraw";
    public static final Logger LOGGER = LoggerFactory.getLogger("BetterTellraw");

    @Override
    public void onInitialize() {
        LOGGER.info("[BetterTellraw] BetterTellraw Loaded!");
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            BtellrawCommand.register(dispatcher, registryAccess);
        });
        Config.load();
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}