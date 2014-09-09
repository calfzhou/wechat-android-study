package com.tencent.mm.ui.e;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.a.c;
import com.tencent.mm.ad.j;
import com.tencent.mm.ad.s;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ab;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class k
  implements com.tencent.mm.o.m
{
  private static k jXZ;
  private volatile boolean dAf = false;
  private ArrayList dQc = new ArrayList();
  private SharedPreferences dkI = ak.aHj();
  private final String jXX = "trace_config_last_update_time";
  private final long jXY = 86400000L;
  private final int jzC = 21;

  private static long Dv(String paramString)
  {
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (Exception localException)
    {
    }
    return -1L;
  }

  public static k bbQ()
  {
    if (jXZ == null);
    try
    {
      if (jXZ == null)
        jXZ = new k();
      return jXZ;
    }
    finally
    {
    }
  }

  private void release()
  {
    z.i("!44@/B4Tb64lLpLssFm+yuiGha2XCcB34ncnjxg8wRKbGvk=", "summer release");
    this.dAf = false;
    bg.qX().b(159, this);
    bg.qX().b(160, this);
  }

  private void rw(int paramInt)
  {
    String str1 = s.yO().yL();
    String str2 = s.yO().E(paramInt, 21);
    while (true)
    {
      HashMap localHashMap;
      int m;
      SharedPreferences.Editor localEditor;
      try
      {
        Map localMap = com.tencent.mm.sdk.platformtools.x.bB(c.af(c.k(str1, str2)), "TraceConfig");
        if (localMap == null)
        {
          z.d("!44@/B4Tb64lLpLssFm+yuiGha2XCcB34ncnjxg8wRKbGvk=", "summer kvMap is null and ret");
          return;
        }
        localHashMap = new HashMap();
        i = 0;
        StringBuilder localStringBuilder = new StringBuilder().append(".TraceConfig.Item");
        if (i == 0)
        {
          localObject = "";
          String str3 = localObject;
          String str4 = (String)localMap.get(str3 + ".$key");
          if (str4 == null)
            continue;
          m = i + 1;
          long l = Dv((String)localMap.get(str3));
          if (l < 0L)
            break label431;
          z.i("!44@/B4Tb64lLpLssFm+yuiGha2XCcB34ncnjxg8wRKbGvk=", "summer updateTraceConfig i: " + m + " key: " + str4 + "|value: " + l);
          localHashMap.put(str4, Long.valueOf(l));
          i = m;
          continue;
        }
        Object localObject = Integer.valueOf(i);
        continue;
        localEditor = this.dkI.edit();
        Iterator localIterator = localHashMap.entrySet().iterator();
        if (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          localEditor.putLong((String)localEntry.getKey(), ((Long)localEntry.getValue()).longValue());
          continue;
        }
      }
      catch (IOException localIOException)
      {
        com.tencent.mm.ad.l locall = s.yO().C(paramInt, 21);
        locall.setStatus(2);
        s.yO().b(locall);
        return;
      }
      localEditor.putLong("trace_config_last_update_time", System.currentTimeMillis()).commit();
      z.d("!44@/B4Tb64lLpLssFm+yuiGha2XCcB34ncnjxg8wRKbGvk=", "summer updateTraceConfig configMap size: " + localHashMap.size());
      int j = this.dQc.size();
      for (int k = 0; k < j; k++)
        ((m)this.dQc.get(k)).bbJ();
      continue;
      label431: int i = m;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    int i = paramx.getType();
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(i);
    z.i("!44@/B4Tb64lLpLssFm+yuiGha2XCcB34ncnjxg8wRKbGvk=", "summer onSceneEnd: errType:[%d], errCode:[%d], type:[%d]", arrayOfObject);
    if ((!(paramx instanceof ab)) || (((ab)paramx).tu() != 21))
      z.i("!44@/B4Tb64lLpLssFm+yuiGha2XCcB34ncnjxg8wRKbGvk=", "summer onSceneEnd another scene and ret");
    do
    {
      return;
      if (i == 159)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.ad.l[] arrayOfl = s.yO().ed(21);
          if ((arrayOfl == null) || (arrayOfl.length == 0))
          {
            z.i("!44@/B4Tb64lLpLssFm+yuiGha2XCcB34ncnjxg8wRKbGvk=", "summer doDownload error no pkg found.");
            release();
            return;
          }
          com.tencent.mm.ad.l locall = arrayOfl[0];
          z.i("!44@/B4Tb64lLpLssFm+yuiGha2XCcB34ncnjxg8wRKbGvk=", "summer doDownload pkg id:" + locall.getId() + " version:" + locall.getVersion() + " status:" + locall.getStatus() + " type:" + locall.yJ());
          if (5 == locall.getStatus())
          {
            j localj = new j(locall.getId(), 21);
            bg.qX().d(localj);
            return;
          }
          z.i("!44@/B4Tb64lLpLssFm+yuiGha2XCcB34ncnjxg8wRKbGvk=", "summer pkgInfo has downloaded and release");
          this.dkI.edit().putLong("trace_config_last_update_time", System.currentTimeMillis()).commit();
          release();
          return;
        }
        release();
        return;
      }
    }
    while (i != 160);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      rw(((j)paramx).yI());
    release();
  }

  public final boolean a(m paramm)
  {
    if ((paramm != null) && (!this.dQc.contains(paramm)))
      return this.dQc.add(paramm);
    return false;
  }

  public final void update()
  {
    bg.qQ().n(new l(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.e.k
 * JD-Core Version:    0.6.2
 */