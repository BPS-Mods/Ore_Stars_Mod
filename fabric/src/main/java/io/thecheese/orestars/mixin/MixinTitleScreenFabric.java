package io.thecheese.orestars.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class MixinTitleScreenFabric {
	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
		// The name is fake i did this so Compiler shuts the fuck up
	}
}