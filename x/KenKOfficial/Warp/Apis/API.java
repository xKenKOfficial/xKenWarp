package x.KenKOfficial.Warp.Apis;

import java.util.Arrays;
import java.util.List;
import x.KenKOfficial.Warp.Utils.ChatUtil;
import org.bukkit.entity.Player;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import x.KenKOfficial.Warp.Basic.Main;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import x.KenKOfficial.Warp.Files.WarpFile;

public class API
{
    private static final /* synthetic */ String[] IIIIl;
    private static /* synthetic */ WarpFile warpFile;
    public static final /* synthetic */ String PREFIX;
    private static final /* synthetic */ String SUCCESS_REMOVE_WARP;
    private static final /* synthetic */ int[] lIIIl;
    private static final /* synthetic */ String ERROR_REMOVE_WARP;
    private static final /* synthetic */ String ERROR_SETWARP;
    private static final /* synthetic */ String SUCCESS_SETWARP;
    
    private static void IIIIIIl() {
        (IIIIl = new String[API.lIIIl[32]])[API.lIIIl[0]] = lIllll("OycTAwNi", "LFasp");
        API.IIIIl[API.lIIIl[1]] = Illlll("M3F6GxoassI=", "ZvXSI");
        API.IIIIl[API.lIIIl[2]] = lIllll("TAg=", "bpfTJ");
        API.IIIIl[API.lIIIl[3]] = llllll("c8uyHRp9Etk=", "UoMOq");
        API.IIIIl[API.lIIIl[4]] = Illlll("nh37r09WehA=", "Ktfmy");
        API.IIIIl[API.lIIIl[5]] = lIllll("OicDHgJj", "MFqnq");
        API.IIIIl[API.lIIIl[6]] = Illlll("gWHpQYoK57o=", "MiWOC");
        API.IIIIl[API.lIIIl[7]] = lIllll("IjYCHzB7", "UWpoC");
        API.IIIIl[API.lIIIl[8]] = llllll("PAQsmCfVDhM=", "GdawK");
        API.IIIIl[API.lIIIl[9]] = lIllll("JzQfATR+", "PUmqG");
        API.IIIIl[API.lIIIl[10]] = Illlll("GmL5nSydRsw=", "VvmBg");
        API.IIIIl[API.lIIIl[11]] = Illlll("mZorP0vZSYg=", "fBVQs");
        API.IIIIl[API.lIIIl[12]] = llllll("Fhr25roTe+w=", "iVosM");
        API.IIIIl[API.lIIIl[13]] = Illlll("HlK+de1Iv4KNNF2GfopGJQ==", "jEbKU");
        API.IIIIl[API.lIIIl[14]] = lIllll("MCcCGgcYKhkZAA==", "GFpjt");
        API.IIIIl[API.lIIIl[15]] = lIllll("WQ==", "yWuqK");
        API.IIIIl[API.lIIIl[16]] = llllll("f6dCstxHgF/ifNul1LK/GQ==", "EKMQM");
        API.IIIIl[API.lIIIl[17]] = llllll("RoZ088wMQ5M=", "TSOdt");
        API.IIIIl[API.lIIIl[18]] = llllll("DNXenoByAYI=", "jgzCx");
        API.IIIIl[API.lIIIl[19]] = llllll("WOXs96OfKhA=", "jILsQ");
        API.IIIIl[API.lIIIl[20]] = Illlll("m5PJwX4hArw=", "JNTVj");
        API.IIIIl[API.lIIIl[21]] = Illlll("7WEyeqLKDopR8eH+J9SoMQ==", "mKYFF");
        API.IIIIl[API.lIIIl[22]] = llllll("hIUJ5Ca20O8RbJ1Z8iH1pA==", "XkLQS");
        API.IIIIl[API.lIIIl[23]] = Illlll("VoQzm0yLowg=", "dWVHJ");
        API.IIIIl[API.lIIIl[24]] = lIllll("DQMZKiQpGhk1MQs=", "vMXga");
        API.IIIIl[API.lIIIl[25]] = Illlll("z8MP33WxKRA=", "bXErM");
        API.IIIIl[API.lIIIl[26]] = llllll("tYCk3x2Jqdv1N0cAfrU4Bg==", "mbfYT");
        API.IIIIl[API.lIIIl[27]] = Illlll("kjmyjrMY9fFih2t+KPDtSA==", "WNtuw");
        API.IIIIl[API.lIIIl[28]] = Illlll("eWufmAe71/psqw2YvwRLOqSYaK4squuO", "NfXDD");
        API.IIIIl[API.lIIIl[29]] = lIllll("HAISOSUdFzkgKxs4BTwhDhMDETMOFRY=", "ogfND");
        API.IIIIl[API.lIIIl[30]] = llllll("9AHd1xo2qAvqTpWLrhE96af/BRglshB+", "FpORj");
        API.IIIIl[API.lIIIl[31]] = llllll("HAKHzCD4zFbR9mP69fnIq4LDy7+VwAbm", "OTHbC");
    }
    
