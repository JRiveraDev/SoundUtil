import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class SoundManager
{

	public void cave(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.AMBIENCE_CAVE, volume, pitch);
	}

	public void rain(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.AMBIENCE_RAIN, volume, pitch);
	}

	public void rain_thunder(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.AMBIENCE_THUNDER, volume, pitch);
	}

	public void damage_fall_mall(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.FALL_SMALL, volume, pitch);
	}

	public void damage_fall_big(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		w = p.getWorld();
		w.playSound(p.getLocation(), Sound.FALL_BIG, volume, pitch);
	}

	public void damage_hit(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.HURT_FLESH, volume, pitch);
	}

	public void dig_wool(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.DIG_WOOL, volume, pitch);
	}

	public void dig_grass(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.DIG_GRASS, volume, pitch);
	}

	public void dig_gravel(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.DIG_GRAVEL, volume, pitch);
	}

	public void dig_snow(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.DIG_SNOW, volume, pitch);
	}

	public void dig_sand(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.DIG_SAND, volume, pitch);
	}

	public void dig_stone(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.DIG_STONE, volume, pitch);
	}

	public void dig_wood(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.DIG_WOOD, volume, pitch);
	}

	public void fire_fire(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.FIRE, volume, pitch);
	}

	public void fire_ignite(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.FIRE_IGNITE, volume, pitch);
	}

	public void firework(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.FIREWORK_BLAST, volume, pitch);
	}

	public void firework2(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.FIREWORK_BLAST2, volume, pitch);
	}

	public static void firework_large(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.FIREWORK_LARGE_BLAST, volume, pitch);
	}

	public void firework_large2(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.FIREWORK_LARGE_BLAST2, volume, pitch);
	}

	public void firework_launch(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.FIREWORK_LAUNCH, volume, pitch);
	}

	public void firework_twinkle(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.FIREWORK_TWINKLE, volume, pitch);
	}

	public void firework_twinkle2(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.FIREWORK_TWINKLE2, volume, pitch);
	}

	public void liquid_water(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WATER, volume, pitch);
	}

	public void liquid_lava(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.LAVA, volume, pitch);
	}

	public void liquid_lavapop(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.LAVA_POP, volume, pitch);
	}

	public void liquid_splash(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.SPLASH, volume, pitch);
	}

	public void liquid_splash2(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.SPLASH2, volume, pitch);
	}

	public void minecart_inside(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.MINECART_INSIDE, volume, pitch);
	}

	public void minecart_base(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.MINECART_BASE, volume, pitch);
	}

	public void bat_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.BAT_DEATH, volume, pitch);
	}

	public static void bat_idle(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.BAT_IDLE, volume, pitch);
	}

	public void bat_hurt(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.BAT_HURT, volume, pitch);
	}

	public void bat_loop(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.BAT_LOOP, volume, pitch);
	}

	public void bat_fly(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, volume, pitch);
	}

	public void blaze_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.BLAZE_DEATH, volume, pitch);
	}

	public static void blaze_hit(final Location l, World w, final int volume, final int pitch, final Player p)
	{

		p.getWorld().playSound(p.getLocation(), Sound.BLAZE_HIT, volume, pitch);
	}

	public void blaze_breath(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.BLAZE_BREATH, volume, pitch);
	}

	public void cat_hiss(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CAT_HISS, volume, pitch);
	}

	public void cat_hit(final Location l, World w, final int volume, final int pitch, final Player p)
	{

		p.getWorld().playSound(p.getLocation(), Sound.CAT_HIT, volume, pitch);
	}

	public void cat_meow(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CAT_MEOW, volume, pitch);
	}

	public void cat_purr(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CAT_PURR, volume, pitch);
	}

	public void cat_purreow(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CAT_PURREOW, volume, pitch);
	}

	public void chicken_hurt(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CHICKEN_HURT, volume, pitch);
	}

	public void chicken_egg(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, volume, pitch);
	}

	public void chicken_walk(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CHICKEN_WALK, volume, pitch);
	}

	public static void chicken_cluck(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CHICKEN_IDLE, volume, pitch);
	}

	public void cow_hurt(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.COW_HURT, volume, pitch);
	}

	public static void cow_moo(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.COW_IDLE, volume, pitch);
	}

	public void cow_walk(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.COW_WALK, volume, pitch);
	}

	public void creeper_hiss(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CREEPER_HISS, volume, pitch);
	}

	public void creeper_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CREEPER_DEATH, volume, pitch);
	}

	public void enderdragon_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ENDERDRAGON_DEATH, volume, pitch);
	}

	public void enderdragon_growl(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ENDERDRAGON_GROWL, volume, pitch);
	}

	public void enderdragon_hit(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ENDERDRAGON_HIT, volume, pitch);
	}

	public void enderdragon_wings(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, volume, pitch);
	}

	public void endermen_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ENDERMAN_DEATH, volume, pitch);
	}

	public void endermen_hit(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ENDERMAN_HIT, volume, pitch);
	}

	public void endermen_idle(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ENDERMAN_IDLE, volume, pitch);
	}

	public void endermen_scream(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ENDERMAN_SCREAM, volume, pitch);
	}

	public void irongolem_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.IRONGOLEM_DEATH, volume, pitch);
	}

	public void irongolem_hit(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.IRONGOLEM_HIT, volume, pitch);
	}

	public void irongolem_throw(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.IRONGOLEM_THROW, volume, pitch);
	}

	public void slime_attack(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.SLIME_ATTACK, volume, pitch);
	}

	public void slime_walk(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.SLIME_WALK, volume, pitch);
	}

	public void pig_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.PIG_DEATH, volume, pitch);
	}

	public void pig_oink(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.PIG_IDLE, volume, pitch);
	}

	public void pig_walk(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.PIG_WALK, volume, pitch);
	}

	public void sheep_walk(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.SHEEP_WALK, volume, pitch);
	}

	public void sheep_baa(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.SHEEP_IDLE, volume, pitch);
	}

	public void skeleton_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.SKELETON_DEATH, volume, pitch);
	}

	public void skeleton_hurt(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.SKELETON_HURT, volume, pitch);
	}

	public void skeleton_walk(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.SKELETON_WALK, volume, pitch);
	}

	public void spider_say(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.SPIDER_IDLE, volume, pitch);
	}

	public void spider_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.SPIDER_DEATH, volume, pitch);
	}

	public void villager_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.VILLAGER_DEATH, volume, pitch);
	}

	public void villager_haggle(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.VILLAGER_HAGGLE, volume, pitch);
	}

	public void villager_hit(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.VILLAGER_HIT, volume, pitch);
	}

	public void villager_hhhh(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.VILLAGER_IDLE, volume, pitch);
	}

	public void villager_no(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.VILLAGER_NO, volume, pitch);
	}

	public void villager_yes(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.VILLAGER_YES, volume, pitch);
	}

	public void wither_shoot(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WITHER_SHOOT, volume, pitch);
	}

	public void wither_spawn(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WITHER_SPAWN, volume, pitch);
	}

	public void wither_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WITHER_DEATH, volume, pitch);
	}

	public void wither_idle(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WITHER_IDLE, volume, pitch);
	}

	public void wither_hurt(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WITHER_HURT, volume, pitch);
	}

	public void wolf_bark(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WOLF_BARK, volume, pitch);
	}

	public void wolf_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WOLF_DEATH, volume, pitch);
	}

	public void wolf_growl(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WOLF_GROWL, volume, pitch);
	}

	public void wolf_howl(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WOLF_HOWL, volume, pitch);
	}

	public void wolf_hurt(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WOLF_HURT, volume, pitch);
	}

	public void wolf_pant(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WOLF_PANT, volume, pitch);
	}

	public void wolf_shake(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WOLF_SHAKE, volume, pitch);
	}

	public void wolf_walk(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WOLF_WALK, volume, pitch);
	}

	public void wolf_cry(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WOLF_WHINE, volume, pitch);
	}

	public void zombie_death(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ZOMBIE_DEATH, volume, pitch);
	}

	public void zombie_hurt(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ZOMBIE_HURT, volume, pitch);
	}

	public void zombie_grown(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ZOMBIE_IDLE, volume, pitch);
	}

	public void zombie_infect(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ZOMBIE_INFECT, volume, pitch);
	}

	public void zombie_metal_door(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ZOMBIE_METAL, volume, pitch);
	}

	public void zombie_door(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ZOMBIE_WOODBREAK, volume, pitch);
	}

	public void zombie_remedy(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ZOMBIE_REMEDY, volume, pitch);
	}

	public void zombie_revive(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ZOMBIE_UNFECT, volume, pitch);
	}

	public void zombie_wood(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ZOMBIE_WOOD, volume, pitch);
	}

	public void anvil_break(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ANVIL_BREAK, volume, pitch);
	}

	public void anvil_use(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ANVIL_USE, volume, pitch);
	}

	public void anvil_drop(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ANVIL_LAND, volume, pitch);
	}

	public void item_break(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ITEM_BREAK, volume, pitch);
	}

	public void arrow_hit(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ARROW_HIT, volume, pitch);
	}

	public void burp(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.BURP, volume, pitch);
	}

	public void chest_close(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CHEST_CLOSE, volume, pitch);
	}

	public void chest_open(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CHEST_OPEN, volume, pitch);
	}

	public void click(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.CLICK, volume, pitch);
	}

	public void door_open(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.DOOR_OPEN, volume, pitch);
	}

	public void door_close(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.DOOR_CLOSE, volume, pitch);
	}

	public void drink(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.DRINK, volume, pitch);
	}

	public void eat(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.EAT, volume, pitch);
	}

	public void explode(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.EXPLODE, volume, pitch);
	}

	public void fizz(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.FIZZ, volume, pitch);
	}

	public void fuse(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.FUSE, volume, pitch);
	}

	public void glass(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.GLASS, volume, pitch);
	}

	public void level_up(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.LEVEL_UP, volume, pitch);
	}

	public void orb(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.ORB_PICKUP, volume, pitch);
	}

	public void successful_hit(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, volume, pitch);
	}

	public void wood_click(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.WOOD_CLICK, volume, pitch);
	}

	public void step_gravel(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.STEP_GRAVEL, volume, pitch);
	}

	public void step_grass(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.STEP_GRASS, volume, pitch);
	}

	public void step_ladder(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.STEP_LADDER, volume, pitch);
	}

	public void step_sand(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.STEP_SAND, volume, pitch);
	}

	public void step_snow(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.STEP_SNOW, volume, pitch);
	}

	public void step_stone(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.STEP_STONE, volume, pitch);
	}

	public void step_wood(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.STEP_WOOD, volume, pitch);
	}

	public void step_wool(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.STEP_WOOL, volume, pitch);
	}

	public void piston_out(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.PISTON_EXTEND, volume, pitch);
	}

	public void piston_in(final Location l, World w, final int volume, final int pitch, final Player p)
	{
		p.getWorld().playSound(p.getLocation(), Sound.PISTON_RETRACT, volume, pitch);
	}
}
