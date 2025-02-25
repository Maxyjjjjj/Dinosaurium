
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dinosaurium.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import com.dinosaurium.entity.ZhenyuanlongEntity;
import com.dinosaurium.entity.YutyrannusEntity;
import com.dinosaurium.entity.VelociraptorEntity;
import com.dinosaurium.entity.TyrannosaurusEntity;
import com.dinosaurium.entity.TuojiangosaurusEntity;
import com.dinosaurium.entity.TriceratopsEntity;
import com.dinosaurium.entity.TherizinosaurusEntity;
import com.dinosaurium.entity.StegosaurusEntity;
import com.dinosaurium.entity.SpinosaurusEntity;
import com.dinosaurium.entity.SpinofaarusEntity;
import com.dinosaurium.entity.SinosauropteryxEntity;
import com.dinosaurium.entity.ShuvuuiaEntity;
import com.dinosaurium.entity.SharovipteryxEntity;
import com.dinosaurium.entity.RepenomamusEntity;
import com.dinosaurium.entity.QuetzalcoatlusEntity;
import com.dinosaurium.entity.PterodaustroEntity;
import com.dinosaurium.entity.PteranodonEntity;
import com.dinosaurium.entity.PsittacosaurusEntity;
import com.dinosaurium.entity.ProtoceratopsEntity;
import com.dinosaurium.entity.ParasaurolophusEntity;
import com.dinosaurium.entity.ParapuzosiaEntity;
import com.dinosaurium.entity.PachyrhinosaurusEntity;
import com.dinosaurium.entity.PachycephalosaurusEntity;
import com.dinosaurium.entity.OviraptorEntity;
import com.dinosaurium.entity.OuranosaurusEntity;
import com.dinosaurium.entity.OrodromeusEntity;
import com.dinosaurium.entity.OnchopristisEntity;
import com.dinosaurium.entity.OmmaEntity;
import com.dinosaurium.entity.OlorotitanEntity;
import com.dinosaurium.entity.NyctosaurusEntity;
import com.dinosaurium.entity.NigersaurusEntity;
import com.dinosaurium.entity.NemegtosaurusEntity;
import com.dinosaurium.entity.NanuqsaurusEntity;
import com.dinosaurium.entity.NannogomphusEntity;
import com.dinosaurium.entity.MongolarachneEntity;
import com.dinosaurium.entity.MiragaiaEntity;
import com.dinosaurium.entity.MicroraptorEntity;
import com.dinosaurium.entity.MamenchisaurusEntity;
import com.dinosaurium.entity.MagyarosaurusEntity;
import com.dinosaurium.entity.LisowiciaEntity;
import com.dinosaurium.entity.LambeosaurusEntity;
import com.dinosaurium.entity.KolEntity;
import com.dinosaurium.entity.JeholopterusEntity;
import com.dinosaurium.entity.IguanodonEntity;
import com.dinosaurium.entity.IchthyosaurusEntity;
import com.dinosaurium.entity.HorseshoeCrabEntity;
import com.dinosaurium.entity.HerrerasaurusEntity;
import com.dinosaurium.entity.HatzegopteryxEntity;
import com.dinosaurium.entity.HalszkaraptorEntity;
import com.dinosaurium.entity.GiantCicadEntity;
import com.dinosaurium.entity.GallimimusEntity;
import com.dinosaurium.entity.EdmontosaurusEntity;
import com.dinosaurium.entity.DsungaripterusEntity;
import com.dinosaurium.entity.DiplodocusEntity;
import com.dinosaurium.entity.DilophosaurusEntity;
import com.dinosaurium.entity.DeinocheirusEntity;
import com.dinosaurium.entity.CretaraneusEntity;
import com.dinosaurium.entity.CompsognathusEntity;
import com.dinosaurium.entity.CoelophysisEntity;
import com.dinosaurium.entity.CephaloleichnitesEntity;
import com.dinosaurium.entity.BruhathkayosaurusEntity;
import com.dinosaurium.entity.BrachytrachelopanEntity;
import com.dinosaurium.entity.BeipiaosaurusEntity;
import com.dinosaurium.entity.AustroraptorEntity;
import com.dinosaurium.entity.ArchaeopteryxEntity;
import com.dinosaurium.entity.ArambourgianiaEntity;
import com.dinosaurium.entity.AnzuEntity;
import com.dinosaurium.entity.AnkylosaurusEntity;
import com.dinosaurium.entity.AnchiornisEntity;
import com.dinosaurium.entity.AmargasaurusEntity;
import com.dinosaurium.DinosauriumMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DinosauriumModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, DinosauriumMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<VelociraptorEntity>> VELOCIRAPTOR = register("velociraptor",
			EntityType.Builder.<VelociraptorEntity>of(VelociraptorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShuvuuiaEntity>> SHUVUUIA = register("shuvuuia",
			EntityType.Builder.<ShuvuuiaEntity>of(ShuvuuiaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.3f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<AustroraptorEntity>> AUSTRORAPTOR = register("austroraptor",
			EntityType.Builder.<AustroraptorEntity>of(AustroraptorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DiplodocusEntity>> DIPLODOCUS = register("diplodocus",
			EntityType.Builder.<DiplodocusEntity>of(DiplodocusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3.4f, 4.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<QuetzalcoatlusEntity>> QUETZALCOATLUS = register("quetzalcoatlus",
			EntityType.Builder.<QuetzalcoatlusEntity>of(QuetzalcoatlusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 3.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MicroraptorEntity>> MICRORAPTOR = register("microraptor",
			EntityType.Builder.<MicroraptorEntity>of(MicroraptorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<HatzegopteryxEntity>> HATZEGOPTERYX = register("hatzegopteryx",
			EntityType.Builder.<HatzegopteryxEntity>of(HatzegopteryxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ArambourgianiaEntity>> ARAMBOURGIANIA = register("arambourgiania",
			EntityType.Builder.<ArambourgianiaEntity>of(ArambourgianiaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<IchthyosaurusEntity>> ICHTHYOSAURUS = register("ichthyosaurus",
			EntityType.Builder.<IchthyosaurusEntity>of(IchthyosaurusEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AnkylosaurusEntity>> ANKYLOSAURUS = register("ankylosaurus",
			EntityType.Builder.<AnkylosaurusEntity>of(AnkylosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.3f, 1.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<GallimimusEntity>> GALLIMIMUS = register("gallimimus",
			EntityType.Builder.<GallimimusEntity>of(GallimimusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<DeinocheirusEntity>> DEINOCHEIRUS = register("deinocheirus",
			EntityType.Builder.<DeinocheirusEntity>of(DeinocheirusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 2.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<StegosaurusEntity>> STEGOSAURUS = register("stegosaurus",
			EntityType.Builder.<StegosaurusEntity>of(StegosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.6f, 2.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TriceratopsEntity>> TRICERATOPS = register("triceratops",
			EntityType.Builder.<TriceratopsEntity>of(TriceratopsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TyrannosaurusEntity>> TYRANNOSAURUS = register("tyrannosaurus",
			EntityType.Builder.<TyrannosaurusEntity>of(TyrannosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<OnchopristisEntity>> ONCHOPRISTIS = register("onchopristis",
			EntityType.Builder.<OnchopristisEntity>of(OnchopristisEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpinosaurusEntity>> SPINOSAURUS = register("spinosaurus",
			EntityType.Builder.<SpinosaurusEntity>of(SpinosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 2.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AmargasaurusEntity>> AMARGASAURUS = register("amargasaurus",
			EntityType.Builder.<AmargasaurusEntity>of(AmargasaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 2.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TherizinosaurusEntity>> THERIZINOSAURUS = register("therizinosaurus",
			EntityType.Builder.<TherizinosaurusEntity>of(TherizinosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.7f, 3.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<ParasaurolophusEntity>> PARASAUROLOPHUS = register("parasaurolophus",
			EntityType.Builder.<ParasaurolophusEntity>of(ParasaurolophusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 3.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SinosauropteryxEntity>> SINOSAUROPTERYX = register("sinosauropteryx",
			EntityType.Builder.<SinosauropteryxEntity>of(SinosauropteryxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NigersaurusEntity>> NIGERSAURUS = register("nigersaurus",
			EntityType.Builder.<NigersaurusEntity>of(NigersaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 2.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<IguanodonEntity>> IGUANODON = register("iguanodon",
			EntityType.Builder.<IguanodonEntity>of(IguanodonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 2.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<CompsognathusEntity>> COMPSOGNATHUS = register("compsognathus",
			EntityType.Builder.<CompsognathusEntity>of(CompsognathusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<OviraptorEntity>> OVIRAPTOR = register("oviraptor",
			EntityType.Builder.<OviraptorEntity>of(OviraptorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<PteranodonEntity>> PTERANODON = register("pteranodon",
			EntityType.Builder.<PteranodonEntity>of(PteranodonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BruhathkayosaurusEntity>> BRUHATHKAYOSAURUS = register("bruhathkayosaurus",
			EntityType.Builder.<BruhathkayosaurusEntity>of(BruhathkayosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(4.5f, 8.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<NyctosaurusEntity>> NYCTOSAURUS = register("nyctosaurus",
			EntityType.Builder.<NyctosaurusEntity>of(NyctosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrachytrachelopanEntity>> BRACHYTRACHELOPAN = register("brachytrachelopan",
			EntityType.Builder.<BrachytrachelopanEntity>of(BrachytrachelopanEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.6f, 4.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MiragaiaEntity>> MIRAGAIA = register("miragaia",
			EntityType.Builder.<MiragaiaEntity>of(MiragaiaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TuojiangosaurusEntity>> TUOJIANGOSAURUS = register("tuojiangosaurus",
			EntityType.Builder.<TuojiangosaurusEntity>of(TuojiangosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 2.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ProtoceratopsEntity>> PROTOCERATOPS = register("protoceratops",
			EntityType.Builder.<ProtoceratopsEntity>of(ProtoceratopsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ArchaeopteryxEntity>> ARCHAEOPTERYX = register("archaeopteryx",
			EntityType.Builder.<ArchaeopteryxEntity>of(ArchaeopteryxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<OlorotitanEntity>> OLOROTITAN = register("olorotitan",
			EntityType.Builder.<OlorotitanEntity>of(OlorotitanEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 3.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MagyarosaurusEntity>> MAGYAROSAURUS = register("magyarosaurus",
			EntityType.Builder.<MagyarosaurusEntity>of(MagyarosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<NemegtosaurusEntity>> NEMEGTOSAURUS = register("nemegtosaurus",
			EntityType.Builder.<NemegtosaurusEntity>of(NemegtosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<PachyrhinosaurusEntity>> PACHYRHINOSAURUS = register("pachyrhinosaurus",
			EntityType.Builder.<PachyrhinosaurusEntity>of(PachyrhinosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<NanuqsaurusEntity>> NANUQSAURUS = register("nanuqsaurus",
			EntityType.Builder.<NanuqsaurusEntity>of(NanuqsaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ParapuzosiaEntity>> PARAPUZOSIA = register("parapuzosia",
			EntityType.Builder.<ParapuzosiaEntity>of(ParapuzosiaEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<OrodromeusEntity>> ORODROMEUS = register("orodromeus",
			EntityType.Builder.<OrodromeusEntity>of(OrodromeusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CephaloleichnitesEntity>> CEPHALOLEICHNITES = register("cephaloleichnites",
			EntityType.Builder.<CephaloleichnitesEntity>of(CephaloleichnitesEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<KolEntity>> KOL = register("kol", EntityType.Builder.<KolEntity>of(KolEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<AnzuEntity>> ANZU = register("anzu",
			EntityType.Builder.<AnzuEntity>of(AnzuEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 2.25f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeipiaosaurusEntity>> BEIPIAOSAURUS = register("beipiaosaurus",
			EntityType.Builder.<BeipiaosaurusEntity>of(BeipiaosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ZhenyuanlongEntity>> ZHENYUANLONG = register("zhenyuanlong",
			EntityType.Builder.<ZhenyuanlongEntity>of(ZhenyuanlongEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DilophosaurusEntity>> DILOPHOSAURUS = register("dilophosaurus",
			EntityType.Builder.<DilophosaurusEntity>of(DilophosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<EdmontosaurusEntity>> EDMONTOSAURUS = register("edmontosaurus",
			EntityType.Builder.<EdmontosaurusEntity>of(EdmontosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.3f, 3.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<PachycephalosaurusEntity>> PACHYCEPHALOSAURUS = register("pachycephalosaurus",
			EntityType.Builder.<PachycephalosaurusEntity>of(PachycephalosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CretaraneusEntity>> CRETARANEUS = register("cretaraneus",
			EntityType.Builder.<CretaraneusEntity>of(CretaraneusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<MongolarachneEntity>> MONGOLARACHNE = register("mongolarachne",
			EntityType.Builder.<MongolarachneEntity>of(MongolarachneEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<CoelophysisEntity>> COELOPHYSIS = register("coelophysis",
			EntityType.Builder.<CoelophysisEntity>of(CoelophysisEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<JeholopterusEntity>> JEHOLOPTERUS = register("jeholopterus",
			EntityType.Builder.<JeholopterusEntity>of(JeholopterusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<HalszkaraptorEntity>> HALSZKARAPTOR = register("halszkaraptor",
			EntityType.Builder.<HalszkaraptorEntity>of(HalszkaraptorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<PsittacosaurusEntity>> PSITTACOSAURUS = register("psittacosaurus",
			EntityType.Builder.<PsittacosaurusEntity>of(PsittacosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<YutyrannusEntity>> YUTYRANNUS = register("yutyrannus",
			EntityType.Builder.<YutyrannusEntity>of(YutyrannusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<RepenomamusEntity>> REPENOMAMUS = register("repenomamus",
			EntityType.Builder.<RepenomamusEntity>of(RepenomamusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<MamenchisaurusEntity>> MAMENCHISAURUS = register("mamenchisaurus",
			EntityType.Builder.<MamenchisaurusEntity>of(MamenchisaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 2.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpinofaarusEntity>> SPINOFAARUS = register("spinofaarus",
			EntityType.Builder.<SpinofaarusEntity>of(SpinofaarusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.3f, 2.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<OmmaEntity>> OMMA = register("omma",
			EntityType.Builder.<OmmaEntity>of(OmmaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<NannogomphusEntity>> NANNOGOMPHUS = register("nannogomphus",
			EntityType.Builder.<NannogomphusEntity>of(NannogomphusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<GiantCicadEntity>> GIANT_CICADA = register("giant_cicada",
			EntityType.Builder.<GiantCicadEntity>of(GiantCicadEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<LambeosaurusEntity>> LAMBEOSAURUS = register("lambeosaurus",
			EntityType.Builder.<LambeosaurusEntity>of(LambeosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<OuranosaurusEntity>> OURANOSAURUS = register("ouranosaurus",
			EntityType.Builder.<OuranosaurusEntity>of(OuranosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<DsungaripterusEntity>> DSUNGARIPTERUS = register("dsungaripterus",
			EntityType.Builder.<DsungaripterusEntity>of(DsungaripterusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<PterodaustroEntity>> PTERODAUSTRO = register("pterodaustro",
			EntityType.Builder.<PterodaustroEntity>of(PterodaustroEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<LisowiciaEntity>> LISOWICIA = register("lisowicia",
			EntityType.Builder.<LisowiciaEntity>of(LisowiciaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.3f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<HorseshoeCrabEntity>> HORSESHOE_CRAB = register("horseshoe_crab",
			EntityType.Builder.<HorseshoeCrabEntity>of(HorseshoeCrabEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<AnchiornisEntity>> ANCHIORNIS = register("anchiornis",
			EntityType.Builder.<AnchiornisEntity>of(AnchiornisEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<HerrerasaurusEntity>> HERRERASAURUS = register("herrerasaurus",
			EntityType.Builder.<HerrerasaurusEntity>of(HerrerasaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharovipteryxEntity>> SHAROVIPTERYX = register("sharovipteryx",
			EntityType.Builder.<SharovipteryxEntity>of(SharovipteryxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerEntity(Capabilities.ItemHandler.ENTITY, ANCHIORNIS.get(), (living, context) -> living.getInventory());
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		VelociraptorEntity.init(event);
		ShuvuuiaEntity.init(event);
		AustroraptorEntity.init(event);
		DiplodocusEntity.init(event);
		QuetzalcoatlusEntity.init(event);
		MicroraptorEntity.init(event);
		HatzegopteryxEntity.init(event);
		ArambourgianiaEntity.init(event);
		IchthyosaurusEntity.init(event);
		AnkylosaurusEntity.init(event);
		GallimimusEntity.init(event);
		DeinocheirusEntity.init(event);
		StegosaurusEntity.init(event);
		TriceratopsEntity.init(event);
		TyrannosaurusEntity.init(event);
		OnchopristisEntity.init(event);
		SpinosaurusEntity.init(event);
		AmargasaurusEntity.init(event);
		TherizinosaurusEntity.init(event);
		ParasaurolophusEntity.init(event);
		SinosauropteryxEntity.init(event);
		NigersaurusEntity.init(event);
		IguanodonEntity.init(event);
		CompsognathusEntity.init(event);
		OviraptorEntity.init(event);
		PteranodonEntity.init(event);
		BruhathkayosaurusEntity.init(event);
		NyctosaurusEntity.init(event);
		BrachytrachelopanEntity.init(event);
		MiragaiaEntity.init(event);
		TuojiangosaurusEntity.init(event);
		ProtoceratopsEntity.init(event);
		ArchaeopteryxEntity.init(event);
		OlorotitanEntity.init(event);
		MagyarosaurusEntity.init(event);
		NemegtosaurusEntity.init(event);
		PachyrhinosaurusEntity.init(event);
		NanuqsaurusEntity.init(event);
		ParapuzosiaEntity.init(event);
		OrodromeusEntity.init(event);
		CephaloleichnitesEntity.init(event);
		KolEntity.init(event);
		AnzuEntity.init(event);
		BeipiaosaurusEntity.init(event);
		ZhenyuanlongEntity.init(event);
		DilophosaurusEntity.init(event);
		EdmontosaurusEntity.init(event);
		PachycephalosaurusEntity.init(event);
		CretaraneusEntity.init(event);
		MongolarachneEntity.init(event);
		CoelophysisEntity.init(event);
		JeholopterusEntity.init(event);
		HalszkaraptorEntity.init(event);
		PsittacosaurusEntity.init(event);
		YutyrannusEntity.init(event);
		RepenomamusEntity.init(event);
		MamenchisaurusEntity.init(event);
		SpinofaarusEntity.init(event);
		OmmaEntity.init(event);
		NannogomphusEntity.init(event);
		GiantCicadEntity.init(event);
		LambeosaurusEntity.init(event);
		OuranosaurusEntity.init(event);
		DsungaripterusEntity.init(event);
		PterodaustroEntity.init(event);
		LisowiciaEntity.init(event);
		HorseshoeCrabEntity.init(event);
		AnchiornisEntity.init(event);
		HerrerasaurusEntity.init(event);
		SharovipteryxEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(VELOCIRAPTOR.get(), VelociraptorEntity.createAttributes().build());
		event.put(SHUVUUIA.get(), ShuvuuiaEntity.createAttributes().build());
		event.put(AUSTRORAPTOR.get(), AustroraptorEntity.createAttributes().build());
		event.put(DIPLODOCUS.get(), DiplodocusEntity.createAttributes().build());
		event.put(QUETZALCOATLUS.get(), QuetzalcoatlusEntity.createAttributes().build());
		event.put(MICRORAPTOR.get(), MicroraptorEntity.createAttributes().build());
		event.put(HATZEGOPTERYX.get(), HatzegopteryxEntity.createAttributes().build());
		event.put(ARAMBOURGIANIA.get(), ArambourgianiaEntity.createAttributes().build());
		event.put(ICHTHYOSAURUS.get(), IchthyosaurusEntity.createAttributes().build());
		event.put(ANKYLOSAURUS.get(), AnkylosaurusEntity.createAttributes().build());
		event.put(GALLIMIMUS.get(), GallimimusEntity.createAttributes().build());
		event.put(DEINOCHEIRUS.get(), DeinocheirusEntity.createAttributes().build());
		event.put(STEGOSAURUS.get(), StegosaurusEntity.createAttributes().build());
		event.put(TRICERATOPS.get(), TriceratopsEntity.createAttributes().build());
		event.put(TYRANNOSAURUS.get(), TyrannosaurusEntity.createAttributes().build());
		event.put(ONCHOPRISTIS.get(), OnchopristisEntity.createAttributes().build());
		event.put(SPINOSAURUS.get(), SpinosaurusEntity.createAttributes().build());
		event.put(AMARGASAURUS.get(), AmargasaurusEntity.createAttributes().build());
		event.put(THERIZINOSAURUS.get(), TherizinosaurusEntity.createAttributes().build());
		event.put(PARASAUROLOPHUS.get(), ParasaurolophusEntity.createAttributes().build());
		event.put(SINOSAUROPTERYX.get(), SinosauropteryxEntity.createAttributes().build());
		event.put(NIGERSAURUS.get(), NigersaurusEntity.createAttributes().build());
		event.put(IGUANODON.get(), IguanodonEntity.createAttributes().build());
		event.put(COMPSOGNATHUS.get(), CompsognathusEntity.createAttributes().build());
		event.put(OVIRAPTOR.get(), OviraptorEntity.createAttributes().build());
		event.put(PTERANODON.get(), PteranodonEntity.createAttributes().build());
		event.put(BRUHATHKAYOSAURUS.get(), BruhathkayosaurusEntity.createAttributes().build());
		event.put(NYCTOSAURUS.get(), NyctosaurusEntity.createAttributes().build());
		event.put(BRACHYTRACHELOPAN.get(), BrachytrachelopanEntity.createAttributes().build());
		event.put(MIRAGAIA.get(), MiragaiaEntity.createAttributes().build());
		event.put(TUOJIANGOSAURUS.get(), TuojiangosaurusEntity.createAttributes().build());
		event.put(PROTOCERATOPS.get(), ProtoceratopsEntity.createAttributes().build());
		event.put(ARCHAEOPTERYX.get(), ArchaeopteryxEntity.createAttributes().build());
		event.put(OLOROTITAN.get(), OlorotitanEntity.createAttributes().build());
		event.put(MAGYAROSAURUS.get(), MagyarosaurusEntity.createAttributes().build());
		event.put(NEMEGTOSAURUS.get(), NemegtosaurusEntity.createAttributes().build());
		event.put(PACHYRHINOSAURUS.get(), PachyrhinosaurusEntity.createAttributes().build());
		event.put(NANUQSAURUS.get(), NanuqsaurusEntity.createAttributes().build());
		event.put(PARAPUZOSIA.get(), ParapuzosiaEntity.createAttributes().build());
		event.put(ORODROMEUS.get(), OrodromeusEntity.createAttributes().build());
		event.put(CEPHALOLEICHNITES.get(), CephaloleichnitesEntity.createAttributes().build());
		event.put(KOL.get(), KolEntity.createAttributes().build());
		event.put(ANZU.get(), AnzuEntity.createAttributes().build());
		event.put(BEIPIAOSAURUS.get(), BeipiaosaurusEntity.createAttributes().build());
		event.put(ZHENYUANLONG.get(), ZhenyuanlongEntity.createAttributes().build());
		event.put(DILOPHOSAURUS.get(), DilophosaurusEntity.createAttributes().build());
		event.put(EDMONTOSAURUS.get(), EdmontosaurusEntity.createAttributes().build());
		event.put(PACHYCEPHALOSAURUS.get(), PachycephalosaurusEntity.createAttributes().build());
		event.put(CRETARANEUS.get(), CretaraneusEntity.createAttributes().build());
		event.put(MONGOLARACHNE.get(), MongolarachneEntity.createAttributes().build());
		event.put(COELOPHYSIS.get(), CoelophysisEntity.createAttributes().build());
		event.put(JEHOLOPTERUS.get(), JeholopterusEntity.createAttributes().build());
		event.put(HALSZKARAPTOR.get(), HalszkaraptorEntity.createAttributes().build());
		event.put(PSITTACOSAURUS.get(), PsittacosaurusEntity.createAttributes().build());
		event.put(YUTYRANNUS.get(), YutyrannusEntity.createAttributes().build());
		event.put(REPENOMAMUS.get(), RepenomamusEntity.createAttributes().build());
		event.put(MAMENCHISAURUS.get(), MamenchisaurusEntity.createAttributes().build());
		event.put(SPINOFAARUS.get(), SpinofaarusEntity.createAttributes().build());
		event.put(OMMA.get(), OmmaEntity.createAttributes().build());
		event.put(NANNOGOMPHUS.get(), NannogomphusEntity.createAttributes().build());
		event.put(GIANT_CICADA.get(), GiantCicadEntity.createAttributes().build());
		event.put(LAMBEOSAURUS.get(), LambeosaurusEntity.createAttributes().build());
		event.put(OURANOSAURUS.get(), OuranosaurusEntity.createAttributes().build());
		event.put(DSUNGARIPTERUS.get(), DsungaripterusEntity.createAttributes().build());
		event.put(PTERODAUSTRO.get(), PterodaustroEntity.createAttributes().build());
		event.put(LISOWICIA.get(), LisowiciaEntity.createAttributes().build());
		event.put(HORSESHOE_CRAB.get(), HorseshoeCrabEntity.createAttributes().build());
		event.put(ANCHIORNIS.get(), AnchiornisEntity.createAttributes().build());
		event.put(HERRERASAURUS.get(), HerrerasaurusEntity.createAttributes().build());
		event.put(SHAROVIPTERYX.get(), SharovipteryxEntity.createAttributes().build());
	}
}
