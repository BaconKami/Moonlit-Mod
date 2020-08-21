package com.multiversequeen.moonlit.entities;

import com.multiversequeen.moonlit.Moonlit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CustomEntities {
	public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Moonlit.MOD_ID);
	public static final RegistryObject<EntityType<MoonlitEntity>> MOONLIT = BuildEntity(MoonlitEntity::new, MoonlitEntity.class, 2.845F, 0.3125F);

	public static <T extends Entity> RegistryObject<EntityType<T>> BuildEntity(EntityType.IFactory<T> entity, Class<T> entityClass, float width, float height)
	{
		String name = entityClass.getSimpleName().toLowerCase();
		return ENTITIES.register(name,
				() -> EntityType.Builder.create(entity, EntityClassification.CREATURE)
						.size(width, height).build(name));
	}
}