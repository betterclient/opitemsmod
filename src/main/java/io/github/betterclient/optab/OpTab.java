package io.github.betterclient.optab;

import java.util.ArrayList;
import java.util.List;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.client.MinecraftClient;
import net.minecraft.component.DataComponentPatch;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import static net.minecraft.enchantment.Enchantments.*;

public class OpTab implements ModInitializer {
	private static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of("optab", "optab"));
	public ItemGroup opGroup;

	@Override
	public void onInitialize(ModContainer mod) {
		var builder = FabricItemGroup.builder();
		var icon = new ItemStack(Blocks.BARRIER);

		builder.icon(() -> icon);
		builder.name(Text.translatable("itemGroup.optab.optab"));
		builder.entries((featureFlagBitSet, itemStackCollector) -> itemStackCollector.addStacks(getItems()));
		opGroup = builder.build();
		Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, opGroup);
		LogManager.getLogger("OpTab").info("Initialized OpTab");
	}

	public List<ItemStack> getItems() {
		List<ItemStack> stacks = new ArrayList<>();
		assert MinecraftClient.getInstance().world != null;
		Registry<Enchantment> registry = MinecraftClient.getInstance().world.getRegistryManager().get(RegistryKeys.ENCHANTMENT);

		Holder<Enchantment> SHARPNESS0 = Holder.createDirect(registry.get(SHARPNESS));
		Holder<Enchantment> FIRE_ASPECT0 = Holder.createDirect(registry.get(FIRE_ASPECT));
		Holder<Enchantment> MENDING0 = Holder.createDirect(registry.get(MENDING));
		Holder<Enchantment> UNBREAKING0 = Holder.createDirect(registry.get(UNBREAKING));
		Holder<Enchantment> FEATHER_FALLING0 = Holder.createDirect(registry.get(FEATHER_FALLING));
		Holder<Enchantment> PROTECTION0 = Holder.createDirect(registry.get(PROTECTION));
		Holder<Enchantment> BLAST_PROTECTION0 = Holder.createDirect(registry.get(BLAST_PROTECTION));
		Holder<Enchantment> PROJECTILE_PROTECTION0 = Holder.createDirect(registry.get(PROJECTILE_PROTECTION));
		Holder<Enchantment> FIRE_PROTECTION0 = Holder.createDirect(registry.get(FIRE_PROTECTION));
		Holder<Enchantment> EFFICIENCY0 = Holder.createDirect(registry.get(EFFICIENCY));
		Holder<Enchantment> FORTUNE0 = Holder.createDirect(registry.get(FORTUNE));
		Holder<Enchantment> SILK_TOUCH0 = Holder.createDirect(registry.get(SILK_TOUCH));
		Holder<Enchantment> RESPIRATION0 = Holder.createDirect(registry.get(RESPIRATION));
		Holder<Enchantment> THORNS0 = Holder.createDirect(registry.get(THORNS));

		ItemStack sharp32ksword = new ItemStack(Items.NETHERITE_SWORD);
		sharp32ksword.applyEnchantment(SHARPNESS0, 127);
		sharp32ksword.applyEnchantment(FIRE_ASPECT0, 127);
		sharp32ksword.applyEnchantment(MENDING0, 127);
		sharp32ksword.applyEnchantment(UNBREAKING0, 127);
		sharp32ksword.applyPatch(DataComponentPatch.builder().put(DataComponentTypes.CUSTOM_NAME, Text.literal("OP Sword")).build());
		stacks.add(sharp32ksword);

		ItemStack sharp32kaxe = new ItemStack(Items.NETHERITE_AXE);
		sharp32kaxe.applyEnchantment(EFFICIENCY0, 127);
		sharp32kaxe.applyEnchantment(SHARPNESS0, 127);
		sharp32kaxe.applyEnchantment(FIRE_ASPECT0, 127);
		sharp32kaxe.applyEnchantment(MENDING0, 127);
		sharp32kaxe.applyEnchantment(UNBREAKING0, 127);
		sharp32kaxe.applyPatch(DataComponentPatch.builder().put(DataComponentTypes.CUSTOM_NAME, Text.literal("OP Axe")).build());
		stacks.add(sharp32kaxe);

		ItemStack eff32kpickaxe = new ItemStack(Items.NETHERITE_PICKAXE);
		eff32kpickaxe.applyEnchantment(EFFICIENCY0, 127);
		eff32kpickaxe.applyEnchantment(FORTUNE0, 10);
		eff32kpickaxe.applyEnchantment(MENDING0, 127);
		eff32kpickaxe.applyEnchantment(UNBREAKING0, 127);
		eff32kpickaxe.applyPatch(DataComponentPatch.builder().put(DataComponentTypes.CUSTOM_NAME, Text.literal("OP Pickaxe")).build());
		stacks.add(eff32kpickaxe);

		ItemStack silktouchpickaxe = new ItemStack(Items.NETHERITE_PICKAXE);
		silktouchpickaxe.applyEnchantment(EFFICIENCY0, 127);
		silktouchpickaxe.applyEnchantment(SILK_TOUCH0, 1);
		silktouchpickaxe.applyEnchantment(MENDING0, 127);
		silktouchpickaxe.applyEnchantment(UNBREAKING0, 127);
		silktouchpickaxe.applyPatch(DataComponentPatch.builder().put(DataComponentTypes.CUSTOM_NAME, Text.literal("OP Silk Touch Pickaxe")).build());
		stacks.add(silktouchpickaxe);

		ItemStack eff32kshovel = new ItemStack(Items.NETHERITE_SHOVEL);
		eff32kshovel.applyEnchantment(EFFICIENCY0, 127);
		eff32kshovel.applyEnchantment(FORTUNE0, 10);
		eff32kshovel.applyEnchantment(MENDING0, 127);
		eff32kshovel.applyEnchantment(UNBREAKING0, 127);
		eff32kshovel.applyPatch(DataComponentPatch.builder().put(DataComponentTypes.CUSTOM_NAME, Text.literal("OP Shovel")).build());
		stacks.add(eff32kshovel);

		ItemStack all32khelmet = new ItemStack(Items.NETHERITE_HELMET);
		all32khelmet.applyEnchantment(PROTECTION0, 127);
		all32khelmet.applyEnchantment(FIRE_PROTECTION0, 127);
		all32khelmet.applyEnchantment(BLAST_PROTECTION0, 127);
		all32khelmet.applyEnchantment(PROJECTILE_PROTECTION0, 127);
		all32khelmet.applyEnchantment(RESPIRATION0, 127);
		all32khelmet.applyEnchantment(THORNS0, 127);
		all32khelmet.applyEnchantment(MENDING0, 127);
		all32khelmet.applyEnchantment(UNBREAKING0, 127);
		all32khelmet.applyPatch(DataComponentPatch.builder().put(DataComponentTypes.CUSTOM_NAME, Text.literal("OP Helmet")).build());
		stacks.add(all32khelmet);

		ItemStack all32kchestplate = new ItemStack(Items.NETHERITE_CHESTPLATE);
		all32kchestplate.applyEnchantment(PROTECTION0, 127);
		all32kchestplate.applyEnchantment(FIRE_PROTECTION0, 127);
		all32kchestplate.applyEnchantment(BLAST_PROTECTION0, 127);
		all32kchestplate.applyEnchantment(PROJECTILE_PROTECTION0, 127);
		all32kchestplate.applyEnchantment(THORNS0, 127);
		all32kchestplate.applyEnchantment(MENDING0, 127);
		all32kchestplate.applyEnchantment(UNBREAKING0, 127);
		all32kchestplate.applyPatch(DataComponentPatch.builder().put(DataComponentTypes.CUSTOM_NAME, Text.literal("OP Chestplate")).build());
		stacks.add(all32kchestplate);

		ItemStack all32kleggings = new ItemStack(Items.NETHERITE_LEGGINGS);
		all32kleggings.applyEnchantment(PROTECTION0, 127);
		all32kleggings.applyEnchantment(FIRE_PROTECTION0, 127);
		all32kleggings.applyEnchantment(BLAST_PROTECTION0, 127);
		all32kleggings.applyEnchantment(PROJECTILE_PROTECTION0, 127);
		all32kleggings.applyEnchantment(THORNS0, 127);
		all32kleggings.applyEnchantment(MENDING0, 127);
		all32kleggings.applyEnchantment(UNBREAKING0, 127);
		all32kleggings.applyPatch(DataComponentPatch.builder().put(DataComponentTypes.CUSTOM_NAME, Text.literal("OP Leggings")).build());
		stacks.add(all32kleggings);

		ItemStack all32kboots = new ItemStack(Items.NETHERITE_BOOTS);
		all32kboots.applyEnchantment(PROTECTION0, 127);
		all32kboots.applyEnchantment(FIRE_PROTECTION0, 127);
		all32kboots.applyEnchantment(BLAST_PROTECTION0, 127);
		all32kboots.applyEnchantment(PROJECTILE_PROTECTION0, 127);
		all32kboots.applyEnchantment(THORNS0, 127);
		all32kboots.applyEnchantment(FEATHER_FALLING0, 127);
		all32kboots.applyEnchantment(MENDING0, 127);
		all32kboots.applyEnchantment(UNBREAKING0, 127);
		all32kboots.applyPatch(DataComponentPatch.builder().put(DataComponentTypes.CUSTOM_NAME, Text.literal("OP Boots")).build());
		stacks.add(all32kboots);

		/*ItemStack stackedtotem = new ItemStack(Items.TOTEM_OF_UNDYING);
		stackedtotem.setCount(64);
		stackedtotem.applyPatch(DataComponentPatch.builder().put(DataComponentTypes.CUSTOM_NAME, Text.literal("Stacked Totem")).build());
		stacks.add(stackedtotem);*/

		//Unfortunately >1.19.3 doesn't seem to allow stacked items in item groups

		stacks.add(new ItemStack(Blocks.COMMAND_BLOCK));
		stacks.add(new ItemStack(Blocks.BARRIER));
		stacks.add(new ItemStack(Blocks.STRUCTURE_BLOCK));
		stacks.add(new ItemStack(Blocks.STRUCTURE_VOID));
		stacks.add(new ItemStack(Blocks.LIGHT));
		stacks.add(new ItemStack(Items.COMMAND_BLOCK_MINECART));
		stacks.add(new ItemStack(Blocks.DRAGON_EGG));
		stacks.add(new ItemStack(Items.DEBUG_STICK));
		stacks.add(new ItemStack(Blocks.SPAWNER));
		stacks.add(new ItemStack(Items.KNOWLEDGE_BOOK));
		return stacks;
	}
}
