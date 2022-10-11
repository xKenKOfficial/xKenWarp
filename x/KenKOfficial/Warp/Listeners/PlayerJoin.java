package x.KenKOfficial.Warp.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import x.KenKOfficial.Warp.Utils.ChatUtil;
import x.KenKOfficial.Warp.Basic.Main;
import org.bukkit.event.player.PlayerJoinEvent;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.bukkit.event.Listener;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ int[] lIll;
    private static final /* synthetic */ String[] IIll;
    
    private static String lIIIll(final String IIlIlIIIIllllll, final String llIIlIIIIllllll) {
        try {
            final SecretKeySpec lIIllIIIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIIIllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.lIll[8]), "DES");
            final Cipher IIIllIIIIllllll = Cipher.getInstance("DES");
            IIIllIIIIllllll.init(PlayerJoin.lIll[2], lIIllIIIIllllll);
            return new String(IIIllIIIIllllll.doFinal(Base64.getDecoder().decode(IIlIlIIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIIIllllll) {
            lllIlIIIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIll(final int lIIlIllllIlllll, final int IIIlIllllIlllll) {
        return lIIlIllllIlllll < IIIlIllllIlllll;
    }
    
    private static boolean IIlIll(final int IllIIllllIlllll) {
        return IllIIllllIlllll != 0;
    }
    
    private static String llllIl(String lIIIIIIIIllllll, final String lIlIIIIIIllllll) {
        lIIIIIIIIllllll = (float)new String(Base64.getDecoder().decode(((String)lIIIIIIIIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIlIIIIIIllllll = new StringBuilder();
        final char[] llIIIIIIIllllll = lIlIIIIIIllllll.toCharArray();
        int IlIIIIIIIllllll = PlayerJoin.lIll[0];
        final boolean IIlllllllIlllll = (Object)((String)lIIIIIIIIllllll).toCharArray();
        final short llIllllllIlllll = (short)IIlllllllIlllll.length;
        int IlIllllllIlllll = PlayerJoin.lIll[0];
        while (lIlIll(IlIllllllIlllll, llIllllllIlllll)) {
            final char lllIIIIIIllllll = IIlllllllIlllll[IlIllllllIlllll];
            IIlIIIIIIllllll.append((char)(lllIIIIIIllllll ^ llIIIIIIIllllll[IlIIIIIIIllllll % llIIIIIIIllllll.length]));
            "".length();
            ++IlIIIIIIIllllll;
            ++IlIllllllIlllll;
            "".length();
            if (((0xA4 ^ 0xAE ^ (0xE ^ 0x25)) & (0x12 ^ 0x64 ^ (0x62 ^ 0x35) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(IIlIIIIIIllllll);
    }
    
    static {
        llIIll();
        IlIIll();
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent lllllIIIIllllll) {
        final Player IIIIIlIIIllllll = lllllIIIIllllll.getPlayer();
        if (IIlIll(Main.getPlugin().getConfig().getBoolean(PlayerJoin.IIll[PlayerJoin.lIll[0]]) ? 1 : 0) && IIlIll(IIIIIlIIIllllll.hasPermission(PlayerJoin.IIll[PlayerJoin.lIll[1]]) ? 1 : 0)) {
            IIIIIlIIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.IIll[PlayerJoin.lIll[2]]).append(Main.getPlugin().getName()).append(PlayerJoin.IIll[PlayerJoin.lIll[3]]))));
            IIIIIlIIIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIll[PlayerJoin.lIll[4]]));
            IIIIIlIIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.IIll[PlayerJoin.lIll[5]]).append(Main.getPlugin().getName()))));
            IIIIIlIIIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIll[PlayerJoin.lIll[6]]));
            IIIIIlIIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.IIll[PlayerJoin.lIll[7]]).append(Main.getPlugin().getDescription().getVersion()))));
            IIIIIlIIIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIll[PlayerJoin.lIll[8]]));
            IIIIIlIIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.IIll[PlayerJoin.lIll[9]]).append(Bukkit.getBukkitVersion()))));
            IIIIIlIIIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIll[PlayerJoin.lIll[10]]));
            IIIIIlIIIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIll[PlayerJoin.lIll[11]]));
            IIIIIlIIIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIll[PlayerJoin.lIll[12]]));
            IIIIIlIIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.IIll[PlayerJoin.lIll[13]]).append(Main.getPlugin().getName()).append(PlayerJoin.IIll[PlayerJoin.lIll[14]]))));
        }
    }
    
    private static void IlIIll() {
        (IIll = new String[PlayerJoin.lIll[15]])[PlayerJoin.lIll[0]] = llllIl("BigmCiwYGzoDIxk=", "vDSmE");
        PlayerJoin.IIll[PlayerJoin.lIll[1]] = IIIIll("Djsc0bQZyvdhsQ9aEbWeQGF8wRWXbVck", "vZugA");
        PlayerJoin.IIll[PlayerJoin.lIll[2]] = lIIIll("ItVskycXxQCcs/btcISGxVmdIsnXsRzLENs301zEn8s=", "vtjEX");
        PlayerJoin.IIll[PlayerJoin.lIll[3]] = lIIIll("vAoUiO7rDG1o5q2Ms06lZEz1Vrp186zt", "Bwtkn");
        PlayerJoin.IIll[PlayerJoin.lIll[4]] = IIIIll("tNk9DY9NHK0=", "ZMSeB");
        PlayerJoin.IIll[PlayerJoin.lIll[5]] = llllIl("cVBGGwAkERglSmlMUW0O", "QvqKl");
        PlayerJoin.IIll[PlayerJoin.lIll[6]] = llllIl("aA==", "HASjR");
        PlayerJoin.IIll[PlayerJoin.lIll[7]] = IIIIll("kllawDXbmiN57m1D3ZmtvA==", "yehVe");
        PlayerJoin.IIll[PlayerJoin.lIll[8]] = lIIIll("6BH8kOsx/AQ=", "mGeCs");
        PlayerJoin.IIll[PlayerJoin.lIll[9]] = lIIIll("2dtHSWhp/ULB2Msism9fG55+Xlv5XT/Xxy+XAwJ5vJg=", "sdYXn");
        PlayerJoin.IIll[PlayerJoin.lIll[10]] = llllIl("dg==", "VQING");
        PlayerJoin.IIll[PlayerJoin.lIll[11]] = llllIl("ZFRyGjEwEzE7KyVSBD42MRMpPDglES80ZHxIZXMgdUNrZHJqQHVncDZcZTItIAhrdXN0SHBj", "DrEUB");
        PlayerJoin.IIll[PlayerJoin.lIll[12]] = llllIl("Tw==", "oCxMS");
        PlayerJoin.IIll[PlayerJoin.lIll[13]] = IIIIll("vVlQfHVYW9HWHR3+xGhs8dRBQ/NbPdJEfKRC8o/AkNA=", "STcmO");
        PlayerJoin.IIll[PlayerJoin.lIll[14]] = lIIIll("/NAcXvd/X3TCxTI+j03Xzd+LHagJ2JFg", "tbllW");
    }
    
    private static String IIIIll(final String lIIIlllllIlllll, final String IlllIllllIlllll) {
        try {
            final SecretKeySpec IIlIlllllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlllIllllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIIlllllIlllll = Cipher.getInstance("Blowfish");
            llIIlllllIlllll.init(PlayerJoin.lIll[2], IIlIlllllIlllll);
            return new String(llIIlllllIlllll.doFinal(Base64.getDecoder().decode(lIIIlllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIlllllIlllll) {
            IlIIlllllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void llIIll() {
        (lIll = new int[16])[0] = ((0x39 ^ 0x6) & ~(0x39 ^ 0x6));
        PlayerJoin.lIll[1] = " ".length();
        PlayerJoin.lIll[2] = "  ".length();
        PlayerJoin.lIll[3] = "   ".length();
        PlayerJoin.lIll[4] = (0x88 ^ 0xC4 ^ (0x37 ^ 0x7F));
        PlayerJoin.lIll[5] = (0x2C ^ 0x29);
        PlayerJoin.lIll[6] = (83 + 111 - 164 + 113 ^ 47 + 4 - 5 + 91);
        PlayerJoin.lIll[7] = (0x1C ^ 0x15 ^ (0xAF ^ 0xA1));
        PlayerJoin.lIll[8] = (0x2A ^ 0x22);
        PlayerJoin.lIll[9] = (0x50 ^ 0x59);
        PlayerJoin.lIll[10] = (36 + 69 - 1 + 61 ^ 110 + 66 - 156 + 155);
        PlayerJoin.lIll[11] = (0xD ^ 0x6);
        PlayerJoin.lIll[12] = (0x98 ^ 0x94);
        PlayerJoin.lIll[13] = (0x1 ^ 0xC);
        PlayerJoin.lIll[14] = (0x67 ^ 0x69);
        PlayerJoin.lIll[15] = (0x1E ^ 0x4F ^ (0x2B ^ 0x75));
    }
}
