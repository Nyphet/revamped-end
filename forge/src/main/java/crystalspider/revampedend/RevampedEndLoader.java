package crystalspider.revampedend;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

/**
 * Torch hit! mod loader.
 */
@Mod(RevampedEndLoader.MODID)
public class RevampedEndLoader {
  /**
   * ID of this mod.
   */
  public static final String MODID = "revampedend";

  /**
   * Network channel protocol version.
   */
  public static final String PROTOCOL_VERSION = "1.18-1.0";
  /**
   * {@link SimpleChannel} instance for compatibility client-server.
   */
  public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, "main"), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);

  public RevampedEndLoader() {
    // MinecraftForge.EVENT_BUS.register(new AttackEntityEventHandler());
  }
}