package com.tencent.mm.q;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.c.b.d;
import com.tencent.mm.sdk.f.ae;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends d
{
  protected static ae dhu = localae;
  public static int dpE = 1;
  public static int dpF = 0;
  private static int dpI = 0;
  private static e dpJ = null;
  private List dpG;
  private e dpH;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[14];
    localae.dhI = new String[15];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "username";
    localae.iGy.put("username", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" username TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "username";
    localae.dhI[1] = "brandList";
    localae.iGy.put("brandList", "TEXT default '' ");
    localStringBuilder.append(" brandList TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[2] = "brandListVersion";
    localae.iGy.put("brandListVersion", "TEXT");
    localStringBuilder.append(" brandListVersion TEXT");
    localStringBuilder.append(", ");
    localae.dhI[3] = "brandListContent";
    localae.iGy.put("brandListContent", "TEXT");
    localStringBuilder.append(" brandListContent TEXT");
    localStringBuilder.append(", ");
    localae.dhI[4] = "brandFlag";
    localae.iGy.put("brandFlag", "INTEGER");
    localStringBuilder.append(" brandFlag INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[5] = "extInfo";
    localae.iGy.put("extInfo", "TEXT");
    localStringBuilder.append(" extInfo TEXT");
    localStringBuilder.append(", ");
    localae.dhI[6] = "brandInfo";
    localae.iGy.put("brandInfo", "TEXT");
    localStringBuilder.append(" brandInfo TEXT");
    localStringBuilder.append(", ");
    localae.dhI[7] = "brandIconURL";
    localae.iGy.put("brandIconURL", "TEXT");
    localStringBuilder.append(" brandIconURL TEXT");
    localStringBuilder.append(", ");
    localae.dhI[8] = "updateTime";
    localae.iGy.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    localae.dhI[9] = "hadAlert";
    localae.iGy.put("hadAlert", "INTEGER");
    localStringBuilder.append(" hadAlert INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[10] = "acceptType";
    localae.iGy.put("acceptType", "INTEGER default '0' ");
    localStringBuilder.append(" acceptType INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[11] = "type";
    localae.iGy.put("type", "INTEGER default '0' ");
    localStringBuilder.append(" type INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[12] = "status";
    localae.iGy.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[13] = "enterpriseFather";
    localae.iGy.put("enterpriseFather", "TEXT");
    localStringBuilder.append(" enterpriseFather TEXT");
    localae.dhI[14] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  public final void b(Cursor paramCursor)
  {
    super.b(paramCursor);
  }

  public final ContentValues ir()
  {
    return super.ir();
  }

  protected final ae nF()
  {
    return dhu;
  }

  public final e tY()
  {
    long l;
    if (this.dpH == null)
    {
      l = System.currentTimeMillis();
      if ((ch.jb(this.field_extInfo)) || (dpI != this.field_extInfo.hashCode()))
        break label81;
      this.dpH = dpJ;
    }
    while (true)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.field_username;
      arrayOfObject[1] = Long.valueOf(System.currentTimeMillis() - l);
      z.d("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "user:%s, parse extInfo time:%d", arrayOfObject);
      return this.dpH;
      label81: e locale = e.ft(this.field_extInfo);
      this.dpH = locale;
      dpJ = locale;
      dpI = ch.ja(this.field_extInfo).hashCode();
    }
  }

  public final boolean tZ()
  {
    return (0x1 & this.field_brandFlag) == 0;
  }

  public final boolean ua()
  {
    return (0x4 & this.field_brandFlag) != 0;
  }

  public final boolean ub()
  {
    if (System.currentTimeMillis() - this.field_updateTime > 86400000L);
    Calendar localCalendar;
    do
    {
      return true;
      localCalendar = Calendar.getInstance();
      localCalendar.set(11, 0);
      localCalendar.set(12, 0);
      localCalendar.set(13, 0);
    }
    while (this.field_updateTime < localCalendar.getTimeInMillis());
    return false;
  }

  public final void uc()
  {
    tY();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.field_acceptType);
    arrayOfObject[1] = this.field_extInfo;
    z.i("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "update accept type %d %s", arrayOfObject);
    this.field_acceptType = this.dpH.ur();
    this.field_type = tY().uz();
  }

  public final boolean ud()
  {
    tY();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.field_username;
    arrayOfObject[1] = Boolean.valueOf(this.dpH.ud());
    z.i("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "is report location, user %s %B", arrayOfObject);
    return this.dpH.ud();
  }

  public final boolean ue()
  {
    tY();
    return this.dpH.uu() == 1;
  }

  public final boolean uf()
  {
    tY();
    return this.field_type == 1;
  }

  public final boolean ug()
  {
    tY();
    return (this.field_type == 2) || (this.field_type == 3);
  }

  public final boolean uh()
  {
    tY();
    return this.field_type == 2;
  }

  public final boolean ui()
  {
    tY();
    return this.field_type == 3;
  }

  public final List uj()
  {
    if (this.dpG != null)
      return this.dpG;
    this.dpG = new LinkedList();
    if ((this.field_brandInfo == null) || (this.field_brandInfo.length() == 0))
      return this.dpG;
    try
    {
      JSONArray localJSONArray = new JSONObject(this.field_brandInfo).optJSONArray("urls");
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        b localb = new b();
        JSONObject localJSONObject = localJSONArray.optJSONObject(i);
        localb.title = localJSONObject.optString("title");
        localb.url = localJSONObject.optString("url");
        localb.dpK = localJSONObject.optString("title_key");
        localb.description = localJSONObject.optString("description");
        this.dpG.add(localb);
      }
    }
    catch (Exception localException)
    {
    }
    return this.dpG;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.a
 * JD-Core Version:    0.6.2
 */