    private static String lIllll(String IlIIIllIlIlllll, final String lIIIIllIlIlllll) {
        IlIIIllIlIlllll = (double)new String(Base64.getDecoder().decode(((String)IlIIIllIlIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIlIIllIlIlllll = new StringBuilder();
        final char[] IIlIIllIlIlllll = lIIIIllIlIlllll.toCharArray();
        int llIIIllIlIlllll = API.lIIIl[0];
        final float lIlllIlIlIlllll = (Object)((String)IlIIIllIlIlllll).toCharArray();
        final double IIlllIlIlIlllll = lIlllIlIlIlllll.length;
        byte llIllIlIlIlllll = (byte)API.lIIIl[0];
        while (llIIIIl(llIllIlIlIlllll, (int)IIlllIlIlIlllll)) {
            final char IIIlIllIlIlllll = lIlllIlIlIlllll[llIllIlIlIlllll];
            lIlIIllIlIlllll.append((char)(IIIlIllIlIlllll ^ IIlIIllIlIlllll[llIIIllIlIlllll % IIlIIllIlIlllll.length]));
            "".length();
            ++llIIIllIlIlllll;
            ++llIllIlIlIlllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lIlIIllIlIlllll);
    }
    
    static {
        lIIIIIl();
        IIIIIIl();
        PREFIX = Main.getPlugin().getConfig().getString(API.IIIIl[API.lIIIl[25]]);
        NO_PERM = Main.getPlugin().getConfig().getString(API.IIIIl[API.lIIIl[26]]);
        WRONG_ARGS = Main.getPlugin().getConfig().getString(API.IIIIl[API.lIIIl[27]]);
        SUCCESS_SETWARP = Main.getPlugin().getConfig().getString(API.IIIIl[API.lIIIl[28]]);
        ERROR_SETWARP = Main.getPlugin().getConfig().getString(API.IIIIl[API.lIIIl[29]]);
        SUCCESS_REMOVE_WARP = Main.getPlugin().getConfig().getString(API.IIIIl[API.lIIIl[30]]);
        ERROR_REMOVE_WARP = Main.getPlugin().getConfig().getString(API.IIIIl[API.lIIIl[31]]);
        API.warpFile = WarpFile.getInstance();
    }
    
    private static void lIIIIIl() {
        (lIIIl = new int[33])[0] = ((97 + 29 - 9 + 24 ^ 12 + 70 - 18 + 69) & (0xC ^ 0x77 ^ (0xD ^ 0x7E) ^ -" ".length()));
        API.lIIIl[1] = " ".length();
        API.lIIIl[2] = "  ".length();
        API.lIIIl[3] = "   ".length();
        API.lIIIl[4] = (0xA5 ^ 0x94 ^ (0xE ^ 0x3B));
        API.lIIIl[5] = (0x64 ^ 0x61);
        API.lIIIl[6] = (0xC0 ^ 0xC6);
        API.lIIIl[7] = (44 + 160 - 96 + 89 ^ 120 + 65 - 31 + 40);
        API.lIIIl[8] = (0x0 ^ 0x9 ^ " ".length());
        API.lIIIl[9] = (0x28 ^ 0x21);
        API.lIIIl[10] = (0x4D ^ 0x47);
        API.lIIIl[11] = (0xC ^ 0xA ^ (0x85 ^ 0x88));
        API.lIIIl[12] = (0x5E ^ 0x52);
        API.lIIIl[13] = (157 + 28 - 51 + 28 ^ 18 + 25 + 76 + 56);
        API.lIIIl[14] = (104 + 75 - 107 + 96 ^ 47 + 52 + 8 + 59);
        API.lIIIl[15] = (0x4C ^ 0x43);
        API.lIIIl[16] = (0x31 ^ 0x21);
        API.lIIIl[17] = (0x3A ^ 0x2B);
        API.lIIIl[18] = (0x1D ^ 0xF);
        API.lIIIl[19] = (0x8E ^ 0x9D);
        API.lIIIl[20] = (136 + 13 - 93 + 121 ^ 67 + 5 + 61 + 32);
        API.lIIIl[21] = (0x49 ^ 0x28 ^ (0xF5 ^ 0x81));
        API.lIIIl[22] = (0x72 ^ 0x13 ^ (0xB0 ^ 0xC7));
        API.lIIIl[23] = (0xAB ^ 0xC7 ^ (0x45 ^ 0x3E));
        API.lIIIl[24] = (0x8D ^ 0x95);
        API.lIIIl[25] = (151 + 135 - 257 + 188 ^ 123 + 50 + 16 + 3);
        API.lIIIl[26] = (0x6B ^ 0x71);
        API.lIIIl[27] = (0x9D ^ 0x86);
        API.lIIIl[28] = (0x93 ^ 0x88 ^ (0x14 ^ 0x13));
        API.lIIIl[29] = (0x7F ^ 0x62);
        API.lIIIl[30] = (0x21 ^ 0x3F);
        API.lIIIl[31] = (0x3E ^ 0x5C ^ (0x47 ^ 0x3A));
        API.lIIIl[32] = (0x9F ^ 0xBF);
    }
    
    private static String llllll(final String IIIIlIlIlIlllll, final String lIIIlIlIlIlllll) {
        try {
            final SecretKeySpec lIlIlIlIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIlIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIlIlIlIlIlllll = Cipher.getInstance("Blowfish");
            IIlIlIlIlIlllll.init(API.lIIIl[2], lIlIlIlIlIlllll);
            return new String(IIlIlIlIlIlllll.doFinal(Base64.getDecoder().decode(IIIIlIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIlIlIlllll) {
            llIIlIlIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IlIIIIl(final Object IlIlllIIlIlllll) {
        return IlIlllIIlIlllll == null;
    }
    
    public static void setWarp(final Player llIIIIIllIlllll, final String IlIIIIIllIlllll) {
        final double lIIlIIIllIlllll = llIIIIIllIlllll.getLocation().getX();
        final double IIIlIIIllIlllll = llIIIIIllIlllll.getLocation().getY();
        final double lllIIIIllIlllll = llIIIIIllIlllll.getLocation().getZ();
        final float IllIIIIllIlllll = llIIIIIllIlllll.getLocation().getYaw();
        final float lIlIIIIllIlllll = llIIIIIllIlllll.getLocation().getPitch();
        final String IIlIIIIllIlllll = llIIIIIllIlllll.getWorld().getName();
        if (!IlIIIIl(getDataFolder().getFile().getString(String.valueOf(new StringBuilder().append(API.IIIIl[API.lIIIl[0]]).append(IlIIIIIllIlllll))))) {
            llIIIIIllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(API.IIIIl[API.lIIIl[17]]).append(API.ERROR_SETWARP))));
            return;
        }
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.IIIIl[API.lIIIl[1]]).append(IlIIIIIllIlllll).append(API.IIIIl[API.lIIIl[2]])), (Object)lIIlIIIllIlllll);
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.IIIIl[API.lIIIl[3]]).append(IlIIIIIllIlllll).append(API.IIIIl[API.lIIIl[4]])), (Object)IIIlIIIllIlllll);
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.IIIIl[API.lIIIl[5]]).append(IlIIIIIllIlllll).append(API.IIIIl[API.lIIIl[6]])), (Object)lllIIIIllIlllll);
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.IIIIl[API.lIIIl[7]]).append(IlIIIIIllIlllll).append(API.IIIIl[API.lIIIl[8]])), (Object)IllIIIIllIlllll);
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.IIIIl[API.lIIIl[9]]).append(IlIIIIIllIlllll).append(API.IIIIl[API.lIIIl[10]])), (Object)lIlIIIIllIlllll);
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.IIIIl[API.lIIIl[11]]).append(IlIIIIIllIlllll).append(API.IIIIl[API.lIIIl[12]])), (Object)IIlIIIIllIlllll);
        final List<String> IIllIIIllIlllll = (List<String>)getDataFolder().getFile().getStringList(API.IIIIl[API.lIIIl[13]]);
        IIllIIIllIlllll.add(IlIIIIIllIlllll);
        "".length();
        getDataFolder().getFile().set(API.IIIIl[API.lIIIl[14]], (Object)IIllIIIllIlllll);
        getDataFolder().saveData();
        llIIIIIllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(API.IIIIl[API.lIIIl[15]]).append(API.SUCCESS_SETWARP.replace(API.IIIIl[API.lIIIl[16]], IlIIIIIllIlllll)))));
        "".length();
        if (null != null) {
            return;
        }
    }
    
    public static void delWarp(final Player IllIlllIlIlllll, final String llIIlllIlIlllll) {
        if (IlIIIIl(getDataFolder().getFile().getString(String.valueOf(new StringBuilder().append(API.IIIIl[API.lIIIl[18]]).append(llIIlllIlIlllll))))) {
            IllIlllIlIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(API.IIIIl[API.lIIIl[19]]).append(API.ERROR_REMOVE_WARP))));
            return;
        }
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.IIIIl[API.lIIIl[20]]).append(llIIlllIlIlllll)), (Object)null);
        final List<String> lllIlllIlIlllll = (List<String>)getDataFolder().getFile().getStringList(API.IIIIl[API.lIIIl[21]]);
        lllIlllIlIlllll.remove(llIIlllIlIlllll);
        "".length();
        getDataFolder().getFile().set(API.IIIIl[API.lIIIl[22]], (Object)lllIlllIlIlllll);
        getDataFolder().saveData();
        IllIlllIlIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(API.IIIIl[API.lIIIl[23]]).append(API.SUCCESS_REMOVE_WARP.replace(API.IIIIl[API.lIIIl[24]], llIIlllIlIlllll)))));
    }
    
    public static WarpFile getDataFolder() {
        return API.warpFile;
    }
    
    private static boolean llIIIIl(final int lIllllIIlIlllll, final int IIllllIIlIlllll) {
        return lIllllIIlIlllll < IIllllIIlIlllll;
    }
    
    private static String Illlll(final String llIIIIlIlIlllll, final String IIlIIIlIlIlllll) {
        try {
            final SecretKeySpec IIIlIIlIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlIIIlIlIlllll.getBytes(StandardCharsets.UTF_8)), API.lIIIl[8]), "DES");
            final Cipher lllIIIlIlIlllll = Cipher.getInstance("DES");
            lllIIIlIlIlllll.init(API.lIIIl[2], IIIlIIlIlIlllll);
            return new String(lllIIIlIlIlllll.doFinal(Base64.getDecoder().decode(llIIIIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIIIlIlIlllll) {
            IllIIIlIlIlllll.printStackTrace();
            return null;
        }
    }
}
