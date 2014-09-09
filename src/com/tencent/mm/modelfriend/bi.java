package com.tencent.mm.modelfriend;

import com.tencent.mm.c.b.ad;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class bi extends ad
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[12];
    localae.dhI = new String[13];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "wechatId";
    localae.iGy.put("wechatId", "TEXT");
    localStringBuilder.append(" wechatId TEXT");
    localStringBuilder.append(", ");
    localae.dhI[1] = "linkedInId";
    localae.iGy.put("linkedInId", "TEXT");
    localStringBuilder.append(" linkedInId TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "name";
    localae.iGy.put("name", "TEXT");
    localStringBuilder.append(" name TEXT");
    localStringBuilder.append(", ");
    localae.dhI[3] = "position";
    localae.iGy.put("position", "TEXT");
    localStringBuilder.append(" position TEXT");
    localStringBuilder.append(", ");
    localae.dhI[4] = "picUrl";
    localae.iGy.put("picUrl", "TEXT");
    localStringBuilder.append(" picUrl TEXT");
    localStringBuilder.append(", ");
    localae.dhI[5] = "wechatUsername";
    localae.iGy.put("wechatUsername", "TEXT");
    localStringBuilder.append(" wechatUsername TEXT");
    localStringBuilder.append(", ");
    localae.dhI[6] = "wechatSmallHead";
    localae.iGy.put("wechatSmallHead", "TEXT");
    localStringBuilder.append(" wechatSmallHead TEXT");
    localStringBuilder.append(", ");
    localae.dhI[7] = "wechatBigHead";
    localae.iGy.put("wechatBigHead", "TEXT");
    localStringBuilder.append(" wechatBigHead TEXT");
    localStringBuilder.append(", ");
    localae.dhI[8] = "linkedInProfileUrl";
    localae.iGy.put("linkedInProfileUrl", "TEXT");
    localStringBuilder.append(" linkedInProfileUrl TEXT");
    localStringBuilder.append(", ");
    localae.dhI[9] = "status";
    localae.iGy.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[10] = "userOpStatus";
    localae.iGy.put("userOpStatus", "INTEGER default '0' ");
    localStringBuilder.append(" userOpStatus INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[11] = "nickname";
    localae.iGy.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localae.dhI[12] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  protected final ae nF()
  {
    return dhu;
  }

  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("wechatIdwechatId\n");
    localStringBuffer.append("linkedInIdlinkedInId\n");
    localStringBuffer.append("namename\n");
    localStringBuffer.append("positionposition\n");
    localStringBuffer.append("picUrlpicUrl\n");
    localStringBuffer.append("wechatUsernamewechatUsername\n");
    localStringBuffer.append("wechatBigHeadwechatSmallHead\n");
    localStringBuffer.append("wechatUsernamewechatBigHead\n");
    localStringBuffer.append("linkedInProfileUrllinkedInProfileUrl\n");
    localStringBuffer.append("statusstatus\n");
    localStringBuffer.append("userOpStatusstatus\n");
    return localStringBuffer.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.bi
 * JD-Core Version:    0.6.2
 */