package com.tencent.mm.app;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.c.a.bl;
import com.tencent.mm.c.a.bm;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.CheckCanSubscribeBizUI;
import java.util.ArrayList;

final class t extends g
{
  t(WorkerProfile paramWorkerProfile)
  {
    super(0);
  }

  private static boolean a(Context paramContext, String[] paramArrayOfString1, String[] paramArrayOfString2, int paramInt, String paramString)
  {
    if (paramContext == null)
    {
      z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "ExtCallBizEvent IListener:context is null.");
      paramContext = ak.getContext();
    }
    if ((paramArrayOfString1 == null) || (paramArrayOfString1.length < 2))
    {
      z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "ExtCallBizEvent IListener:args error.");
      return false;
    }
    int i = paramArrayOfString1.length;
    for (int j = 0; j < i; j++)
      z.i("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "arg : %s", new Object[] { paramArrayOfString1[j] });
    String str1 = paramArrayOfString1[0];
    String str2 = paramArrayOfString1[1];
    int k = paramArrayOfString1.length;
    String str3 = null;
    if (k > 2)
      str3 = paramArrayOfString1[2];
    int m = paramArrayOfString1.length;
    int n = 0;
    if (m > 3);
    try
    {
      int i5 = Integer.parseInt(paramArrayOfString1[3]);
      n = i5;
      int i1 = paramArrayOfString1.length;
      i2 = 0;
      if (i1 <= 4);
    }
    catch (Exception localException2)
    {
      try
      {
        int i4 = Integer.parseInt(paramArrayOfString1[4]);
        i2 = i4;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(paramInt);
        z.i("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "ExtCallBizEvent IListener:source(%d)", arrayOfObject1);
        switch (paramInt)
        {
        default:
          z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "ExtCallBizEvent IListener:source is out of range.");
          return false;
          localException2 = localException2;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = localException2.getMessage();
          z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "parse int failed : %s", arrayOfObject3);
          n = 0;
        case 1:
        case 2:
        }
      }
      catch (Exception localException1)
      {
        int i2;
        while (true)
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = localException1.getMessage();
          z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "parse int failed : %s", arrayOfObject2);
          i2 = 0;
        }
        if ((paramArrayOfString2 == null) || (paramArrayOfString2.length == 0))
        {
          z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "ExtCallBizEvent IListener:packageNames is null or nil.");
          return false;
          if (ch.jb(paramString))
          {
            z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "ExtCallBizEvent IListener:fromURL(%s) is null or nil.", new Object[] { paramString });
            return false;
          }
        }
        z.i("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "ExtCallBizEvent IListener: appId(%s), toUserName(%s), extInfo(%s), fromURL(%s)", new Object[] { str1, str2, str3, paramString });
        if ((ch.jb(str1)) || (ch.jb(str2)))
        {
          z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "appId or toUsername is null or nil.");
          return false;
        }
        Intent localIntent = new Intent(paramContext, CheckCanSubscribeBizUI.class);
        localIntent.putExtra("appId", str1);
        localIntent.putExtra("toUserName", str2);
        localIntent.putExtra("extInfo", str3);
        localIntent.putExtra("source", paramInt);
        localIntent.putExtra("scene", n);
        localIntent.putExtra("jump_profile_type", i2);
        localIntent.addFlags(268435456);
        if ((paramArrayOfString2 != null) && (paramArrayOfString2.length > 0))
        {
          ArrayList localArrayList = new ArrayList();
          for (int i3 = 0; i3 < paramArrayOfString2.length; i3++)
            localArrayList.add(paramArrayOfString2[i3]);
          localIntent.putStringArrayListExtra("androidPackNameList", localArrayList);
        }
        paramContext.startActivity(localIntent);
      }
    }
    return true;
  }

  public final boolean a(e parame)
  {
    if (parame == null)
    {
      z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "ExtCallBizEvent IListener:event is null.");
      return false;
    }
    if (!(parame instanceof bl))
    {
      z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "ExtCallBizEvent IListener:event is not a instance of ExtCallBizEvent.");
      return false;
    }
    bl localbl = (bl)parame;
    if (localbl.cIn == null)
    {
      z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "ExtCallBizEvent IListener:event.data is null.");
      return false;
    }
    return a(localbl.cIn.context, localbl.cIn.selectionArgs, localbl.cIn.cIo, localbl.cIn.aRG, localbl.cIn.cIp);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.t
 * JD-Core Version:    0.6.2
 */