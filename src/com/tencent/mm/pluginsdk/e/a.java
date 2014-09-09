package com.tencent.mm.pluginsdk.e;

import android.app.Activity;
import com.tencent.mm.sdk.platformtools.z;

public final class a
{
  private i hwn;
  private j hwo;
  private k hwp;
  private g hwq;
  private h hwr;
  private f hws;

  private static void a(b paramb)
  {
    if (paramb != null)
      paramb.b(paramb);
  }

  public final boolean a(Activity paramActivity, n paramn)
  {
    if ((paramn.type == 0) || (paramn.action == 0))
      return false;
    if (this.hws == null)
      this.hws = new f(paramActivity);
    if (this.hws.a(paramn))
      return true;
    switch (paramn.type)
    {
    default:
      z.e("!44@/B4Tb64lLpI82FDEKU4MMswDBO/xZgZna735fRAmfMs=", "Unkown error type");
      return false;
    case 1:
      if (this.hwn == null)
        this.hwn = new i(paramActivity);
      this.hwn.a(paramn);
      return false;
    case 2:
      if (this.hwo == null)
        this.hwo = new j(paramActivity);
      this.hwo.a(paramn);
      return false;
    case 3:
      if (this.hwp == null)
        this.hwp = new k(paramActivity);
      this.hwp.a(paramn);
      return false;
    case 4:
      if (this.hwq == null)
        this.hwq = new g(paramActivity);
      this.hwq.a(paramn);
      return false;
    case 5:
      if (this.hwr == null)
        this.hwr = new h(paramActivity);
      this.hwr.a(paramn);
      return false;
    case 6:
    }
    if (this.hws == null)
      this.hws = new f(paramActivity);
    this.hws.a(paramn);
    return false;
  }

  public final void close()
  {
    a(this.hwn);
    a(this.hwo);
    a(this.hwp);
    a(this.hwq);
    a(this.hwr);
    a(this.hws);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.a
 * JD-Core Version:    0.6.2
 */