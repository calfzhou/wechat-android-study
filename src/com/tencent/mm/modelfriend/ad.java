package com.tencent.mm.modelfriend;

import com.tencent.mm.c.b.aa;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class ad extends aa
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[16];
    localae.dhI = new String[17];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "googleid";
    localae.iGy.put("googleid", "TEXT");
    localStringBuilder.append(" googleid TEXT");
    localStringBuilder.append(", ");
    localae.dhI[1] = "googlename";
    localae.iGy.put("googlename", "TEXT");
    localStringBuilder.append(" googlename TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "googlephotourl";
    localae.iGy.put("googlephotourl", "TEXT");
    localStringBuilder.append(" googlephotourl TEXT");
    localStringBuilder.append(", ");
    localae.dhI[3] = "googlegmail";
    localae.iGy.put("googlegmail", "TEXT");
    localStringBuilder.append(" googlegmail TEXT");
    localStringBuilder.append(", ");
    localae.dhI[4] = "username";
    localae.iGy.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    localae.dhI[5] = "nickname";
    localae.iGy.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localStringBuilder.append(", ");
    localae.dhI[6] = "nicknameqp";
    localae.iGy.put("nicknameqp", "TEXT");
    localStringBuilder.append(" nicknameqp TEXT");
    localStringBuilder.append(", ");
    localae.dhI[7] = "usernamepy";
    localae.iGy.put("usernamepy", "TEXT");
    localStringBuilder.append(" usernamepy TEXT");
    localStringBuilder.append(", ");
    localae.dhI[8] = "small_url";
    localae.iGy.put("small_url", "TEXT");
    localStringBuilder.append(" small_url TEXT");
    localStringBuilder.append(", ");
    localae.dhI[9] = "big_url";
    localae.iGy.put("big_url", "TEXT");
    localStringBuilder.append(" big_url TEXT");
    localStringBuilder.append(", ");
    localae.dhI[10] = "ret";
    localae.iGy.put("ret", "INTEGER");
    localStringBuilder.append(" ret INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[11] = "status";
    localae.iGy.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[12] = "googleitemid";
    localae.iGy.put("googleitemid", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" googleitemid TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "googleitemid";
    localae.dhI[13] = "googlecgistatus";
    localae.iGy.put("googlecgistatus", "INTEGER default '2' ");
    localStringBuilder.append(" googlecgistatus INTEGER default '2' ");
    localStringBuilder.append(", ");
    localae.dhI[14] = "contecttype";
    localae.iGy.put("contecttype", "TEXT");
    localStringBuilder.append(" contecttype TEXT");
    localStringBuilder.append(", ");
    localae.dhI[15] = "googlenamepy";
    localae.iGy.put("googlenamepy", "TEXT");
    localStringBuilder.append(" googlenamepy TEXT");
    localae.dhI[16] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  protected final ae nF()
  {
    return dhu;
  }

  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("googleIDgoogleid\n");
    localStringBuffer.append("googleNamegooglename\n");
    localStringBuffer.append("googlePhotoUrlgooglephotourl\n");
    localStringBuffer.append("googleGmailgooglegmail\n");
    localStringBuffer.append("userNameusername\n");
    localStringBuffer.append("nickNamenickname\n");
    localStringBuffer.append("nickNameQuanPinnicknameqp\n");
    localStringBuffer.append("nickNamePYInitialusernamepy\n");
    localStringBuffer.append("smallHeaderUrlsmall_url\n");
    localStringBuffer.append("bigHeaderUrlbig_url\n");
    localStringBuffer.append("retret\n");
    localStringBuffer.append("statusstatus\n");
    localStringBuffer.append("googleItemIDgoogleitemid\n");
    localStringBuffer.append("cgiStatusgooglecgistatus\n");
    localStringBuffer.append("contactTypecontecttype\n");
    localStringBuffer.append("googleNamePYInitialgooglenamepy\n");
    return localStringBuffer.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.ad
 * JD-Core Version:    0.6.2
 */