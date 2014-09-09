package com.tencent.mm.plugin.accountsync.b;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  public static a dWC = new a();
  private Map dWD;

  public final Map ag(Context paramContext)
  {
    while (true)
    {
      int i;
      try
      {
        String str1 = ch.d(paramContext.getAssets().open("config/EmailAddress.xml"));
        if (ch.jb(str1))
          return null;
        Map localMap1 = x.bB(str1, "config");
        if ((localMap1 == null) || (localMap1.isEmpty()))
        {
          z.d("!32@/B4Tb64lLpJwOMBN3Ft5hVOpzvJV0XFH", "values null");
          return null;
        }
        if (this.dWD == null)
        {
          this.dWD = new HashMap();
          i = 0;
          StringBuilder localStringBuilder = new StringBuilder(".config.format");
          if (i == 0)
          {
            localObject = "";
            String str2 = localObject;
            if (localMap1.get(str2) == null)
              continue;
            String str3 = str2 + ".emaildomain";
            String str4 = str2 + ".loginpage";
            String str5 = (String)localMap1.get(str3);
            String str6 = (String)localMap1.get(str4);
            if ((ch.jb(str5)) || (ch.jb(str6)))
              break label274;
            this.dWD.put(str5, str6);
            break label274;
          }
        }
        else
        {
          return this.dWD;
        }
        Object localObject = Integer.valueOf(i);
        continue;
        Map localMap2 = this.dWD;
        return localMap2;
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getMessage();
        z.e("!32@/B4Tb64lLpJwOMBN3Ft5hVOpzvJV0XFH", "parse email failed:[%s]", arrayOfObject);
        return null;
      }
      label274: i++;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.b.a
 * JD-Core Version:    0.6.2
 */