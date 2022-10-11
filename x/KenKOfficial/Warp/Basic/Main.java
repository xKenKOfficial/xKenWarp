package x.KenKOfficial.Warp.Basic;

import org.bukkit.plugin.Plugin;
import org.bukkit.event.Listener;
import x.KenKOfficial.Warp.Listeners.PlayerJoin;
import x.KenKOfficial.Warp.Apis.API;
import x.KenKOfficial.Warp.Commands.WarpCommand;
import x.KenKOfficial.Warp.Commands.SetwarpCommand;
import org.bukkit.command.CommandExecutor;
import x.KenKOfficial.Warp.Commands.DelwarpCommand;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.PrintStream;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ String[] Illl;
    private static /* synthetic */ Main plugin;
    private static final /* synthetic */ int[] llll;
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerCommands();
        this.registerListeners();
        this.registerFiles();
        System.out.println(Main.Illl[Main.llll[0]]);
        System.out.println(this.getName());
        System.out.println(String.valueOf(new StringBuilder().append(Main.Illl[Main.llll[1]]).append(this.getDescription().getVersion())));
        System.out.println(String.valueOf(new StringBuilder().append(Main.Illl[Main.llll[2]]).append(Bukkit.getBukkitVersion())));
        final PrintStream out = System.out;
        String s;
        if (llIlll(this.isEnabled() ? 1 : 0)) {
            s = Main.Illl[Main.llll[3]];
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            s = Main.Illl[Main.llll[4]];
        }
        out.println(s);
        System.out.println(Main.Illl[Main.llll[5]]);
        System.out.println(Main.Illl[Main.llll[6]]);
    }
    
    private static String lllIll(String lllIIlIllIlllll, final String IllIIlIllIlllll) {
        lllIIlIllIlllll = (char)new String(Base64.getDecoder().decode(((String)lllIIlIllIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIlIlIllIlllll = new StringBuilder();
        final char[] lIIlIlIllIlllll = IllIIlIllIlllll.toCharArray();
        int IIIlIlIllIlllll = Main.llll[0];
        final char IlIIIlIllIlllll = (Object)((String)lllIIlIllIlllll).toCharArray();
        final byte lIIIIlIllIlllll = (byte)IlIIIlIllIlllll.length;
        float IIIIIlIllIlllll = Main.llll[0];
        while (IIllll((int)IIIIIlIllIlllll, lIIIIlIllIlllll)) {
            final char lIllIlIllIlllll = IlIIIlIllIlllll[IIIIIlIllIlllll];
            IlIlIlIllIlllll.append((char)(lIllIlIllIlllll ^ lIIlIlIllIlllll[IIIlIlIllIlllll % lIIlIlIllIlllll.length]));
            "".length();
            ++IIIlIlIllIlllll;
            ++IIIIIlIllIlllll;
            "".length();
            if (((0x33 ^ 0x6F) & ~(0x55 ^ 0x9)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(IlIlIlIllIlllll);
    }
    
    private static String IIIlll(final String lIIlIIlllIlllll, final String IllIIIlllIlllll) {
        try {
            final SecretKeySpec IIllIIlllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIIIlllIlllll.getBytes(StandardCharsets.UTF_8)), Main.llll[8]), "DES");
            final Cipher llIlIIlllIlllll = Cipher.getInstance("DES");
            llIlIIlllIlllll.init(Main.llll[2], IIllIIlllIlllll);
            return new String(llIlIIlllIlllll.doFinal(Base64.getDecoder().decode(lIIlIIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIIlllIlllll) {
            IlIlIIlllIlllll.printStackTrace();
            return null;
        }
    }
    
    static {
        IlIlll();
        lIIlll();
    }
    
    private void registerCommands() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.Illl[Main.llll[14]]).append(this.getName())));
        this.getCommand(Main.Illl[Main.llll[15]]).setExecutor((CommandExecutor)new DelwarpCommand());
        this.getCommand(Main.Illl[Main.llll[16]]).setExecutor((CommandExecutor)new SetwarpCommand());
        this.getCommand(Main.Illl[Main.llll[17]]).setExecutor((CommandExecutor)new WarpCommand());
    }
    
    private static void IlIlll() {
        (llll = new int[22])[0] = ((0x6F ^ 0x5D) & ~(0x66 ^ 0x54));
        Main.llll[1] = " ".length();
        Main.llll[2] = "  ".length();
        Main.llll[3] = "   ".length();
        Main.llll[4] = (0x70 ^ 0x1E ^ (0xF1 ^ 0x9B));
        Main.llll[5] = (67 + 157 - 168 + 137 ^ 126 + 97 - 70 + 43);
        Main.llll[6] = (0x5D ^ 0x5B);
        Main.llll[7] = (0xAB ^ 0xAC);
        Main.llll[8] = (0xA7 ^ 0xAF);
        Main.llll[9] = (0x56 ^ 0x24 ^ (0xF ^ 0x74));
        Main.llll[10] = (0xA4 ^ 0xAE);
        Main.llll[11] = (0xD ^ 0x6);
        Main.llll[12] = (0xB4 ^ 0xB8);
        Main.llll[13] = (0x7A ^ 0x71 ^ (0x7A ^ 0x7C));
        Main.llll[14] = (18 + 36 - 1 + 127 ^ 159 + 84 - 233 + 176);
        Main.llll[15] = (0xBA ^ 0xB5);
        Main.llll[16] = (49 + 67 - 47 + 69 ^ 62 + 45 - 51 + 98);
        Main.llll[17] = (0x5F ^ 0x4E);
        Main.llll[18] = (0x10 ^ 0x2);
        Main.llll[19] = (0x8D ^ 0x80 ^ (0x28 ^ 0x36));
        Main.llll[20] = (0x1 ^ 0x7B ^ (0xF9 ^ 0x97));
        Main.llll[21] = (0x8C ^ 0x99);
    }
    
    private static String IllIll(final String IlIlllIllIlllll, final String lIIlllIllIlllll) {
        try {
            final SecretKeySpec llllllIllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlllIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlllllIllIlllll = Cipher.getInstance("Blowfish");
            IlllllIllIlllll.init(Main.llll[2], llllllIllIlllll);
            return new String(IlllllIllIlllll.doFinal(Base64.getDecoder().decode(IlIlllIllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllllIllIlllll) {
            lIllllIllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlll() {
        (Illl = new String[Main.llll[21]])[Main.llll[0]] = IllIll("XsZS8xATalhexlLzEBNqWF7GUvMQE2pYXsZS8xATalhexlLzEBNqWF7GUvMQE2pYXsZS8xATaljrhxEzrFD9gg==", "yjKTN");
        Main.Illl[Main.llll[1]] = IllIll("uQNM5W94+U4CMLoKYiudCA==", "AnCct");
        Main.Illl[Main.llll[2]] = lllIll("MgcUEAwEQiQWDQ4LEllG", "ebfcf");
        Main.Illl[Main.llll[3]] = IllIll("wqiqQtBr1z0Xu9PnYtXRnw==", "cadPR");
        Main.Illl[Main.llll[4]] = IIIlll("z4pI2dD7IzKhLcgiSa1VqQ==", "GlQlf");
        Main.Illl[Main.llll[5]] = IllIll("z70gn1vYje8/HW+vWePcKDdovdtSev0YNQXP/eh1zjwRNKh/Q9KgjPh/2WGN56X6pvCVOGgzwf15Egcm8feiAA==", "exJTp");
        Main.Illl[Main.llll[6]] = IllIll("D0kiX/tEoREPSSJf+0ShEQ9JIl/7RKERD0kiX/tEoREPSSJf+0ShEQ9JIl/7RKERD0kiX/tEoRFF8fwUNPxh7g==", "YiUQb");
        Main.Illl[Main.llll[7]] = IIIlll("nujhOwlCwTWe6OE7CULBNZ7o4TsJQsE1nujhOwlCwTWe6OE7CULBNZ7o4TsJQsE1nujhOwlCwTVw8tGud0d65w==", "bqStV");
        Main.Illl[Main.llll[8]] = IllIll("Tc52gSYH5Io89o8kxwkU/Q==", "IsDql");
        Main.Illl[Main.llll[9]] = IllIll("M/KSidguoizc2idSc/rNTQ==", "MYNbG");
        Main.Illl[Main.llll[10]] = IllIll("Ppf5v4ny60zZqyuZIjVSKA==", "RsIQZ");
        Main.Illl[Main.llll[11]] = IIIlll("OVnnGY58sN5LhkY7W2Wa7w==", "ixuVw");
        Main.Illl[Main.llll[12]] = IIIlll("0Q812LexW4w/+e7V7KBSw9kGH9g9MyCPn8pDKZBt2xDQ5h5+IAR0NefZkVEpeLGZX7tK0BQUjHaIKZQ0ufalxw==", "EOsSN");
        Main.Illl[Main.llll[13]] = lllIll("Qk17ZWtCTXtla0JNe2VrQk17ZWtCTXtla0JNe2VrQk17ZWtCTXtla0JNe2VrQk17ZWtCTXtla0JNe2U=", "anXFH");
        Main.Illl[Main.llll[14]] = IIIlll("Ew2Qu5qss5Pu3GkuMSNWBfulfUb2Qb9UlfFfdgB42Ww=", "YckiI");
        Main.Illl[Main.llll[15]] = IIIlll("YTTMd579bcc=", "jRTjV");
        Main.Illl[Main.llll[16]] = IllIll("6aHGG9wQu74=", "wrIyh");
        Main.Illl[Main.llll[17]] = lllIll("GCkHGw==", "oHukn");
        Main.Illl[Main.llll[18]] = IIIlll("SZFdI4VQMZAjwnmKCpxX4sUVqO0kAYRgBGs1KtWwwag=", "UvxzQ");
        Main.Illl[Main.llll[19]] = IIIlll("ObrLc3K8s9swDIouBiOkDspiYIZwZXrgm7G3KXxsYvYoF/raJAZK15uA+07CXJDV", "bQtKw");
        Main.Illl[Main.llll[20]] = lllIll("AAQfJj8jEg4hJT9FHyMlMQoYbyc1CwkmKy8XDiw1MAsWLCR6H08/IC8CBiE5YEU=", "ZeoOL");
    }
    
    private static boolean IIllll(final int IIlllIIllIlllll, final int llIllIIllIlllll) {
        return IIlllIIllIlllll < llIllIIllIlllll;
    }
    
    private void saveFiles() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.Illl[Main.llll[20]]).append(this.getName())));
        API.getDataFolder().saveData();
    }
    
    private void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.Illl[Main.llll[18]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        this.saveFiles();
        System.out.println(Main.Illl[Main.llll[7]]);
        System.out.println(this.getName());
        System.out.println(String.valueOf(new StringBuilder().append(Main.Illl[Main.llll[8]]).append(this.getDescription().getVersion())));
        System.out.println(String.valueOf(new StringBuilder().append(Main.Illl[Main.llll[9]]).append(Bukkit.getBukkitVersion())));
        final PrintStream out = System.out;
        String s;
        if (llIlll(this.isEnabled() ? 1 : 0)) {
            s = Main.Illl[Main.llll[10]];
            "".length();
            if (-(0x6A ^ 0x6E) >= 0) {
                return;
            }
        }
        else {
            s = Main.Illl[Main.llll[11]];
        }
        out.println(s);
        System.out.println(Main.Illl[Main.llll[12]]);
        System.out.println(Main.Illl[Main.llll[13]]);
    }
    
    private void registerFiles() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.Illl[Main.llll[19]]).append(this.getName())));
        API.getDataFolder().setup((Plugin)this);
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    private static boolean llIlll(final int lIIllIIllIlllll) {
        return lIIllIIllIlllll != 0;
    }
}
