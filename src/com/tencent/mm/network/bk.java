package com.tencent.mm.network;

import android.content.Context;
import com.tencent.mm.network.a.a;
import com.tencent.mm.sdk.platformtools.cm;

public final class bk
{
  private static bk dUb;
  private bm dUc;
  private bn dUd;
  private Context dUe;
  private bl dUf;
  private bi dUg;
  private bh dUh;
  private a dUi;
  private ao dht;
  private cm gQj;

  private static bk Di()
  {
    if (dUb == null)
      dUb = new bk();
    return dUb;
  }

  public static a Dj()
  {
    return Di().dUi;
  }

  public static bm Dk()
  {
    return Di().dUc;
  }

  public static bn Dl()
  {
    return Di().dUd;
  }

  public static cm Dm()
  {
    return Di().gQj;
  }

  public static bl Dn()
  {
    return Di().dUf;
  }

  public static ao Do()
  {
    return Di().dht;
  }

  public static bi Dp()
  {
    return Di().dUg;
  }

  public static bh Dq()
  {
    return Di().dUh;
  }

  public static void a(a parama)
  {
    Di().dUi = parama;
  }

  public static void a(bh parambh)
  {
    Di().dUh = parambh;
  }

  public static void a(bi parambi)
  {
    Di().dUg = parambi;
  }

  public static void a(bl parambl)
  {
    Di().dUf = parambl;
  }

  public static void a(bm parambm)
  {
    Di().dUc = parambm;
  }

  public static void a(bn parambn)
  {
    Di().dUd = parambn;
  }

  public static void a(cm paramcm)
  {
    Di().gQj = paramcm;
  }

  public static void e(ao paramao)
  {
    Di().dht = paramao;
  }

  public static Context getContext()
  {
    return Di().dUe;
  }

  public static void setContext(Context paramContext)
  {
    Di().dUe = paramContext;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.bk
 * JD-Core Version:    0.6.2
 */