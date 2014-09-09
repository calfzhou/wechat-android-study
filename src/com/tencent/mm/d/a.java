package com.tencent.mm.d;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;
import java.util.Map;
import org.json.JSONObject;

public final class a
{
  public int cCB;
  public String cCD;
  public int cHw;
  public int cHx;
  public String desc;
  public String url;

  private static boolean bX(int paramInt)
  {
    if (paramInt == 4);
    while ((paramInt == 1) || (paramInt == 5))
      return true;
    return false;
  }

  public static a ct(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    a locala = new a();
    Map localMap = x.bB(paramString, "e");
    if (localMap == null)
    {
      z.d("!32@mcRQy4rJhxpew8juYpXfC2gRX1mziZs0", "this is not errmsg");
      return null;
    }
    locala.desc = ((String)localMap.get(".e.Content"));
    locala.url = ((String)localMap.get(".e.Url"));
    locala.cCD = ((String)localMap.get(".e.Title"));
    locala.cHx = ch.getInt((String)localMap.get(".e.Action"), 0);
    locala.cCB = ch.getInt((String)localMap.get(".e.ShowType"), 0);
    locala.cHw = ch.getInt((String)localMap.get(".e.DispSec"), 30);
    if (bX(locala.cCB))
      return locala;
    try
    {
      JSONObject localJSONObject = new JSONObject((String)localMap.get(".e"));
      locala.desc = localJSONObject.getString("Content");
      locala.url = localJSONObject.getString("Url");
      locala.cCD = localJSONObject.getString("Title");
      locala.cHx = ch.getInt(localJSONObject.getString("Action"), 0);
      locala.cCB = ch.getInt(localJSONObject.getString("ShowType"), 0);
      locala.cHw = ch.getInt(localJSONObject.getString("DispSec"), 30);
      boolean bool = bX(locala.cCB);
      if (bool)
        return locala;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final boolean a(Context paramContext, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if (this.cCB == 4)
    {
      e.a(paramContext, this.desc, this.cCD, paramOnClickListener1, paramOnClickListener2);
      return true;
    }
    if (this.cCB == 1)
    {
      e.o(paramContext, this.desc, this.cCD);
      return true;
    }
    if (this.cCB == 5)
    {
      e.o(paramContext, this.desc, this.cCD);
      return true;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a
 * JD-Core Version:    0.6.2
 */