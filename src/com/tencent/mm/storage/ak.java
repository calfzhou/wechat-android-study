package com.tencent.mm.storage;

import com.tencent.mm.c.b.n;
import com.tencent.mm.protocal.a.abz;
import com.tencent.mm.protocal.a.aca;
import com.tencent.mm.protocal.a.gn;
import com.tencent.mm.sdk.f.ae;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;

public final class ak extends n
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[24];
    localae.dhI = new String[25];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "productID";
    localae.iGy.put("productID", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" productID TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "productID";
    localae.dhI[1] = "consumeProductID";
    localae.iGy.put("consumeProductID", "TEXT");
    localStringBuilder.append(" consumeProductID TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "packName";
    localae.iGy.put("packName", "TEXT");
    localStringBuilder.append(" packName TEXT");
    localStringBuilder.append(", ");
    localae.dhI[3] = "packDesc";
    localae.iGy.put("packDesc", "TEXT");
    localStringBuilder.append(" packDesc TEXT");
    localStringBuilder.append(", ");
    localae.dhI[4] = "packAuthInfo";
    localae.iGy.put("packAuthInfo", "TEXT");
    localStringBuilder.append(" packAuthInfo TEXT");
    localStringBuilder.append(", ");
    localae.dhI[5] = "packPrice";
    localae.iGy.put("packPrice", "TEXT");
    localStringBuilder.append(" packPrice TEXT");
    localStringBuilder.append(", ");
    localae.dhI[6] = "packType";
    localae.iGy.put("packType", "INTEGER");
    localStringBuilder.append(" packType INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[7] = "packFlag";
    localae.iGy.put("packFlag", "INTEGER");
    localStringBuilder.append(" packFlag INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[8] = "packExpire";
    localae.iGy.put("packExpire", "INTEGER");
    localStringBuilder.append(" packExpire INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[9] = "packCopyright";
    localae.iGy.put("packCopyright", "TEXT default '' ");
    localStringBuilder.append(" packCopyright TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[10] = "priceNum";
    localae.iGy.put("priceNum", "TEXT default '' ");
    localStringBuilder.append(" priceNum TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[11] = "priceType";
    localae.iGy.put("priceType", "TEXT default '' ");
    localStringBuilder.append(" priceType TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[12] = "iconUrl";
    localae.iGy.put("iconUrl", "TEXT");
    localStringBuilder.append(" iconUrl TEXT");
    localStringBuilder.append(", ");
    localae.dhI[13] = "coverUrl";
    localae.iGy.put("coverUrl", "TEXT default '' ");
    localStringBuilder.append(" coverUrl TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[14] = "panelUrl";
    localae.iGy.put("panelUrl", "TEXT default '' ");
    localStringBuilder.append(" panelUrl TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[15] = "timeLimitStr";
    localae.iGy.put("timeLimitStr", "TEXT default '' ");
    localStringBuilder.append(" timeLimitStr TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[16] = "version";
    localae.iGy.put("version", "INTEGER default '-1' ");
    localStringBuilder.append(" version INTEGER default '-1' ");
    localStringBuilder.append(", ");
    localae.dhI[17] = "packThumbCnt";
    localae.iGy.put("packThumbCnt", "INTEGER");
    localStringBuilder.append(" packThumbCnt INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[18] = "thumbExtCount";
    localae.iGy.put("thumbExtCount", "INTEGER default '' ");
    localStringBuilder.append(" thumbExtCount INTEGER default '' ");
    localStringBuilder.append(", ");
    localae.dhI[19] = "packThumbList";
    localae.iGy.put("packThumbList", "BLOB default '' ");
    localStringBuilder.append(" packThumbList BLOB default '' ");
    localStringBuilder.append(", ");
    localae.dhI[20] = "thumbExtList";
    localae.iGy.put("thumbExtList", "BLOB default '' ");
    localStringBuilder.append(" thumbExtList BLOB default '' ");
    localStringBuilder.append(", ");
    localae.dhI[21] = "lang";
    localae.iGy.put("lang", "TEXT default '' ");
    localStringBuilder.append(" lang TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[22] = "shareDesc";
    localae.iGy.put("shareDesc", "TEXT default '' ");
    localStringBuilder.append(" shareDesc TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[23] = "oldRedirectUrl";
    localae.iGy.put("oldRedirectUrl", "TEXT default '' ");
    localStringBuilder.append(" oldRedirectUrl TEXT default '' ");
    localae.dhI[24] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  private static byte[] X(LinkedList paramLinkedList)
  {
    abz localabz = new abz();
    localabz.hWs = paramLinkedList;
    try
    {
      byte[] arrayOfByte = localabz.toByteArray();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      z.e("!56@/B4Tb64lLpKW6XSoHkFWUD4sQdXykKjv69KuSvc99hjhDRWfepYT1Q==", "covertToThumbExtList failed");
    }
    return null;
  }

  private static byte[] Y(LinkedList paramLinkedList)
  {
    aca localaca = new aca();
    localaca.hWj = paramLinkedList;
    try
    {
      byte[] arrayOfByte = localaca.toByteArray();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      z.e("!56@/B4Tb64lLpKW6XSoHkFWUD4sQdXykKjv69KuSvc99hjhDRWfepYT1Q==", "covertToThumbList failed");
    }
    return null;
  }

  public static gn a(ak paramak)
  {
    gn localgn = new gn();
    localgn.hWq = paramak.field_consumeProductID;
    localgn.hWk = paramak.field_coverUrl;
    localgn.fxH = paramak.field_iconUrl;
    localgn.hWe = paramak.field_packAuthInfo;
    localgn.hWm = paramak.field_packCopyright;
    localgn.hWd = paramak.field_packDesc;
    localgn.hWl = paramak.field_packExpire;
    localgn.hWh = paramak.field_packFlag;
    localgn.hWc = paramak.field_packName;
    localgn.hWf = paramak.field_packPrice;
    localgn.hWi = paramak.field_packThumbCnt;
    localgn.hWj = cL(paramak.field_packThumbList);
    localgn.hWg = paramak.field_packType;
    localgn.hWp = paramak.field_panelUrl;
    localgn.hWn = paramak.field_priceNum;
    localgn.hWo = paramak.field_priceType;
    localgn.hSc = paramak.field_productID;
    localgn.hWr = paramak.field_thumbExtCount;
    localgn.hWs = cK(paramak.field_thumbExtList);
    localgn.hWu = paramak.field_timeLimitStr;
    localgn.hWt = paramak.field_version;
    localgn.hWv = paramak.field_shareDesc;
    localgn.hWw = paramak.field_oldRedirectUrl;
    return localgn;
  }

  public static ak a(gn paramgn)
  {
    ak localak = new ak();
    localak.field_consumeProductID = paramgn.hWq;
    localak.field_coverUrl = paramgn.hWk;
    localak.field_iconUrl = paramgn.fxH;
    localak.field_packAuthInfo = paramgn.hWe;
    localak.field_packCopyright = paramgn.hWm;
    localak.field_packDesc = paramgn.hWd;
    localak.field_packExpire = paramgn.hWl;
    localak.field_packFlag = paramgn.hWh;
    localak.field_packName = paramgn.hWc;
    localak.field_packPrice = paramgn.hWf;
    localak.field_packThumbCnt = paramgn.hWi;
    localak.field_packThumbList = Y(paramgn.hWj);
    localak.field_packType = paramgn.hWg;
    localak.field_panelUrl = paramgn.hWp;
    localak.field_priceNum = paramgn.hWn;
    localak.field_priceType = paramgn.hWo;
    localak.field_productID = paramgn.hSc;
    localak.field_thumbExtCount = paramgn.hWr;
    localak.field_thumbExtList = X(paramgn.hWs);
    localak.field_timeLimitStr = paramgn.hWu;
    localak.field_version = paramgn.hWt;
    localak.field_lang = y.aGW();
    localak.field_shareDesc = paramgn.hWv;
    localak.field_oldRedirectUrl = paramgn.hWw;
    return localak;
  }

  private static LinkedList cK(byte[] paramArrayOfByte)
  {
    abz localabz = new abz();
    try
    {
      localabz.cx(paramArrayOfByte);
      if (localabz.hWs != null)
        return localabz.hWs;
    }
    catch (IOException localIOException)
    {
      while (true)
        z.e("!56@/B4Tb64lLpKW6XSoHkFWUD4sQdXykKjv69KuSvc99hjhDRWfepYT1Q==", "covertFromThumbExtList failed");
    }
    return null;
  }

  private static LinkedList cL(byte[] paramArrayOfByte)
  {
    aca localaca = new aca();
    try
    {
      localaca.cy(paramArrayOfByte);
      if (localaca.hWj != null)
        return localaca.hWj;
    }
    catch (IOException localIOException)
    {
      while (true)
        z.e("!56@/B4Tb64lLpKW6XSoHkFWUD4sQdXykKjv69KuSvc99hjhDRWfepYT1Q==", "covertFromThumbList failed");
    }
    return null;
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ak
 * JD-Core Version:    0.6.2
 */