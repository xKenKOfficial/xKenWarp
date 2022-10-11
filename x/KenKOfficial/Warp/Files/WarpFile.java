package x.KenKOfficial.Warp.Files;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.IOException;
import org.bukkit.Bukkit;
import java.io.File;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class WarpFile
{
    /* synthetic */ FileConfiguration data;
    private static final /* synthetic */ String[] l;
    static /* synthetic */ WarpFile instance;
    private static final /* synthetic */ int[] Il;
    public static /* synthetic */ File rfile;
    
    public void setup(final Plugin llIIlllllllllll) {
        if (Ill(llIIlllllllllll.getDataFolder().exists() ? 1 : 0)) {
            llIIlllllllllll.getDataFolder().mkdir();
            "".length();
        }
        final File lIlIlllllllllll = new File(String.valueOf(new StringBuilder().append(llIIlllllllllll.getDataFolder()).append(File.separator).append(WarpFile.l[WarpFile.Il[0]])));
        WarpFile.rfile = new File(lIlIlllllllllll, String.valueOf(String.valueOf(new StringBuilder().append(String.valueOf(File.separatorChar)).append(WarpFile.l[WarpFile.Il[1]]))));
        if (Ill(WarpFile.rfile.exists() ? 1 : 0)) {
            try {
                lIlIlllllllllll.mkdirs();
                "".length();
                WarpFile.rfile.createNewFile();
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (IOException IIIllllllllllll) {
                Bukkit.getServer().getLogger().severe(WarpFile.l[WarpFile.Il[2]]);
            }
        }
        this.data = (FileConfiguration)YamlConfiguration.loadConfiguration(WarpFile.rfile);
    }
    
    public static WarpFile getInstance() {
        return WarpFile.instance;
    }
    
    public FileConfiguration getFile() {
        return this.data;
    }
    
    private static boolean lll(final int lIllllIllllllll, final int IIllllIllllllll) {
        return lIllllIllllllll < IIllllIllllllll;
    }
    
    public void saveData() {
        try {
            this.data.save(WarpFile.rfile);
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        catch (IOException llIlIllllllllll) {
            Bukkit.getServer().getLogger().severe(WarpFile.l[WarpFile.Il[3]]);
        }
    }
    
    private static boolean Ill(final int IlIlllIllllllll) {
        return IlIlllIllllllll == 0;
    }
    
    public void reloadData() {
        this.data = (FileConfiguration)YamlConfiguration.loadConfiguration(WarpFile.rfile);
    }
    
    private static String ll(String lIlIlIlllllllll, final String lIIllIlllllllll) {
        lIlIlIlllllllll = (long)new String(Base64.getDecoder().decode(((String)lIlIlIlllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIllIlllllllll = new StringBuilder();
        final char[] lllIlIlllllllll = lIIllIlllllllll.toCharArray();
        int IllIlIlllllllll = WarpFile.Il[0];
        final float IIIIlIlllllllll = (Object)((String)lIlIlIlllllllll).toCharArray();
        final byte llllIIlllllllll = (byte)IIIIlIlllllllll.length;
        boolean IlllIIlllllllll = WarpFile.Il[0] != 0;
        while (lll(IlllIIlllllllll ? 1 : 0, llllIIlllllllll)) {
            final char llIllIlllllllll = IIIIlIlllllllll[IlllIIlllllllll];
            IIIllIlllllllll.append((char)(llIllIlllllllll ^ lllIlIlllllllll[IllIlIlllllllll % lllIlIlllllllll.length]));
            "".length();
            ++IllIlIlllllllll;
            ++IlllIIlllllllll;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(IIIllIlllllllll);
    }
    
    private static void lIl() {
        (Il = new int[5])[0] = ((0xD ^ 0x1F) & ~(0x41 ^ 0x53));
        WarpFile.Il[1] = " ".length();
        WarpFile.Il[2] = "  ".length();
        WarpFile.Il[3] = "   ".length();
        WarpFile.Il[4] = (0x6B ^ 0x6F);
    }
    
    static {
        lIl();
        IIl();
        WarpFile.instance = new WarpFile();
    }
    
    private static void IIl() {
        (l = new String[WarpFile.Il[4]])[WarpFile.Il[0]] = l("wleSTHK5XtQ=", "mFrJJ");
        WarpFile.l[WarpFile.Il[1]] = l("WfAPVBnWKDvQ9vYFwHwb2Q==", "qyCaI");
        WarpFile.l[WarpFile.Il[2]] = l("5KOPDpGWkWe8v9T49tj5nuVDDVSY0XnlRkT7DfYSo5iEDV7V9Xo5uQ==", "AyySE");
        WarpFile.l[WarpFile.Il[3]] = ll("JwQJVjINDAAZZxoECVY9CB0FBSYKTRwaLgIYTAEmGx0fWD4EAQ==", "imlvG");
    }
    
    private static String l(final String llIIIIlllllllll, final String IlIIIIlllllllll) {
        try {
            final SecretKeySpec IIIlIIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIIIIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllIIIlllllllll = Cipher.getInstance("Blowfish");
            lllIIIlllllllll.init(WarpFile.Il[2], IIIlIIlllllllll);
            return new String(lllIIIlllllllll.doFinal(Base64.getDecoder().decode(llIIIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIIIlllllllll) {
            IllIIIlllllllll.printStackTrace();
            return null;
        }
    }
}
