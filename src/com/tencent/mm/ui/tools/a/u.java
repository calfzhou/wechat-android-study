package com.tencent.mm.ui.tools.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.cm;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class u
{
  private static u jWY = null;
  static final cm jXe = new v(Looper.getMainLooper());
  final Context context;
  final n jWA;
  final e jWB;
  private final x jWZ;
  final Map jXa;
  final Map jXb;
  final ReferenceQueue jXc;
  boolean jXd;

  private u(Context paramContext, n paramn, e parame, boolean paramBoolean)
  {
    this.context = paramContext;
    this.jWA = paramn;
    this.jWB = parame;
    this.jXd = paramBoolean;
    this.jXa = new WeakHashMap();
    this.jXb = new WeakHashMap();
    this.jXc = new ReferenceQueue();
    this.jWZ = new x(this.jXc, jXe);
    this.jWZ.start();
  }

  public static ad a(l paraml)
  {
    return new ad(paraml);
  }

  static u bbu()
  {
    return jWY;
  }

  public static u cG(Context paramContext)
  {
    if (jWY == null);
    try
    {
      jWY = new w(paramContext).bbx();
      return jWY;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void close()
  {
    while (true)
    {
      try
      {
        if (jWY != null)
        {
          if (jWY.jXa.size() != 0)
            break label151;
          jWY.jWB.clear();
          n localn = jWY.jWA;
          localn.jWO.shutdown();
          localn.jWN.quit();
          Iterator localIterator = jWY.jXb.values().iterator();
          if (!localIterator.hasNext())
            continue;
          ((m)localIterator.next()).cancel();
          continue;
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        return;
        jWY.jXb.clear();
        jWY.jXa.clear();
        jWY.jWZ.interrupt();
        jWY = null;
        continue;
      }
      finally
      {
      }
      label151: jWY.jWB.clear();
    }
  }

  public static ad ru(int paramInt)
  {
    if (paramInt == 0)
      throw new IllegalArgumentException("Resource ID must not be zero.");
    return new ad(paramInt);
  }

  public final void ah(Object paramObject)
  {
    if (paramObject == null);
    m localm;
    do
    {
      do
      {
        return;
        a locala = (a)this.jXa.remove(paramObject);
        if (locala != null)
        {
          locala.cancel();
          n localn = this.jWA;
          localn.gQj.sendMessage(localn.gQj.obtainMessage(2, locala));
        }
      }
      while (!(paramObject instanceof ImageView));
      ImageView localImageView = (ImageView)paramObject;
      localm = (m)this.jXb.remove(localImageView);
    }
    while (localm == null);
    localm.cancel();
  }

  public final void bbv()
  {
    this.jXd = false;
  }

  final void d(d paramd)
  {
    List localList = paramd.jWC;
    if (localList.isEmpty());
    while (true)
    {
      return;
      Bitmap localBitmap = paramd.dwV;
      s locals = paramd.bbr();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (!locala.EO)
        {
          this.jXa.remove(locala.jWr.get());
          if (localBitmap != null)
          {
            if (locals == null)
              throw new AssertionError("LoadedFrom cannot be null.");
            locala.a(localBitmap, locals);
          }
          else
          {
            locala.error();
          }
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.u
 * JD-Core Version:    0.6.2
 */