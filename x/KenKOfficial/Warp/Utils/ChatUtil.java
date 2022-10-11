package x.KenKOfficial.Warp.Utils;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ChatUtil
{
    private static final /* synthetic */ String[] IIl;
    private static final /* synthetic */ int[] lIl;
    
    public static String fixColor(final String IIIlIllIlllllll) {
        return IIIlIllIlllllll.replaceAll(ChatUtil.IIl[ChatUtil.lIl[0]], ChatUtil.IIl[ChatUtil.lIl[1]]).replace(ChatUtil.IIl[ChatUtil.lIl[2]], ChatUtil.IIl[ChatUtil.lIl[3]]).replace(ChatUtil.IIl[ChatUtil.lIl[4]], ChatUtil.IIl[ChatUtil.lIl[5]]).replace(ChatUtil.IIl[ChatUtil.lIl[6]], ChatUtil.IIl[ChatUtil.lIl[7]]);
    }
    
    private static void IlIIl() {
        (IIl = new String[ChatUtil.lIl[8]])[ChatUtil.lIl[0]] = llll("2DdcM37Cy5c=", "ZOidA");
        ChatUtil.IIl[ChatUtil.lIl[1]] = IIIIl("w5c=", "pXlPW");
        ChatUtil.IIl[ChatUtil.lIl[2]] = IIIIl("Rlc=", "xiAPh");
        ChatUtil.IIl[ChatUtil.lIl[3]] = lIIIl("hag8Dw8hE14=", "AaNhG");
        ChatUtil.IIl[ChatUtil.lIl[4]] = IIIIl("fkY=", "BzfmD");
        ChatUtil.IIl[ChatUtil.lIl[5]] = IIIIl("w60=", "FXSAU");
        ChatUtil.IIl[ChatUtil.lIl[6]] = lIIIl("eh31SPIGALg=", "ahRhX");
        ChatUtil.IIl[ChatUtil.lIl[7]] = IIIIl("WQ==", "SPkzi");
    }
    
    private static void llIIl() {
        (lIl = new int[9])[0] = ((0x3C ^ 0x36) & ~(0x28 ^ 0x22));
        ChatUtil.lIl[1] = " ".length();
        ChatUtil.lIl[2] = "  ".length();
        ChatUtil.lIl[3] = "   ".length();
        ChatUtil.lIl[4] = (0x79 ^ 0x7D);
        ChatUtil.lIl[5] = (0xF ^ 0x75 ^ 87 + 45 - 58 + 53);
        ChatUtil.lIl[6] = (0x3 ^ 0x5);
        ChatUtil.lIl[7] = (0x36 ^ 0x31);
        ChatUtil.lIl[8] = (0x6D ^ 0x65);
    }
    
    private static String llll(final String IlIIlIlIlllllll, final String lIIIlIlIlllllll) {
        try {
            final SecretKeySpec lIlIlIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIlIlIlIlllllll = Cipher.getInstance("Blowfish");
            IIlIlIlIlllllll.init(ChatUtil.lIl[2], lIlIlIlIlllllll);
            return new String(IIlIlIlIlllllll.doFinal(Base64.getDecoder().decode(IlIIlIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIlIlllllll) {
            llIIlIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIlIl(final int IlIIllIIlllllll, final int lIIIllIIlllllll) {
        return IlIIllIIlllllll < lIIIllIIlllllll;
    }
    
    static {
        llIIl();
        IlIIl();
    }
    
    private static String lIIIl(final String lllllIlIlllllll, final String IIlllIlIlllllll) {
        try {
            final SecretKeySpec IlIIIllIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlllIlIlllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.lIl[8]), "DES");
            final Cipher lIIIIllIlllllll = Cipher.getInstance("DES");
            lIIIIllIlllllll.init(ChatUtil.lIl[2], IlIIIllIlllllll);
            return new String(lIIIIllIlllllll.doFinal(Base64.getDecoder().decode(lllllIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIllIlllllll) {
            IIIIIllIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String IIIIl(String lIllllIIlllllll, final String IIllllIIlllllll) {
        lIllllIIlllllll = new String(Base64.getDecoder().decode(lIllllIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIIIIlIlllllll = new StringBuilder();
        final char[] llllllIIlllllll = IIllllIIlllllll.toCharArray();
        int IlllllIIlllllll = ChatUtil.lIl[0];
        final short IIIlllIIlllllll = (Object)lIllllIIlllllll.toCharArray();
        final long lllIllIIlllllll = IIIlllIIlllllll.length;
        int IllIllIIlllllll = ChatUtil.lIl[0];
        while (IIlIl(IllIllIIlllllll, (int)lllIllIIlllllll)) {
            final char llIIIIlIlllllll = IIIlllIIlllllll[IllIllIIlllllll];
            IIIIIIlIlllllll.append((char)(llIIIIlIlllllll ^ llllllIIlllllll[IlllllIIlllllll % llllllIIlllllll.length]));
            "".length();
            ++IlllllIIlllllll;
            ++IllIllIIlllllll;
            "".length();
            if (-(0x5F ^ 0x5B) > 0) {
                return null;
            }
        }
        return String.valueOf(IIIIIIlIlllllll);
    }
}
